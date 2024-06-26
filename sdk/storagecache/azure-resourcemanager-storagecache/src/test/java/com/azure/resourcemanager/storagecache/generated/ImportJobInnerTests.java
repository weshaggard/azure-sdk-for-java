// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.fluent.models.ImportJobInner;
import com.azure.resourcemanager.storagecache.models.ConflictResolutionMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ImportJobInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportJobInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"importPrefixes\":[\"gxsabkyq\",\"uujitcjc\"],\"conflictResolutionMode\":\"OverwriteAlways\",\"maximumErrors\":1003107077,\"status\":{\"state\":\"Cancelling\",\"statusMessage\":\"rwpdappdsbdkvwrw\",\"totalBlobsWalked\":8907363253188424560,\"blobsWalkedPerSecond\":8087000369487039234,\"totalBlobsImported\":5558562364469410639,\"blobsImportedPerSecond\":7488631932267615574,\"lastCompletionTime\":\"2021-04-28T11:05:16Z\",\"lastStartedTime\":\"2021-11-14T20:48:19Z\",\"totalErrors\":2022069390,\"totalConflicts\":885785432}},\"location\":\"zdatqxhocdg\",\"tags\":{\"icndvkaozwyifty\":\"lgphu\",\"tyxolniwpwc\":\"xhurok\",\"awxklr\":\"kjfkg\"},\"id\":\"plwckbas\",\"name\":\"ypnddhsgcb\",\"type\":\"cph\"}")
            .toObject(ImportJobInner.class);
        Assertions.assertEquals("zdatqxhocdg", model.location());
        Assertions.assertEquals("lgphu", model.tags().get("icndvkaozwyifty"));
        Assertions.assertEquals("gxsabkyq", model.importPrefixes().get(0));
        Assertions.assertEquals(ConflictResolutionMode.OVERWRITE_ALWAYS, model.conflictResolutionMode());
        Assertions.assertEquals(1003107077, model.maximumErrors());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportJobInner model = new ImportJobInner().withLocation("zdatqxhocdg")
            .withTags(mapOf("icndvkaozwyifty", "lgphu", "tyxolniwpwc", "xhurok", "awxklr", "kjfkg"))
            .withImportPrefixes(Arrays.asList("gxsabkyq", "uujitcjc"))
            .withConflictResolutionMode(ConflictResolutionMode.OVERWRITE_ALWAYS)
            .withMaximumErrors(1003107077);
        model = BinaryData.fromObject(model).toObject(ImportJobInner.class);
        Assertions.assertEquals("zdatqxhocdg", model.location());
        Assertions.assertEquals("lgphu", model.tags().get("icndvkaozwyifty"));
        Assertions.assertEquals("gxsabkyq", model.importPrefixes().get(0));
        Assertions.assertEquals(ConflictResolutionMode.OVERWRITE_ALWAYS, model.conflictResolutionMode());
        Assertions.assertEquals(1003107077, model.maximumErrors());
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
