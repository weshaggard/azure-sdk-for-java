// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.models.DeviceConfiguration;

public final class DeviceConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeviceConfiguration model
            = BinaryData.fromString("{\"deviceVersion\":\"tvfcivfsn\",\"identitySystem\":\"AzureAD\"}")
                .toObject(DeviceConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeviceConfiguration model = new DeviceConfiguration();
        model = BinaryData.fromObject(model).toObject(DeviceConfiguration.class);
    }
}
