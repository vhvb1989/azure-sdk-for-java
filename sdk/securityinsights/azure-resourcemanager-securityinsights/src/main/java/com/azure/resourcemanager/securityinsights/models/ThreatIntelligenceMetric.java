// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes threat intelligence metric. */
@Fluent
public final class ThreatIntelligenceMetric {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThreatIntelligenceMetric.class);

    /*
     * Last updated indicator metric
     */
    @JsonProperty(value = "lastUpdatedTimeUtc")
    private String lastUpdatedTimeUtc;

    /*
     * Threat type metrics
     */
    @JsonProperty(value = "threatTypeMetrics")
    private List<ThreatIntelligenceMetricEntity> threatTypeMetrics;

    /*
     * Pattern type metrics
     */
    @JsonProperty(value = "patternTypeMetrics")
    private List<ThreatIntelligenceMetricEntity> patternTypeMetrics;

    /*
     * Source metrics
     */
    @JsonProperty(value = "sourceMetrics")
    private List<ThreatIntelligenceMetricEntity> sourceMetrics;

    /**
     * Get the lastUpdatedTimeUtc property: Last updated indicator metric.
     *
     * @return the lastUpdatedTimeUtc value.
     */
    public String lastUpdatedTimeUtc() {
        return this.lastUpdatedTimeUtc;
    }

    /**
     * Set the lastUpdatedTimeUtc property: Last updated indicator metric.
     *
     * @param lastUpdatedTimeUtc the lastUpdatedTimeUtc value to set.
     * @return the ThreatIntelligenceMetric object itself.
     */
    public ThreatIntelligenceMetric withLastUpdatedTimeUtc(String lastUpdatedTimeUtc) {
        this.lastUpdatedTimeUtc = lastUpdatedTimeUtc;
        return this;
    }

    /**
     * Get the threatTypeMetrics property: Threat type metrics.
     *
     * @return the threatTypeMetrics value.
     */
    public List<ThreatIntelligenceMetricEntity> threatTypeMetrics() {
        return this.threatTypeMetrics;
    }

    /**
     * Set the threatTypeMetrics property: Threat type metrics.
     *
     * @param threatTypeMetrics the threatTypeMetrics value to set.
     * @return the ThreatIntelligenceMetric object itself.
     */
    public ThreatIntelligenceMetric withThreatTypeMetrics(List<ThreatIntelligenceMetricEntity> threatTypeMetrics) {
        this.threatTypeMetrics = threatTypeMetrics;
        return this;
    }

    /**
     * Get the patternTypeMetrics property: Pattern type metrics.
     *
     * @return the patternTypeMetrics value.
     */
    public List<ThreatIntelligenceMetricEntity> patternTypeMetrics() {
        return this.patternTypeMetrics;
    }

    /**
     * Set the patternTypeMetrics property: Pattern type metrics.
     *
     * @param patternTypeMetrics the patternTypeMetrics value to set.
     * @return the ThreatIntelligenceMetric object itself.
     */
    public ThreatIntelligenceMetric withPatternTypeMetrics(List<ThreatIntelligenceMetricEntity> patternTypeMetrics) {
        this.patternTypeMetrics = patternTypeMetrics;
        return this;
    }

    /**
     * Get the sourceMetrics property: Source metrics.
     *
     * @return the sourceMetrics value.
     */
    public List<ThreatIntelligenceMetricEntity> sourceMetrics() {
        return this.sourceMetrics;
    }

    /**
     * Set the sourceMetrics property: Source metrics.
     *
     * @param sourceMetrics the sourceMetrics value to set.
     * @return the ThreatIntelligenceMetric object itself.
     */
    public ThreatIntelligenceMetric withSourceMetrics(List<ThreatIntelligenceMetricEntity> sourceMetrics) {
        this.sourceMetrics = sourceMetrics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (threatTypeMetrics() != null) {
            threatTypeMetrics().forEach(e -> e.validate());
        }
        if (patternTypeMetrics() != null) {
            patternTypeMetrics().forEach(e -> e.validate());
        }
        if (sourceMetrics() != null) {
            sourceMetrics().forEach(e -> e.validate());
        }
    }
}