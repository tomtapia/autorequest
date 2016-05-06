//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:22 PM CLT 
//


package s1motor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inDSF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inDSF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="r04FechaPeriodo" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04MontoDeudaDirectaVigente" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04Montodeudacastigadadirecta" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04Montodeudacastigadaindirecta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="r04Montodeudacomercial" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="r04MontodeudacomercialCodeudoraval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="r04Montodeudacreditosdeconsumo" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04MontodeudacreditosdeconsumoCodeudoraval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="r04Montodeudacreditoshipotecarios" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04MontodeudacreditoshipotecariosCodeudoraval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="r04Montodeudadirectamorosa3090" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04Montodeudadirectavencida" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04Montodeudaindirectavencida" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="r04Montodeudaindirectavigente" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="r04Montolineadecredito" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r04MontolineadecreditoCodeudoraval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="r04Numeroinstitucionesacreedoras" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDSF", propOrder = {
    "r04FechaPeriodo",
    "r04MontoDeudaDirectaVigente",
    "r04Montodeudacastigadadirecta",
    "r04Montodeudacastigadaindirecta",
    "r04Montodeudacomercial",
    "r04MontodeudacomercialCodeudoraval",
    "r04Montodeudacreditosdeconsumo",
    "r04MontodeudacreditosdeconsumoCodeudoraval",
    "r04Montodeudacreditoshipotecarios",
    "r04MontodeudacreditoshipotecariosCodeudoraval",
    "r04Montodeudadirectamorosa3090",
    "r04Montodeudadirectavencida",
    "r04Montodeudaindirectavencida",
    "r04Montodeudaindirectavigente",
    "r04Montolineadecredito",
    "r04MontolineadecreditoCodeudoraval",
    "r04Numeroinstitucionesacreedoras"
})
public class InDSF
    extends DaBean
{

    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> r04FechaPeriodo;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04MontoDeudaDirectaVigente;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04Montodeudacastigadadirecta;
    @XmlElement(defaultValue = "-99.0")
    protected double r04Montodeudacastigadaindirecta;
    @XmlElement(defaultValue = "-99.0")
    protected double r04Montodeudacomercial;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal r04MontodeudacomercialCodeudoraval;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04Montodeudacreditosdeconsumo;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal r04MontodeudacreditosdeconsumoCodeudoraval;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04Montodeudacreditoshipotecarios;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal r04MontodeudacreditoshipotecariosCodeudoraval;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04Montodeudadirectamorosa3090;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04Montodeudadirectavencida;
    @XmlElement(defaultValue = "-99.0")
    protected double r04Montodeudaindirectavencida;
    @XmlElement(defaultValue = "-99.0")
    protected double r04Montodeudaindirectavigente;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> r04Montolineadecredito;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal r04MontolineadecreditoCodeudoraval;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> r04Numeroinstitucionesacreedoras;

    /**
     * Gets the value of the r04FechaPeriodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04FechaPeriodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04FechaPeriodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getR04FechaPeriodo() {
        if (r04FechaPeriodo == null) {
            r04FechaPeriodo = new ArrayList<Integer>();
        }
        return this.r04FechaPeriodo;
    }

    /**
     * Gets the value of the r04MontoDeudaDirectaVigente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04MontoDeudaDirectaVigente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04MontoDeudaDirectaVigente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04MontoDeudaDirectaVigente() {
        if (r04MontoDeudaDirectaVigente == null) {
            r04MontoDeudaDirectaVigente = new ArrayList<Double>();
        }
        return this.r04MontoDeudaDirectaVigente;
    }

    /**
     * Gets the value of the r04Montodeudacastigadadirecta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Montodeudacastigadadirecta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Montodeudacastigadadirecta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04Montodeudacastigadadirecta() {
        if (r04Montodeudacastigadadirecta == null) {
            r04Montodeudacastigadadirecta = new ArrayList<Double>();
        }
        return this.r04Montodeudacastigadadirecta;
    }

    /**
     * Obtiene el valor de la propiedad r04Montodeudacastigadaindirecta.
     * 
     */
    public double getR04Montodeudacastigadaindirecta() {
        return r04Montodeudacastigadaindirecta;
    }

    /**
     * Define el valor de la propiedad r04Montodeudacastigadaindirecta.
     * 
     */
    public void setR04Montodeudacastigadaindirecta(double value) {
        this.r04Montodeudacastigadaindirecta = value;
    }

    /**
     * Obtiene el valor de la propiedad r04Montodeudacomercial.
     * 
     */
    public double getR04Montodeudacomercial() {
        return r04Montodeudacomercial;
    }

    /**
     * Define el valor de la propiedad r04Montodeudacomercial.
     * 
     */
    public void setR04Montodeudacomercial(double value) {
        this.r04Montodeudacomercial = value;
    }

    /**
     * Obtiene el valor de la propiedad r04MontodeudacomercialCodeudoraval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR04MontodeudacomercialCodeudoraval() {
        return r04MontodeudacomercialCodeudoraval;
    }

    /**
     * Define el valor de la propiedad r04MontodeudacomercialCodeudoraval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR04MontodeudacomercialCodeudoraval(BigDecimal value) {
        this.r04MontodeudacomercialCodeudoraval = value;
    }

    /**
     * Gets the value of the r04Montodeudacreditosdeconsumo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Montodeudacreditosdeconsumo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Montodeudacreditosdeconsumo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04Montodeudacreditosdeconsumo() {
        if (r04Montodeudacreditosdeconsumo == null) {
            r04Montodeudacreditosdeconsumo = new ArrayList<Double>();
        }
        return this.r04Montodeudacreditosdeconsumo;
    }

    /**
     * Obtiene el valor de la propiedad r04MontodeudacreditosdeconsumoCodeudoraval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR04MontodeudacreditosdeconsumoCodeudoraval() {
        return r04MontodeudacreditosdeconsumoCodeudoraval;
    }

    /**
     * Define el valor de la propiedad r04MontodeudacreditosdeconsumoCodeudoraval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR04MontodeudacreditosdeconsumoCodeudoraval(BigDecimal value) {
        this.r04MontodeudacreditosdeconsumoCodeudoraval = value;
    }

    /**
     * Gets the value of the r04Montodeudacreditoshipotecarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Montodeudacreditoshipotecarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Montodeudacreditoshipotecarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04Montodeudacreditoshipotecarios() {
        if (r04Montodeudacreditoshipotecarios == null) {
            r04Montodeudacreditoshipotecarios = new ArrayList<Double>();
        }
        return this.r04Montodeudacreditoshipotecarios;
    }

    /**
     * Obtiene el valor de la propiedad r04MontodeudacreditoshipotecariosCodeudoraval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR04MontodeudacreditoshipotecariosCodeudoraval() {
        return r04MontodeudacreditoshipotecariosCodeudoraval;
    }

    /**
     * Define el valor de la propiedad r04MontodeudacreditoshipotecariosCodeudoraval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR04MontodeudacreditoshipotecariosCodeudoraval(BigDecimal value) {
        this.r04MontodeudacreditoshipotecariosCodeudoraval = value;
    }

    /**
     * Gets the value of the r04Montodeudadirectamorosa3090 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Montodeudadirectamorosa3090 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Montodeudadirectamorosa3090().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04Montodeudadirectamorosa3090() {
        if (r04Montodeudadirectamorosa3090 == null) {
            r04Montodeudadirectamorosa3090 = new ArrayList<Double>();
        }
        return this.r04Montodeudadirectamorosa3090;
    }

    /**
     * Gets the value of the r04Montodeudadirectavencida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Montodeudadirectavencida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Montodeudadirectavencida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04Montodeudadirectavencida() {
        if (r04Montodeudadirectavencida == null) {
            r04Montodeudadirectavencida = new ArrayList<Double>();
        }
        return this.r04Montodeudadirectavencida;
    }

    /**
     * Obtiene el valor de la propiedad r04Montodeudaindirectavencida.
     * 
     */
    public double getR04Montodeudaindirectavencida() {
        return r04Montodeudaindirectavencida;
    }

    /**
     * Define el valor de la propiedad r04Montodeudaindirectavencida.
     * 
     */
    public void setR04Montodeudaindirectavencida(double value) {
        this.r04Montodeudaindirectavencida = value;
    }

    /**
     * Obtiene el valor de la propiedad r04Montodeudaindirectavigente.
     * 
     */
    public double getR04Montodeudaindirectavigente() {
        return r04Montodeudaindirectavigente;
    }

    /**
     * Define el valor de la propiedad r04Montodeudaindirectavigente.
     * 
     */
    public void setR04Montodeudaindirectavigente(double value) {
        this.r04Montodeudaindirectavigente = value;
    }

    /**
     * Gets the value of the r04Montolineadecredito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Montolineadecredito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Montolineadecredito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR04Montolineadecredito() {
        if (r04Montolineadecredito == null) {
            r04Montolineadecredito = new ArrayList<Double>();
        }
        return this.r04Montolineadecredito;
    }

    /**
     * Obtiene el valor de la propiedad r04MontolineadecreditoCodeudoraval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR04MontolineadecreditoCodeudoraval() {
        return r04MontolineadecreditoCodeudoraval;
    }

    /**
     * Define el valor de la propiedad r04MontolineadecreditoCodeudoraval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR04MontolineadecreditoCodeudoraval(BigDecimal value) {
        this.r04MontolineadecreditoCodeudoraval = value;
    }

    /**
     * Gets the value of the r04Numeroinstitucionesacreedoras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r04Numeroinstitucionesacreedoras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR04Numeroinstitucionesacreedoras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getR04Numeroinstitucionesacreedoras() {
        if (r04Numeroinstitucionesacreedoras == null) {
            r04Numeroinstitucionesacreedoras = new ArrayList<Integer>();
        }
        return this.r04Numeroinstitucionesacreedoras;
    }

}
