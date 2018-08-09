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
 * The ToQuantity operator converts the value of its argument to a Quantity value. The operator accepts strings using the following format:
 * 
 * (+|-)?#0(.0#)?('<unit>')?
 * 
 * Meaning an optional polarity indicator, followed by any number of digits (including none) followed by at least one digit, optionally followed by a decimal point, at least one digit, and any number of additional digits, all optionally followed by a unit designator as a string literal specifying a valid UCUM unit of measure. Spaces are allowed between the quantity value and the unit designator.
 * 
 * Note that the decimal value of the quantity returned by this operator must be a valid value in the range representable for Decimal values in CQL. 
 * 
 * If the input string is not formatted correctly, or cannot be interpreted as a valid Quantity value, a run-time error is thrown.
 * 
 * If the argument is null, the result is null.
 * 
 * <p>Java class for ToQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToQuantity">
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
@XmlType(name = "ToQuantity")
public class ToQuantity
    extends UnaryExpression
{


}
