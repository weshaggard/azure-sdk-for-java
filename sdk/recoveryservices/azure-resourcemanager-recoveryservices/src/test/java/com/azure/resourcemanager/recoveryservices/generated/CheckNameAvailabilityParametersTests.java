// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.CheckNameAvailabilityParameters;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityParameters model
            = BinaryData.fromString("{\"type\":\"lxxwrljdouskc\",\"name\":\"kocrcjdkwtnhx\"}")
                .toObject(CheckNameAvailabilityParameters.class);
        Assertions.assertEquals("lxxwrljdouskc", model.type());
        Assertions.assertEquals("kocrcjdkwtnhx", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityParameters model
            = new CheckNameAvailabilityParameters().withType("lxxwrljdouskc").withName("kocrcjdkwtnhx");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityParameters.class);
        Assertions.assertEquals("lxxwrljdouskc", model.type());
        Assertions.assertEquals("kocrcjdkwtnhx", model.name());
    }
}
