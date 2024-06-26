// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.RestResourceDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RestResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestResourceDataset model = BinaryData.fromString(
            "{\"type\":\"ypkcpwsrqnn\",\"typeProperties\":{\"relativeUrl\":\"datavwkryzgav\",\"requestMethod\":\"datandm\",\"requestBody\":\"dataiekkiskyyyaekn\",\"additionalHeaders\":{\"jiutfofhoajj\":\"datayshdawjlmlcufb\"},\"paginationRules\":{\"quyhbceev\":\"datayqyjnufzvl\",\"dssijuaxxf\":\"datagirrpwnqtvuxeuj\"}},\"description\":\"u\",\"structure\":\"datatl\",\"schema\":\"dataltjhb\",\"linkedServiceName\":{\"referenceName\":\"ycgqakcsihxvt\",\"parameters\":{\"pxpry\":\"datawf\",\"ahtqmmk\":\"datansbubwhzqqgugwlu\",\"qwebagm\":\"datahwq\",\"rgvypa\":\"datapkephujeucosvkke\"}},\"parameters\":{\"ezfpffbuqxkn\":{\"type\":\"SecureString\",\"defaultValue\":\"dataillgnu\"},\"bg\":{\"type\":\"Float\",\"defaultValue\":\"datag\"},\"zoksgqhb\":{\"type\":\"String\",\"defaultValue\":\"datajfchicpare\"}},\"annotations\":[\"datauxilozb\",\"datakcr\",\"datal\"],\"folder\":{\"name\":\"jw\"},\"\":{\"hfgmuxuqiagsko\":\"dataptsflotumbmwgft\"}}")
            .toObject(RestResourceDataset.class);
        Assertions.assertEquals("u", model.description());
        Assertions.assertEquals("ycgqakcsihxvt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("ezfpffbuqxkn").type());
        Assertions.assertEquals("jw", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestResourceDataset model = new RestResourceDataset().withDescription("u")
            .withStructure("datatl")
            .withSchema("dataltjhb")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ycgqakcsihxvt")
                .withParameters(mapOf("pxpry", "datawf", "ahtqmmk", "datansbubwhzqqgugwlu", "qwebagm", "datahwq",
                    "rgvypa", "datapkephujeucosvkke")))
            .withParameters(mapOf("ezfpffbuqxkn",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("dataillgnu"), "bg",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datag"), "zoksgqhb",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datajfchicpare")))
            .withAnnotations(Arrays.asList("datauxilozb", "datakcr", "datal"))
            .withFolder(new DatasetFolder().withName("jw"))
            .withRelativeUrl("datavwkryzgav")
            .withRequestMethod("datandm")
            .withRequestBody("dataiekkiskyyyaekn")
            .withAdditionalHeaders(mapOf("jiutfofhoajj", "datayshdawjlmlcufb"))
            .withPaginationRules(mapOf("quyhbceev", "datayqyjnufzvl", "dssijuaxxf", "datagirrpwnqtvuxeuj"));
        model = BinaryData.fromObject(model).toObject(RestResourceDataset.class);
        Assertions.assertEquals("u", model.description());
        Assertions.assertEquals("ycgqakcsihxvt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("ezfpffbuqxkn").type());
        Assertions.assertEquals("jw", model.folder().name());
    }

    // Use "Map.of" if available
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
