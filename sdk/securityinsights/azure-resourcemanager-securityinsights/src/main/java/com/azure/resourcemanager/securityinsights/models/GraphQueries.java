// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The graph query to show the current data status. */
@Fluent
public class GraphQueries {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GraphQueries.class);

    /*
     * the metric that the query is checking
     */
    @JsonProperty(value = "metricName")
    private String metricName;

    /*
     * The legend for the graph
     */
    @JsonProperty(value = "legend")
    private String legend;

    /*
     * The base query for the graph
     */
    @JsonProperty(value = "baseQuery")
    private String baseQuery;

    /**
     * Get the metricName property: the metric that the query is checking.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: the metric that the query is checking.
     *
     * @param metricName the metricName value to set.
     * @return the GraphQueries object itself.
     */
    public GraphQueries withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the legend property: The legend for the graph.
     *
     * @return the legend value.
     */
    public String legend() {
        return this.legend;
    }

    /**
     * Set the legend property: The legend for the graph.
     *
     * @param legend the legend value to set.
     * @return the GraphQueries object itself.
     */
    public GraphQueries withLegend(String legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Get the baseQuery property: The base query for the graph.
     *
     * @return the baseQuery value.
     */
    public String baseQuery() {
        return this.baseQuery;
    }

    /**
     * Set the baseQuery property: The base query for the graph.
     *
     * @param baseQuery the baseQuery value to set.
     * @return the GraphQueries object itself.
     */
    public GraphQueries withBaseQuery(String baseQuery) {
        this.baseQuery = baseQuery;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}