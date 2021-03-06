/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Evaluation details of policy language expressions.
 */
public class ExpressionEvaluationDetails {
    /**
     * Evaluation result.
     */
    @JsonProperty(value = "result")
    private String result;

    /**
     * Expression evaluated.
     */
    @JsonProperty(value = "expression")
    private String expression;

    /**
     * Property path if the expression is a field or an alias.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Value of the expression.
     */
    @JsonProperty(value = "expressionValue")
    private Object expressionValue;

    /**
     * Target value to be compared with the expression value.
     */
    @JsonProperty(value = "targetValue")
    private Object targetValue;

    /**
     * Operator to compare the expression value and the target value.
     */
    @JsonProperty(value = "operator")
    private String operator;

    /**
     * Get evaluation result.
     *
     * @return the result value
     */
    public String result() {
        return this.result;
    }

    /**
     * Set evaluation result.
     *
     * @param result the result value to set
     * @return the ExpressionEvaluationDetails object itself.
     */
    public ExpressionEvaluationDetails withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Get expression evaluated.
     *
     * @return the expression value
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set expression evaluated.
     *
     * @param expression the expression value to set
     * @return the ExpressionEvaluationDetails object itself.
     */
    public ExpressionEvaluationDetails withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get property path if the expression is a field or an alias.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set property path if the expression is a field or an alias.
     *
     * @param path the path value to set
     * @return the ExpressionEvaluationDetails object itself.
     */
    public ExpressionEvaluationDetails withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get value of the expression.
     *
     * @return the expressionValue value
     */
    public Object expressionValue() {
        return this.expressionValue;
    }

    /**
     * Set value of the expression.
     *
     * @param expressionValue the expressionValue value to set
     * @return the ExpressionEvaluationDetails object itself.
     */
    public ExpressionEvaluationDetails withExpressionValue(Object expressionValue) {
        this.expressionValue = expressionValue;
        return this;
    }

    /**
     * Get target value to be compared with the expression value.
     *
     * @return the targetValue value
     */
    public Object targetValue() {
        return this.targetValue;
    }

    /**
     * Set target value to be compared with the expression value.
     *
     * @param targetValue the targetValue value to set
     * @return the ExpressionEvaluationDetails object itself.
     */
    public ExpressionEvaluationDetails withTargetValue(Object targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * Get operator to compare the expression value and the target value.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set operator to compare the expression value and the target value.
     *
     * @param operator the operator value to set
     * @return the ExpressionEvaluationDetails object itself.
     */
    public ExpressionEvaluationDetails withOperator(String operator) {
        this.operator = operator;
        return this;
    }

}
