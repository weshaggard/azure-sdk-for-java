// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enumeration of supported long-running Text Analysis tasks.
 */
public final class AnalyzeTextLROTaskKind extends ExpandableStringEnum<AnalyzeTextLROTaskKind> {
    /**
     * Static value SentimentAnalysis for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind SENTIMENT_ANALYSIS = fromString("SentimentAnalysis");

    /**
     * Static value EntityRecognition for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind ENTITY_RECOGNITION = fromString("EntityRecognition");

    /**
     * Static value PiiEntityRecognition for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind PII_ENTITY_RECOGNITION = fromString("PiiEntityRecognition");

    /**
     * Static value KeyPhraseExtraction for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind KEY_PHRASE_EXTRACTION = fromString("KeyPhraseExtraction");

    /**
     * Static value EntityLinking for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind ENTITY_LINKING = fromString("EntityLinking");

    /**
     * Static value Healthcare for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind HEALTHCARE = fromString("Healthcare");

    /**
     * Static value ExtractiveSummarization for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind EXTRACTIVE_SUMMARIZATION = fromString("ExtractiveSummarization");

    /**
     * Static value CustomEntityRecognition for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind CUSTOM_ENTITY_RECOGNITION = fromString("CustomEntityRecognition");

    /**
     * Static value CustomSingleLabelClassification for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind CUSTOM_SINGLE_LABEL_CLASSIFICATION
        = fromString("CustomSingleLabelClassification");

    /**
     * Static value CustomMultiLabelClassification for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind CUSTOM_MULTI_LABEL_CLASSIFICATION
        = fromString("CustomMultiLabelClassification");

    /**
     * Static value AbstractiveSummarization for AnalyzeTextLROTaskKind.
     */
    @Generated
    public static final AnalyzeTextLROTaskKind ABSTRACTIVE_SUMMARIZATION = fromString("AbstractiveSummarization");

    /**
     * Creates a new instance of AnalyzeTextLROTaskKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AnalyzeTextLROTaskKind() {
    }

    /**
     * Creates or finds a AnalyzeTextLROTaskKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AnalyzeTextLROTaskKind.
     */
    @Generated
    public static AnalyzeTextLROTaskKind fromString(String name) {
        return fromString(name, AnalyzeTextLROTaskKind.class);
    }

    /**
     * Gets known AnalyzeTextLROTaskKind values.
     * 
     * @return known AnalyzeTextLROTaskKind values.
     */
    @Generated
    public static Collection<AnalyzeTextLROTaskKind> values() {
        return values(AnalyzeTextLROTaskKind.class);
    }
}
