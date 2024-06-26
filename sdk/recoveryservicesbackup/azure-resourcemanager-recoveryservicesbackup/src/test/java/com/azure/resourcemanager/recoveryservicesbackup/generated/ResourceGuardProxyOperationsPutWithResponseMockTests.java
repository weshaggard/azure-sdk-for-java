// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardOperationDetail;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBase;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBaseResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceGuardProxyOperationsPutWithResponseMockTests {
    @Test
    public void testPutWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"resourceGuardResourceId\":\"ykykip\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"epfnoc\",\"defaultResourceRequest\":\"ezacfpztga\"},{\"vaultCriticalOperation\":\"yqejga\",\"defaultResourceRequest\":\"kctgkp\"}],\"lastUpdatedTime\":\"kqzkcyzmff\",\"description\":\"dyfcix\"},\"eTag\":\"lcqvhoejgoiutgw\",\"location\":\"mkahpqha\",\"tags\":{\"hncogmipnml\":\"tac\",\"v\":\"q\"},\"id\":\"bhikeaqgr\",\"name\":\"gpomxpu\",\"type\":\"dtsdfjy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ResourceGuardProxyBaseResource response = manager.resourceGuardProxyOperations()
            .define("fcm")
            .withRegion("vfqbqna")
            .withExistingVault("gubsrtmdylpe", "pilttjzgc")
            .withTags(mapOf("yvdgxlyzk", "yenzsieuscpl"))
            .withProperties(new ResourceGuardProxyBase().withResourceGuardResourceId("fbodetresrgvts")
                .withResourceGuardOperationDetails(Arrays.asList(
                    new ResourceGuardOperationDetail().withVaultCriticalOperation("t")
                        .withDefaultResourceRequest("ivmuqkevzgjyp"),
                    new ResourceGuardOperationDetail().withVaultCriticalOperation("hxmpdxxz")
                        .withDefaultResourceRequest("wwzjwotnxlkfhglh")))
                .withLastUpdatedTime("oxqwecrsnhpcse")
                .withDescription("xovppqibukklvzr"))
            .withEtag("mlccmetjscz")
            .create();

        Assertions.assertEquals("mkahpqha", response.location());
        Assertions.assertEquals("tac", response.tags().get("hncogmipnml"));
        Assertions.assertEquals("ykykip", response.properties().resourceGuardResourceId());
        Assertions.assertEquals("epfnoc",
            response.properties().resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions.assertEquals("ezacfpztga",
            response.properties().resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("kqzkcyzmff", response.properties().lastUpdatedTime());
        Assertions.assertEquals("dyfcix", response.properties().description());
        Assertions.assertEquals("lcqvhoejgoiutgw", response.etag());
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
