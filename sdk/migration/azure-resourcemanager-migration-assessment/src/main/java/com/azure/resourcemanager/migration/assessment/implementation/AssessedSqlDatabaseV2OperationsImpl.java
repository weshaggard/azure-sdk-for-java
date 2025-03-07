// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.migration.assessment.fluent.AssessedSqlDatabaseV2OperationsClient;
import com.azure.resourcemanager.migration.assessment.fluent.models.AssessedSqlDatabaseV2Inner;
import com.azure.resourcemanager.migration.assessment.models.AssessedSqlDatabaseV2;
import com.azure.resourcemanager.migration.assessment.models.AssessedSqlDatabaseV2Operations;

public final class AssessedSqlDatabaseV2OperationsImpl implements AssessedSqlDatabaseV2Operations {
    private static final ClientLogger LOGGER = new ClientLogger(AssessedSqlDatabaseV2OperationsImpl.class);

    private final AssessedSqlDatabaseV2OperationsClient innerClient;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    public AssessedSqlDatabaseV2OperationsImpl(AssessedSqlDatabaseV2OperationsClient innerClient,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AssessedSqlDatabaseV2> listBySqlAssessmentV2(String resourceGroupName, String projectName,
        String groupName, String assessmentName) {
        PagedIterable<AssessedSqlDatabaseV2Inner> inner
            = this.serviceClient().listBySqlAssessmentV2(resourceGroupName, projectName, groupName, assessmentName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AssessedSqlDatabaseV2Impl(inner1, this.manager()));
    }

    public PagedIterable<AssessedSqlDatabaseV2> listBySqlAssessmentV2(String resourceGroupName, String projectName,
        String groupName, String assessmentName, String filter, Integer pageSize, String continuationToken,
        Integer totalRecordCount, Context context) {
        PagedIterable<AssessedSqlDatabaseV2Inner> inner = this.serviceClient()
            .listBySqlAssessmentV2(resourceGroupName, projectName, groupName, assessmentName, filter, pageSize,
                continuationToken, totalRecordCount, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AssessedSqlDatabaseV2Impl(inner1, this.manager()));
    }

    public Response<AssessedSqlDatabaseV2> getWithResponse(String resourceGroupName, String projectName,
        String groupName, String assessmentName, String assessedSqlDatabaseName, Context context) {
        Response<AssessedSqlDatabaseV2Inner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, projectName, groupName, assessmentName, assessedSqlDatabaseName,
                context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AssessedSqlDatabaseV2Impl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AssessedSqlDatabaseV2 get(String resourceGroupName, String projectName, String groupName,
        String assessmentName, String assessedSqlDatabaseName) {
        AssessedSqlDatabaseV2Inner inner = this.serviceClient()
            .get(resourceGroupName, projectName, groupName, assessmentName, assessedSqlDatabaseName);
        if (inner != null) {
            return new AssessedSqlDatabaseV2Impl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AssessedSqlDatabaseV2OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }
}
