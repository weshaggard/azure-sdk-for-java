// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentAlertListInner;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.SecurityAlert;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IncidentAlertListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IncidentAlertListInner model = BinaryData.fromString(
            "{\"value\":[{\"kind\":\"SecurityAlert\",\"properties\":{\"alertDisplayName\":\"sofieypefojyqd\",\"alertType\":\"u\",\"compromisedEntity\":\"cp\",\"confidenceLevel\":\"Unknown\",\"confidenceReasons\":[{\"reason\":\"hihlhzdsqtzbs\",\"reasonType\":\"nowc\"},{\"reason\":\"fgmvecactxmwo\",\"reasonType\":\"yowc\"},{\"reason\":\"qovekqvgqou\",\"reasonType\":\"fzmpjwyivq\"},{\"reason\":\"f\",\"reasonType\":\"vhrfsphuagrt\"}],\"confidenceScore\":52.23238295786751,\"confidenceScoreStatus\":\"InProcess\",\"description\":\"qcz\",\"endTimeUtc\":\"2021-12-08T16:17:07Z\",\"intent\":\"Exploitation\",\"providerAlertId\":\"ubyjaffmmf\",\"processingEndTime\":\"2021-09-28T19:04:07Z\",\"productComponentName\":\"cuubgq\",\"productName\":\"rtalmet\",\"productVersion\":\"wgdsl\",\"remediationSteps\":[\"hhrmooizqsey\",\"xiutcx\"],\"severity\":\"Medium\",\"startTimeUtc\":\"2021-08-22T21:59:05Z\",\"status\":\"Resolved\",\"systemAlertId\":\"togebjoxsl\",\"tactics\":[\"Persistence\"],\"timeGenerated\":\"2021-01-08T11:03:25Z\",\"vendorName\":\"rqnkkzjcjbtr\",\"alertLink\":\"ehvvib\",\"resourceIdentifiers\":[\"datajsto\"],\"additionalData\":{\"kxzt\":\"datait\",\"pimaqxzhemjyh\":\"dataoobklftidgfcwq\",\"bawpfajnjwltlwt\":\"datahujswtwkozzwcul\"},\"friendlyName\":\"guk\"},\"id\":\"lhsnvkcdmx\",\"name\":\"rpoaimlnwi\",\"type\":\"aomylwea\"},{\"kind\":\"SecurityAlert\",\"properties\":{\"alertDisplayName\":\"cse\",\"alertType\":\"wwnpj\",\"compromisedEntity\":\"fz\",\"confidenceLevel\":\"High\",\"confidenceReasons\":[{\"reason\":\"ahfbous\",\"reasonType\":\"epgfew\"},{\"reason\":\"wlyxgncxyk\",\"reasonType\":\"djhlimm\"},{\"reason\":\"x\",\"reasonType\":\"bcporxvxcjzhqizx\"}],\"confidenceScore\":81.57777603551037,\"confidenceScoreStatus\":\"NotFinal\",\"description\":\"cja\",\"endTimeUtc\":\"2021-06-14T14:33:43Z\",\"intent\":\"Persistence\",\"providerAlertId\":\"dqazkmtgguwpijra\",\"processingEndTime\":\"2021-01-09T21:04Z\",\"productComponentName\":\"m\",\"productName\":\"hfcf\",\"productVersion\":\"rxgkne\",\"remediationSteps\":[\"inzqodfvpgs\",\"oxgsgbpfgzdjtx\",\"zflbqvg\"],\"severity\":\"High\",\"startTimeUtc\":\"2021-07-03T13:37:31Z\",\"status\":\"Unknown\",\"systemAlertId\":\"qusrdvetnws\",\"tactics\":[\"InitialAccess\"],\"timeGenerated\":\"2021-10-27T19:57:47Z\",\"vendorName\":\"duy\",\"alertLink\":\"uzhyrmewipmvekdx\",\"resourceIdentifiers\":[\"dataqgsjjxun\",\"dataxgketwz\"],\"additionalData\":{\"neqsxvmh\":\"datajhfjmhvvmuvgpm\",\"as\":\"databuzjyih\",\"nsqyrpfoobrltt\":\"datahudypohyuemsl\"},\"friendlyName\":\"sjnygqdnfwqzdzgt\"},\"id\":\"axhnfh\",\"name\":\"lyvijouwiv\",\"type\":\"xoyzunbix\"}]}")
            .toObject(IncidentAlertListInner.class);
        Assertions.assertEquals(AlertSeverity.MEDIUM, model.value().get(0).severity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IncidentAlertListInner model = new IncidentAlertListInner()
            .withValue(Arrays.asList(new SecurityAlert().withSeverity(AlertSeverity.MEDIUM),
                new SecurityAlert().withSeverity(AlertSeverity.HIGH)));
        model = BinaryData.fromObject(model).toObject(IncidentAlertListInner.class);
        Assertions.assertEquals(AlertSeverity.MEDIUM, model.value().get(0).severity());
    }
}
