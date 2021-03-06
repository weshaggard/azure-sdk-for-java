/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.LogAnalyticsManager;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.SavedSearchesListResultInner;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.SavedSearchInner;
import java.util.List;

/**
 * Type representing SavedSearchesListResult.
 */
public interface SavedSearchesListResult extends HasInner<SavedSearchesListResultInner>, HasManager<LogAnalyticsManager> {
    /**
     * @return the value value.
     */
    List<SavedSearchInner> value();

}
