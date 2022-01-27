// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.AlertRuleInner;
import com.azure.resourcemanager.securityinsights.fluent.models.ScheduledAlertRuleProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Represents scheduled alert rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Scheduled")
@Fluent
public final class ScheduledAlertRule extends AlertRuleInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScheduledAlertRule.class);

    /*
     * Scheduled alert rule properties
     */
    @JsonProperty(value = "properties")
    private ScheduledAlertRuleProperties innerProperties;

    /**
     * Get the innerProperties property: Scheduled alert rule properties.
     *
     * @return the innerProperties value.
     */
    private ScheduledAlertRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduledAlertRule withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @return the alertRuleTemplateName value.
     */
    public String alertRuleTemplateName() {
        return this.innerProperties() == null ? null : this.innerProperties().alertRuleTemplateName();
    }

    /**
     * Set the alertRuleTemplateName property: The Name of the alert rule template used to create this rule.
     *
     * @param alertRuleTemplateName the alertRuleTemplateName value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withAlertRuleTemplateName(String alertRuleTemplateName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withAlertRuleTemplateName(alertRuleTemplateName);
        return this;
    }

    /**
     * Get the templateVersion property: The version of the alert rule template used to create this rule - in format
     * &lt;a.b.c&gt;, where all are numbers, for example 0 &lt;1.0.2&gt;.
     *
     * @return the templateVersion value.
     */
    public String templateVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().templateVersion();
    }

    /**
     * Set the templateVersion property: The version of the alert rule template used to create this rule - in format
     * &lt;a.b.c&gt;, where all are numbers, for example 0 &lt;1.0.2&gt;.
     *
     * @param templateVersion the templateVersion value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withTemplateVersion(String templateVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withTemplateVersion(templateVersion);
        return this;
    }

    /**
     * Get the description property: The description of the alert rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the alert rule.
     *
     * @param description the description value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the query property: The query that creates alerts for this rule.
     *
     * @return the query value.
     */
    public String query() {
        return this.innerProperties() == null ? null : this.innerProperties().query();
    }

    /**
     * Set the query property: The query that creates alerts for this rule.
     *
     * @param query the query value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withQuery(String query) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withQuery(query);
        return this;
    }

    /**
     * Get the displayName property: The display name for alerts created by this alert rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for alerts created by this alert rule.
     *
     * @param displayName the displayName value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Determines whether this alert rule is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the lastModifiedUtc property: The last time that this alert rule has been modified.
     *
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedUtc();
    }

    /**
     * Get the suppressionDuration property: The suppression (in ISO 8601 duration format) to wait since last time this
     * alert rule been triggered.
     *
     * @return the suppressionDuration value.
     */
    public Duration suppressionDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().suppressionDuration();
    }

    /**
     * Set the suppressionDuration property: The suppression (in ISO 8601 duration format) to wait since last time this
     * alert rule been triggered.
     *
     * @param suppressionDuration the suppressionDuration value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withSuppressionDuration(Duration suppressionDuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withSuppressionDuration(suppressionDuration);
        return this;
    }

    /**
     * Get the suppressionEnabled property: Determines whether the suppression for this alert rule is enabled or
     * disabled.
     *
     * @return the suppressionEnabled value.
     */
    public Boolean suppressionEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().suppressionEnabled();
    }

    /**
     * Set the suppressionEnabled property: Determines whether the suppression for this alert rule is enabled or
     * disabled.
     *
     * @param suppressionEnabled the suppressionEnabled value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withSuppressionEnabled(Boolean suppressionEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withSuppressionEnabled(suppressionEnabled);
        return this;
    }

    /**
     * Get the severity property: The severity for alerts created by this alert rule.
     *
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: The severity for alerts created by this alert rule.
     *
     * @param severity the severity value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withSeverity(AlertSeverity severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the tactics property: The tactics of the alert rule.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.innerProperties() == null ? null : this.innerProperties().tactics();
    }

    /**
     * Set the tactics property: The tactics of the alert rule.
     *
     * @param tactics the tactics value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withTactics(List<AttackTactic> tactics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withTactics(tactics);
        return this;
    }

    /**
     * Get the incidentConfiguration property: The settings of the incidents that created from alerts triggered by this
     * analytics rule.
     *
     * @return the incidentConfiguration value.
     */
    public IncidentConfiguration incidentConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().incidentConfiguration();
    }

    /**
     * Set the incidentConfiguration property: The settings of the incidents that created from alerts triggered by this
     * analytics rule.
     *
     * @param incidentConfiguration the incidentConfiguration value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withIncidentConfiguration(IncidentConfiguration incidentConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withIncidentConfiguration(incidentConfiguration);
        return this;
    }

    /**
     * Get the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     *
     * @return the customDetails value.
     */
    public Map<String, String> customDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().customDetails();
    }

    /**
     * Set the customDetails property: Dictionary of string key-value pairs of columns to be attached to the alert.
     *
     * @param customDetails the customDetails value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withCustomDetails(Map<String, String> customDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withCustomDetails(customDetails);
        return this;
    }

    /**
     * Get the entityMappings property: Array of the entity mappings of the alert rule.
     *
     * @return the entityMappings value.
     */
    public List<EntityMapping> entityMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().entityMappings();
    }

    /**
     * Set the entityMappings property: Array of the entity mappings of the alert rule.
     *
     * @param entityMappings the entityMappings value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withEntityMappings(List<EntityMapping> entityMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withEntityMappings(entityMappings);
        return this;
    }

    /**
     * Get the alertDetailsOverride property: The alert details override settings.
     *
     * @return the alertDetailsOverride value.
     */
    public AlertDetailsOverride alertDetailsOverride() {
        return this.innerProperties() == null ? null : this.innerProperties().alertDetailsOverride();
    }

    /**
     * Set the alertDetailsOverride property: The alert details override settings.
     *
     * @param alertDetailsOverride the alertDetailsOverride value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withAlertDetailsOverride(AlertDetailsOverride alertDetailsOverride) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withAlertDetailsOverride(alertDetailsOverride);
        return this;
    }

    /**
     * Get the queryFrequency property: The frequency (in ISO 8601 duration format) for this alert rule to run.
     *
     * @return the queryFrequency value.
     */
    public Duration queryFrequency() {
        return this.innerProperties() == null ? null : this.innerProperties().queryFrequency();
    }

    /**
     * Set the queryFrequency property: The frequency (in ISO 8601 duration format) for this alert rule to run.
     *
     * @param queryFrequency the queryFrequency value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withQueryFrequency(Duration queryFrequency) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withQueryFrequency(queryFrequency);
        return this;
    }

    /**
     * Get the queryPeriod property: The period (in ISO 8601 duration format) that this alert rule looks at.
     *
     * @return the queryPeriod value.
     */
    public Duration queryPeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().queryPeriod();
    }

    /**
     * Set the queryPeriod property: The period (in ISO 8601 duration format) that this alert rule looks at.
     *
     * @param queryPeriod the queryPeriod value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withQueryPeriod(Duration queryPeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withQueryPeriod(queryPeriod);
        return this;
    }

    /**
     * Get the triggerOperator property: The operation against the threshold that triggers alert rule.
     *
     * @return the triggerOperator value.
     */
    public TriggerOperator triggerOperator() {
        return this.innerProperties() == null ? null : this.innerProperties().triggerOperator();
    }

    /**
     * Set the triggerOperator property: The operation against the threshold that triggers alert rule.
     *
     * @param triggerOperator the triggerOperator value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withTriggerOperator(TriggerOperator triggerOperator) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withTriggerOperator(triggerOperator);
        return this;
    }

    /**
     * Get the triggerThreshold property: The threshold triggers this alert rule.
     *
     * @return the triggerThreshold value.
     */
    public Integer triggerThreshold() {
        return this.innerProperties() == null ? null : this.innerProperties().triggerThreshold();
    }

    /**
     * Set the triggerThreshold property: The threshold triggers this alert rule.
     *
     * @param triggerThreshold the triggerThreshold value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withTriggerThreshold(Integer triggerThreshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withTriggerThreshold(triggerThreshold);
        return this;
    }

    /**
     * Get the eventGroupingSettings property: The event grouping settings.
     *
     * @return the eventGroupingSettings value.
     */
    public EventGroupingSettings eventGroupingSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().eventGroupingSettings();
    }

    /**
     * Set the eventGroupingSettings property: The event grouping settings.
     *
     * @param eventGroupingSettings the eventGroupingSettings value to set.
     * @return the ScheduledAlertRule object itself.
     */
    public ScheduledAlertRule withEventGroupingSettings(EventGroupingSettings eventGroupingSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduledAlertRuleProperties();
        }
        this.innerProperties().withEventGroupingSettings(eventGroupingSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}