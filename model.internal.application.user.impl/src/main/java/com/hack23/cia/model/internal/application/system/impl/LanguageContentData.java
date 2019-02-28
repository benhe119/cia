//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.system.impl;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTimeTypeAdapter;


/**
 * <p>Java class for LanguageContentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageContentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="modelObjectVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fromLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="keyGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="refKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageContentType" type="{http://system.application.internal.model.cia.hack23.com/impl}LanguageContentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageContentData", propOrder = {
    "modelObjectId",
    "modelObjectVersion",
    "fromLanguage",
    "toLanguage",
    "createdDate",
    "keyGroup",
    "locationContext",
    "lastModifiedDate",
    "refKey",
    "languageValue",
    "languageContentType"
})
@Entity(name = "LanguageContentData")
@Table(name = "LANGUAGE_CONTENT_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class LanguageContentData
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Integer modelObjectId;
    protected int modelObjectVersion;
    protected String fromLanguage;
    protected String toLanguage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateTimeTypeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date createdDate;
    protected String keyGroup;
    protected String locationContext;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateTimeTypeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date lastModifiedDate;
    protected String refKey;
    protected String languageValue;
    @XmlSchemaType(name = "string")
    protected LanguageContentType languageContentType;
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
     * Gets the value of the fromLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FROM_LANGUAGE")
    public String getFromLanguage() {
        return fromLanguage;
    }

    /**
     * Sets the value of the fromLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromLanguage(final String value) {
        this.fromLanguage = value;
    }

    /**
     * Gets the value of the toLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TO_LANGUAGE")
    public String getToLanguage() {
        return toLanguage;
    }

    /**
     * Sets the value of the toLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLanguage(final String value) {
        this.toLanguage = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(final Date value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the keyGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "KEY_GROUP")
    public String getKeyGroup() {
        return keyGroup;
    }

    /**
     * Sets the value of the keyGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyGroup(final String value) {
        this.keyGroup = value;
    }

    /**
     * Gets the value of the locationContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LOCATION_CONTEXT")
    public String getLocationContext() {
        return locationContext;
    }

    /**
     * Sets the value of the locationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContext(final String value) {
        this.locationContext = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDate(final Date value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the refKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "REF_KEY", length = 10485760)
    public String getRefKey() {
        return refKey;
    }

    /**
     * Sets the value of the refKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefKey(final String value) {
        this.refKey = value;
    }

    /**
     * Gets the value of the languageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LANGUAGE_VALUE", length = 10485760)
    public String getLanguageValue() {
        return languageValue;
    }

    /**
     * Sets the value of the languageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageValue(final String value) {
        this.languageValue = value;
    }

    /**
     * Gets the value of the languageContentType property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageContentType }
     *     
     */
    @Basic
    @Column(name = "LANGUAGE_CONTENT_TYPE")
    @Enumerated(EnumType.STRING)
    public LanguageContentType getLanguageContentType() {
        return languageContentType;
    }

    /**
     * Sets the value of the languageContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageContentType }
     *     
     */
    public void setLanguageContentType(final LanguageContentType value) {
        this.languageContentType = value;
    }

    public LanguageContentData withModelObjectId(final Integer value) {
        setModelObjectId(value);
        return this;
    }

    public LanguageContentData withModelObjectVersion(final int value) {
        setModelObjectVersion(value);
        return this;
    }

    public LanguageContentData withFromLanguage(final String value) {
        setFromLanguage(value);
        return this;
    }

    public LanguageContentData withToLanguage(final String value) {
        setToLanguage(value);
        return this;
    }

    public LanguageContentData withCreatedDate(final Date value) {
        setCreatedDate(value);
        return this;
    }

    public LanguageContentData withKeyGroup(final String value) {
        setKeyGroup(value);
        return this;
    }

    public LanguageContentData withLocationContext(final String value) {
        setLocationContext(value);
        return this;
    }

    public LanguageContentData withLastModifiedDate(final Date value) {
        setLastModifiedDate(value);
        return this;
    }

    public LanguageContentData withRefKey(final String value) {
        setRefKey(value);
        return this;
    }

    public LanguageContentData withLanguageValue(final String value) {
        setLanguageValue(value);
        return this;
    }

    public LanguageContentData withLanguageContentType(final LanguageContentType value) {
        setLanguageContentType(value);
        return this;
    }

	@Override
	public final String toString() {
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
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
