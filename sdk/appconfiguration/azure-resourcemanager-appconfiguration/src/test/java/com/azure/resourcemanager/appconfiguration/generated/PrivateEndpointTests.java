// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.models.PrivateEndpoint;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpoint model = BinaryData.fromString("{\"id\":\"qgoulznd\"}").toObject(PrivateEndpoint.class);
        Assertions.assertEquals("qgoulznd", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpoint model = new PrivateEndpoint().withId("qgoulznd");
        model = BinaryData.fromObject(model).toObject(PrivateEndpoint.class);
        Assertions.assertEquals("qgoulznd", model.id());
    }
}