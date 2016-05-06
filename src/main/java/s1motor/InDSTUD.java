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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para inDSTUD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inDSTUD">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="datossolicitudBfcanal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfclasificacionConvenio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfcodigoCanalDealer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfcodigoEjecutivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfdolarDelDia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfestimacionDeIngresosRentaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfestrategiaDeAsignacionCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfestrategiaDeAsignacionCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfestrategiaDeAsignacionCodigoSubproducto" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfestrategiaDeAsignacionMontoRecomendado" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBffechaUltimaLlamadaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfidLlamadoMotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfmarcaEstadoConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfmarcaPreaprobado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfmarcaProductoSolicitado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfnumeroDeIteracion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="datossolicitudBfporcentajeMaximaCuotaBancoFalabella" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="datossolicitudBfsegmentacionVc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfsolicitudInterviniente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfsolicitudReevaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfsolicitudTitular" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitudBfsucursal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBftipoDeConvenio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitudBfufDelDia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDSTUD", propOrder = {
    "datossolicitudBfcanal",
    "datossolicitudBfclasificacionConvenio",
    "datossolicitudBfcodigoCanalDealer",
    "datossolicitudBfcodigoEjecutivo",
    "datossolicitudBfdolarDelDia",
    "datossolicitudBfestimacionDeIngresosRentaDeEvaluacion",
    "datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion",
    "datossolicitudBfestrategiaDeAsignacionCodigoDestino",
    "datossolicitudBfestrategiaDeAsignacionCodigoProducto",
    "datossolicitudBfestrategiaDeAsignacionCodigoSubproducto",
    "datossolicitudBfestrategiaDeAsignacionMontoRecomendado",
    "datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas",
    "datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales",
    "datossolicitudBffechaUltimaLlamadaDeEvaluacion",
    "datossolicitudBfidLlamadoMotor",
    "datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd",
    "datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd",
    "datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem",
    "datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet",
    "datossolicitudBfmarcaEstadoConvenio",
    "datossolicitudBfmarcaPreaprobado",
    "datossolicitudBfmarcaProductoSolicitado",
    "datossolicitudBfnumeroDeIteracion",
    "datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio",
    "datossolicitudBfporcentajeMaximaCuotaBancoFalabella",
    "datossolicitudBfsegmentacionVc",
    "datossolicitudBfsolicitudInterviniente",
    "datossolicitudBfsolicitudReevaluacion",
    "datossolicitudBfsolicitudTitular",
    "datossolicitudBfsucursal",
    "datossolicitudBftipoDeConvenio",
    "datossolicitudBfufDelDia"
})
public class InDSTUD
    extends DaBean
{

    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfcanal;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfclasificacionConvenio;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfcodigoCanalDealer;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfcodigoEjecutivo;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfdolarDelDia;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfestimacionDeIngresosRentaDeEvaluacion;
    @XmlElement(defaultValue = "|")
    protected String datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> datossolicitudBfestrategiaDeAsignacionCodigoDestino;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> datossolicitudBfestrategiaDeAsignacionCodigoProducto;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> datossolicitudBfestrategiaDeAsignacionCodigoSubproducto;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> datossolicitudBfestrategiaDeAsignacionMontoRecomendado;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitudBffechaUltimaLlamadaDeEvaluacion;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfidLlamadoMotor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet;
    @XmlElement(defaultValue = "|")
    protected String datossolicitudBfmarcaEstadoConvenio;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfmarcaPreaprobado;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfmarcaProductoSolicitado;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfnumeroDeIteracion;
    @XmlElement(defaultValue = "-99.0")
    protected double datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio;
    @XmlElement(defaultValue = "-99.0")
    protected double datossolicitudBfporcentajeMaximaCuotaBancoFalabella;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfsegmentacionVc;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfsolicitudInterviniente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfsolicitudReevaluacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfsolicitudTitular;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBfsucursal;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitudBftipoDeConvenio;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitudBfufDelDia;

    /**
     * Obtiene el valor de la propiedad datossolicitudBfcanal.
     * 
     */
    public int getDatossolicitudBfcanal() {
        return datossolicitudBfcanal;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfcanal.
     * 
     */
    public void setDatossolicitudBfcanal(int value) {
        this.datossolicitudBfcanal = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfclasificacionConvenio.
     * 
     */
    public int getDatossolicitudBfclasificacionConvenio() {
        return datossolicitudBfclasificacionConvenio;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfclasificacionConvenio.
     * 
     */
    public void setDatossolicitudBfclasificacionConvenio(int value) {
        this.datossolicitudBfclasificacionConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfcodigoCanalDealer.
     * 
     */
    public int getDatossolicitudBfcodigoCanalDealer() {
        return datossolicitudBfcodigoCanalDealer;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfcodigoCanalDealer.
     * 
     */
    public void setDatossolicitudBfcodigoCanalDealer(int value) {
        this.datossolicitudBfcodigoCanalDealer = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfcodigoEjecutivo.
     * 
     */
    public int getDatossolicitudBfcodigoEjecutivo() {
        return datossolicitudBfcodigoEjecutivo;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfcodigoEjecutivo.
     * 
     */
    public void setDatossolicitudBfcodigoEjecutivo(int value) {
        this.datossolicitudBfcodigoEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfdolarDelDia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfdolarDelDia() {
        return datossolicitudBfdolarDelDia;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfdolarDelDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfdolarDelDia(BigDecimal value) {
        this.datossolicitudBfdolarDelDia = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfestimacionDeIngresosRentaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfestimacionDeIngresosRentaDeEvaluacion() {
        return datossolicitudBfestimacionDeIngresosRentaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfestimacionDeIngresosRentaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfestimacionDeIngresosRentaDeEvaluacion(BigDecimal value) {
        this.datossolicitudBfestimacionDeIngresosRentaDeEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion() {
        return datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion(String value) {
        this.datossolicitudBfestimacionDeIngresosTipoMontoRentaDeEvaluacion = value;
    }

    /**
     * Gets the value of the datossolicitudBfestrategiaDeAsignacionCodigoDestino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitudBfestrategiaDeAsignacionCodigoDestino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitudBfestrategiaDeAsignacionCodigoDestino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDatossolicitudBfestrategiaDeAsignacionCodigoDestino() {
        if (datossolicitudBfestrategiaDeAsignacionCodigoDestino == null) {
            datossolicitudBfestrategiaDeAsignacionCodigoDestino = new ArrayList<Integer>();
        }
        return this.datossolicitudBfestrategiaDeAsignacionCodigoDestino;
    }

    /**
     * Gets the value of the datossolicitudBfestrategiaDeAsignacionCodigoProducto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitudBfestrategiaDeAsignacionCodigoProducto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitudBfestrategiaDeAsignacionCodigoProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDatossolicitudBfestrategiaDeAsignacionCodigoProducto() {
        if (datossolicitudBfestrategiaDeAsignacionCodigoProducto == null) {
            datossolicitudBfestrategiaDeAsignacionCodigoProducto = new ArrayList<Integer>();
        }
        return this.datossolicitudBfestrategiaDeAsignacionCodigoProducto;
    }

    /**
     * Gets the value of the datossolicitudBfestrategiaDeAsignacionCodigoSubproducto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitudBfestrategiaDeAsignacionCodigoSubproducto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitudBfestrategiaDeAsignacionCodigoSubproducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDatossolicitudBfestrategiaDeAsignacionCodigoSubproducto() {
        if (datossolicitudBfestrategiaDeAsignacionCodigoSubproducto == null) {
            datossolicitudBfestrategiaDeAsignacionCodigoSubproducto = new ArrayList<Integer>();
        }
        return this.datossolicitudBfestrategiaDeAsignacionCodigoSubproducto;
    }

    /**
     * Gets the value of the datossolicitudBfestrategiaDeAsignacionMontoRecomendado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitudBfestrategiaDeAsignacionMontoRecomendado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitudBfestrategiaDeAsignacionMontoRecomendado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getDatossolicitudBfestrategiaDeAsignacionMontoRecomendado() {
        if (datossolicitudBfestrategiaDeAsignacionMontoRecomendado == null) {
            datossolicitudBfestrategiaDeAsignacionMontoRecomendado = new ArrayList<BigDecimal>();
        }
        return this.datossolicitudBfestrategiaDeAsignacionMontoRecomendado;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas() {
        return datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas(BigDecimal value) {
        this.datossolicitudBfexposicionGlobalDelClienteExposicionClienteParaCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales() {
        return datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales(BigDecimal value) {
        this.datossolicitudBfexposicionGlobalDelClienteExposicionParaTransaccionales = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBffechaUltimaLlamadaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitudBffechaUltimaLlamadaDeEvaluacion() {
        return datossolicitudBffechaUltimaLlamadaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad datossolicitudBffechaUltimaLlamadaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitudBffechaUltimaLlamadaDeEvaluacion(XMLGregorianCalendar value) {
        this.datossolicitudBffechaUltimaLlamadaDeEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfidLlamadoMotor.
     * 
     */
    public int getDatossolicitudBfidLlamadoMotor() {
        return datossolicitudBfidLlamadoMotor;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfidLlamadoMotor.
     * 
     */
    public void setDatossolicitudBfidLlamadoMotor(int value) {
        this.datossolicitudBfidLlamadoMotor = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd() {
        return datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd(BigDecimal value) {
        this.datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoDisponibleMetd = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd() {
        return datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd(BigDecimal value) {
        this.datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualDisponibleMemd = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem() {
        return datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem(BigDecimal value) {
        this.datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoMensualMem = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet() {
        return datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet(BigDecimal value) {
        this.datossolicitudBfleverageYCargaMensualBfmontoEndeudamientoTotalMet = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfmarcaEstadoConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitudBfmarcaEstadoConvenio() {
        return datossolicitudBfmarcaEstadoConvenio;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfmarcaEstadoConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitudBfmarcaEstadoConvenio(String value) {
        this.datossolicitudBfmarcaEstadoConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfmarcaPreaprobado.
     * 
     */
    public int getDatossolicitudBfmarcaPreaprobado() {
        return datossolicitudBfmarcaPreaprobado;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfmarcaPreaprobado.
     * 
     */
    public void setDatossolicitudBfmarcaPreaprobado(int value) {
        this.datossolicitudBfmarcaPreaprobado = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfmarcaProductoSolicitado.
     * 
     */
    public int getDatossolicitudBfmarcaProductoSolicitado() {
        return datossolicitudBfmarcaProductoSolicitado;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfmarcaProductoSolicitado.
     * 
     */
    public void setDatossolicitudBfmarcaProductoSolicitado(int value) {
        this.datossolicitudBfmarcaProductoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfnumeroDeIteracion.
     * 
     */
    public int getDatossolicitudBfnumeroDeIteracion() {
        return datossolicitudBfnumeroDeIteracion;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfnumeroDeIteracion.
     * 
     */
    public void setDatossolicitudBfnumeroDeIteracion(int value) {
        this.datossolicitudBfnumeroDeIteracion = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio.
     * 
     */
    public double getDatossolicitudBfporcentajeDescuentoAutorizadoPorConvenio() {
        return datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio.
     * 
     */
    public void setDatossolicitudBfporcentajeDescuentoAutorizadoPorConvenio(double value) {
        this.datossolicitudBfporcentajeDescuentoAutorizadoPorConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfporcentajeMaximaCuotaBancoFalabella.
     * 
     */
    public double getDatossolicitudBfporcentajeMaximaCuotaBancoFalabella() {
        return datossolicitudBfporcentajeMaximaCuotaBancoFalabella;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfporcentajeMaximaCuotaBancoFalabella.
     * 
     */
    public void setDatossolicitudBfporcentajeMaximaCuotaBancoFalabella(double value) {
        this.datossolicitudBfporcentajeMaximaCuotaBancoFalabella = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfsegmentacionVc.
     * 
     */
    public int getDatossolicitudBfsegmentacionVc() {
        return datossolicitudBfsegmentacionVc;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfsegmentacionVc.
     * 
     */
    public void setDatossolicitudBfsegmentacionVc(int value) {
        this.datossolicitudBfsegmentacionVc = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfsolicitudInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfsolicitudInterviniente() {
        return datossolicitudBfsolicitudInterviniente;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfsolicitudInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfsolicitudInterviniente(BigDecimal value) {
        this.datossolicitudBfsolicitudInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfsolicitudReevaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfsolicitudReevaluacion() {
        return datossolicitudBfsolicitudReevaluacion;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfsolicitudReevaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfsolicitudReevaluacion(BigDecimal value) {
        this.datossolicitudBfsolicitudReevaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfsolicitudTitular.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfsolicitudTitular() {
        return datossolicitudBfsolicitudTitular;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfsolicitudTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfsolicitudTitular(BigDecimal value) {
        this.datossolicitudBfsolicitudTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfsucursal.
     * 
     */
    public int getDatossolicitudBfsucursal() {
        return datossolicitudBfsucursal;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfsucursal.
     * 
     */
    public void setDatossolicitudBfsucursal(int value) {
        this.datossolicitudBfsucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBftipoDeConvenio.
     * 
     */
    public int getDatossolicitudBftipoDeConvenio() {
        return datossolicitudBftipoDeConvenio;
    }

    /**
     * Define el valor de la propiedad datossolicitudBftipoDeConvenio.
     * 
     */
    public void setDatossolicitudBftipoDeConvenio(int value) {
        this.datossolicitudBftipoDeConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitudBfufDelDia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitudBfufDelDia() {
        return datossolicitudBfufDelDia;
    }

    /**
     * Define el valor de la propiedad datossolicitudBfufDelDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitudBfufDelDia(BigDecimal value) {
        this.datossolicitudBfufDelDia = value;
    }

}
