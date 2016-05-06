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
 * <p>Clase Java para inDSC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inDSC">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="sinacofiScboletinConcursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sinacofiScfechaDeBloqueoCedulaDeIdentidad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sinacofiScfechaDeProceso" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sinacofiScnumDeSerieCedulaDeIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sinacofiScnumMorosidad" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sinacofiScnumProtestosImpagos" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDSC", propOrder = {
    "sinacofiScboletinConcursal",
    "sinacofiScfechaDeBloqueoCedulaDeIdentidad",
    "sinacofiScfechaDeProceso",
    "sinacofiScnumDeSerieCedulaDeIdentidad",
    "sinacofiScnumMorosidad",
    "sinacofiScnumProtestosImpagos"
})
public class InDSC
    extends DaBean
{

    @XmlElement(defaultValue = "|")
    protected String sinacofiScboletinConcursal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sinacofiScfechaDeBloqueoCedulaDeIdentidad;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Size(min = 0)
    protected List<XMLGregorianCalendar> sinacofiScfechaDeProceso;
    @XmlElement(defaultValue = "|")
    protected String sinacofiScnumDeSerieCedulaDeIdentidad;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> sinacofiScnumMorosidad;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> sinacofiScnumProtestosImpagos;

    /**
     * Obtiene el valor de la propiedad sinacofiScboletinConcursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinacofiScboletinConcursal() {
        return sinacofiScboletinConcursal;
    }

    /**
     * Define el valor de la propiedad sinacofiScboletinConcursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinacofiScboletinConcursal(String value) {
        this.sinacofiScboletinConcursal = value;
    }

    /**
     * Obtiene el valor de la propiedad sinacofiScfechaDeBloqueoCedulaDeIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSinacofiScfechaDeBloqueoCedulaDeIdentidad() {
        return sinacofiScfechaDeBloqueoCedulaDeIdentidad;
    }

    /**
     * Define el valor de la propiedad sinacofiScfechaDeBloqueoCedulaDeIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSinacofiScfechaDeBloqueoCedulaDeIdentidad(XMLGregorianCalendar value) {
        this.sinacofiScfechaDeBloqueoCedulaDeIdentidad = value;
    }

    /**
     * Gets the value of the sinacofiScfechaDeProceso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sinacofiScfechaDeProceso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSinacofiScfechaDeProceso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getSinacofiScfechaDeProceso() {
        if (sinacofiScfechaDeProceso == null) {
            sinacofiScfechaDeProceso = new ArrayList<XMLGregorianCalendar>();
        }
        return this.sinacofiScfechaDeProceso;
    }

    /**
     * Obtiene el valor de la propiedad sinacofiScnumDeSerieCedulaDeIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinacofiScnumDeSerieCedulaDeIdentidad() {
        return sinacofiScnumDeSerieCedulaDeIdentidad;
    }

    /**
     * Define el valor de la propiedad sinacofiScnumDeSerieCedulaDeIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinacofiScnumDeSerieCedulaDeIdentidad(String value) {
        this.sinacofiScnumDeSerieCedulaDeIdentidad = value;
    }

    /**
     * Gets the value of the sinacofiScnumMorosidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sinacofiScnumMorosidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSinacofiScnumMorosidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSinacofiScnumMorosidad() {
        if (sinacofiScnumMorosidad == null) {
            sinacofiScnumMorosidad = new ArrayList<Integer>();
        }
        return this.sinacofiScnumMorosidad;
    }

    /**
     * Gets the value of the sinacofiScnumProtestosImpagos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sinacofiScnumProtestosImpagos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSinacofiScnumProtestosImpagos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSinacofiScnumProtestosImpagos() {
        if (sinacofiScnumProtestosImpagos == null) {
            sinacofiScnumProtestosImpagos = new ArrayList<Integer>();
        }
        return this.sinacofiScnumProtestosImpagos;
    }

}
