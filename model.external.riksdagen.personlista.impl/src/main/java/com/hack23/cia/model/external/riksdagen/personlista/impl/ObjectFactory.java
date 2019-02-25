//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:59 PM CET 
//


package com.hack23.cia.model.external.riksdagen.personlista.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hack23.cia.model.external.riksdagen.personlista.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Personlista_QNAME = new QName("http://personlista.riksdagen.external.model.cia.hack23.com/impl", "personlista");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hack23.cia.model.external.riksdagen.personlista.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonContainerElement }
     * 
     */
    public PersonContainerElement createPersonContainerElement() {
        return new PersonContainerElement();
    }

    /**
     * Create an instance of {@link PersonElement }
     * 
     */
    public PersonElement createPersonElement() {
        return new PersonElement();
    }

    /**
     * Create an instance of {@link PersonAssignmentElement }
     * 
     */
    public PersonAssignmentElement createPersonAssignmentElement() {
        return new PersonAssignmentElement();
    }

    /**
     * Create an instance of {@link AssignmentElement }
     * 
     */
    public AssignmentElement createAssignmentElement() {
        return new AssignmentElement();
    }

    /**
     * Create an instance of {@link PersonDetailElement }
     * 
     */
    public PersonDetailElement createPersonDetailElement() {
        return new PersonDetailElement();
    }

    /**
     * Create an instance of {@link DetailElement }
     * 
     */
    public DetailElement createDetailElement() {
        return new DetailElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonContainerElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personlista.riksdagen.external.model.cia.hack23.com/impl", name = "personlista")
    public JAXBElement<PersonContainerElement> createPersonlista(PersonContainerElement value) {
        return new JAXBElement<PersonContainerElement>(_Personlista_QNAME, PersonContainerElement.class, null, value);
    }

}