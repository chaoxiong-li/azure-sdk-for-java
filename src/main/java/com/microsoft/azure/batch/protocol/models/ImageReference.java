/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an Azure Virtual Machines Marketplace image or a custom Azure
 * Virtual Machine image. To get the list of all Azure Marketplace image
 * references verified by Azure Batch, see the 'List node agent SKUs'
 * operation.
 */
public class ImageReference {
    /**
     * The publisher of the Azure Virtual Machines Marketplace image.
     * For example, Canonical or MicrosoftWindowsServer.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * The offer type of the Azure Virtual Machines Marketplace image.
     * For example, UbuntuServer or WindowsServer.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /**
     * The SKU of the Azure Virtual Machines Marketplace image.
     * For example, 14.04.0-LTS or 2012-R2-Datacenter.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /**
     * The version of the Azure Virtual Machines Marketplace image.
     * A value of 'latest' can be specified to select the latest version of an
     * image. If omitted, the default is 'latest'.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * The ARM resource identifier of the virtual machine image. Computes nodes
     * of the pool will be created using this custom image. This is of the form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/images/{imageName}.
     * This property is mutually exclusive with other ImageReference
     * properties. The virtual machine image must be in the same region and
     * subscription as the Azure Batch account. For information about the
     * firewall settings for the Batch node agent to communicate with the Batch
     * service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     */
    @JsonProperty(value = "virtualMachineImageId")
    private String virtualMachineImageId;

    /**
     * Get for example, Canonical or MicrosoftWindowsServer.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set for example, Canonical or MicrosoftWindowsServer.
     *
     * @param publisher the publisher value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get for example, UbuntuServer or WindowsServer.
     *
     * @return the offer value
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set for example, UbuntuServer or WindowsServer.
     *
     * @param offer the offer value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get for example, 14.04.0-LTS or 2012-R2-Datacenter.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set for example, 14.04.0-LTS or 2012-R2-Datacenter.
     *
     * @param sku the sku value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get a value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set a value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     *
     * @param version the version value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get this property is mutually exclusive with other ImageReference properties. The virtual machine image must be in the same region and subscription as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @return the virtualMachineImageId value
     */
    public String virtualMachineImageId() {
        return this.virtualMachineImageId;
    }

    /**
     * Set this property is mutually exclusive with other ImageReference properties. The virtual machine image must be in the same region and subscription as the Azure Batch account. For information about the firewall settings for the Batch node agent to communicate with the Batch service see https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @param virtualMachineImageId the virtualMachineImageId value to set
     * @return the ImageReference object itself.
     */
    public ImageReference withVirtualMachineImageId(String virtualMachineImageId) {
        this.virtualMachineImageId = virtualMachineImageId;
        return this;
    }

}