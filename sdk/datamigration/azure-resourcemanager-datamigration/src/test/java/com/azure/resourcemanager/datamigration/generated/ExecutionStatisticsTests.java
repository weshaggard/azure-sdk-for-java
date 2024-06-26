// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ExecutionStatistics;
import com.azure.resourcemanager.datamigration.models.WaitStatistics;
import java.util.HashMap;
import java.util.Map;

public final class ExecutionStatisticsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecutionStatistics model =
            BinaryData
                .fromString(
                    "{\"executionCount\":8797893448307273762,\"cpuTimeMs\":80.684784,\"elapsedTimeMs\":89.05603,\"waitStats\":{\"krsgsgb\":{\"waitType\":\"ijf\",\"waitTimeMs\":15.637827,\"waitCount\":1131525087104993997},\"h\":{\"waitType\":\"uzqgnjdgkynsc\",\"waitTimeMs\":66.948456,\"waitCount\":6628803404275129574},\"ihfrbbcevqa\":{\"waitType\":\"komtkubotppn\",\"waitTimeMs\":8.019334,\"waitCount\":8531774854785485311},\"jpykvgtrdcnifmzz\":{\"waitType\":\"ltd\",\"waitTimeMs\":39.743866,\"waitCount\":5464382079076792981}},\"hasErrors\":true,\"sqlErrors\":[\"rnysux\"]}")
                .toObject(ExecutionStatistics.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecutionStatistics model =
            new ExecutionStatistics()
                .withWaitStats(
                    mapOf(
                        "krsgsgb",
                        new WaitStatistics(),
                        "h",
                        new WaitStatistics(),
                        "ihfrbbcevqa",
                        new WaitStatistics(),
                        "jpykvgtrdcnifmzz",
                        new WaitStatistics()));
        model = BinaryData.fromObject(model).toObject(ExecutionStatistics.class);
    }

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
