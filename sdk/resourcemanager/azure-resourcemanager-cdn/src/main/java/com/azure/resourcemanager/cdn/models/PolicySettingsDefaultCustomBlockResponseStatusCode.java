// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** If the action type is block, this field defines the default customer overridable http response status code. */
public final class PolicySettingsDefaultCustomBlockResponseStatusCode
    extends ExpandableStringEnum<PolicySettingsDefaultCustomBlockResponseStatusCode> {
    /** Static value 200 for PolicySettingsDefaultCustomBlockResponseStatusCode. */
    public static final PolicySettingsDefaultCustomBlockResponseStatusCode TWO_ZERO_ZERO = fromInt(200);

    /** Static value 403 for PolicySettingsDefaultCustomBlockResponseStatusCode. */
    public static final PolicySettingsDefaultCustomBlockResponseStatusCode FOUR_ZERO_THREE = fromInt(403);

    /** Static value 405 for PolicySettingsDefaultCustomBlockResponseStatusCode. */
    public static final PolicySettingsDefaultCustomBlockResponseStatusCode FOUR_ZERO_FIVE = fromInt(405);

    /** Static value 406 for PolicySettingsDefaultCustomBlockResponseStatusCode. */
    public static final PolicySettingsDefaultCustomBlockResponseStatusCode FOUR_ZERO_SIX = fromInt(406);

    /** Static value 429 for PolicySettingsDefaultCustomBlockResponseStatusCode. */
    public static final PolicySettingsDefaultCustomBlockResponseStatusCode FOUR_TWO_NINE = fromInt(429);

    /**
     * Creates or finds a PolicySettingsDefaultCustomBlockResponseStatusCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicySettingsDefaultCustomBlockResponseStatusCode.
     */
    @JsonCreator
    public static PolicySettingsDefaultCustomBlockResponseStatusCode fromInt(int name) {
        return fromString(String.valueOf(name), PolicySettingsDefaultCustomBlockResponseStatusCode.class);
    }

    /**
     * Gets known PolicySettingsDefaultCustomBlockResponseStatusCode values.
     *
     * @return known PolicySettingsDefaultCustomBlockResponseStatusCode values.
     */
    public static Collection<PolicySettingsDefaultCustomBlockResponseStatusCode> values() {
        return values(PolicySettingsDefaultCustomBlockResponseStatusCode.class);
    }
}
