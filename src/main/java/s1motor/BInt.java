//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:22 PM CLT 
//


package s1motor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bInt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AU_BI" type="{http://ws.bfchfalabella.ch/}auBI" minOccurs="0"/>
 *         &lt;element name="IN_DCE" type="{http://ws.bfchfalabella.ch/}inDCE" minOccurs="0"/>
 *         &lt;element name="IN_DP" type="{http://ws.bfchfalabella.ch/}inDP" minOccurs="0"/>
 *         &lt;element name="IN_DSC" type="{http://ws.bfchfalabella.ch/}inDSC" minOccurs="0"/>
 *         &lt;element name="IN_DSF" type="{http://ws.bfchfalabella.ch/}inDSF" minOccurs="0"/>
 *         &lt;element name="IN_DSTE" type="{http://ws.bfchfalabella.ch/}inDSTE" minOccurs="0"/>
 *         &lt;element name="IN_DSTUD" type="{http://ws.bfchfalabella.ch/}inDSTUD" minOccurs="0"/>
 *         &lt;element name="OCONTROL" type="{http://ws.bfchfalabella.ch/}ocontrol" minOccurs="0"/>
 *         &lt;element name="OUT_BI" type="{http://ws.bfchfalabella.ch/}outBI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bInt", propOrder = {
    "aubi",
    "indce",
    "indp",
    "indsc",
    "indsf",
    "indste",
    "indstud",
    "ocontrol",
    "outbi"
})
public class BInt {

    @XmlElement(name = "AU_BI")
    @Valid
    @NotNull
    protected AuBI aubi;
    @XmlElement(name = "IN_DCE")
    @Valid
    @NotNull
    protected InDCE indce;
    @XmlElement(name = "IN_DP")
    @Valid
    @NotNull
    protected InDP indp;
    @XmlElement(name = "IN_DSC")
    @Valid
    @NotNull
    protected InDSC indsc;
    @XmlElement(name = "IN_DSF")
    @Valid
    @NotNull
    protected InDSF indsf;
    @XmlElement(name = "IN_DSTE")
    @Valid
    @NotNull
    protected InDSTE indste;
    @XmlElement(name = "IN_DSTUD")
    @Valid
    @NotNull
    protected InDSTUD indstud;
    @XmlElement(name = "OCONTROL")
    @Valid
    @NotNull
    protected Ocontrol ocontrol;
    @XmlElement(name = "OUT_BI")
    @Valid
    @NotNull
    protected OutBI outbi;

    /**
     * Obtiene el valor de la propiedad aubi.
     * 
     * @return
     *     possible object is
     *     {@link AuBI }
     *     
     */
    public AuBI getAUBI() {
        return aubi;
    }

    /**
     * Define el valor de la propiedad aubi.
     * 
     * @param value
     *     allowed object is
     *     {@link AuBI }
     *     
     */
    public void setAUBI(AuBI value) {
        this.aubi = value;
    }

    /**
     * Obtiene el valor de la propiedad indce.
     * 
     * @return
     *     possible object is
     *     {@link InDCE }
     *     
     */
    public InDCE getINDCE() {
        return indce;
    }

    /**
     * Define el valor de la propiedad indce.
     * 
     * @param value
     *     allowed object is
     *     {@link InDCE }
     *     
     */
    public void setINDCE(InDCE value) {
        this.indce = value;
    }

    /**
     * Obtiene el valor de la propiedad indp.
     * 
     * @return
     *     possible object is
     *     {@link InDP }
     *     
     */
    public InDP getINDP() {
        return indp;
    }

    /**
     * Define el valor de la propiedad indp.
     * 
     * @param value
     *     allowed object is
     *     {@link InDP }
     *     
     */
    public void setINDP(InDP value) {
        this.indp = value;
    }

    /**
     * Obtiene el valor de la propiedad indsc.
     * 
     * @return
     *     possible object is
     *     {@link InDSC }
     *     
     */
    public InDSC getINDSC() {
        return indsc;
    }

    /**
     * Define el valor de la propiedad indsc.
     * 
     * @param value
     *     allowed object is
     *     {@link InDSC }
     *     
     */
    public void setINDSC(InDSC value) {
        this.indsc = value;
    }

    /**
     * Obtiene el valor de la propiedad indsf.
     * 
     * @return
     *     possible object is
     *     {@link InDSF }
     *     
     */
    public InDSF getINDSF() {
        return indsf;
    }

    /**
     * Define el valor de la propiedad indsf.
     * 
     * @param value
     *     allowed object is
     *     {@link InDSF }
     *     
     */
    public void setINDSF(InDSF value) {
        this.indsf = value;
    }

    /**
     * Obtiene el valor de la propiedad indste.
     * 
     * @return
     *     possible object is
     *     {@link InDSTE }
     *     
     */
    public InDSTE getINDSTE() {
        return indste;
    }

    /**
     * Define el valor de la propiedad indste.
     * 
     * @param value
     *     allowed object is
     *     {@link InDSTE }
     *     
     */
    public void setINDSTE(InDSTE value) {
        this.indste = value;
    }

    /**
     * Obtiene el valor de la propiedad indstud.
     * 
     * @return
     *     possible object is
     *     {@link InDSTUD }
     *     
     */
    public InDSTUD getINDSTUD() {
        return indstud;
    }

    /**
     * Define el valor de la propiedad indstud.
     * 
     * @param value
     *     allowed object is
     *     {@link InDSTUD }
     *     
     */
    public void setINDSTUD(InDSTUD value) {
        this.indstud = value;
    }

    /**
     * Obtiene el valor de la propiedad ocontrol.
     * 
     * @return
     *     possible object is
     *     {@link Ocontrol }
     *     
     */
    public Ocontrol getOCONTROL() {
        return ocontrol;
    }

    /**
     * Define el valor de la propiedad ocontrol.
     * 
     * @param value
     *     allowed object is
     *     {@link Ocontrol }
     *     
     */
    public void setOCONTROL(Ocontrol value) {
        this.ocontrol = value;
    }

    /**
     * Obtiene el valor de la propiedad outbi.
     * 
     * @return
     *     possible object is
     *     {@link OutBI }
     *     
     */
    public OutBI getOUTBI() {
        return outbi;
    }

    /**
     * Define el valor de la propiedad outbi.
     * 
     * @param value
     *     allowed object is
     *     {@link OutBI }
     *     
     */
    public void setOUTBI(OutBI value) {
        this.outbi = value;
    }

}
