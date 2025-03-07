// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.fluent.models.WidgetTypeResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.WidgetTypeListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WidgetTypeListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WidgetTypeListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"widgetTypeName\":\"omlik\",\"definition\":\"twvc\",\"description\":\"swkacvej\",\"displayName\":{\"pqthehnmnaoya\":\"vlvhbwrnfxtgd\",\"t\":\"kcoeqswank\",\"ktgj\":\"tmhdroznnhdr\",\"eml\":\"sggux\"},\"imageUrl\":\"waeeczgfb\",\"tenantId\":\"klelssxb\",\"widgetVersion\":\"c\",\"changed\":\"2020-12-21T09:45:57Z\",\"created\":\"2021-01-04T18:33:56Z\"},\"id\":\"ksrl\",\"name\":\"mdesqp\",\"type\":\"pvmjcdoewbid\"}],\"nextLink\":\"t\"}")
            .toObject(WidgetTypeListResult.class);
        Assertions.assertEquals("twvc", model.value().get(0).definition());
        Assertions.assertEquals("swkacvej", model.value().get(0).description());
        Assertions.assertEquals("vlvhbwrnfxtgd", model.value().get(0).displayName().get("pqthehnmnaoya"));
        Assertions.assertEquals("waeeczgfb", model.value().get(0).imageUrl());
        Assertions.assertEquals("c", model.value().get(0).widgetVersion());
        Assertions.assertEquals("t", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WidgetTypeListResult model = new WidgetTypeListResult()
            .withValue(Arrays.asList(new WidgetTypeResourceFormatInner().withDefinition("twvc")
                .withDescription("swkacvej")
                .withDisplayName(
                    mapOf("pqthehnmnaoya", "vlvhbwrnfxtgd", "t", "kcoeqswank", "ktgj", "tmhdroznnhdr", "eml", "sggux"))
                .withImageUrl("waeeczgfb")
                .withWidgetVersion("c")))
            .withNextLink("t");
        model = BinaryData.fromObject(model).toObject(WidgetTypeListResult.class);
        Assertions.assertEquals("twvc", model.value().get(0).definition());
        Assertions.assertEquals("swkacvej", model.value().get(0).description());
        Assertions.assertEquals("vlvhbwrnfxtgd", model.value().get(0).displayName().get("pqthehnmnaoya"));
        Assertions.assertEquals("waeeczgfb", model.value().get(0).imageUrl());
        Assertions.assertEquals("c", model.value().get(0).widgetVersion());
        Assertions.assertEquals("t", model.nextLink());
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
