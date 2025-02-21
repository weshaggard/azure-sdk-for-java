// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.RecipientEmailContractProperties;
import org.junit.jupiter.api.Assertions;

public final class RecipientEmailContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecipientEmailContractProperties model
            = BinaryData.fromString("{\"email\":\"ibmg\"}").toObject(RecipientEmailContractProperties.class);
        Assertions.assertEquals("ibmg", model.email());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecipientEmailContractProperties model = new RecipientEmailContractProperties().withEmail("ibmg");
        model = BinaryData.fromObject(model).toObject(RecipientEmailContractProperties.class);
        Assertions.assertEquals("ibmg", model.email());
    }
}
