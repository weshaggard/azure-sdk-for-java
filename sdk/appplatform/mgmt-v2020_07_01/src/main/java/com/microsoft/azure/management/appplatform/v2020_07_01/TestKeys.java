/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2020_07_01.implementation.AppPlatformManager;
import com.microsoft.azure.management.appplatform.v2020_07_01.implementation.TestKeysInner;

/**
 * Type representing TestKeys.
 */
public interface TestKeys extends HasInner<TestKeysInner>, HasManager<AppPlatformManager> {
    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the primaryTestEndpoint value.
     */
    String primaryTestEndpoint();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * @return the secondaryTestEndpoint value.
     */
    String secondaryTestEndpoint();

}
