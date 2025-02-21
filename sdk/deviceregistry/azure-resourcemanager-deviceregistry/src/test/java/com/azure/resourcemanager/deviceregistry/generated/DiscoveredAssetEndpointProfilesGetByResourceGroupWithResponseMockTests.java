// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.deviceregistry.DeviceRegistryManager;
import com.azure.resourcemanager.deviceregistry.models.AuthenticationMethod;
import com.azure.resourcemanager.deviceregistry.models.DiscoveredAssetEndpointProfile;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DiscoveredAssetEndpointProfilesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"targetAddress\":\"xkgymareqnajxqu\",\"additionalConfiguration\":\"hky\",\"supportedAuthenticationMethods\":[\"Anonymous\",\"UsernamePassword\",\"Anonymous\"],\"endpointProfileType\":\"gssofwq\",\"discoveryId\":\"zqalkrmnjijpx\",\"version\":6013226485484313004,\"provisioningState\":\"Succeeded\"},\"extendedLocation\":{\"type\":\"dfnbyxbaaabjyv\",\"name\":\"yffimrzrtuzqogs\"},\"location\":\"nevfdnw\",\"tags\":{\"ud\":\"ewzsyyceuzsoib\",\"brqubp\":\"frxtrthzvaytdwk\"},\"id\":\"xhexiilivpdti\",\"name\":\"r\",\"type\":\"tdqoaxoruzfgsq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DeviceRegistryManager manager = DeviceRegistryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DiscoveredAssetEndpointProfile response = manager.discoveredAssetEndpointProfiles()
            .getByResourceGroupWithResponse("ywdmjsjqbjh", "yxxrwlycoduh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("nevfdnw", response.location());
        Assertions.assertEquals("ewzsyyceuzsoib", response.tags().get("ud"));
        Assertions.assertEquals("xkgymareqnajxqu", response.properties().targetAddress());
        Assertions.assertEquals("hky", response.properties().additionalConfiguration());
        Assertions.assertEquals(AuthenticationMethod.ANONYMOUS,
            response.properties().supportedAuthenticationMethods().get(0));
        Assertions.assertEquals("gssofwq", response.properties().endpointProfileType());
        Assertions.assertEquals("zqalkrmnjijpx", response.properties().discoveryId());
        Assertions.assertEquals(6013226485484313004L, response.properties().version());
        Assertions.assertEquals("dfnbyxbaaabjyv", response.extendedLocation().type());
        Assertions.assertEquals("yffimrzrtuzqogs", response.extendedLocation().name());
    }
}
