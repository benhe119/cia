//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ViewRiksdagenCommitteeBallotDecisionEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenCommitteeBallotDecisionEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hangar_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="issue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="concern" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenCommitteeBallotDecisionEmbeddedId", propOrder = {
    "id",
    "hangarId",
    "issue",
    "concern"
})
@Embeddable
public class ViewRiksdagenCommitteeBallotDecisionEmbeddedId
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected String id;
    @XmlElement(name = "hangar_id", required = true)
    protected BigDecimal hangarId;
    @XmlElement(required = true)
    protected String issue;
    @XmlElement(required = true)
    protected String concern;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(final String value) {
        this.id = value;
    }

    /**
     * Gets the value of the hangarId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "HANGAR_ID", precision = 20, scale = 10)
    public BigDecimal getHangarId() {
        return hangarId;
    }

    /**
     * Sets the value of the hangarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHangarId(final BigDecimal value) {
        this.hangarId = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ISSUE")
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(final String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the concern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONCERN")
    public String getConcern() {
        return concern;
    }

    /**
     * Sets the value of the concern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcern(final String value) {
        this.concern = value;
    }

    public ViewRiksdagenCommitteeBallotDecisionEmbeddedId withId(final String value) {
        setId(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionEmbeddedId withHangarId(final BigDecimal value) {
        setHangarId(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionEmbeddedId withIssue(final String value) {
        setIssue(value);
        return this;
    }

    public ViewRiksdagenCommitteeBallotDecisionEmbeddedId withConcern(final String value) {
        setConcern(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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
