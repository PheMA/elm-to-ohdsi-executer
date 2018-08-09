//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/model_elm">http://java.sun.com/xml/model_elm</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 03:15:28 PM CDT 
//


package edu.phema.elm_to_omop.model_elm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The In operator tests for membership in an interval or list.
 * 			
 * There are two overloads of this operator:
 * 	T, List : The type of T must be the same as the element type of the list.
 * 	T, Interval : The type of T must be the same as the point type of the interval.
 * 	
 * For the T, List overload, this operator returns true if the given element is in the given list, using equivalence semantics. If the list-valued argument is null, it should be treated as an empty list.
 * 
 * For the T, Interval overload, this operator returns true if the given point is greater than or equal to the starting point of the interval, and less than or equal to the ending point of the interval. For open interval boundaries, exclusive comparison operators are used. For closed interval boundaries, if the interval boundary is null, the result of the boundary comparison is considered true. If either argument is null, the result is null. If precision is specified and the point type is a date/time type, comparisons used in the operation are performed at the specified precision.
 * 
 * <p>Java class for In complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="In">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}BinaryExpression">
 *       &lt;attribute name="precision" type="{urn:hl7-org:elm:r1}DateTimePrecision" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "In")
public class In
    extends BinaryExpression
{

    @XmlAttribute(name = "precision")
    protected DateTimePrecision precision;

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePrecision }
     *     
     */
    public DateTimePrecision getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePrecision }
     *     
     */
    public void setPrecision(DateTimePrecision value) {
        this.precision = value;
    }

}
