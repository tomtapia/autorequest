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
 * <p>Clase Java para inDP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inDP">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="aumentolineaCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aumentolineaCodigoDestino2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aumentolineaCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aumentolineaCodigoProducto2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aumentolineaCodigoSubProducto2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aumentolineaCodigosubproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aumentolineaMontoDeLaLinea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="aumentolineaMontoDeLaLinea2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="aumentolineaMontoDeLaLineaMonedaExtranjera" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="aumentolineaMontoDeLaLineaMonedaExtranjera2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="aumentolineaMontoDeLaLineaRotativo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="aumentolineaMontoDeLaLineaRotativo2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="automotrizCategoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizCodigosubproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="automotrizFechaFabricacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="automotrizFinAutomovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="automotrizMarcaAutomovil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizMarcaSeguroDesgravamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="automotrizMarcaSeguroDesgravamencesantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="automotrizModeloAutomovil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizMontoGiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="automotrizMontoSolicitado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="automotrizNumeroDeCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizPieAutomotriz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="automotrizPlazoSolicitado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizTasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="automotrizTipoPoliticaAutomotriz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizUso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="automotrizValorAutomovil" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable10" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable11" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable12" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable13" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable14" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="auxiliaresBfvariable9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="consumoCodigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumoCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumoCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumoCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="consumoMarcaSeguroDesgravamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumoMarcaSeguroDesgravamencesantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumoMontoAConsolidar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="consumoMontoARefinanciar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="consumoMontoGiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="consumoMontoSolicitado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="consumoNumeroDeCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumoPlazoSolicitado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumoTasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hipotecarioCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotecarioCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotecarioCodigosubproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotecarioComunaVivienda" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hipotecarioCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hipotecarioDestinoPropiedad" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hipotecarioMarcaTieneComplementario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hipotecarioMontoDeFinanciamiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hipotecarioMontoSolicitado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hipotecarioNumercoDeCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotecarioPie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hipotecarioPieJustificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hipotecarioPlazoSolicitado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotecarioTasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hipotecarioTipoDeFinanciamiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hipotecarioValorBienRaiz" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hipotecarioValorVivienda" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineacreditoCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineacreditoCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineacreditoCodigosubproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineacreditoMontoDeLaLinea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="renegociacionCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="renegociacionCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="renegociacionCodigosubproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="renegociacionCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="renegociacionMontoARenegociar" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renegociacionMontoGastosDeCobranzaARenegociar" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renegociacionMontoGiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="renegociacionMontoInteresesPenalesARenegociar" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renegociacionMontoOtrosGastosARenegociar" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renegociacionNumeroDeCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="renegociacionPlazoSolicitado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="renegociacionTasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tarjetaCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tarjetaCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tarjetaCodigosubproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tarjetaLimiteDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tarjetaLimiteDeCreditoEnMonedaExtranjera" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tarjetaLimiteDeCreditoRotativo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDP", propOrder = {
    "aumentolineaCodigoDestino",
    "aumentolineaCodigoDestino2",
    "aumentolineaCodigoProducto",
    "aumentolineaCodigoProducto2",
    "aumentolineaCodigoSubProducto2",
    "aumentolineaCodigosubproducto",
    "aumentolineaMontoDeLaLinea",
    "aumentolineaMontoDeLaLinea2",
    "aumentolineaMontoDeLaLineaMonedaExtranjera",
    "aumentolineaMontoDeLaLineaMonedaExtranjera2",
    "aumentolineaMontoDeLaLineaRotativo",
    "aumentolineaMontoDeLaLineaRotativo2",
    "automotrizCategoria",
    "automotrizCodigoDestino",
    "automotrizCodigoProducto",
    "automotrizCodigosubproducto",
    "automotrizCuota",
    "automotrizFechaFabricacion",
    "automotrizFinAutomovil",
    "automotrizMarcaAutomovil",
    "automotrizMarcaSeguroDesgravamen",
    "automotrizMarcaSeguroDesgravamencesantia",
    "automotrizModeloAutomovil",
    "automotrizMontoGiro",
    "automotrizMontoSolicitado",
    "automotrizNumeroDeCuotas",
    "automotrizPieAutomotriz",
    "automotrizPlazoSolicitado",
    "automotrizTasa",
    "automotrizTipoPoliticaAutomotriz",
    "automotrizUso",
    "automotrizValorAutomovil",
    "auxiliaresBfvariable1",
    "auxiliaresBfvariable10",
    "auxiliaresBfvariable11",
    "auxiliaresBfvariable12",
    "auxiliaresBfvariable13",
    "auxiliaresBfvariable14",
    "auxiliaresBfvariable15",
    "auxiliaresBfvariable16",
    "auxiliaresBfvariable17",
    "auxiliaresBfvariable18",
    "auxiliaresBfvariable19",
    "auxiliaresBfvariable2",
    "auxiliaresBfvariable20",
    "auxiliaresBfvariable3",
    "auxiliaresBfvariable4",
    "auxiliaresBfvariable5",
    "auxiliaresBfvariable6",
    "auxiliaresBfvariable7",
    "auxiliaresBfvariable8",
    "auxiliaresBfvariable9",
    "consumoCodigo",
    "consumoCodigoDestino",
    "consumoCodigoProducto",
    "consumoCuota",
    "consumoMarcaSeguroDesgravamen",
    "consumoMarcaSeguroDesgravamencesantia",
    "consumoMontoAConsolidar",
    "consumoMontoARefinanciar",
    "consumoMontoGiro",
    "consumoMontoSolicitado",
    "consumoNumeroDeCuotas",
    "consumoPlazoSolicitado",
    "consumoTasa",
    "hipotecarioCodigoDestino",
    "hipotecarioCodigoProducto",
    "hipotecarioCodigosubproducto",
    "hipotecarioComunaVivienda",
    "hipotecarioCuota",
    "hipotecarioDestinoPropiedad",
    "hipotecarioMarcaTieneComplementario",
    "hipotecarioMontoDeFinanciamiento",
    "hipotecarioMontoSolicitado",
    "hipotecarioNumercoDeCuotas",
    "hipotecarioPie",
    "hipotecarioPieJustificado",
    "hipotecarioPlazoSolicitado",
    "hipotecarioTasa",
    "hipotecarioTipoDeFinanciamiento",
    "hipotecarioValorBienRaiz",
    "hipotecarioValorVivienda",
    "lineacreditoCodigoDestino",
    "lineacreditoCodigoProducto",
    "lineacreditoCodigosubproducto",
    "lineacreditoMontoDeLaLinea",
    "renegociacionCodigoDestino",
    "renegociacionCodigoProducto",
    "renegociacionCodigosubproducto",
    "renegociacionCuota",
    "renegociacionMontoARenegociar",
    "renegociacionMontoGastosDeCobranzaARenegociar",
    "renegociacionMontoGiro",
    "renegociacionMontoInteresesPenalesARenegociar",
    "renegociacionMontoOtrosGastosARenegociar",
    "renegociacionNumeroDeCuotas",
    "renegociacionPlazoSolicitado",
    "renegociacionTasa",
    "tarjetaCodigoDestino",
    "tarjetaCodigoProducto",
    "tarjetaCodigosubproducto",
    "tarjetaLimiteDeCredito",
    "tarjetaLimiteDeCreditoEnMonedaExtranjera",
    "tarjetaLimiteDeCreditoRotativo"
})
public class InDP
    extends DaBean
{

    @XmlElement(defaultValue = "-99")
    protected int aumentolineaCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int aumentolineaCodigoDestino2;
    @XmlElement(defaultValue = "-99")
    protected int aumentolineaCodigoProducto;
    @XmlElement(defaultValue = "-99")
    protected int aumentolineaCodigoProducto2;
    @XmlElement(defaultValue = "-99")
    protected int aumentolineaCodigoSubProducto2;
    @XmlElement(defaultValue = "-99")
    protected int aumentolineaCodigosubproducto;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal aumentolineaMontoDeLaLinea;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal aumentolineaMontoDeLaLinea2;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal aumentolineaMontoDeLaLineaMonedaExtranjera;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal aumentolineaMontoDeLaLineaMonedaExtranjera2;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal aumentolineaMontoDeLaLineaRotativo;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal aumentolineaMontoDeLaLineaRotativo2;
    @XmlElement(defaultValue = "-99")
    protected int automotrizCategoria;
    @XmlElement(defaultValue = "-99")
    protected int automotrizCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int automotrizCodigoProducto;
    @XmlElement(defaultValue = "-99")
    protected int automotrizCodigosubproducto;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal automotrizCuota;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar automotrizFechaFabricacion;
    @XmlElement(defaultValue = "|")
    protected String automotrizFinAutomovil;
    @XmlElement(defaultValue = "-99")
    protected int automotrizMarcaAutomovil;
    @XmlElement(defaultValue = "|")
    protected String automotrizMarcaSeguroDesgravamen;
    @XmlElement(defaultValue = "|")
    protected String automotrizMarcaSeguroDesgravamencesantia;
    @XmlElement(defaultValue = "-99")
    protected int automotrizModeloAutomovil;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal automotrizMontoGiro;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal automotrizMontoSolicitado;
    @XmlElement(defaultValue = "-99")
    protected int automotrizNumeroDeCuotas;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal automotrizPieAutomotriz;
    @XmlElement(defaultValue = "-99")
    protected int automotrizPlazoSolicitado;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal automotrizTasa;
    @XmlElement(defaultValue = "-99")
    protected int automotrizTipoPoliticaAutomotriz;
    @XmlElement(defaultValue = "-99")
    protected int automotrizUso;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal automotrizValorAutomovil;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auxiliaresBfvariable10;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auxiliaresBfvariable11;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auxiliaresBfvariable12;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auxiliaresBfvariable13;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auxiliaresBfvariable14;
    @XmlElement(defaultValue = "|")
    protected String auxiliaresBfvariable15;
    @XmlElement(defaultValue = "|")
    protected String auxiliaresBfvariable16;
    @XmlElement(defaultValue = "|")
    protected String auxiliaresBfvariable17;
    @XmlElement(defaultValue = "|")
    protected String auxiliaresBfvariable18;
    @XmlElement(defaultValue = "|")
    protected String auxiliaresBfvariable19;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable2;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable20;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable3;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable4;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable5;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable6;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable7;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable8;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal auxiliaresBfvariable9;
    @XmlElement(defaultValue = "-99")
    protected int consumoCodigo;
    @XmlElement(defaultValue = "-99")
    protected int consumoCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int consumoCodigoProducto;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal consumoCuota;
    @XmlElement(defaultValue = "|")
    protected String consumoMarcaSeguroDesgravamen;
    @XmlElement(defaultValue = "|")
    protected String consumoMarcaSeguroDesgravamencesantia;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal consumoMontoAConsolidar;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal consumoMontoARefinanciar;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal consumoMontoGiro;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal consumoMontoSolicitado;
    @XmlElement(defaultValue = "-99")
    protected int consumoNumeroDeCuotas;
    @XmlElement(defaultValue = "-99")
    protected int consumoPlazoSolicitado;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal consumoTasa;
    @XmlElement(defaultValue = "-99")
    protected int hipotecarioCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int hipotecarioCodigoProducto;
    @XmlElement(defaultValue = "-99")
    protected int hipotecarioCodigosubproducto;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> hipotecarioComunaVivienda;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal hipotecarioCuota;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> hipotecarioDestinoPropiedad;
    @XmlElement(defaultValue = "|")
    protected String hipotecarioMarcaTieneComplementario;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal hipotecarioMontoDeFinanciamiento;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal hipotecarioMontoSolicitado;
    @XmlElement(defaultValue = "-99")
    protected int hipotecarioNumercoDeCuotas;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal hipotecarioPie;
    @XmlElement(defaultValue = "|")
    protected String hipotecarioPieJustificado;
    @XmlElement(defaultValue = "-99")
    protected int hipotecarioPlazoSolicitado;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal hipotecarioTasa;
    @XmlElement(defaultValue = "-99")
    protected int hipotecarioTipoDeFinanciamiento;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> hipotecarioValorBienRaiz;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> hipotecarioValorVivienda;
    @XmlElement(defaultValue = "-99")
    protected int lineacreditoCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int lineacreditoCodigoProducto;
    @XmlElement(defaultValue = "-99")
    protected int lineacreditoCodigosubproducto;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal lineacreditoMontoDeLaLinea;
    @XmlElement(defaultValue = "-99")
    protected int renegociacionCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int renegociacionCodigoProducto;
    @XmlElement(defaultValue = "-99")
    protected int renegociacionCodigosubproducto;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal renegociacionCuota;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> renegociacionMontoARenegociar;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> renegociacionMontoGastosDeCobranzaARenegociar;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal renegociacionMontoGiro;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> renegociacionMontoInteresesPenalesARenegociar;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> renegociacionMontoOtrosGastosARenegociar;
    @XmlElement(defaultValue = "-99")
    protected int renegociacionNumeroDeCuotas;
    @XmlElement(defaultValue = "-99")
    protected int renegociacionPlazoSolicitado;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal renegociacionTasa;
    @XmlElement(defaultValue = "-99")
    protected int tarjetaCodigoDestino;
    @XmlElement(defaultValue = "-99")
    protected int tarjetaCodigoProducto;
    @XmlElement(defaultValue = "-99")
    protected int tarjetaCodigosubproducto;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal tarjetaLimiteDeCredito;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal tarjetaLimiteDeCreditoEnMonedaExtranjera;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal tarjetaLimiteDeCreditoRotativo;

    /**
     * Obtiene el valor de la propiedad aumentolineaCodigoDestino.
     * 
     */
    public int getAumentolineaCodigoDestino() {
        return aumentolineaCodigoDestino;
    }

    /**
     * Define el valor de la propiedad aumentolineaCodigoDestino.
     * 
     */
    public void setAumentolineaCodigoDestino(int value) {
        this.aumentolineaCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaCodigoDestino2.
     * 
     */
    public int getAumentolineaCodigoDestino2() {
        return aumentolineaCodigoDestino2;
    }

    /**
     * Define el valor de la propiedad aumentolineaCodigoDestino2.
     * 
     */
    public void setAumentolineaCodigoDestino2(int value) {
        this.aumentolineaCodigoDestino2 = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaCodigoProducto.
     * 
     */
    public int getAumentolineaCodigoProducto() {
        return aumentolineaCodigoProducto;
    }

    /**
     * Define el valor de la propiedad aumentolineaCodigoProducto.
     * 
     */
    public void setAumentolineaCodigoProducto(int value) {
        this.aumentolineaCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaCodigoProducto2.
     * 
     */
    public int getAumentolineaCodigoProducto2() {
        return aumentolineaCodigoProducto2;
    }

    /**
     * Define el valor de la propiedad aumentolineaCodigoProducto2.
     * 
     */
    public void setAumentolineaCodigoProducto2(int value) {
        this.aumentolineaCodigoProducto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaCodigoSubProducto2.
     * 
     */
    public int getAumentolineaCodigoSubProducto2() {
        return aumentolineaCodigoSubProducto2;
    }

    /**
     * Define el valor de la propiedad aumentolineaCodigoSubProducto2.
     * 
     */
    public void setAumentolineaCodigoSubProducto2(int value) {
        this.aumentolineaCodigoSubProducto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaCodigosubproducto.
     * 
     */
    public int getAumentolineaCodigosubproducto() {
        return aumentolineaCodigosubproducto;
    }

    /**
     * Define el valor de la propiedad aumentolineaCodigosubproducto.
     * 
     */
    public void setAumentolineaCodigosubproducto(int value) {
        this.aumentolineaCodigosubproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaMontoDeLaLinea.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentolineaMontoDeLaLinea() {
        return aumentolineaMontoDeLaLinea;
    }

    /**
     * Define el valor de la propiedad aumentolineaMontoDeLaLinea.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentolineaMontoDeLaLinea(BigDecimal value) {
        this.aumentolineaMontoDeLaLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaMontoDeLaLinea2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentolineaMontoDeLaLinea2() {
        return aumentolineaMontoDeLaLinea2;
    }

    /**
     * Define el valor de la propiedad aumentolineaMontoDeLaLinea2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentolineaMontoDeLaLinea2(BigDecimal value) {
        this.aumentolineaMontoDeLaLinea2 = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaMontoDeLaLineaMonedaExtranjera.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentolineaMontoDeLaLineaMonedaExtranjera() {
        return aumentolineaMontoDeLaLineaMonedaExtranjera;
    }

    /**
     * Define el valor de la propiedad aumentolineaMontoDeLaLineaMonedaExtranjera.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentolineaMontoDeLaLineaMonedaExtranjera(BigDecimal value) {
        this.aumentolineaMontoDeLaLineaMonedaExtranjera = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaMontoDeLaLineaMonedaExtranjera2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentolineaMontoDeLaLineaMonedaExtranjera2() {
        return aumentolineaMontoDeLaLineaMonedaExtranjera2;
    }

    /**
     * Define el valor de la propiedad aumentolineaMontoDeLaLineaMonedaExtranjera2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentolineaMontoDeLaLineaMonedaExtranjera2(BigDecimal value) {
        this.aumentolineaMontoDeLaLineaMonedaExtranjera2 = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaMontoDeLaLineaRotativo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentolineaMontoDeLaLineaRotativo() {
        return aumentolineaMontoDeLaLineaRotativo;
    }

    /**
     * Define el valor de la propiedad aumentolineaMontoDeLaLineaRotativo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentolineaMontoDeLaLineaRotativo(BigDecimal value) {
        this.aumentolineaMontoDeLaLineaRotativo = value;
    }

    /**
     * Obtiene el valor de la propiedad aumentolineaMontoDeLaLineaRotativo2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentolineaMontoDeLaLineaRotativo2() {
        return aumentolineaMontoDeLaLineaRotativo2;
    }

    /**
     * Define el valor de la propiedad aumentolineaMontoDeLaLineaRotativo2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentolineaMontoDeLaLineaRotativo2(BigDecimal value) {
        this.aumentolineaMontoDeLaLineaRotativo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizCategoria.
     * 
     */
    public int getAutomotrizCategoria() {
        return automotrizCategoria;
    }

    /**
     * Define el valor de la propiedad automotrizCategoria.
     * 
     */
    public void setAutomotrizCategoria(int value) {
        this.automotrizCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizCodigoDestino.
     * 
     */
    public int getAutomotrizCodigoDestino() {
        return automotrizCodigoDestino;
    }

    /**
     * Define el valor de la propiedad automotrizCodigoDestino.
     * 
     */
    public void setAutomotrizCodigoDestino(int value) {
        this.automotrizCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizCodigoProducto.
     * 
     */
    public int getAutomotrizCodigoProducto() {
        return automotrizCodigoProducto;
    }

    /**
     * Define el valor de la propiedad automotrizCodigoProducto.
     * 
     */
    public void setAutomotrizCodigoProducto(int value) {
        this.automotrizCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizCodigosubproducto.
     * 
     */
    public int getAutomotrizCodigosubproducto() {
        return automotrizCodigosubproducto;
    }

    /**
     * Define el valor de la propiedad automotrizCodigosubproducto.
     * 
     */
    public void setAutomotrizCodigosubproducto(int value) {
        this.automotrizCodigosubproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutomotrizCuota() {
        return automotrizCuota;
    }

    /**
     * Define el valor de la propiedad automotrizCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutomotrizCuota(BigDecimal value) {
        this.automotrizCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizFechaFabricacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutomotrizFechaFabricacion() {
        return automotrizFechaFabricacion;
    }

    /**
     * Define el valor de la propiedad automotrizFechaFabricacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutomotrizFechaFabricacion(XMLGregorianCalendar value) {
        this.automotrizFechaFabricacion = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizFinAutomovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomotrizFinAutomovil() {
        return automotrizFinAutomovil;
    }

    /**
     * Define el valor de la propiedad automotrizFinAutomovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomotrizFinAutomovil(String value) {
        this.automotrizFinAutomovil = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizMarcaAutomovil.
     * 
     */
    public int getAutomotrizMarcaAutomovil() {
        return automotrizMarcaAutomovil;
    }

    /**
     * Define el valor de la propiedad automotrizMarcaAutomovil.
     * 
     */
    public void setAutomotrizMarcaAutomovil(int value) {
        this.automotrizMarcaAutomovil = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizMarcaSeguroDesgravamen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomotrizMarcaSeguroDesgravamen() {
        return automotrizMarcaSeguroDesgravamen;
    }

    /**
     * Define el valor de la propiedad automotrizMarcaSeguroDesgravamen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomotrizMarcaSeguroDesgravamen(String value) {
        this.automotrizMarcaSeguroDesgravamen = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizMarcaSeguroDesgravamencesantia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomotrizMarcaSeguroDesgravamencesantia() {
        return automotrizMarcaSeguroDesgravamencesantia;
    }

    /**
     * Define el valor de la propiedad automotrizMarcaSeguroDesgravamencesantia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomotrizMarcaSeguroDesgravamencesantia(String value) {
        this.automotrizMarcaSeguroDesgravamencesantia = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizModeloAutomovil.
     * 
     */
    public int getAutomotrizModeloAutomovil() {
        return automotrizModeloAutomovil;
    }

    /**
     * Define el valor de la propiedad automotrizModeloAutomovil.
     * 
     */
    public void setAutomotrizModeloAutomovil(int value) {
        this.automotrizModeloAutomovil = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizMontoGiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutomotrizMontoGiro() {
        return automotrizMontoGiro;
    }

    /**
     * Define el valor de la propiedad automotrizMontoGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutomotrizMontoGiro(BigDecimal value) {
        this.automotrizMontoGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizMontoSolicitado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutomotrizMontoSolicitado() {
        return automotrizMontoSolicitado;
    }

    /**
     * Define el valor de la propiedad automotrizMontoSolicitado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutomotrizMontoSolicitado(BigDecimal value) {
        this.automotrizMontoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizNumeroDeCuotas.
     * 
     */
    public int getAutomotrizNumeroDeCuotas() {
        return automotrizNumeroDeCuotas;
    }

    /**
     * Define el valor de la propiedad automotrizNumeroDeCuotas.
     * 
     */
    public void setAutomotrizNumeroDeCuotas(int value) {
        this.automotrizNumeroDeCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizPieAutomotriz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutomotrizPieAutomotriz() {
        return automotrizPieAutomotriz;
    }

    /**
     * Define el valor de la propiedad automotrizPieAutomotriz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutomotrizPieAutomotriz(BigDecimal value) {
        this.automotrizPieAutomotriz = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizPlazoSolicitado.
     * 
     */
    public int getAutomotrizPlazoSolicitado() {
        return automotrizPlazoSolicitado;
    }

    /**
     * Define el valor de la propiedad automotrizPlazoSolicitado.
     * 
     */
    public void setAutomotrizPlazoSolicitado(int value) {
        this.automotrizPlazoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizTasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutomotrizTasa() {
        return automotrizTasa;
    }

    /**
     * Define el valor de la propiedad automotrizTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutomotrizTasa(BigDecimal value) {
        this.automotrizTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizTipoPoliticaAutomotriz.
     * 
     */
    public int getAutomotrizTipoPoliticaAutomotriz() {
        return automotrizTipoPoliticaAutomotriz;
    }

    /**
     * Define el valor de la propiedad automotrizTipoPoliticaAutomotriz.
     * 
     */
    public void setAutomotrizTipoPoliticaAutomotriz(int value) {
        this.automotrizTipoPoliticaAutomotriz = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizUso.
     * 
     */
    public int getAutomotrizUso() {
        return automotrizUso;
    }

    /**
     * Define el valor de la propiedad automotrizUso.
     * 
     */
    public void setAutomotrizUso(int value) {
        this.automotrizUso = value;
    }

    /**
     * Obtiene el valor de la propiedad automotrizValorAutomovil.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutomotrizValorAutomovil() {
        return automotrizValorAutomovil;
    }

    /**
     * Define el valor de la propiedad automotrizValorAutomovil.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutomotrizValorAutomovil(BigDecimal value) {
        this.automotrizValorAutomovil = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable1.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable1() {
        return auxiliaresBfvariable1;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable1(BigDecimal value) {
        this.auxiliaresBfvariable1 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable10.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuxiliaresBfvariable10() {
        return auxiliaresBfvariable10;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable10.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuxiliaresBfvariable10(XMLGregorianCalendar value) {
        this.auxiliaresBfvariable10 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable11.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuxiliaresBfvariable11() {
        return auxiliaresBfvariable11;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable11.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuxiliaresBfvariable11(XMLGregorianCalendar value) {
        this.auxiliaresBfvariable11 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable12.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuxiliaresBfvariable12() {
        return auxiliaresBfvariable12;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable12.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuxiliaresBfvariable12(XMLGregorianCalendar value) {
        this.auxiliaresBfvariable12 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable13.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuxiliaresBfvariable13() {
        return auxiliaresBfvariable13;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable13.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuxiliaresBfvariable13(XMLGregorianCalendar value) {
        this.auxiliaresBfvariable13 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable14.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuxiliaresBfvariable14() {
        return auxiliaresBfvariable14;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable14.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuxiliaresBfvariable14(XMLGregorianCalendar value) {
        this.auxiliaresBfvariable14 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaresBfvariable15() {
        return auxiliaresBfvariable15;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaresBfvariable15(String value) {
        this.auxiliaresBfvariable15 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable16.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaresBfvariable16() {
        return auxiliaresBfvariable16;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable16.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaresBfvariable16(String value) {
        this.auxiliaresBfvariable16 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable17.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaresBfvariable17() {
        return auxiliaresBfvariable17;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable17.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaresBfvariable17(String value) {
        this.auxiliaresBfvariable17 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaresBfvariable18() {
        return auxiliaresBfvariable18;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaresBfvariable18(String value) {
        this.auxiliaresBfvariable18 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaresBfvariable19() {
        return auxiliaresBfvariable19;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaresBfvariable19(String value) {
        this.auxiliaresBfvariable19 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable2() {
        return auxiliaresBfvariable2;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable2(BigDecimal value) {
        this.auxiliaresBfvariable2 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable20.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable20() {
        return auxiliaresBfvariable20;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable20.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable20(BigDecimal value) {
        this.auxiliaresBfvariable20 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable3.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable3() {
        return auxiliaresBfvariable3;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable3(BigDecimal value) {
        this.auxiliaresBfvariable3 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable4.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable4() {
        return auxiliaresBfvariable4;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable4.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable4(BigDecimal value) {
        this.auxiliaresBfvariable4 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable5.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable5() {
        return auxiliaresBfvariable5;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable5.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable5(BigDecimal value) {
        this.auxiliaresBfvariable5 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable6.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable6() {
        return auxiliaresBfvariable6;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable6.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable6(BigDecimal value) {
        this.auxiliaresBfvariable6 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable7.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable7() {
        return auxiliaresBfvariable7;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable7.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable7(BigDecimal value) {
        this.auxiliaresBfvariable7 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable8.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable8() {
        return auxiliaresBfvariable8;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable8.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable8(BigDecimal value) {
        this.auxiliaresBfvariable8 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliaresBfvariable9.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuxiliaresBfvariable9() {
        return auxiliaresBfvariable9;
    }

    /**
     * Define el valor de la propiedad auxiliaresBfvariable9.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuxiliaresBfvariable9(BigDecimal value) {
        this.auxiliaresBfvariable9 = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoCodigo.
     * 
     */
    public int getConsumoCodigo() {
        return consumoCodigo;
    }

    /**
     * Define el valor de la propiedad consumoCodigo.
     * 
     */
    public void setConsumoCodigo(int value) {
        this.consumoCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoCodigoDestino.
     * 
     */
    public int getConsumoCodigoDestino() {
        return consumoCodigoDestino;
    }

    /**
     * Define el valor de la propiedad consumoCodigoDestino.
     * 
     */
    public void setConsumoCodigoDestino(int value) {
        this.consumoCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoCodigoProducto.
     * 
     */
    public int getConsumoCodigoProducto() {
        return consumoCodigoProducto;
    }

    /**
     * Define el valor de la propiedad consumoCodigoProducto.
     * 
     */
    public void setConsumoCodigoProducto(int value) {
        this.consumoCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumoCuota() {
        return consumoCuota;
    }

    /**
     * Define el valor de la propiedad consumoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumoCuota(BigDecimal value) {
        this.consumoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoMarcaSeguroDesgravamen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumoMarcaSeguroDesgravamen() {
        return consumoMarcaSeguroDesgravamen;
    }

    /**
     * Define el valor de la propiedad consumoMarcaSeguroDesgravamen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumoMarcaSeguroDesgravamen(String value) {
        this.consumoMarcaSeguroDesgravamen = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoMarcaSeguroDesgravamencesantia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumoMarcaSeguroDesgravamencesantia() {
        return consumoMarcaSeguroDesgravamencesantia;
    }

    /**
     * Define el valor de la propiedad consumoMarcaSeguroDesgravamencesantia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumoMarcaSeguroDesgravamencesantia(String value) {
        this.consumoMarcaSeguroDesgravamencesantia = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoMontoAConsolidar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumoMontoAConsolidar() {
        return consumoMontoAConsolidar;
    }

    /**
     * Define el valor de la propiedad consumoMontoAConsolidar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumoMontoAConsolidar(BigDecimal value) {
        this.consumoMontoAConsolidar = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoMontoARefinanciar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumoMontoARefinanciar() {
        return consumoMontoARefinanciar;
    }

    /**
     * Define el valor de la propiedad consumoMontoARefinanciar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumoMontoARefinanciar(BigDecimal value) {
        this.consumoMontoARefinanciar = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoMontoGiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumoMontoGiro() {
        return consumoMontoGiro;
    }

    /**
     * Define el valor de la propiedad consumoMontoGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumoMontoGiro(BigDecimal value) {
        this.consumoMontoGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoMontoSolicitado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumoMontoSolicitado() {
        return consumoMontoSolicitado;
    }

    /**
     * Define el valor de la propiedad consumoMontoSolicitado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumoMontoSolicitado(BigDecimal value) {
        this.consumoMontoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoNumeroDeCuotas.
     * 
     */
    public int getConsumoNumeroDeCuotas() {
        return consumoNumeroDeCuotas;
    }

    /**
     * Define el valor de la propiedad consumoNumeroDeCuotas.
     * 
     */
    public void setConsumoNumeroDeCuotas(int value) {
        this.consumoNumeroDeCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoPlazoSolicitado.
     * 
     */
    public int getConsumoPlazoSolicitado() {
        return consumoPlazoSolicitado;
    }

    /**
     * Define el valor de la propiedad consumoPlazoSolicitado.
     * 
     */
    public void setConsumoPlazoSolicitado(int value) {
        this.consumoPlazoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoTasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumoTasa() {
        return consumoTasa;
    }

    /**
     * Define el valor de la propiedad consumoTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumoTasa(BigDecimal value) {
        this.consumoTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioCodigoDestino.
     * 
     */
    public int getHipotecarioCodigoDestino() {
        return hipotecarioCodigoDestino;
    }

    /**
     * Define el valor de la propiedad hipotecarioCodigoDestino.
     * 
     */
    public void setHipotecarioCodigoDestino(int value) {
        this.hipotecarioCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioCodigoProducto.
     * 
     */
    public int getHipotecarioCodigoProducto() {
        return hipotecarioCodigoProducto;
    }

    /**
     * Define el valor de la propiedad hipotecarioCodigoProducto.
     * 
     */
    public void setHipotecarioCodigoProducto(int value) {
        this.hipotecarioCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioCodigosubproducto.
     * 
     */
    public int getHipotecarioCodigosubproducto() {
        return hipotecarioCodigosubproducto;
    }

    /**
     * Define el valor de la propiedad hipotecarioCodigosubproducto.
     * 
     */
    public void setHipotecarioCodigosubproducto(int value) {
        this.hipotecarioCodigosubproducto = value;
    }

    /**
     * Gets the value of the hipotecarioComunaVivienda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hipotecarioComunaVivienda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHipotecarioComunaVivienda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHipotecarioComunaVivienda() {
        if (hipotecarioComunaVivienda == null) {
            hipotecarioComunaVivienda = new ArrayList<Integer>();
        }
        return this.hipotecarioComunaVivienda;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHipotecarioCuota() {
        return hipotecarioCuota;
    }

    /**
     * Define el valor de la propiedad hipotecarioCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHipotecarioCuota(BigDecimal value) {
        this.hipotecarioCuota = value;
    }

    /**
     * Gets the value of the hipotecarioDestinoPropiedad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hipotecarioDestinoPropiedad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHipotecarioDestinoPropiedad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHipotecarioDestinoPropiedad() {
        if (hipotecarioDestinoPropiedad == null) {
            hipotecarioDestinoPropiedad = new ArrayList<Integer>();
        }
        return this.hipotecarioDestinoPropiedad;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioMarcaTieneComplementario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHipotecarioMarcaTieneComplementario() {
        return hipotecarioMarcaTieneComplementario;
    }

    /**
     * Define el valor de la propiedad hipotecarioMarcaTieneComplementario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHipotecarioMarcaTieneComplementario(String value) {
        this.hipotecarioMarcaTieneComplementario = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioMontoDeFinanciamiento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHipotecarioMontoDeFinanciamiento() {
        return hipotecarioMontoDeFinanciamiento;
    }

    /**
     * Define el valor de la propiedad hipotecarioMontoDeFinanciamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHipotecarioMontoDeFinanciamiento(BigDecimal value) {
        this.hipotecarioMontoDeFinanciamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioMontoSolicitado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHipotecarioMontoSolicitado() {
        return hipotecarioMontoSolicitado;
    }

    /**
     * Define el valor de la propiedad hipotecarioMontoSolicitado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHipotecarioMontoSolicitado(BigDecimal value) {
        this.hipotecarioMontoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioNumercoDeCuotas.
     * 
     */
    public int getHipotecarioNumercoDeCuotas() {
        return hipotecarioNumercoDeCuotas;
    }

    /**
     * Define el valor de la propiedad hipotecarioNumercoDeCuotas.
     * 
     */
    public void setHipotecarioNumercoDeCuotas(int value) {
        this.hipotecarioNumercoDeCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioPie.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHipotecarioPie() {
        return hipotecarioPie;
    }

    /**
     * Define el valor de la propiedad hipotecarioPie.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHipotecarioPie(BigDecimal value) {
        this.hipotecarioPie = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioPieJustificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHipotecarioPieJustificado() {
        return hipotecarioPieJustificado;
    }

    /**
     * Define el valor de la propiedad hipotecarioPieJustificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHipotecarioPieJustificado(String value) {
        this.hipotecarioPieJustificado = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioPlazoSolicitado.
     * 
     */
    public int getHipotecarioPlazoSolicitado() {
        return hipotecarioPlazoSolicitado;
    }

    /**
     * Define el valor de la propiedad hipotecarioPlazoSolicitado.
     * 
     */
    public void setHipotecarioPlazoSolicitado(int value) {
        this.hipotecarioPlazoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioTasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHipotecarioTasa() {
        return hipotecarioTasa;
    }

    /**
     * Define el valor de la propiedad hipotecarioTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHipotecarioTasa(BigDecimal value) {
        this.hipotecarioTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad hipotecarioTipoDeFinanciamiento.
     * 
     */
    public int getHipotecarioTipoDeFinanciamiento() {
        return hipotecarioTipoDeFinanciamiento;
    }

    /**
     * Define el valor de la propiedad hipotecarioTipoDeFinanciamiento.
     * 
     */
    public void setHipotecarioTipoDeFinanciamiento(int value) {
        this.hipotecarioTipoDeFinanciamiento = value;
    }

    /**
     * Gets the value of the hipotecarioValorBienRaiz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hipotecarioValorBienRaiz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHipotecarioValorBienRaiz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getHipotecarioValorBienRaiz() {
        if (hipotecarioValorBienRaiz == null) {
            hipotecarioValorBienRaiz = new ArrayList<BigDecimal>();
        }
        return this.hipotecarioValorBienRaiz;
    }

    /**
     * Gets the value of the hipotecarioValorVivienda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hipotecarioValorVivienda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHipotecarioValorVivienda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getHipotecarioValorVivienda() {
        if (hipotecarioValorVivienda == null) {
            hipotecarioValorVivienda = new ArrayList<BigDecimal>();
        }
        return this.hipotecarioValorVivienda;
    }

    /**
     * Obtiene el valor de la propiedad lineacreditoCodigoDestino.
     * 
     */
    public int getLineacreditoCodigoDestino() {
        return lineacreditoCodigoDestino;
    }

    /**
     * Define el valor de la propiedad lineacreditoCodigoDestino.
     * 
     */
    public void setLineacreditoCodigoDestino(int value) {
        this.lineacreditoCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad lineacreditoCodigoProducto.
     * 
     */
    public int getLineacreditoCodigoProducto() {
        return lineacreditoCodigoProducto;
    }

    /**
     * Define el valor de la propiedad lineacreditoCodigoProducto.
     * 
     */
    public void setLineacreditoCodigoProducto(int value) {
        this.lineacreditoCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad lineacreditoCodigosubproducto.
     * 
     */
    public int getLineacreditoCodigosubproducto() {
        return lineacreditoCodigosubproducto;
    }

    /**
     * Define el valor de la propiedad lineacreditoCodigosubproducto.
     * 
     */
    public void setLineacreditoCodigosubproducto(int value) {
        this.lineacreditoCodigosubproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad lineacreditoMontoDeLaLinea.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineacreditoMontoDeLaLinea() {
        return lineacreditoMontoDeLaLinea;
    }

    /**
     * Define el valor de la propiedad lineacreditoMontoDeLaLinea.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineacreditoMontoDeLaLinea(BigDecimal value) {
        this.lineacreditoMontoDeLaLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionCodigoDestino.
     * 
     */
    public int getRenegociacionCodigoDestino() {
        return renegociacionCodigoDestino;
    }

    /**
     * Define el valor de la propiedad renegociacionCodigoDestino.
     * 
     */
    public void setRenegociacionCodigoDestino(int value) {
        this.renegociacionCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionCodigoProducto.
     * 
     */
    public int getRenegociacionCodigoProducto() {
        return renegociacionCodigoProducto;
    }

    /**
     * Define el valor de la propiedad renegociacionCodigoProducto.
     * 
     */
    public void setRenegociacionCodigoProducto(int value) {
        this.renegociacionCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionCodigosubproducto.
     * 
     */
    public int getRenegociacionCodigosubproducto() {
        return renegociacionCodigosubproducto;
    }

    /**
     * Define el valor de la propiedad renegociacionCodigosubproducto.
     * 
     */
    public void setRenegociacionCodigosubproducto(int value) {
        this.renegociacionCodigosubproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenegociacionCuota() {
        return renegociacionCuota;
    }

    /**
     * Define el valor de la propiedad renegociacionCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenegociacionCuota(BigDecimal value) {
        this.renegociacionCuota = value;
    }

    /**
     * Gets the value of the renegociacionMontoARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renegociacionMontoARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenegociacionMontoARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getRenegociacionMontoARenegociar() {
        if (renegociacionMontoARenegociar == null) {
            renegociacionMontoARenegociar = new ArrayList<BigDecimal>();
        }
        return this.renegociacionMontoARenegociar;
    }

    /**
     * Gets the value of the renegociacionMontoGastosDeCobranzaARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renegociacionMontoGastosDeCobranzaARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenegociacionMontoGastosDeCobranzaARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getRenegociacionMontoGastosDeCobranzaARenegociar() {
        if (renegociacionMontoGastosDeCobranzaARenegociar == null) {
            renegociacionMontoGastosDeCobranzaARenegociar = new ArrayList<BigDecimal>();
        }
        return this.renegociacionMontoGastosDeCobranzaARenegociar;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionMontoGiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenegociacionMontoGiro() {
        return renegociacionMontoGiro;
    }

    /**
     * Define el valor de la propiedad renegociacionMontoGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenegociacionMontoGiro(BigDecimal value) {
        this.renegociacionMontoGiro = value;
    }

    /**
     * Gets the value of the renegociacionMontoInteresesPenalesARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renegociacionMontoInteresesPenalesARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenegociacionMontoInteresesPenalesARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getRenegociacionMontoInteresesPenalesARenegociar() {
        if (renegociacionMontoInteresesPenalesARenegociar == null) {
            renegociacionMontoInteresesPenalesARenegociar = new ArrayList<BigDecimal>();
        }
        return this.renegociacionMontoInteresesPenalesARenegociar;
    }

    /**
     * Gets the value of the renegociacionMontoOtrosGastosARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renegociacionMontoOtrosGastosARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenegociacionMontoOtrosGastosARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getRenegociacionMontoOtrosGastosARenegociar() {
        if (renegociacionMontoOtrosGastosARenegociar == null) {
            renegociacionMontoOtrosGastosARenegociar = new ArrayList<BigDecimal>();
        }
        return this.renegociacionMontoOtrosGastosARenegociar;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionNumeroDeCuotas.
     * 
     */
    public int getRenegociacionNumeroDeCuotas() {
        return renegociacionNumeroDeCuotas;
    }

    /**
     * Define el valor de la propiedad renegociacionNumeroDeCuotas.
     * 
     */
    public void setRenegociacionNumeroDeCuotas(int value) {
        this.renegociacionNumeroDeCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionPlazoSolicitado.
     * 
     */
    public int getRenegociacionPlazoSolicitado() {
        return renegociacionPlazoSolicitado;
    }

    /**
     * Define el valor de la propiedad renegociacionPlazoSolicitado.
     * 
     */
    public void setRenegociacionPlazoSolicitado(int value) {
        this.renegociacionPlazoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad renegociacionTasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenegociacionTasa() {
        return renegociacionTasa;
    }

    /**
     * Define el valor de la propiedad renegociacionTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenegociacionTasa(BigDecimal value) {
        this.renegociacionTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaCodigoDestino.
     * 
     */
    public int getTarjetaCodigoDestino() {
        return tarjetaCodigoDestino;
    }

    /**
     * Define el valor de la propiedad tarjetaCodigoDestino.
     * 
     */
    public void setTarjetaCodigoDestino(int value) {
        this.tarjetaCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaCodigoProducto.
     * 
     */
    public int getTarjetaCodigoProducto() {
        return tarjetaCodigoProducto;
    }

    /**
     * Define el valor de la propiedad tarjetaCodigoProducto.
     * 
     */
    public void setTarjetaCodigoProducto(int value) {
        this.tarjetaCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaCodigosubproducto.
     * 
     */
    public int getTarjetaCodigosubproducto() {
        return tarjetaCodigosubproducto;
    }

    /**
     * Define el valor de la propiedad tarjetaCodigosubproducto.
     * 
     */
    public void setTarjetaCodigosubproducto(int value) {
        this.tarjetaCodigosubproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaLimiteDeCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarjetaLimiteDeCredito() {
        return tarjetaLimiteDeCredito;
    }

    /**
     * Define el valor de la propiedad tarjetaLimiteDeCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarjetaLimiteDeCredito(BigDecimal value) {
        this.tarjetaLimiteDeCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaLimiteDeCreditoEnMonedaExtranjera.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarjetaLimiteDeCreditoEnMonedaExtranjera() {
        return tarjetaLimiteDeCreditoEnMonedaExtranjera;
    }

    /**
     * Define el valor de la propiedad tarjetaLimiteDeCreditoEnMonedaExtranjera.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarjetaLimiteDeCreditoEnMonedaExtranjera(BigDecimal value) {
        this.tarjetaLimiteDeCreditoEnMonedaExtranjera = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaLimiteDeCreditoRotativo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarjetaLimiteDeCreditoRotativo() {
        return tarjetaLimiteDeCreditoRotativo;
    }

    /**
     * Define el valor de la propiedad tarjetaLimiteDeCreditoRotativo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarjetaLimiteDeCreditoRotativo(BigDecimal value) {
        this.tarjetaLimiteDeCreditoRotativo = value;
    }

}
