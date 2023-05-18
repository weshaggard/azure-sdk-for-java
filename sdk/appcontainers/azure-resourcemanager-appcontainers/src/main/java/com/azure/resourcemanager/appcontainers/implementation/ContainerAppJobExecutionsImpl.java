// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppJobExecutionsInner;
import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionInner;
import com.azure.resourcemanager.appcontainers.models.ContainerAppJobExecutions;
import com.azure.resourcemanager.appcontainers.models.JobExecution;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ContainerAppJobExecutionsImpl implements ContainerAppJobExecutions {
    private ContainerAppJobExecutionsInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    ContainerAppJobExecutionsImpl(
        ContainerAppJobExecutionsInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<JobExecution> value() {
        List<JobExecutionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new JobExecutionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ContainerAppJobExecutionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}