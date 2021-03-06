/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.kusto.v2020_02_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2020_02_15.AttachedDatabaseConfigurations;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.kusto.v2020_02_15.AttachedDatabaseConfiguration;

class AttachedDatabaseConfigurationsImpl extends WrapperImpl<AttachedDatabaseConfigurationsInner> implements AttachedDatabaseConfigurations {
    private final KustoManager manager;

    AttachedDatabaseConfigurationsImpl(KustoManager manager) {
        super(manager.inner().attachedDatabaseConfigurations());
        this.manager = manager;
    }

    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public AttachedDatabaseConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    private AttachedDatabaseConfigurationImpl wrapModel(AttachedDatabaseConfigurationInner inner) {
        return  new AttachedDatabaseConfigurationImpl(inner, manager());
    }

    private AttachedDatabaseConfigurationImpl wrapModel(String name) {
        return new AttachedDatabaseConfigurationImpl(name, this.manager());
    }

    @Override
    public Observable<AttachedDatabaseConfiguration> listByClusterAsync(String resourceGroupName, String clusterName) {
        AttachedDatabaseConfigurationsInner client = this.inner();
        return client.listByClusterAsync(resourceGroupName, clusterName)
        .flatMap(new Func1<List<AttachedDatabaseConfigurationInner>, Observable<AttachedDatabaseConfigurationInner>>() {
            @Override
            public Observable<AttachedDatabaseConfigurationInner> call(List<AttachedDatabaseConfigurationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<AttachedDatabaseConfigurationInner, AttachedDatabaseConfiguration>() {
            @Override
            public AttachedDatabaseConfiguration call(AttachedDatabaseConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<AttachedDatabaseConfiguration> getAsync(String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName) {
        AttachedDatabaseConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, attachedDatabaseConfigurationName)
        .flatMap(new Func1<AttachedDatabaseConfigurationInner, Observable<AttachedDatabaseConfiguration>>() {
            @Override
            public Observable<AttachedDatabaseConfiguration> call(AttachedDatabaseConfigurationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AttachedDatabaseConfiguration)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName) {
        AttachedDatabaseConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, attachedDatabaseConfigurationName).toCompletable();
    }

}
