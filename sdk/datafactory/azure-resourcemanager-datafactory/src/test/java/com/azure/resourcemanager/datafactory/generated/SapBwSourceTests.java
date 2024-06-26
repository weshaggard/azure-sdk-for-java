// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapBwSource;

public final class SapBwSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapBwSource model = BinaryData.fromString(
            "{\"type\":\"mq\",\"query\":\"datahllmblls\",\"queryTimeout\":\"datajjrhxornuoqpob\",\"additionalColumns\":\"datarsdx\",\"sourceRetryCount\":\"dataxbqyavcxjols\",\"sourceRetryWait\":\"datai\",\"maxConcurrentConnections\":\"datapnms\",\"disableMetricsCollection\":\"datantakr\",\"\":{\"uwcmzpwk\":\"dataurf\"}}")
            .toObject(SapBwSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapBwSource model = new SapBwSource().withSourceRetryCount("dataxbqyavcxjols")
            .withSourceRetryWait("datai")
            .withMaxConcurrentConnections("datapnms")
            .withDisableMetricsCollection("datantakr")
            .withQueryTimeout("datajjrhxornuoqpob")
            .withAdditionalColumns("datarsdx")
            .withQuery("datahllmblls");
        model = BinaryData.fromObject(model).toObject(SapBwSource.class);
    }
}
