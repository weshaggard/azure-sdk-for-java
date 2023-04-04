// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.cancerprofiling.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the Onco Phenotype inference. */
public final class OncoPhenotypeInferenceType extends ExpandableStringEnum<OncoPhenotypeInferenceType> {
    /** Static value tumorSite for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType TUMOR_SITE = fromString("tumorSite");

    /** Static value histology for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType HISTOLOGY = fromString("histology");

    /** Static value clinicalStageT for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType CLINICAL_STAGET = fromString("clinicalStageT");

    /** Static value clinicalStageN for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType CLINICAL_STAGEN = fromString("clinicalStageN");

    /** Static value clinicalStageM for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType CLINICAL_STAGEM = fromString("clinicalStageM");

    /** Static value pathologicStageT for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType PATHOLOGIC_STAGET = fromString("pathologicStageT");

    /** Static value pathologicStageN for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType PATHOLOGIC_STAGEN = fromString("pathologicStageN");

    /** Static value pathologicStageM for OncoPhenotypeInferenceType. */
    public static final OncoPhenotypeInferenceType PATHOLOGIC_STAGEM = fromString("pathologicStageM");

    /**
     * Creates a new instance of OncoPhenotypeInferenceType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OncoPhenotypeInferenceType() {}

    /**
     * Creates or finds a OncoPhenotypeInferenceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OncoPhenotypeInferenceType.
     */
    @JsonCreator
    public static OncoPhenotypeInferenceType fromString(String name) {
        return fromString(name, OncoPhenotypeInferenceType.class);
    }

    /**
     * Gets known OncoPhenotypeInferenceType values.
     *
     * @return known OncoPhenotypeInferenceType values.
     */
    public static Collection<OncoPhenotypeInferenceType> values() {
        return values(OncoPhenotypeInferenceType.class);
    }
}