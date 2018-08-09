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
import javax.xml.namespace.QName;


/**
 * The MaxValue operator returns the maximum representable value for the given type.
 * 			
 * The MaxValue operator is defined for the Integer, Decimal, DateTime, and Time types.
 * 
 * For Integer, MaxValue returns the maximum signed 32-bit integer, 2^31 - 1.
 * 
 * For Decimal, MaxValue returns the maximum representable Decimal value, (10^37 - 1) / 10^8 (9999999999999999999999999999.99999999).
 * 
 * For DateTime, MaxValue returns the maximum representable DateTime value, DateTime(9999, 12, 31, 23, 59, 59, 999).
 * 
 * For Time, MaxValue returns the maximum representable Time value, Time(23, 59, 59, 999).
 * 
 * For any other type, attempting to invoke MaxValue results in an error.
 * 
 * <p>Java class for MaxValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaxValue">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;attribute name="valueType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaxValue")
public class MaxValue
    extends Expression
{

    @XmlAttribute(name = "valueType", required = true)
    protected QName valueType;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValueType(QName value) {
        this.valueType = value;
    }

}
