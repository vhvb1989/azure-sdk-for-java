// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ShutdownOnIdleMode. */
public enum ShutdownOnIdleMode {
    /** Enum value None. */
    NONE("None"),

    /** Enum value UserAbsence. */
    USER_ABSENCE("UserAbsence"),

    /** Enum value LowUsage. */
    LOW_USAGE("LowUsage");

    /** The actual serialized value for a ShutdownOnIdleMode instance. */
    private final String value;

    ShutdownOnIdleMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ShutdownOnIdleMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ShutdownOnIdleMode object, or null if unable to parse.
     */
    @JsonCreator
    public static ShutdownOnIdleMode fromString(String value) {
        ShutdownOnIdleMode[] items = ShutdownOnIdleMode.values();
        for (ShutdownOnIdleMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}