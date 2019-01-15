/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A page view result.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("pageView")
public class EventsPageViewResult extends EventsResultData {
    /**
     * The pageView property.
     */
    @JsonProperty(value = "pageView")
    private EventsPageViewInfo pageView;

    /**
     * Get the pageView value.
     *
     * @return the pageView value
     */
    public EventsPageViewInfo pageView() {
        return this.pageView;
    }

    /**
     * Set the pageView value.
     *
     * @param pageView the pageView value to set
     * @return the EventsPageViewResult object itself.
     */
    public EventsPageViewResult withPageView(EventsPageViewInfo pageView) {
        this.pageView = pageView;
        return this;
    }

}