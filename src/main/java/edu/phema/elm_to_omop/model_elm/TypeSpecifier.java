//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/model_elm">http://java.sun.com/xml/model_elm</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 03:15:28 PM CDT 
//


package edu.phema.elm_to_omop.model_elm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * TypeSpecifier is the abstract base type for all type specifiers.
 * 			
 * 
 * <p>Java class for TypeSpecifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeSpecifier">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Element">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeSpecifier")
@XmlSeeAlso({
    ChoiceTypeSpecifier.class,
    NamedTypeSpecifier.class,
    TupleTypeSpecifier.class,
    ListTypeSpecifier.class,
    IntervalTypeSpecifier.class
})
public abstract class TypeSpecifier
    extends Element
{


}
