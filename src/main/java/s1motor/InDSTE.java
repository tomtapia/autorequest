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
 * <p>Clase Java para inDSTE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inDSTE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="datossolicitanteBancoFalabellaCodigoDescuentoInterno" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaDescuentosInternosDeducibles" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaFechaDeNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaFechaInicioEmpleoActual" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaFechaVeto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaHabitoPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaIndiceDePerdida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaClienteConocido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaCupFirmado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaFuncionarioBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMarcaVetado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaMotivoVeto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaNacionalidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaNivelEducacional" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaPatrimonio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaRut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreAutomotriz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreCliente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreConsolidacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreConsumo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreHipotecario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreLineaDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreNoConocido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreRefinanciamiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaScoreTarjetaDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaSexo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTipoDeActividad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTipoDeContrato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTipoDeEmpleo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTipoDeInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTipoDeVivienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteBancoFalabellaTotalDeHaberes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEeactividad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEecupo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEediasMora" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEeestado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEefechaDeIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEefechaDeNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEehabitoPago" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEemarcaActivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEemarcaPremiumelite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEemarcaRenegociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEemarcaSuperavancista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEerenta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEescoreBanco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEescoreCmr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEetipoDeProducto" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEetipoDeVivienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEetipoRentaComprobada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datossolicitanteCmrEmpresaExternaEeultimafechapago" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDSTE", propOrder = {
    "datossolicitanteBancoFalabellaCodigoDescuentoInterno",
    "datossolicitanteBancoFalabellaDescuentosInternosDeducibles",
    "datossolicitanteBancoFalabellaEstadoCivil",
    "datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior",
    "datossolicitanteBancoFalabellaFechaDeNacimiento",
    "datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior",
    "datossolicitanteBancoFalabellaFechaInicioEmpleoActual",
    "datossolicitanteBancoFalabellaFechaVeto",
    "datossolicitanteBancoFalabellaHabitoPago",
    "datossolicitanteBancoFalabellaIndiceDePerdida",
    "datossolicitanteBancoFalabellaMarcaClienteConocido",
    "datossolicitanteBancoFalabellaMarcaCupFirmado",
    "datossolicitanteBancoFalabellaMarcaFuncionarioBanco",
    "datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro",
    "datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo",
    "datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero",
    "datossolicitanteBancoFalabellaMarcaVetado",
    "datossolicitanteBancoFalabellaMotivoVeto",
    "datossolicitanteBancoFalabellaNacionalidad",
    "datossolicitanteBancoFalabellaNivelEducacional",
    "datossolicitanteBancoFalabellaPatrimonio",
    "datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo",
    "datossolicitanteBancoFalabellaRut",
    "datossolicitanteBancoFalabellaScoreAutomotriz",
    "datossolicitanteBancoFalabellaScoreCliente",
    "datossolicitanteBancoFalabellaScoreConsolidacion",
    "datossolicitanteBancoFalabellaScoreConsumo",
    "datossolicitanteBancoFalabellaScoreHipotecario",
    "datossolicitanteBancoFalabellaScoreLineaDeCredito",
    "datossolicitanteBancoFalabellaScoreNoConocido",
    "datossolicitanteBancoFalabellaScoreRefinanciamiento",
    "datossolicitanteBancoFalabellaScoreTarjetaDeCredito",
    "datossolicitanteBancoFalabellaSexo",
    "datossolicitanteBancoFalabellaTipoDeActividad",
    "datossolicitanteBancoFalabellaTipoDeContrato",
    "datossolicitanteBancoFalabellaTipoDeEmpleo",
    "datossolicitanteBancoFalabellaTipoDeInterviniente",
    "datossolicitanteBancoFalabellaTipoDeVivienda",
    "datossolicitanteBancoFalabellaTipoPersona",
    "datossolicitanteBancoFalabellaTotalDeHaberes",
    "datossolicitanteCmrEmpresaExternaEeactividad",
    "datossolicitanteCmrEmpresaExternaEecupo",
    "datossolicitanteCmrEmpresaExternaEediasMora",
    "datossolicitanteCmrEmpresaExternaEeestado",
    "datossolicitanteCmrEmpresaExternaEefechaDeIngreso",
    "datossolicitanteCmrEmpresaExternaEefechaDeNacimiento",
    "datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion",
    "datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta",
    "datossolicitanteCmrEmpresaExternaEehabitoPago",
    "datossolicitanteCmrEmpresaExternaEemarcaActivo",
    "datossolicitanteCmrEmpresaExternaEemarcaPremiumelite",
    "datossolicitanteCmrEmpresaExternaEemarcaRenegociado",
    "datossolicitanteCmrEmpresaExternaEemarcaSuperavancista",
    "datossolicitanteCmrEmpresaExternaEerenta",
    "datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor",
    "datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo",
    "datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor",
    "datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta",
    "datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor",
    "datossolicitanteCmrEmpresaExternaEescoreBanco",
    "datossolicitanteCmrEmpresaExternaEescoreCmr",
    "datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta",
    "datossolicitanteCmrEmpresaExternaEetipoDeProducto",
    "datossolicitanteCmrEmpresaExternaEetipoDeVivienda",
    "datossolicitanteCmrEmpresaExternaEetipoRentaComprobada",
    "datossolicitanteCmrEmpresaExternaEeultimafechapago"
})
public class InDSTE
    extends DaBean
{

    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> datossolicitanteBancoFalabellaCodigoDescuentoInterno;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> datossolicitanteBancoFalabellaDescuentosInternosDeducibles;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaEstadoCivil;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteBancoFalabellaFechaDeNacimiento;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaFechaInicioEmpleoActual;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteBancoFalabellaFechaVeto;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaHabitoPago;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaIndiceDePerdida;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaMarcaClienteConocido;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaMarcaCupFirmado;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaMarcaFuncionarioBanco;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaMarcaVetado;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaMotivoVeto;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaNacionalidad;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaNivelEducacional;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaPatrimonio;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaRut;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreAutomotriz;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreCliente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreConsolidacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreConsumo;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreHipotecario;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreLineaDeCredito;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreNoConocido;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreRefinanciamiento;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaScoreTarjetaDeCredito;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaSexo;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaTipoDeActividad;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaTipoDeContrato;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaTipoDeEmpleo;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaTipoDeInterviniente;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteBancoFalabellaTipoDeVivienda;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteBancoFalabellaTipoPersona;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteBancoFalabellaTotalDeHaberes;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEeactividad;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEecupo;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEediasMora;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEeestado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteCmrEmpresaExternaEefechaDeIngreso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteCmrEmpresaExternaEefechaDeNacimiento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> datossolicitanteCmrEmpresaExternaEehabitoPago;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteCmrEmpresaExternaEemarcaActivo;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteCmrEmpresaExternaEemarcaPremiumelite;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteCmrEmpresaExternaEemarcaRenegociado;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteCmrEmpresaExternaEemarcaSuperavancista;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEerenta;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEescoreBanco;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEescoreCmr;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> datossolicitanteCmrEmpresaExternaEetipoDeProducto;
    @XmlElement(defaultValue = "-99")
    protected int datossolicitanteCmrEmpresaExternaEetipoDeVivienda;
    @XmlElement(defaultValue = "|")
    protected String datossolicitanteCmrEmpresaExternaEetipoRentaComprobada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datossolicitanteCmrEmpresaExternaEeultimafechapago;

    /**
     * Gets the value of the datossolicitanteBancoFalabellaCodigoDescuentoInterno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitanteBancoFalabellaCodigoDescuentoInterno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitanteBancoFalabellaCodigoDescuentoInterno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getDatossolicitanteBancoFalabellaCodigoDescuentoInterno() {
        if (datossolicitanteBancoFalabellaCodigoDescuentoInterno == null) {
            datossolicitanteBancoFalabellaCodigoDescuentoInterno = new ArrayList<BigDecimal>();
        }
        return this.datossolicitanteBancoFalabellaCodigoDescuentoInterno;
    }

    /**
     * Gets the value of the datossolicitanteBancoFalabellaDescuentosInternosDeducibles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitanteBancoFalabellaDescuentosInternosDeducibles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitanteBancoFalabellaDescuentosInternosDeducibles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getDatossolicitanteBancoFalabellaDescuentosInternosDeducibles() {
        if (datossolicitanteBancoFalabellaDescuentosInternosDeducibles == null) {
            datossolicitanteBancoFalabellaDescuentosInternosDeducibles = new ArrayList<BigDecimal>();
        }
        return this.datossolicitanteBancoFalabellaDescuentosInternosDeducibles;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaEstadoCivil.
     * 
     */
    public int getDatossolicitanteBancoFalabellaEstadoCivil() {
        return datossolicitanteBancoFalabellaEstadoCivil;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaEstadoCivil.
     * 
     */
    public void setDatossolicitanteBancoFalabellaEstadoCivil(int value) {
        this.datossolicitanteBancoFalabellaEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior.
     * 
     */
    public int getDatossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior() {
        return datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior.
     * 
     */
    public void setDatossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior(int value) {
        this.datossolicitanteBancoFalabellaFechaDeInicioEmpleoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaFechaDeNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteBancoFalabellaFechaDeNacimiento() {
        return datossolicitanteBancoFalabellaFechaDeNacimiento;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaFechaDeNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteBancoFalabellaFechaDeNacimiento(XMLGregorianCalendar value) {
        this.datossolicitanteBancoFalabellaFechaDeNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior.
     * 
     */
    public int getDatossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior() {
        return datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior.
     * 
     */
    public void setDatossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior(int value) {
        this.datossolicitanteBancoFalabellaFechaDeTerminoEmpleoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaFechaInicioEmpleoActual.
     * 
     */
    public int getDatossolicitanteBancoFalabellaFechaInicioEmpleoActual() {
        return datossolicitanteBancoFalabellaFechaInicioEmpleoActual;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaFechaInicioEmpleoActual.
     * 
     */
    public void setDatossolicitanteBancoFalabellaFechaInicioEmpleoActual(int value) {
        this.datossolicitanteBancoFalabellaFechaInicioEmpleoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaFechaVeto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteBancoFalabellaFechaVeto() {
        return datossolicitanteBancoFalabellaFechaVeto;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaFechaVeto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteBancoFalabellaFechaVeto(XMLGregorianCalendar value) {
        this.datossolicitanteBancoFalabellaFechaVeto = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaHabitoPago.
     * 
     */
    public int getDatossolicitanteBancoFalabellaHabitoPago() {
        return datossolicitanteBancoFalabellaHabitoPago;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaHabitoPago.
     * 
     */
    public void setDatossolicitanteBancoFalabellaHabitoPago(int value) {
        this.datossolicitanteBancoFalabellaHabitoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaIndiceDePerdida.
     * 
     */
    public int getDatossolicitanteBancoFalabellaIndiceDePerdida() {
        return datossolicitanteBancoFalabellaIndiceDePerdida;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaIndiceDePerdida.
     * 
     */
    public void setDatossolicitanteBancoFalabellaIndiceDePerdida(int value) {
        this.datossolicitanteBancoFalabellaIndiceDePerdida = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaClienteConocido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaMarcaClienteConocido() {
        return datossolicitanteBancoFalabellaMarcaClienteConocido;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaClienteConocido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaMarcaClienteConocido(String value) {
        this.datossolicitanteBancoFalabellaMarcaClienteConocido = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaCupFirmado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaMarcaCupFirmado() {
        return datossolicitanteBancoFalabellaMarcaCupFirmado;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaCupFirmado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaMarcaCupFirmado(String value) {
        this.datossolicitanteBancoFalabellaMarcaCupFirmado = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaFuncionarioBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaMarcaFuncionarioBanco() {
        return datossolicitanteBancoFalabellaMarcaFuncionarioBanco;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaFuncionarioBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaMarcaFuncionarioBanco(String value) {
        this.datossolicitanteBancoFalabellaMarcaFuncionarioBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro.
     * 
     */
    public int getDatossolicitanteBancoFalabellaMarcaIncumplimientodeterioro() {
        return datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro.
     * 
     */
    public void setDatossolicitanteBancoFalabellaMarcaIncumplimientodeterioro(int value) {
        this.datossolicitanteBancoFalabellaMarcaIncumplimientodeterioro = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaMarcaMatrizDeRiesgo() {
        return datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaMarcaMatrizDeRiesgo(String value) {
        this.datossolicitanteBancoFalabellaMarcaMatrizDeRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero() {
        return datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero(String value) {
        this.datossolicitanteBancoFalabellaMarcaResidenciaDefinitivaExtranjero = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMarcaVetado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaMarcaVetado() {
        return datossolicitanteBancoFalabellaMarcaVetado;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMarcaVetado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaMarcaVetado(String value) {
        this.datossolicitanteBancoFalabellaMarcaVetado = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaMotivoVeto.
     * 
     */
    public int getDatossolicitanteBancoFalabellaMotivoVeto() {
        return datossolicitanteBancoFalabellaMotivoVeto;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaMotivoVeto.
     * 
     */
    public void setDatossolicitanteBancoFalabellaMotivoVeto(int value) {
        this.datossolicitanteBancoFalabellaMotivoVeto = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaNacionalidad.
     * 
     */
    public int getDatossolicitanteBancoFalabellaNacionalidad() {
        return datossolicitanteBancoFalabellaNacionalidad;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaNacionalidad.
     * 
     */
    public void setDatossolicitanteBancoFalabellaNacionalidad(int value) {
        this.datossolicitanteBancoFalabellaNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaNivelEducacional.
     * 
     */
    public int getDatossolicitanteBancoFalabellaNivelEducacional() {
        return datossolicitanteBancoFalabellaNivelEducacional;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaNivelEducacional.
     * 
     */
    public void setDatossolicitanteBancoFalabellaNivelEducacional(int value) {
        this.datossolicitanteBancoFalabellaNivelEducacional = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaPatrimonio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaPatrimonio() {
        return datossolicitanteBancoFalabellaPatrimonio;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaPatrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaPatrimonio(BigDecimal value) {
        this.datossolicitanteBancoFalabellaPatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo.
     * 
     */
    public int getDatossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo() {
        return datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo.
     * 
     */
    public void setDatossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo(int value) {
        this.datossolicitanteBancoFalabellaPuntajeMatrizDeRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaRut.
     * 
     */
    public int getDatossolicitanteBancoFalabellaRut() {
        return datossolicitanteBancoFalabellaRut;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaRut.
     * 
     */
    public void setDatossolicitanteBancoFalabellaRut(int value) {
        this.datossolicitanteBancoFalabellaRut = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreAutomotriz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreAutomotriz() {
        return datossolicitanteBancoFalabellaScoreAutomotriz;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreAutomotriz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreAutomotriz(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreAutomotriz = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreCliente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreCliente() {
        return datossolicitanteBancoFalabellaScoreCliente;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreCliente(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreConsolidacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreConsolidacion() {
        return datossolicitanteBancoFalabellaScoreConsolidacion;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreConsolidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreConsolidacion(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreConsolidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreConsumo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreConsumo() {
        return datossolicitanteBancoFalabellaScoreConsumo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreConsumo(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreHipotecario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreHipotecario() {
        return datossolicitanteBancoFalabellaScoreHipotecario;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreHipotecario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreHipotecario(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreHipotecario = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreLineaDeCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreLineaDeCredito() {
        return datossolicitanteBancoFalabellaScoreLineaDeCredito;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreLineaDeCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreLineaDeCredito(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreLineaDeCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreNoConocido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreNoConocido() {
        return datossolicitanteBancoFalabellaScoreNoConocido;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreNoConocido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreNoConocido(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreNoConocido = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreRefinanciamiento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreRefinanciamiento() {
        return datossolicitanteBancoFalabellaScoreRefinanciamiento;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreRefinanciamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreRefinanciamiento(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreRefinanciamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaScoreTarjetaDeCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaScoreTarjetaDeCredito() {
        return datossolicitanteBancoFalabellaScoreTarjetaDeCredito;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaScoreTarjetaDeCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaScoreTarjetaDeCredito(BigDecimal value) {
        this.datossolicitanteBancoFalabellaScoreTarjetaDeCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaSexo.
     * 
     */
    public int getDatossolicitanteBancoFalabellaSexo() {
        return datossolicitanteBancoFalabellaSexo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaSexo.
     * 
     */
    public void setDatossolicitanteBancoFalabellaSexo(int value) {
        this.datossolicitanteBancoFalabellaSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTipoDeActividad.
     * 
     */
    public int getDatossolicitanteBancoFalabellaTipoDeActividad() {
        return datossolicitanteBancoFalabellaTipoDeActividad;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTipoDeActividad.
     * 
     */
    public void setDatossolicitanteBancoFalabellaTipoDeActividad(int value) {
        this.datossolicitanteBancoFalabellaTipoDeActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTipoDeContrato.
     * 
     */
    public int getDatossolicitanteBancoFalabellaTipoDeContrato() {
        return datossolicitanteBancoFalabellaTipoDeContrato;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTipoDeContrato.
     * 
     */
    public void setDatossolicitanteBancoFalabellaTipoDeContrato(int value) {
        this.datossolicitanteBancoFalabellaTipoDeContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTipoDeEmpleo.
     * 
     */
    public int getDatossolicitanteBancoFalabellaTipoDeEmpleo() {
        return datossolicitanteBancoFalabellaTipoDeEmpleo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTipoDeEmpleo.
     * 
     */
    public void setDatossolicitanteBancoFalabellaTipoDeEmpleo(int value) {
        this.datossolicitanteBancoFalabellaTipoDeEmpleo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTipoDeInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaTipoDeInterviniente() {
        return datossolicitanteBancoFalabellaTipoDeInterviniente;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTipoDeInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaTipoDeInterviniente(String value) {
        this.datossolicitanteBancoFalabellaTipoDeInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTipoDeVivienda.
     * 
     */
    public int getDatossolicitanteBancoFalabellaTipoDeVivienda() {
        return datossolicitanteBancoFalabellaTipoDeVivienda;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTipoDeVivienda.
     * 
     */
    public void setDatossolicitanteBancoFalabellaTipoDeVivienda(int value) {
        this.datossolicitanteBancoFalabellaTipoDeVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteBancoFalabellaTipoPersona() {
        return datossolicitanteBancoFalabellaTipoPersona;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteBancoFalabellaTipoPersona(String value) {
        this.datossolicitanteBancoFalabellaTipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteBancoFalabellaTotalDeHaberes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteBancoFalabellaTotalDeHaberes() {
        return datossolicitanteBancoFalabellaTotalDeHaberes;
    }

    /**
     * Define el valor de la propiedad datossolicitanteBancoFalabellaTotalDeHaberes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteBancoFalabellaTotalDeHaberes(BigDecimal value) {
        this.datossolicitanteBancoFalabellaTotalDeHaberes = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEeactividad.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEeactividad() {
        return datossolicitanteCmrEmpresaExternaEeactividad;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEeactividad.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEeactividad(int value) {
        this.datossolicitanteCmrEmpresaExternaEeactividad = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEecupo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEecupo() {
        return datossolicitanteCmrEmpresaExternaEecupo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEecupo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEecupo(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEecupo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEediasMora.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEediasMora() {
        return datossolicitanteCmrEmpresaExternaEediasMora;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEediasMora.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEediasMora(int value) {
        this.datossolicitanteCmrEmpresaExternaEediasMora = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEeestado.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEeestado() {
        return datossolicitanteCmrEmpresaExternaEeestado;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEeestado.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEeestado(int value) {
        this.datossolicitanteCmrEmpresaExternaEeestado = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaDeIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteCmrEmpresaExternaEefechaDeIngreso() {
        return datossolicitanteCmrEmpresaExternaEefechaDeIngreso;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaDeIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEefechaDeIngreso(XMLGregorianCalendar value) {
        this.datossolicitanteCmrEmpresaExternaEefechaDeIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaDeNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteCmrEmpresaExternaEefechaDeNacimiento() {
        return datossolicitanteCmrEmpresaExternaEefechaDeNacimiento;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaDeNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEefechaDeNacimiento(XMLGregorianCalendar value) {
        this.datossolicitanteCmrEmpresaExternaEefechaDeNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteCmrEmpresaExternaEefechaDeRenegociacion() {
        return datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEefechaDeRenegociacion(XMLGregorianCalendar value) {
        this.datossolicitanteCmrEmpresaExternaEefechaDeRenegociacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteCmrEmpresaExternaEefechaactualizacionrenta() {
        return datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEefechaactualizacionrenta(XMLGregorianCalendar value) {
        this.datossolicitanteCmrEmpresaExternaEefechaactualizacionrenta = value;
    }

    /**
     * Gets the value of the datossolicitanteCmrEmpresaExternaEehabitoPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitanteCmrEmpresaExternaEehabitoPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitanteCmrEmpresaExternaEehabitoPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDatossolicitanteCmrEmpresaExternaEehabitoPago() {
        if (datossolicitanteCmrEmpresaExternaEehabitoPago == null) {
            datossolicitanteCmrEmpresaExternaEehabitoPago = new ArrayList<Integer>();
        }
        return this.datossolicitanteCmrEmpresaExternaEehabitoPago;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaActivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteCmrEmpresaExternaEemarcaActivo() {
        return datossolicitanteCmrEmpresaExternaEemarcaActivo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaActivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEemarcaActivo(String value) {
        this.datossolicitanteCmrEmpresaExternaEemarcaActivo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaPremiumelite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteCmrEmpresaExternaEemarcaPremiumelite() {
        return datossolicitanteCmrEmpresaExternaEemarcaPremiumelite;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaPremiumelite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEemarcaPremiumelite(String value) {
        this.datossolicitanteCmrEmpresaExternaEemarcaPremiumelite = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaRenegociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteCmrEmpresaExternaEemarcaRenegociado() {
        return datossolicitanteCmrEmpresaExternaEemarcaRenegociado;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaRenegociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEemarcaRenegociado(String value) {
        this.datossolicitanteCmrEmpresaExternaEemarcaRenegociado = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaSuperavancista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteCmrEmpresaExternaEemarcaSuperavancista() {
        return datossolicitanteCmrEmpresaExternaEemarcaSuperavancista;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEemarcaSuperavancista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEemarcaSuperavancista(String value) {
        this.datossolicitanteCmrEmpresaExternaEemarcaSuperavancista = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEerenta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEerenta() {
        return datossolicitanteCmrEmpresaExternaEerenta;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEerenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEerenta(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEerenta = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEerentaAvalcodeudor() {
        return datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEerentaAvalcodeudor(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEerentaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEesaldodeudaconsumo() {
        return datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEesaldodeudaconsumo(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEesaldodeudaconsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor() {
        return datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEesaldodeudaconsumoAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEesaldodeudatarjeta() {
        return datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEesaldodeudatarjeta(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEesaldodeudatarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDatossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor() {
        return datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor(BigDecimal value) {
        this.datossolicitanteCmrEmpresaExternaEesaldodeudatarjetaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEescoreBanco.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEescoreBanco() {
        return datossolicitanteCmrEmpresaExternaEescoreBanco;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEescoreBanco.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEescoreBanco(int value) {
        this.datossolicitanteCmrEmpresaExternaEescoreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEescoreCmr.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEescoreCmr() {
        return datossolicitanteCmrEmpresaExternaEescoreCmr;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEescoreCmr.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEescoreCmr(int value) {
        this.datossolicitanteCmrEmpresaExternaEescoreCmr = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta() {
        return datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta(int value) {
        this.datossolicitanteCmrEmpresaExternaEesituacionDeLaCuenta = value;
    }

    /**
     * Gets the value of the datossolicitanteCmrEmpresaExternaEetipoDeProducto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datossolicitanteCmrEmpresaExternaEetipoDeProducto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatossolicitanteCmrEmpresaExternaEetipoDeProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDatossolicitanteCmrEmpresaExternaEetipoDeProducto() {
        if (datossolicitanteCmrEmpresaExternaEetipoDeProducto == null) {
            datossolicitanteCmrEmpresaExternaEetipoDeProducto = new ArrayList<Integer>();
        }
        return this.datossolicitanteCmrEmpresaExternaEetipoDeProducto;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEetipoDeVivienda.
     * 
     */
    public int getDatossolicitanteCmrEmpresaExternaEetipoDeVivienda() {
        return datossolicitanteCmrEmpresaExternaEetipoDeVivienda;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEetipoDeVivienda.
     * 
     */
    public void setDatossolicitanteCmrEmpresaExternaEetipoDeVivienda(int value) {
        this.datossolicitanteCmrEmpresaExternaEetipoDeVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEetipoRentaComprobada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatossolicitanteCmrEmpresaExternaEetipoRentaComprobada() {
        return datossolicitanteCmrEmpresaExternaEetipoRentaComprobada;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEetipoRentaComprobada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEetipoRentaComprobada(String value) {
        this.datossolicitanteCmrEmpresaExternaEetipoRentaComprobada = value;
    }

    /**
     * Obtiene el valor de la propiedad datossolicitanteCmrEmpresaExternaEeultimafechapago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatossolicitanteCmrEmpresaExternaEeultimafechapago() {
        return datossolicitanteCmrEmpresaExternaEeultimafechapago;
    }

    /**
     * Define el valor de la propiedad datossolicitanteCmrEmpresaExternaEeultimafechapago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatossolicitanteCmrEmpresaExternaEeultimafechapago(XMLGregorianCalendar value) {
        this.datossolicitanteCmrEmpresaExternaEeultimafechapago = value;
    }

}
