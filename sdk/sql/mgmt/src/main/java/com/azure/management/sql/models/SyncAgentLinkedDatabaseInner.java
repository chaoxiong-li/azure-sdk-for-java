// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.SyncMemberDbType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SyncAgentLinkedDatabase model. */
@JsonFlatten
@Immutable
public class SyncAgentLinkedDatabaseInner extends ProxyResource {
    /*
     * Type of the sync agent linked database.
     */
    @JsonProperty(value = "properties.databaseType", access = JsonProperty.Access.WRITE_ONLY)
    private SyncMemberDbType databaseType;

    /*
     * Id of the sync agent linked database.
     */
    @JsonProperty(value = "properties.databaseId", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseId;

    /*
     * Description of the sync agent linked database.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Server name of the sync agent linked database.
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * Database name of the sync agent linked database.
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * User name of the sync agent linked database.
     */
    @JsonProperty(value = "properties.userName", access = JsonProperty.Access.WRITE_ONLY)
    private String userName;

    /**
     * Get the databaseType property: Type of the sync agent linked database.
     *
     * @return the databaseType value.
     */
    public SyncMemberDbType databaseType() {
        return this.databaseType;
    }

    /**
     * Get the databaseId property: Id of the sync agent linked database.
     *
     * @return the databaseId value.
     */
    public String databaseId() {
        return this.databaseId;
    }

    /**
     * Get the description property: Description of the sync agent linked database.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the serverName property: Server name of the sync agent linked database.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: Database name of the sync agent linked database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the userName property: User name of the sync agent linked database.
     *
     * @return the userName value.
     */
    public String userName() {
        return this.userName;
    }
}
