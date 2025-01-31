// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Status of the service impacting event. */
@Fluent
public final class ServiceImpactingEventStatus {
    /*
     * Current status of the event
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: Current status of the event.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Current status of the event.
     *
     * @param value the value value to set.
     * @return the ServiceImpactingEventStatus object itself.
     */
    public ServiceImpactingEventStatus withValue(String value) {
        this.value = value;
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
