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
 * The ProperIncludes operator returns true if the first operand includes the second, and is strictly larger.
 * 			
 * There are two overloads of this operator:
 * 	List, List : The element type of both lists must be the same.
 * 	Interval, Interval : The point type of both intervals must be the same.
 * 	
 * For the List, List overload, this operator returns true if the first list includes every element of the second list, using equivalence semantics, and the first list is strictly larger. If either argument is null, it should be treated as an empty list.
 * 
 * For the Interval, Interval overload, this operator returns true if the first interval includes the second interval, and the intervals are not equal. If either argument is null, the result is null. If precision is specified and the point type is a date/time type, comparisons used in the operation are performed at the specified precision.
 * 
 * This operator uses the semantics described in the Start and End operators to determine interval boundaries.
 * 
 * <p>Java class for ProperIncludes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProperIncludes">
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
@XmlType(name = "ProperIncludes")
public class ProperIncludes
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
