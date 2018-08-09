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
 * The ToDateTime operator converts the value of its argument to a DateTime value. The operator expects the string to be formatted using the ISO-8601 date/time representation: 
 * 
 * YYYY-MM-DDThh:mm:ss.fff(+|-)hh:mm
 * 
 * In addition, the string must be interpretable as a valid date/time value.
 * 
 * If the input string is not formatted correctly, or does not represent a valid date/time value, a run-time error is thrown.
 * 
 * As with date/time literals, date/time values may be specified to any precision. If no timezone is supplied, the timezone of the evaluation request timestamp is assumed.
 * 
 * If the argument is null, the result is null.
 * 
 * <p>Java class for ToDateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToDateTime">
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
@XmlType(name = "ToDateTime")
public class ToDateTime
    extends UnaryExpression
{


}
