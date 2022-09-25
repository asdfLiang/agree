package com.contract.simpletest.annotation;

import com.contract.common.tools.Json;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author by liangzj
 * @since 2022/9/25 11:58
 */
public class JsonArgumentProvider implements ArgumentsProvider, AnnotationConsumer<JsonFileSource> {

    private JsonFileSource jsonFileSource;

    @Override
    public void accept(JsonFileSource jsonFileSource) {
        this.jsonFileSource = jsonFileSource;
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        Method method = extensionContext.getRequiredTestMethod();
        String className = method.getDeclaringClass().getSimpleName();

        // 获取对应的json文件
        InputStream in =
                JsonFileSource.class.getResourceAsStream(
                        String.format("%s/%s.json", jsonFileSource.getPath(), className));
        Map dataMap = Json.parse(in, Map.class);

        // 获取每个参数的值
        return Arrays.stream(method.getParameters())
                .map(parameter -> getArgument(dataMap, parameter.getName(), parameter.getType()));
    }

    /**
     * 获取参数值
     *
     * @param dataMap 当前测试类包含的说有数据
     * @param name 数据名称
     * @param classType 数据类型
     * @return
     */
    private Arguments getArgument(Map dataMap, String name, Class classType) {
        return Optional.ofNullable(dataMap)
                .map(map -> map.get(name))
                .map(Json::from)
                .map(json -> Json.parse(json, classType))
                .map(Arguments::of)
                .orElse(null);
    }
}
