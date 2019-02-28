//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.impl;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
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
 * <p>Java class for ViewApplicationActionEventPageModeWeeklySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewApplicationActionEventPageModeWeeklySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://data.application.internal.model.cia.hack23.com/impl}ApplicationActionEventPageModePeriodSummaryEmbeddedId"/&gt;
 *         &lt;element name="hits" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rank_percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewApplicationActionEventPageModeWeeklySummary", propOrder = {
    "embeddedId",
    "hits",
    "rank",
    "rankPercentage"
})
@Entity(name = "ViewApplicationActionEventPageModeWeeklySummary")
@Table(name = "view_application_action_event_page_modes_weekly_summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewApplicationActionEventPageModeWeeklySummary
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected ApplicationActionEventPageModePeriodSummaryEmbeddedId embeddedId;
    protected long hits;
    protected long rank;
    @XmlElement(name = "rank_percentage", required = true)
    protected BigDecimal rankPercentage;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationActionEventPageModePeriodSummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "createdDate", column = @Column(name = "EMBEDDED_ID_CREATED_DATE")),
        @AttributeOverride(name = "page", column = @Column(name = "EMBEDDED_ID_PAGE")),
        @AttributeOverride(name = "pageMode", column = @Column(name = "EMBEDDED_ID_PAGE_MODE"))
    })
    public ApplicationActionEventPageModePeriodSummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationActionEventPageModePeriodSummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(final ApplicationActionEventPageModePeriodSummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the hits property.
     * 
     */
    @Basic
    @Column(name = "HITS", precision = 20)
    public long getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     */
    public void setHits(final long value) {
        this.hits = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    @Basic
    @Column(name = "RANK", precision = 20)
    public long getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(final long value) {
        this.rank = value;
    }

    /**
     * Gets the value of the rankPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "RANK_PERCENTAGE", precision = 20, scale = 10)
    public BigDecimal getRankPercentage() {
        return rankPercentage;
    }

    /**
     * Sets the value of the rankPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRankPercentage(final BigDecimal value) {
        this.rankPercentage = value;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withEmbeddedId(final ApplicationActionEventPageModePeriodSummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withHits(final long value) {
        setHits(value);
        return this;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withRank(final long value) {
        setRank(value);
        return this;
    }

    public ViewApplicationActionEventPageModeWeeklySummary withRankPercentage(final BigDecimal value) {
        setRankPercentage(value);
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
