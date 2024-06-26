// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager;
import com.azure.resourcemanager.redisenterprise.models.AofFrequency;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.Database;
import com.azure.resourcemanager.redisenterprise.models.DeferUpgradeSetting;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.RdbFrequency;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DatabasesListByClusterMockTests {
    @Test
    public void testListByCluster() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"clientProtocol\":\"Encrypted\",\"port\":670634549,\"provisioningState\":\"Deleting\",\"resourceState\":\"CreateFailed\",\"clusteringPolicy\":\"EnterpriseCluster\",\"evictionPolicy\":\"AllKeysLFU\",\"persistence\":{\"aofEnabled\":true,\"rdbEnabled\":false,\"aofFrequency\":\"1s\",\"rdbFrequency\":\"1h\"},\"modules\":[{\"name\":\"glcuhxwtctyqi\",\"args\":\"bbovplwzbhvgyugu\",\"version\":\"vmkfssxqu\"}],\"geoReplication\":{\"groupNickname\":\"plgmgsxnk\",\"linkedDatabases\":[{\"id\":\"es\",\"state\":\"Linking\"}]},\"redisVersion\":\"opwi\",\"deferUpgrade\":\"Deferred\"},\"id\":\"hxpkd\",\"name\":\"zb\",\"type\":\"iuebbaumny\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RedisEnterpriseManager manager = RedisEnterpriseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Database> response
            = manager.databases().listByCluster("kzjancuxrhdwbav", "bniwdj", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(Protocol.ENCRYPTED, response.iterator().next().clientProtocol());
        Assertions.assertEquals(670634549, response.iterator().next().port());
        Assertions.assertEquals(ClusteringPolicy.ENTERPRISE_CLUSTER, response.iterator().next().clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.ALL_KEYS_LFU, response.iterator().next().evictionPolicy());
        Assertions.assertEquals(true, response.iterator().next().persistence().aofEnabled());
        Assertions.assertEquals(false, response.iterator().next().persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ONES, response.iterator().next().persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.ONEH, response.iterator().next().persistence().rdbFrequency());
        Assertions.assertEquals("glcuhxwtctyqi", response.iterator().next().modules().get(0).name());
        Assertions.assertEquals("bbovplwzbhvgyugu", response.iterator().next().modules().get(0).args());
        Assertions.assertEquals("plgmgsxnk", response.iterator().next().geoReplication().groupNickname());
        Assertions.assertEquals("es", response.iterator().next().geoReplication().linkedDatabases().get(0).id());
        Assertions.assertEquals(DeferUpgradeSetting.DEFERRED, response.iterator().next().deferUpgrade());
    }
}
