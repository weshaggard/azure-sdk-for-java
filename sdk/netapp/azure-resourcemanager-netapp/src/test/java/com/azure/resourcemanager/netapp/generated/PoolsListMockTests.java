// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PoolsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"etag\":\"nenlsvxeizzg\",\"properties\":{\"poolId\":\"lnsrmffe\",\"size\":7866065785835008361,\"serviceLevel\":\"Standard\",\"provisioningState\":\"tpiymerteea\",\"totalThroughputMibps\":77.7628,\"utilizedThroughputMibps\":98.79107,\"qosType\":\"Auto\",\"coolAccess\":true,\"encryptionType\":\"Double\"},\"location\":\"rtkgdojbmxvavref\",\"tags\":{\"wprtu\":\"svecuijpxtxs\",\"itvtzeexavo\":\"wsawddjibabxvi\",\"dmdqb\":\"tfgle\"},\"id\":\"pypqtgsfj\",\"name\":\"cbslhhx\",\"type\":\"db\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CapacityPool> response
            = manager.pools().list("jlageu", "ulxunsmjbnkpp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rtkgdojbmxvavref", response.iterator().next().location());
        Assertions.assertEquals("svecuijpxtxs", response.iterator().next().tags().get("wprtu"));
        Assertions.assertEquals(7866065785835008361L, response.iterator().next().size());
        Assertions.assertEquals(ServiceLevel.STANDARD, response.iterator().next().serviceLevel());
        Assertions.assertEquals(QosType.AUTO, response.iterator().next().qosType());
        Assertions.assertEquals(true, response.iterator().next().coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, response.iterator().next().encryptionType());
    }
}
