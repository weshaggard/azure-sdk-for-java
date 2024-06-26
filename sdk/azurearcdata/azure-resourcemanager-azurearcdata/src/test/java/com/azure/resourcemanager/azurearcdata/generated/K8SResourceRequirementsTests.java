// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurearcdata.models.K8SResourceRequirements;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class K8SResourceRequirementsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        K8SResourceRequirements model =
            BinaryData
                .fromString(
                    "{\"requests\":{\"pjmcmatuokthfuiu\":\"eupfhyhltrpm\"},\"limits\":{\"zydagfuaxbezyiuo\":\"sfcpkvxodpuozm\",\"dxwzywqsmbsurexi\":\"ktwh\",\"yocf\":\"o\",\"uxh\":\"fksymddystki\"},\"\":{\"i\":\"datadxorrqnbpoczv\",\"sllr\":\"dataqrvkdv\"}}")
                .toObject(K8SResourceRequirements.class);
        Assertions.assertEquals("eupfhyhltrpm", model.requests().get("pjmcmatuokthfuiu"));
        Assertions.assertEquals("sfcpkvxodpuozm", model.limits().get("zydagfuaxbezyiuo"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        K8SResourceRequirements model =
            new K8SResourceRequirements()
                .withRequests(mapOf("pjmcmatuokthfuiu", "eupfhyhltrpm"))
                .withLimits(
                    mapOf(
                        "zydagfuaxbezyiuo",
                        "sfcpkvxodpuozm",
                        "dxwzywqsmbsurexi",
                        "ktwh",
                        "yocf",
                        "o",
                        "uxh",
                        "fksymddystki"))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(K8SResourceRequirements.class);
        Assertions.assertEquals("eupfhyhltrpm", model.requests().get("pjmcmatuokthfuiu"));
        Assertions.assertEquals("sfcpkvxodpuozm", model.limits().get("zydagfuaxbezyiuo"));
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
