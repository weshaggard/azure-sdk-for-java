// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.DiagnosticInvocation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticInvocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticInvocation model =
            BinaryData
                .fromString(
                    "{\"solutionId\":\"clxxwrljdo\",\"additionalParameters\":{\"xbnjbiksq\":\"cqvkocrcjdkwtn\",\"ainqpjwnzlljfm\":\"gls\",\"vmgxsab\":\"pee\"}}")
                .toObject(DiagnosticInvocation.class);
        Assertions.assertEquals("clxxwrljdo", model.solutionId());
        Assertions.assertEquals("cqvkocrcjdkwtn", model.additionalParameters().get("xbnjbiksq"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticInvocation model =
            new DiagnosticInvocation()
                .withSolutionId("clxxwrljdo")
                .withAdditionalParameters(
                    mapOf("xbnjbiksq", "cqvkocrcjdkwtn", "ainqpjwnzlljfm", "gls", "vmgxsab", "pee"));
        model = BinaryData.fromObject(model).toObject(DiagnosticInvocation.class);
        Assertions.assertEquals("clxxwrljdo", model.solutionId());
        Assertions.assertEquals("cqvkocrcjdkwtn", model.additionalParameters().get("xbnjbiksq"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}