// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** attendeeType. */
public final class MicrosoftGraphAttendeeType extends ExpandableStringEnum<MicrosoftGraphAttendeeType> {
    /** Static value required for MicrosoftGraphAttendeeType. */
    public static final MicrosoftGraphAttendeeType REQUIRED = fromString("required");

    /** Static value optional for MicrosoftGraphAttendeeType. */
    public static final MicrosoftGraphAttendeeType OPTIONAL = fromString("optional");

    /** Static value resource for MicrosoftGraphAttendeeType. */
    public static final MicrosoftGraphAttendeeType RESOURCE = fromString("resource");

    /**
     * Creates or finds a MicrosoftGraphAttendeeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphAttendeeType.
     */
    @JsonCreator
    public static MicrosoftGraphAttendeeType fromString(String name) {
        return fromString(name, MicrosoftGraphAttendeeType.class);
    }

    /**
     * Gets known MicrosoftGraphAttendeeType values.
     *
     * @return known MicrosoftGraphAttendeeType values.
     */
    public static Collection<MicrosoftGraphAttendeeType> values() {
        return values(MicrosoftGraphAttendeeType.class);
    }
}
