// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.B2BPartnerContent;
import com.azure.resourcemanager.logic.models.BusinessIdentity;
import com.azure.resourcemanager.logic.models.IntegrationAccountPartner;
import com.azure.resourcemanager.logic.models.PartnerContent;
import com.azure.resourcemanager.logic.models.PartnerType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationAccountPartnersCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"partnerType\":\"B2B\",\"createdTime\":\"2021-10-30T09:46:10Z\",\"changedTime\":\"2021-09-06T02:07:05Z\",\"metadata\":\"dataf\",\"content\":{\"b2b\":{\"businessIdentities\":[{\"qualifier\":\"bmhqy\",\"value\":\"rsywiscoqtvx\"},{\"qualifier\":\"ipchdpdev\",\"value\":\"mpoqkc\"},{\"qualifier\":\"kfesh\",\"value\":\"omtvkxps\"},{\"qualifier\":\"lpyp\",\"value\":\"gdetydqgyhuy\"}]}}},\"location\":\"utspocr\",\"tags\":{\"ftjigtqyzoc\":\"raapczmzi\",\"lciooxybmktbwdfj\":\"yywc\",\"j\":\"epycpw\",\"icknsbbc\":\"kuhrtqnbdgc\"},\"id\":\"bqxwojvejxh\",\"name\":\"eolzftfyjcen\",\"type\":\"idlpmlxhzwyy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogicManager manager = LogicManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationAccountPartner response = manager.integrationAccountPartners()
            .define("cahdagchk")
            .withRegion("kn")
            .withExistingIntegrationAccount("oiqsrqebjg", "fm")
            .withPartnerType(PartnerType.B2B)
            .withContent(new PartnerContent().withB2B(new B2BPartnerContent()
                .withBusinessIdentities(Arrays.asList(new BusinessIdentity().withQualifier("yebarw").withValue("mnxpp"),
                    new BusinessIdentity().withQualifier("fep").withValue("nedjvataeao")))))
            .withTags(mapOf("bgpwz", "vvkfbmrppjfce", "mvzc", "qewixnmvd", "xwihnpyexjrguzi", "cgftelim"))
            .withMetadata("dataaomqqbslwxcfj")
            .create();

        Assertions.assertEquals("utspocr", response.location());
        Assertions.assertEquals("raapczmzi", response.tags().get("ftjigtqyzoc"));
        Assertions.assertEquals(PartnerType.B2B, response.partnerType());
        Assertions.assertEquals("bmhqy", response.content().b2B().businessIdentities().get(0).qualifier());
        Assertions.assertEquals("rsywiscoqtvx", response.content().b2B().businessIdentities().get(0).value());
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
