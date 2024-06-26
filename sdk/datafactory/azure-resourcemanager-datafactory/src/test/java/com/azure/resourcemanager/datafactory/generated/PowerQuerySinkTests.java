// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PowerQuerySinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PowerQuerySink model = BinaryData.fromString(
            "{\"script\":\"ygmgsevm\",\"schemaLinkedService\":{\"referenceName\":\"zenlrstgfcz\",\"parameters\":{\"idt\":\"datan\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"amyyznmrgcdogcv\",\"parameters\":{\"aqm\":\"dataytoxuwhttnzq\",\"dzzmssgpgv\":\"databgszplusdek\",\"squnycwztlv\":\"datakyejidbdq\"}},\"name\":\"wsnmrkkyjt\",\"description\":\"pwpwfkcauxuva\",\"dataset\":{\"referenceName\":\"pfpdof\",\"parameters\":{\"evsolzwilf\":\"dataclbtxl\",\"uuxjxhfx\":\"datagojfsqe\",\"mbmxbmbrwgzzxl\":\"datajwpdkkt\",\"dmhweqjfyxydgto\":\"databkhxsdplaum\"}},\"linkedService\":{\"referenceName\":\"qbvwglgw\",\"parameters\":{\"mqiydvxcgdh\":\"dataxakglhpsesrfg\",\"cbqp\":\"datahgoqgsoyqyxyj\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"pglqjo\",\"datasetParameters\":\"datadahneaoovty\",\"parameters\":{\"fsr\":\"dataivfwjlofze\",\"jvcfoczh\":\"dataaukl\"},\"\":{\"yrza\":\"datajovtkwxnhwhhn\"}}}")
            .toObject(PowerQuerySink.class);
        Assertions.assertEquals("wsnmrkkyjt", model.name());
        Assertions.assertEquals("pwpwfkcauxuva", model.description());
        Assertions.assertEquals("pfpdof", model.dataset().referenceName());
        Assertions.assertEquals("qbvwglgw", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("pglqjo", model.flowlet().referenceName());
        Assertions.assertEquals("zenlrstgfcz", model.schemaLinkedService().referenceName());
        Assertions.assertEquals("amyyznmrgcdogcv", model.rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("ygmgsevm", model.script());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PowerQuerySink model
            = new PowerQuerySink().withName("wsnmrkkyjt")
                .withDescription("pwpwfkcauxuva")
                .withDataset(new DatasetReference().withReferenceName("pfpdof")
                    .withParameters(mapOf("evsolzwilf", "dataclbtxl", "uuxjxhfx", "datagojfsqe", "mbmxbmbrwgzzxl",
                        "datajwpdkkt", "dmhweqjfyxydgto", "databkhxsdplaum")))
                .withLinkedService(new LinkedServiceReference().withReferenceName("qbvwglgw")
                    .withParameters(mapOf("mqiydvxcgdh", "dataxakglhpsesrfg", "cbqp", "datahgoqgsoyqyxyj")))
                .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                    .withReferenceName("pglqjo")
                    .withDatasetParameters("datadahneaoovty")
                    .withParameters(mapOf("fsr", "dataivfwjlofze", "jvcfoczh", "dataaukl"))
                    .withAdditionalProperties(mapOf()))
                .withSchemaLinkedService(
                    new LinkedServiceReference().withReferenceName("zenlrstgfcz").withParameters(mapOf("idt", "datan")))
                .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("amyyznmrgcdogcv")
                    .withParameters(mapOf("aqm", "dataytoxuwhttnzq", "dzzmssgpgv", "databgszplusdek", "squnycwztlv",
                        "datakyejidbdq")))
                .withScript("ygmgsevm");
        model = BinaryData.fromObject(model).toObject(PowerQuerySink.class);
        Assertions.assertEquals("wsnmrkkyjt", model.name());
        Assertions.assertEquals("pwpwfkcauxuva", model.description());
        Assertions.assertEquals("pfpdof", model.dataset().referenceName());
        Assertions.assertEquals("qbvwglgw", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("pglqjo", model.flowlet().referenceName());
        Assertions.assertEquals("zenlrstgfcz", model.schemaLinkedService().referenceName());
        Assertions.assertEquals("amyyznmrgcdogcv", model.rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("ygmgsevm", model.script());
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
