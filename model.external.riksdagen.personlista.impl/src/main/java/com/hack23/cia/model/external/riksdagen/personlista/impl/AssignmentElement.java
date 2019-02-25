//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:59 PM CET 
//


package com.hack23.cia.model.external.riksdagen.personlista.impl;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for AssignmentElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organ_kod" type="{http://personlista.riksdagen.external.model.cia.hack23.com/impl}OrgCode"/&gt;
 *         &lt;element name="roll_kod" type="{http://personlista.riksdagen.external.model.cia.hack23.com/impl}RoleStatus"/&gt;
 *         &lt;element name="ordningsnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://personlista.riksdagen.external.model.cia.hack23.com/impl}RoleStatus"/&gt;
 *         &lt;element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="uppgift" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intressent_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentElement", propOrder = {
    "orgCode",
    "roleCode",
    "orderNumber",
    "status",
    "assignmentType",
    "fromDate",
    "toDate",
    "detail",
    "intressentId"
})
@Entity(name = "AssignmentElement")
@Table(name = "ASSIGNMENT_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class AssignmentElement
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    @XmlElement(name = "organ_kod", required = true)
    @XmlSchemaType(name = "string")
    protected OrgCode orgCode;
    @XmlElement(name = "roll_kod", required = true)
    @XmlSchemaType(name = "string")
    protected RoleStatus roleCode;
    @XmlElement(name = "ordningsnummer", required = true)
    protected String orderNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoleStatus status;
    @XmlElement(name = "typ", required = true)
    protected String assignmentType;
    @XmlElement(name = "from", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    @XmlElement(name = "tom", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date toDate;
    @XmlElement(name = "uppgift", required = true)
    protected String detail;
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrgCode }
     *     
     */
    @Basic
    @Column(name = "ORG_CODE", length = 255)
    @Enumerated(EnumType.STRING)
    public OrgCode getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgCode }
     *     
     */
    public void setOrgCode(OrgCode value) {
        this.orgCode = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleStatus }
     *     
     */
    @Basic
    @Column(name = "ROLE_CODE", length = 255)
    @Enumerated(EnumType.STRING)
    public RoleStatus getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleStatus }
     *     
     */
    public void setRoleCode(RoleStatus value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORDER_NUMBER", length = 255)
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RoleStatus }
     *     
     */
    @Basic
    @Column(name = "STATUS", length = 255)
    @Enumerated(EnumType.STRING)
    public RoleStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleStatus }
     *     
     */
    public void setStatus(RoleStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the assignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ASSIGNMENT_TYPE", length = 255)
    public String getAssignmentType() {
        return assignmentType;
    }

    /**
     * Sets the value of the assignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentType(String value) {
        this.assignmentType = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(Date value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    public Date getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(Date value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DETAIL", length = 65536)
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the intressentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INTRESSENT_ID", length = 255)
    public String getIntressentId() {
        return intressentId;
    }

    /**
     * Sets the value of the intressentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntressentId(String value) {
        this.intressentId = value;
    }

    public AssignmentElement withOrgCode(OrgCode value) {
        setOrgCode(value);
        return this;
    }

    public AssignmentElement withRoleCode(RoleStatus value) {
        setRoleCode(value);
        return this;
    }

    public AssignmentElement withOrderNumber(String value) {
        setOrderNumber(value);
        return this;
    }

    public AssignmentElement withStatus(RoleStatus value) {
        setStatus(value);
        return this;
    }

    public AssignmentElement withAssignmentType(String value) {
        setAssignmentType(value);
        return this;
    }

    public AssignmentElement withFromDate(Date value) {
        setFromDate(value);
        return this;
    }

    public AssignmentElement withToDate(Date value) {
        setToDate(value);
        return this;
    }

    public AssignmentElement withDetail(String value) {
        setDetail(value);
        return this;
    }

    public AssignmentElement withIntressentId(String value) {
        setIntressentId(value);
        return this;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            OrgCode theOrgCode;
            theOrgCode = this.getOrgCode();
            strategy.appendField(locator, this, "orgCode", buffer, theOrgCode);
        }
        {
            RoleStatus theRoleCode;
            theRoleCode = this.getRoleCode();
            strategy.appendField(locator, this, "roleCode", buffer, theRoleCode);
        }
        {
            String theOrderNumber;
            theOrderNumber = this.getOrderNumber();
            strategy.appendField(locator, this, "orderNumber", buffer, theOrderNumber);
        }
        {
            RoleStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            String theAssignmentType;
            theAssignmentType = this.getAssignmentType();
            strategy.appendField(locator, this, "assignmentType", buffer, theAssignmentType);
        }
        {
            Date theFromDate;
            theFromDate = this.getFromDate();
            strategy.appendField(locator, this, "fromDate", buffer, theFromDate);
        }
        {
            Date theToDate;
            theToDate = this.getToDate();
            strategy.appendField(locator, this, "toDate", buffer, theToDate);
        }
        {
            String theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail);
        }
        {
            String theIntressentId;
            theIntressentId = this.getIntressentId();
            strategy.appendField(locator, this, "intressentId", buffer, theIntressentId);
        }
        return buffer;
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
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssignmentElement that = ((AssignmentElement) object);
        {
            OrgCode lhsOrgCode;
            lhsOrgCode = this.getOrgCode();
            OrgCode rhsOrgCode;
            rhsOrgCode = that.getOrgCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgCode", lhsOrgCode), LocatorUtils.property(thatLocator, "orgCode", rhsOrgCode), lhsOrgCode, rhsOrgCode)) {
                return false;
            }
        }
        {
            RoleStatus lhsRoleCode;
            lhsRoleCode = this.getRoleCode();
            RoleStatus rhsRoleCode;
            rhsRoleCode = that.getRoleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleCode", lhsRoleCode), LocatorUtils.property(thatLocator, "roleCode", rhsRoleCode), lhsRoleCode, rhsRoleCode)) {
                return false;
            }
        }
        {
            String lhsOrderNumber;
            lhsOrderNumber = this.getOrderNumber();
            String rhsOrderNumber;
            rhsOrderNumber = that.getOrderNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderNumber", lhsOrderNumber), LocatorUtils.property(thatLocator, "orderNumber", rhsOrderNumber), lhsOrderNumber, rhsOrderNumber)) {
                return false;
            }
        }
        {
            RoleStatus lhsStatus;
            lhsStatus = this.getStatus();
            RoleStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            String lhsAssignmentType;
            lhsAssignmentType = this.getAssignmentType();
            String rhsAssignmentType;
            rhsAssignmentType = that.getAssignmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assignmentType", lhsAssignmentType), LocatorUtils.property(thatLocator, "assignmentType", rhsAssignmentType), lhsAssignmentType, rhsAssignmentType)) {
                return false;
            }
        }
        {
            Date lhsFromDate;
            lhsFromDate = this.getFromDate();
            Date rhsFromDate;
            rhsFromDate = that.getFromDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromDate", lhsFromDate), LocatorUtils.property(thatLocator, "fromDate", rhsFromDate), lhsFromDate, rhsFromDate)) {
                return false;
            }
        }
        {
            Date lhsToDate;
            lhsToDate = this.getToDate();
            Date rhsToDate;
            rhsToDate = that.getToDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toDate", lhsToDate), LocatorUtils.property(thatLocator, "toDate", rhsToDate), lhsToDate, rhsToDate)) {
                return false;
            }
        }
        {
            String lhsDetail;
            lhsDetail = this.getDetail();
            String rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail)) {
                return false;
            }
        }
        {
            String lhsIntressentId;
            lhsIntressentId = this.getIntressentId();
            String rhsIntressentId;
            rhsIntressentId = that.getIntressentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intressentId", lhsIntressentId), LocatorUtils.property(thatLocator, "intressentId", rhsIntressentId), lhsIntressentId, rhsIntressentId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            OrgCode theOrgCode;
            theOrgCode = this.getOrgCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgCode", theOrgCode), currentHashCode, theOrgCode);
        }
        {
            RoleStatus theRoleCode;
            theRoleCode = this.getRoleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleCode", theRoleCode), currentHashCode, theRoleCode);
        }
        {
            String theOrderNumber;
            theOrderNumber = this.getOrderNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderNumber", theOrderNumber), currentHashCode, theOrderNumber);
        }
        {
            RoleStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            String theAssignmentType;
            theAssignmentType = this.getAssignmentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assignmentType", theAssignmentType), currentHashCode, theAssignmentType);
        }
        {
            Date theFromDate;
            theFromDate = this.getFromDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromDate", theFromDate), currentHashCode, theFromDate);
        }
        {
            Date theToDate;
            theToDate = this.getToDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toDate", theToDate), currentHashCode, theToDate);
        }
        {
            String theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail);
        }
        {
            String theIntressentId;
            theIntressentId = this.getIntressentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intressentId", theIntressentId), currentHashCode, theIntressentId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}