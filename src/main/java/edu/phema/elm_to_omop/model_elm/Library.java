//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/model_elm">http://java.sun.com/xml/model_elm</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 03:15:28 PM CDT 
//


package edu.phema.elm_to_omop.model_elm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Library is an instance of a CQL-ELM library. 
 * 
 * <p>Java class for Library complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Library">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Element">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{urn:hl7-org:elm:r1}VersionedIdentifier"/>
 *         &lt;element name="schemaIdentifier" type="{urn:hl7-org:elm:r1}VersionedIdentifier"/>
 *         &lt;element name="usings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}UsingDef" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="includes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}IncludeDef" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}ParameterDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codeSystems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}CodeSystemDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valueSets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}ValueSetDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}CodeDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="concepts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}ConceptDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="def" type="{urn:hl7-org:elm:r1}ExpressionDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Library", propOrder = {
    "identifier",
    "schemaIdentifier",
    "usings",
    "includes",
    "parameters",
    "codeSystems",
    "valueSets",
    "codes",
    "concepts",
    "statements"
})
@XmlRootElement
public class Library
    extends Element
{

    @XmlElement(required = true)
    protected VersionedIdentifier identifier;
    @XmlElement(required = true)
    protected VersionedIdentifier schemaIdentifier;
    protected Library.Usings usings;
    protected Library.Includes includes;
    protected Library.Parameters parameters;
    protected Library.CodeSystems codeSystems;
    protected Library.ValueSets valueSets;
    protected Library.Codes codes;
    protected Library.Concepts concepts;
    protected Library.Statements statements;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedIdentifier }
     *     
     */
    public VersionedIdentifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedIdentifier }
     *     
     */
    public void setIdentifier(VersionedIdentifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the schemaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedIdentifier }
     *     
     */
    public VersionedIdentifier getSchemaIdentifier() {
        return schemaIdentifier;
    }

    /**
     * Sets the value of the schemaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedIdentifier }
     *     
     */
    public void setSchemaIdentifier(VersionedIdentifier value) {
        this.schemaIdentifier = value;
    }

    /**
     * Gets the value of the usings property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Usings }
     *     
     */
    public Library.Usings getUsings() {
        return usings;
    }

    /**
     * Sets the value of the usings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Usings }
     *     
     */
    public void setUsings(Library.Usings value) {
        this.usings = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Includes }
     *     
     */
    public Library.Includes getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Includes }
     *     
     */
    public void setIncludes(Library.Includes value) {
        this.includes = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Parameters }
     *     
     */
    public Library.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Parameters }
     *     
     */
    public void setParameters(Library.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the codeSystems property.
     * 
     * @return
     *     possible object is
     *     {@link Library.CodeSystems }
     *     
     */
    public Library.CodeSystems getCodeSystems() {
        return codeSystems;
    }

    /**
     * Sets the value of the codeSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.CodeSystems }
     *     
     */
    public void setCodeSystems(Library.CodeSystems value) {
        this.codeSystems = value;
    }

    /**
     * Gets the value of the valueSets property.
     * 
     * @return
     *     possible object is
     *     {@link Library.ValueSets }
     *     
     */
    public Library.ValueSets getValueSets() {
        return valueSets;
    }

    /**
     * Sets the value of the valueSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.ValueSets }
     *     
     */
    public void setValueSets(Library.ValueSets value) {
        this.valueSets = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Codes }
     *     
     */
    public Library.Codes getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Codes }
     *     
     */
    public void setCodes(Library.Codes value) {
        this.codes = value;
    }

    /**
     * Gets the value of the concepts property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Concepts }
     *     
     */
    public Library.Concepts getConcepts() {
        return concepts;
    }

    /**
     * Sets the value of the concepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Concepts }
     *     
     */
    public void setConcepts(Library.Concepts value) {
        this.concepts = value;
    }

    /**
     * Gets the value of the statements property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Statements }
     *     
     */
    public Library.Statements getStatements() {
        return statements;
    }

    /**
     * Sets the value of the statements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Statements }
     *     
     */
    public void setStatements(Library.Statements value) {
        this.statements = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}CodeSystemDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class CodeSystems {

        protected List<CodeSystemDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeSystemDef }
         * 
         * 
         */
        public List<CodeSystemDef> getDef() {
            if (def == null) {
                def = new ArrayList<CodeSystemDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}CodeDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class Codes {

        protected List<CodeDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeDef }
         * 
         * 
         */
        public List<CodeDef> getDef() {
            if (def == null) {
                def = new ArrayList<CodeDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}ConceptDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class Concepts {

        protected List<ConceptDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConceptDef }
         * 
         * 
         */
        public List<ConceptDef> getDef() {
            if (def == null) {
                def = new ArrayList<ConceptDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}IncludeDef" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class Includes {

        @XmlElement(required = true)
        protected List<IncludeDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IncludeDef }
         * 
         * 
         */
        public List<IncludeDef> getDef() {
            if (def == null) {
                def = new ArrayList<IncludeDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}ParameterDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class Parameters {

        protected List<ParameterDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParameterDef }
         * 
         * 
         */
        public List<ParameterDef> getDef() {
            if (def == null) {
                def = new ArrayList<ParameterDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}ExpressionDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class Statements {

        protected List<ExpressionDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExpressionDef }
         * 
         * 
         */
        public List<ExpressionDef> getDef() {
            if (def == null) {
                def = new ArrayList<ExpressionDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}UsingDef" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class Usings {

        @XmlElement(required = true)
        protected List<UsingDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UsingDef }
         * 
         * 
         */
        public List<UsingDef> getDef() {
            if (def == null) {
                def = new ArrayList<UsingDef>();
            }
            return this.def;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="def" type="{urn:hl7-org:elm:r1}ValueSetDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "def"
    })
    public static class ValueSets {

        protected List<ValueSetDef> def;

        /**
         * Gets the value of the def property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the def property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValueSetDef }
         * 
         * 
         */
        public List<ValueSetDef> getDef() {
            if (def == null) {
                def = new ArrayList<ValueSetDef>();
            }
            return this.def;
        }

    }

}
