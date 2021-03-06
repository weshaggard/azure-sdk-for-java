/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolConnectionPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolConnectionPolicy;

class SqlPoolConnectionPoliciesImpl extends WrapperImpl<SqlPoolConnectionPoliciesInner> implements SqlPoolConnectionPolicies {
    private final SynapseManager manager;

    SqlPoolConnectionPoliciesImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolConnectionPolicies());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private SqlPoolConnectionPolicyImpl wrapModel(SqlPoolConnectionPolicyInner inner) {
        return  new SqlPoolConnectionPolicyImpl(inner, manager());
    }

    @Override
    public Observable<SqlPoolConnectionPolicy> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolConnectionPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMap(new Func1<SqlPoolConnectionPolicyInner, Observable<SqlPoolConnectionPolicy>>() {
            @Override
            public Observable<SqlPoolConnectionPolicy> call(SqlPoolConnectionPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlPoolConnectionPolicy)wrapModel(inner));
                }
            }
       });
    }

}
