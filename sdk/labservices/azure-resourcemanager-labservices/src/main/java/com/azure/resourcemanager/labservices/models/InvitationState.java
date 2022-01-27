// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for InvitationState. */
public enum InvitationState {
    /** Enum value NotSent. */
    NOT_SENT("NotSent"),

    /** Enum value Sending. */
    SENDING("Sending"),

    /** Enum value Sent. */
    SENT("Sent"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a InvitationState instance. */
    private final String value;

    InvitationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InvitationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InvitationState object, or null if unable to parse.
     */
    @JsonCreator
    public static InvitationState fromString(String value) {
        InvitationState[] items = InvitationState.values();
        for (InvitationState item : items) {
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