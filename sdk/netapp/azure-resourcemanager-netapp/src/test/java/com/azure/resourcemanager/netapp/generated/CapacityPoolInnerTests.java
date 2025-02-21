// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CapacityPoolInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapacityPoolInner model = BinaryData.fromString(
            "{\"etag\":\"wmdyvxqtay\",\"properties\":{\"poolId\":\"ww\",\"size\":3113078757672630652,\"serviceLevel\":\"Flexible\",\"provisioningState\":\"exrmcqibycnojvk\",\"totalThroughputMibps\":0.19367337,\"utilizedThroughputMibps\":58.457565,\"customThroughputMibps\":19.153065,\"qosType\":\"Auto\",\"coolAccess\":true,\"encryptionType\":\"Single\"},\"location\":\"y\",\"tags\":{\"zlmwlxkvugfhz\":\"vgqzcjrvxd\",\"hnnpr\":\"vawjvzunlu\",\"ultskzbbtdz\":\"xipeilpjzuaejx\",\"ekg\":\"mv\"},\"id\":\"wozuhkf\",\"name\":\"bsjyofdx\",\"type\":\"uusdttouwa\"}")
            .toObject(CapacityPoolInner.class);
        Assertions.assertEquals("y", model.location());
        Assertions.assertEquals("vgqzcjrvxd", model.tags().get("zlmwlxkvugfhz"));
        Assertions.assertEquals(3113078757672630652L, model.size());
        Assertions.assertEquals(ServiceLevel.FLEXIBLE, model.serviceLevel());
        Assertions.assertEquals(19.153065F, model.customThroughputMibps());
        Assertions.assertEquals(QosType.AUTO, model.qosType());
        Assertions.assertEquals(true, model.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, model.encryptionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapacityPoolInner model = new CapacityPoolInner().withLocation("y")
            .withTags(mapOf("zlmwlxkvugfhz", "vgqzcjrvxd", "hnnpr", "vawjvzunlu", "ultskzbbtdz", "xipeilpjzuaejx",
                "ekg", "mv"))
            .withSize(3113078757672630652L)
            .withServiceLevel(ServiceLevel.FLEXIBLE)
            .withCustomThroughputMibps(19.153065F)
            .withQosType(QosType.AUTO)
            .withCoolAccess(true)
            .withEncryptionType(EncryptionType.SINGLE);
        model = BinaryData.fromObject(model).toObject(CapacityPoolInner.class);
        Assertions.assertEquals("y", model.location());
        Assertions.assertEquals("vgqzcjrvxd", model.tags().get("zlmwlxkvugfhz"));
        Assertions.assertEquals(3113078757672630652L, model.size());
        Assertions.assertEquals(ServiceLevel.FLEXIBLE, model.serviceLevel());
        Assertions.assertEquals(19.153065F, model.customThroughputMibps());
        Assertions.assertEquals(QosType.AUTO, model.qosType());
        Assertions.assertEquals(true, model.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, model.encryptionType());
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
