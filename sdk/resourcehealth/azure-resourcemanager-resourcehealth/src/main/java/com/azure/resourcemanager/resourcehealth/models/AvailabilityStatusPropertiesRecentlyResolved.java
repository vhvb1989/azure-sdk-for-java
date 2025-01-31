// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * An annotation describing a change in the availabilityState to Available from Unavailable with a reasonType of type
 * Unplanned.
 */
@Fluent
public final class AvailabilityStatusPropertiesRecentlyResolved {
    /*
     * Timestamp for when the availabilityState changed to Unavailable
     */
    @JsonProperty(value = "unavailableOccurredTime")
    private OffsetDateTime unavailableOccurredTime;

    /*
     * Timestamp when the availabilityState changes to Available.
     */
    @JsonProperty(value = "resolvedTime")
    private OffsetDateTime resolvedTime;

    /*
     * Brief description of cause of the resource becoming unavailable.
     */
    @JsonProperty(value = "unavailabilitySummary")
    private String unavailabilitySummary;

    /**
     * Get the unavailableOccurredTime property: Timestamp for when the availabilityState changed to Unavailable.
     *
     * @return the unavailableOccurredTime value.
     */
    public OffsetDateTime unavailableOccurredTime() {
        return this.unavailableOccurredTime;
    }

    /**
     * Set the unavailableOccurredTime property: Timestamp for when the availabilityState changed to Unavailable.
     *
     * @param unavailableOccurredTime the unavailableOccurredTime value to set.
     * @return the AvailabilityStatusPropertiesRecentlyResolved object itself.
     */
    public AvailabilityStatusPropertiesRecentlyResolved withUnavailableOccurredTime(
        OffsetDateTime unavailableOccurredTime) {
        this.unavailableOccurredTime = unavailableOccurredTime;
        return this;
    }

    /**
     * Get the resolvedTime property: Timestamp when the availabilityState changes to Available.
     *
     * @return the resolvedTime value.
     */
    public OffsetDateTime resolvedTime() {
        return this.resolvedTime;
    }

    /**
     * Set the resolvedTime property: Timestamp when the availabilityState changes to Available.
     *
     * @param resolvedTime the resolvedTime value to set.
     * @return the AvailabilityStatusPropertiesRecentlyResolved object itself.
     */
    public AvailabilityStatusPropertiesRecentlyResolved withResolvedTime(OffsetDateTime resolvedTime) {
        this.resolvedTime = resolvedTime;
        return this;
    }

    /**
     * Get the unavailabilitySummary property: Brief description of cause of the resource becoming unavailable.
     *
     * @return the unavailabilitySummary value.
     */
    public String unavailabilitySummary() {
        return this.unavailabilitySummary;
    }

    /**
     * Set the unavailabilitySummary property: Brief description of cause of the resource becoming unavailable.
     *
     * @param unavailabilitySummary the unavailabilitySummary value to set.
     * @return the AvailabilityStatusPropertiesRecentlyResolved object itself.
     */
    public AvailabilityStatusPropertiesRecentlyResolved withUnavailabilitySummary(String unavailabilitySummary) {
        this.unavailabilitySummary = unavailabilitySummary;
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
