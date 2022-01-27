// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IncidentSeverity. */
public final class IncidentSeverity extends ExpandableStringEnum<IncidentSeverity> {
    /** Static value High for IncidentSeverity. */
    public static final IncidentSeverity HIGH = fromString("High");

    /** Static value Medium for IncidentSeverity. */
    public static final IncidentSeverity MEDIUM = fromString("Medium");

    /** Static value Low for IncidentSeverity. */
    public static final IncidentSeverity LOW = fromString("Low");

    /** Static value Informational for IncidentSeverity. */
    public static final IncidentSeverity INFORMATIONAL = fromString("Informational");

    /**
     * Creates or finds a IncidentSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IncidentSeverity.
     */
    @JsonCreator
    public static IncidentSeverity fromString(String name) {
        return fromString(name, IncidentSeverity.class);
    }

    /** @return known IncidentSeverity values. */
    public static Collection<IncidentSeverity> values() {
        return values(IncidentSeverity.class);
    }
}