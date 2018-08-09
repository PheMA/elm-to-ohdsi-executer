//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/model_elm">http://java.sun.com/xml/model_elm</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 03:15:28 PM CDT 
//


package edu.phema.elm_to_omop.model_elm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The ToList operator returns its argument as a List value. The operator accepts a singleton value of any type and returns a list with the value as the single element.
 * 
 * If the argument is null, the operator returns an empty list.
 * 
 * The operator is effectively shorthand for "if operand is null then { } else { operand }".
 * 
 * The operator is used to implement list promotion efficiently.
 * 
 * <p>Java class for ToList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToList">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToList")
public class ToList
    extends UnaryExpression
{


}
