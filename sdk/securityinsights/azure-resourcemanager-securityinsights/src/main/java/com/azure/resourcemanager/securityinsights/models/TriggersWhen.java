// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TriggersWhen. */
public final class TriggersWhen extends ExpandableStringEnum<TriggersWhen> {
    /** Static value Created for TriggersWhen. */
    public static final TriggersWhen CREATED = fromString("Created");

    /**
     * Creates or finds a TriggersWhen from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggersWhen.
     */
    @JsonCreator
    public static TriggersWhen fromString(String name) {
        return fromString(name, TriggersWhen.class);
    }

    /** @return known TriggersWhen values. */
    public static Collection<TriggersWhen> values() {
        return values(TriggersWhen.class);
    }
}