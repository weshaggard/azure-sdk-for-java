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
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProtectionPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"backupManagementType\":\"ProtectionPolicy\",\"protectedItemsCount\":1415414821,\"resourceGuardOperationRequests\":[\"fcmfcn\",\"jajqmatxjt\"]},\"eTag\":\"ln\",\"location\":\"qgxxgfbb\",\"tags\":{\"calincryqxz\":\"pqagynoiprn\",\"mqimiymqru\":\"aqzi\"},\"id\":\"guhfupe\",\"name\":\"asvvoqsbpkfl\",\"type\":\"nfkgxsyaowuzowpu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProtectionPolicyResource response = manager.protectionPolicies()
            .getWithResponse("pvksmit", "sqxtltclkrdpq", "fhyrfrakk", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("qgxxgfbb", response.location());
        Assertions.assertEquals("pqagynoiprn", response.tags().get("calincryqxz"));
        Assertions.assertEquals(1415414821, response.properties().protectedItemsCount());
        Assertions.assertEquals("fcmfcn", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("ln", response.etag());
    }
}
