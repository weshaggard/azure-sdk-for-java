// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PaypalSource;

public final class PaypalSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PaypalSource model = BinaryData.fromString(
            "{\"type\":\"wld\",\"query\":\"datadeqqbdcbnr\",\"queryTimeout\":\"datatgtn\",\"additionalColumns\":\"datasopuwesmxodyto\",\"sourceRetryCount\":\"datan\",\"sourceRetryWait\":\"datasdgmuaqtqn\",\"maxConcurrentConnections\":\"datasiptzgomujuken\",\"disableMetricsCollection\":\"datayombkgky\",\"\":{\"kzxrmmoy\":\"dataihprvokodrpy\",\"xoubekafdxgtgcfk\":\"dataufkxy\",\"m\":\"dataaeu\"}}")
            .toObject(PaypalSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PaypalSource model = new PaypalSource().withSourceRetryCount("datan")
            .withSourceRetryWait("datasdgmuaqtqn")
            .withMaxConcurrentConnections("datasiptzgomujuken")
            .withDisableMetricsCollection("datayombkgky")
            .withQueryTimeout("datatgtn")
            .withAdditionalColumns("datasopuwesmxodyto")
            .withQuery("datadeqqbdcbnr");
        model = BinaryData.fromObject(model).toObject(PaypalSource.class);
    }
}
