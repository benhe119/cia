//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.system.impl;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * <p>Java class for Portal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Portal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="modelObjectVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="portalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portalType" type="{http://system.application.internal.model.cia.hack23.com/impl}PortalType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="googleMapApiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portal", propOrder = {
    "modelObjectId",
    "modelObjectVersion",
    "portalName",
    "portalType",
    "description",
    "googleMapApiKey"
})
@XmlSeeAlso({
    DomainPortal.class
})
@Entity(name = "Portal")
@Table(name = "PORTAL")
@Inheritance(strategy = InheritanceType.JOINED)
public class Portal implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Integer modelObjectId;
    protected int modelObjectVersion;
    protected String portalName;
    @XmlSchemaType(name = "string")
    protected PortalType portalType;
    protected String description;
    protected String googleMapApiKey;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the modelObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "MODEL_OBJECT_ID", precision = 10, scale = 0)
    public Integer getModelObjectId() {
        return modelObjectId;
    }

    /**
     * Sets the value of the modelObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModelObjectId(final Integer value) {
        this.modelObjectId = value;
    }

    /**
     * Gets the value of the modelObjectVersion property.
     * 
     */
    @Version
    @Column(name = "MODEL_OBJECT_VERSION")
    public int getModelObjectVersion() {
        return modelObjectVersion;
    }

    /**
     * Sets the value of the modelObjectVersion property.
     * 
     */
    public void setModelObjectVersion(final int value) {
        this.modelObjectVersion = value;
    }

    /**
     * Gets the value of the portalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PORTAL_NAME")
    public String getPortalName() {
        return portalName;
    }

    /**
     * Sets the value of the portalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalName(final String value) {
        this.portalName = value;
    }

    /**
     * Gets the value of the portalType property.
     * 
     * @return
     *     possible object is
     *     {@link PortalType }
     *     
     */
    @Basic
    @Column(name = "PORTAL_TYPE")
    @Enumerated(EnumType.STRING)
    public PortalType getPortalType() {
        return portalType;
    }

    /**
     * Sets the value of the portalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalType }
     *     
     */
    public void setPortalType(final PortalType value) {
        this.portalType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(final String value) {
        this.description = value;
    }

    /**
     * Gets the value of the googleMapApiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GOOGLE_MAP_API_KEY")
    public String getGoogleMapApiKey() {
        return googleMapApiKey;
    }

    /**
     * Sets the value of the googleMapApiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleMapApiKey(final String value) {
        this.googleMapApiKey = value;
    }

    public Portal withModelObjectId(final Integer value) {
        setModelObjectId(value);
        return this;
    }

    public Portal withModelObjectVersion(final int value) {
        setModelObjectVersion(value);
        return this;
    }

    public Portal withPortalName(final String value) {
        setPortalName(value);
        return this;
    }

    public Portal withPortalType(final PortalType value) {
        setPortalType(value);
        return this;
    }

    public Portal withDescription(final String value) {
        setDescription(value);
        return this;
    }

    public Portal withGoogleMapApiKey(final String value) {
        setGoogleMapApiKey(value);
        return this;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

	@Override
	public boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}


	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
