
package com.wavemaker.runtime.ws.salesforce.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadataServerUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passwordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sandbox" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serverUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="userInfo" type="{urn:partner.soap.sforce.com}GetUserInfoResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", namespace = "urn:partner.soap.sforce.com", propOrder = {
    "metadataServerUrl",
    "passwordExpired",
    "sandbox",
    "serverUrl",
    "sessionId",
    "userId",
    "userInfo"
})
public class LoginResultType {

    @XmlElement(namespace = "urn:partner.soap.sforce.com", required = true, nillable = true)
    protected String metadataServerUrl;
    @XmlElement(namespace = "urn:partner.soap.sforce.com")
    protected boolean passwordExpired;
    @XmlElement(namespace = "urn:partner.soap.sforce.com")
    protected boolean sandbox;
    @XmlElement(namespace = "urn:partner.soap.sforce.com", required = true, nillable = true)
    protected String serverUrl;
    @XmlElement(namespace = "urn:partner.soap.sforce.com", required = true, nillable = true)
    protected String sessionId;
    @XmlElement(namespace = "urn:partner.soap.sforce.com", required = true, nillable = true)
    protected String userId;
    @XmlElement(namespace = "urn:partner.soap.sforce.com")
    protected GetUserInfoResultType userInfo;

    /**
     * Gets the value of the metadataServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataServerUrl() {
        return metadataServerUrl;
    }

    /**
     * Sets the value of the metadataServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataServerUrl(String value) {
        this.metadataServerUrl = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the sandbox property.
     * 
     */
    public boolean isSandbox() {
        return sandbox;
    }

    /**
     * Sets the value of the sandbox property.
     * 
     */
    public void setSandbox(boolean value) {
        this.sandbox = value;
    }

    /**
     * Gets the value of the serverUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * Sets the value of the serverUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerUrl(String value) {
        this.serverUrl = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserInfoResultType }
     *     
     */
    public GetUserInfoResultType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserInfoResultType }
     *     
     */
    public void setUserInfo(GetUserInfoResultType value) {
        this.userInfo = value;
    }

}
