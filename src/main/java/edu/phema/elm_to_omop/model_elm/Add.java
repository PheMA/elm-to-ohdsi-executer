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
 * The Add operator performs numeric addition of its arguments.
 * 			
 * When adding quantities, the dimensions of each quantity must be the same, but not necessarily the unit. For example, units of 'cm' and 'm' can be added, but units of 'cm2' and 'cm' cannot. The unit of the result will be the most granular unit of either input. Attempting to operate on quantities with invalid units will result in a run-time error.
 * 			
 * The Add operator is defined for the Integer, Decimal, and Quantity types. In addition, a time-valued Quantity can be added to a DateTime or Time using this operator.
 * 
 * For DateTime and Time values, the operator returns the value of the given date/time, incremented by the time-valued quantity, respecting variable length periods for calendar years and months.
 * 
 * For DateTime values, the quantity unit must be one of years, months, days, hours, minutes, seconds, or milliseconds.
 * 
 * For Time values, the quantity unit must be one of hours, minutes, seconds, or milliseconds.
 * 
 * The operation is performed by converting the time-based quantity to the highest specified granularity in the date/time value (truncating any resulting decimal portion) and then adding it to the date/time value.
 * 
 * If either argument is null, the result is null.
 * 
 * <p>Java class for Add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Add">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}BinaryExpression">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Add")
public class Add
    extends BinaryExpression
{


}
