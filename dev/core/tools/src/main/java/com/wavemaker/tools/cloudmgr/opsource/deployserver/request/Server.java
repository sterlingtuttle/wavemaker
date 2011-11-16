/*
 *  Copyright (C) 2010-2011 VMWare, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.17 at 10:49:14 AM PST 
//

package com.wavemaker.tools.cloudmgr.opsource.deployserver.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Server element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="Server">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="vlanResourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="imageResourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="administratorPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "description", "vlanResourcePath", "imageResourcePath", "administratorPassword" })
@XmlRootElement(name = "Server")
public class Server {

    @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
    protected String name;

    @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
    protected String description;

    @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
    protected String vlanResourcePath;

    @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
    protected String imageResourcePath;

    @XmlElement(namespace = "http://oec.api.opsource.net/schemas/server")
    protected String administratorPassword;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the vlanResourcePath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVlanResourcePath() {
        return this.vlanResourcePath;
    }

    /**
     * Sets the value of the vlanResourcePath property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setVlanResourcePath(String value) {
        this.vlanResourcePath = value;
    }

    /**
     * Gets the value of the imageResourcePath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getImageResourcePath() {
        return this.imageResourcePath;
    }

    /**
     * Sets the value of the imageResourcePath property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setImageResourcePath(String value) {
        this.imageResourcePath = value;
    }

    /**
     * Gets the value of the administratorPassword property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAdministratorPassword() {
        return this.administratorPassword;
    }

    /**
     * Sets the value of the administratorPassword property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAdministratorPassword(String value) {
        this.administratorPassword = value;
    }

}