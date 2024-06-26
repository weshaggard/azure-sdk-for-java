// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitLabGroup;
import com.azure.resourcemanager.security.models.OnboardingState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GitLabGroupsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"eql\",\"provisioningStatusUpdateTimeUtc\":\"2021-06-01T19:24:01Z\",\"provisioningState\":\"Pending\",\"fullyQualifiedName\":\"izeqlc\",\"fullyQualifiedFriendlyName\":\"qnofkwhg\",\"url\":\"wfyfdbvooelmikds\",\"onboardingState\":\"NotOnboarded\"},\"id\":\"kgjj\",\"name\":\"mvsiy\",\"type\":\"mlmwj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<GitLabGroup> response
            = manager.gitLabGroups().list("qepeftmub", "l", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(DevOpsProvisioningState.PENDING,
            response.iterator().next().properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED,
            response.iterator().next().properties().onboardingState());
    }
}
