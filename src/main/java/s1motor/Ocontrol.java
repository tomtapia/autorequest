//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:22 PM CLT 
//


package s1motor;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ocontrol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ocontrol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="ALIAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDITION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EDITIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ERRORCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OBJECTIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIGNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ocontrol", propOrder = {
    "alias",
    "edition",
    "editiondate",
    "error",
    "errorcount",
    "objective",
    "signature"
})
public class Ocontrol
    extends DaBean
{

    @XmlElement(name = "ALIAS")
    protected String alias;
    @XmlElement(name = "EDITION")
    protected int edition;
    @XmlElement(name = "EDITIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar editiondate;
    @XmlElement(name = "ERROR", nillable = true)
    @Size(min = 0)
    protected List<String> error;
    @XmlElement(name = "ERRORCOUNT")
    protected String errorcount;
    @XmlElement(name = "OBJECTIVE")
    protected String objective;
    @XmlElement(name = "SIGNATURE")
    protected String signature;

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALIAS() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALIAS(String value) {
        this.alias = value;
    }

    /**
     * Obtiene el valor de la propiedad edition.
     * 
     */
    public int getEDITION() {
        return edition;
    }

    /**
     * Define el valor de la propiedad edition.
     * 
     */
    public void setEDITION(int value) {
        this.edition = value;
    }

    /**
     * Obtiene el valor de la propiedad editiondate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDITIONDATE() {
        return editiondate;
    }

    /**
     * Define el valor de la propiedad editiondate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDITIONDATE(XMLGregorianCalendar value) {
        this.editiondate = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getERROR() {
        if (error == null) {
            error = new ArrayList<String>();
        }
        return this.error;
    }

    /**
     * Obtiene el valor de la propiedad errorcount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORCOUNT() {
        return errorcount;
    }

    /**
     * Define el valor de la propiedad errorcount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORCOUNT(String value) {
        this.errorcount = value;
    }

    /**
     * Obtiene el valor de la propiedad objective.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTIVE() {
        return objective;
    }

    /**
     * Define el valor de la propiedad objective.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTIVE(String value) {
        this.objective = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGNATURE() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGNATURE(String value) {
        this.signature = value;
    }

}
