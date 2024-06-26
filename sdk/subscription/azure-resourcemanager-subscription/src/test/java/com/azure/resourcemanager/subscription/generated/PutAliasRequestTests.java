// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.subscription.models.PutAliasRequest;
import com.azure.resourcemanager.subscription.models.PutAliasRequestProperties;
import com.azure.resourcemanager.subscription.models.Workload;
import org.junit.jupiter.api.Assertions;

public final class PutAliasRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PutAliasRequest model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"ouqfprwz\",\"workload\":\"DevTest\",\"billingScope\":\"uitnwuiz\",\"subscriptionId\":\"zxufiz\",\"resellerId\":\"kyfi\"}}")
                .toObject(PutAliasRequest.class);
        Assertions.assertEquals("ouqfprwz", model.properties().displayName());
        Assertions.assertEquals(Workload.DEV_TEST, model.properties().workload());
        Assertions.assertEquals("uitnwuiz", model.properties().billingScope());
        Assertions.assertEquals("zxufiz", model.properties().subscriptionId());
        Assertions.assertEquals("kyfi", model.properties().resellerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PutAliasRequest model =
            new PutAliasRequest()
                .withProperties(
                    new PutAliasRequestProperties()
                        .withDisplayName("ouqfprwz")
                        .withWorkload(Workload.DEV_TEST)
                        .withBillingScope("uitnwuiz")
                        .withSubscriptionId("zxufiz")
                        .withResellerId("kyfi"));
        model = BinaryData.fromObject(model).toObject(PutAliasRequest.class);
        Assertions.assertEquals("ouqfprwz", model.properties().displayName());
        Assertions.assertEquals(Workload.DEV_TEST, model.properties().workload());
        Assertions.assertEquals("uitnwuiz", model.properties().billingScope());
        Assertions.assertEquals("zxufiz", model.properties().subscriptionId());
        Assertions.assertEquals("kyfi", model.properties().resellerId());
    }
}
