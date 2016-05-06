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
 * <p>Clase Java para outBI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="outBI">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="codigoaccion" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosAvalcodeudorRentaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosAvalcodeudorTipoMontoRenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosRentaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosRentaEstimadaEeAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosRentaEstimadaEeTitular" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTipoMontoRenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTipoMontoRentaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTitularRentaDeEvaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fechaCalendario" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="llamarburosinacofichk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llamarburosinacofivigencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="politicasDecisionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="politicasDecisionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="politicasSortedDecisionTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="politicasSortedReasonCodeTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requiereburordb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreCliente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoAutomotrizScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoAutomotrizScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoAutomotrizValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoCcScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoCcScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoCcValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoConsolidacionScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoConsolidacionScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoConsolidacionValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoFinanciamientoScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoFinanciamientoScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoFinanciamientoValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoHipotecarioScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoHipotecarioScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoHipotecarioValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoNoConocidoScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoNoConocidoScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoNoConocidoValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaAdverseRcodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaDeviationTable" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreRiesgoTarjetaScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreRiesgoTarjetaScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRiesgoTarjetaValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudeAdverseReasonCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudeRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudeRankedScoreDeviation" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudeScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scorefraudeScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scorefraudeScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudeScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorefraudeScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudeValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoAdverseReasonCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoRankedAdverseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoRankedScoreDeviation" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scoreriesgoScoreIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scoreriesgoScoreValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoScorecardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreriesgoScoringResultTable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoValue1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoPerfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPoliticaAutomotriz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outBI", propOrder = {
    "codigoaccion",
    "estimacionDeIngresosAvalcodeudorRentaDeEvaluacion",
    "estimacionDeIngresosAvalcodeudorTipoMontoRenta",
    "estimacionDeIngresosRentaDeEvaluacion",
    "estimacionDeIngresosRentaEstimadaEeAvalcodeudor",
    "estimacionDeIngresosRentaEstimadaEeTitular",
    "estimacionDeIngresosTipoMontoRenta",
    "estimacionDeIngresosTipoMontoRentaDeEvaluacion",
    "estimacionDeIngresosTitularRentaDeEvaluacion",
    "fechaCalendario",
    "llamarburosinacofichk",
    "llamarburosinacofivigencia",
    "politicasDecisionCategory",
    "politicasDecisionText",
    "politicasSortedDecisionTable",
    "politicasSortedReasonCodeTable",
    "requiereburordb",
    "scoreCliente",
    "scoreRiesgoAutomotrizAdverseRcodes",
    "scoreRiesgoAutomotrizDeviationTable",
    "scoreRiesgoAutomotrizRankedAdverseReasonCode",
    "scoreRiesgoAutomotrizScore",
    "scoreRiesgoAutomotrizScoreIndex",
    "scoreRiesgoAutomotrizScoreValue",
    "scoreRiesgoAutomotrizScorecardId",
    "scoreRiesgoAutomotrizScoringResultTable",
    "scoreRiesgoAutomotrizValue1",
    "scoreRiesgoCcAdverseRcodes",
    "scoreRiesgoCcDeviationTable",
    "scoreRiesgoCcRankedAdverseReasonCode",
    "scoreRiesgoCcScore",
    "scoreRiesgoCcScoreIndex",
    "scoreRiesgoCcScoreValue",
    "scoreRiesgoCcScorecardId",
    "scoreRiesgoCcScoringResultTable",
    "scoreRiesgoCcValue1",
    "scoreRiesgoConsolidacionAdverseRcodes",
    "scoreRiesgoConsolidacionDeviationTable",
    "scoreRiesgoConsolidacionRankedAdverseReasonCode",
    "scoreRiesgoConsolidacionScore",
    "scoreRiesgoConsolidacionScoreIndex",
    "scoreRiesgoConsolidacionScoreValue",
    "scoreRiesgoConsolidacionScorecardId",
    "scoreRiesgoConsolidacionScoringResultTable",
    "scoreRiesgoConsolidacionValue1",
    "scoreRiesgoFinanciamientoAdverseRcodes",
    "scoreRiesgoFinanciamientoDeviationTable",
    "scoreRiesgoFinanciamientoRankedAdverseReasonCode",
    "scoreRiesgoFinanciamientoScore",
    "scoreRiesgoFinanciamientoScoreIndex",
    "scoreRiesgoFinanciamientoScoreValue",
    "scoreRiesgoFinanciamientoScorecardId",
    "scoreRiesgoFinanciamientoScoringResultTable",
    "scoreRiesgoFinanciamientoValue1",
    "scoreRiesgoHipotecarioAdverseRcodes",
    "scoreRiesgoHipotecarioDeviationTable",
    "scoreRiesgoHipotecarioRankedAdverseReasonCode",
    "scoreRiesgoHipotecarioScore",
    "scoreRiesgoHipotecarioScoreIndex",
    "scoreRiesgoHipotecarioScoreValue",
    "scoreRiesgoHipotecarioScorecardId",
    "scoreRiesgoHipotecarioScoringResultTable",
    "scoreRiesgoHipotecarioValue1",
    "scoreRiesgoNoConocidoAdverseRcodes",
    "scoreRiesgoNoConocidoDeviationTable",
    "scoreRiesgoNoConocidoRankedAdverseReasonCode",
    "scoreRiesgoNoConocidoScore",
    "scoreRiesgoNoConocidoScoreIndex",
    "scoreRiesgoNoConocidoScoreValue",
    "scoreRiesgoNoConocidoScorecardId",
    "scoreRiesgoNoConocidoScoringResultTable",
    "scoreRiesgoNoConocidoValue1",
    "scoreRiesgoTarjetaAdverseRcodes",
    "scoreRiesgoTarjetaDeviationTable",
    "scoreRiesgoTarjetaRankedAdverseReasonCode",
    "scoreRiesgoTarjetaScore",
    "scoreRiesgoTarjetaScoreIndex",
    "scoreRiesgoTarjetaScoreValue",
    "scoreRiesgoTarjetaScorecardId",
    "scoreRiesgoTarjetaScoringResultTable",
    "scoreRiesgoTarjetaValue1",
    "scorefraudeAdverseReasonCodes",
    "scorefraudeRankedAdverseReasonCode",
    "scorefraudeRankedScoreDeviation",
    "scorefraudeScore",
    "scorefraudeScoreIndex",
    "scorefraudeScoreValue",
    "scorefraudeScorecardId",
    "scorefraudeScoringResultTable",
    "scorefraudeValue1",
    "scoreriesgoAdverseReasonCodes",
    "scoreriesgoRankedAdverseReasonCode",
    "scoreriesgoRankedScoreDeviation",
    "scoreriesgoScore",
    "scoreriesgoScoreIndex",
    "scoreriesgoScoreValue",
    "scoreriesgoScorecardId",
    "scoreriesgoScoringResultTable",
    "scoreriesgoValue1",
    "tipoPerfil",
    "tipoPoliticaAutomotriz"
})
public class OutBI
    extends DaBean
{

    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> codigoaccion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal estimacionDeIngresosAvalcodeudorRentaDeEvaluacion;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosAvalcodeudorTipoMontoRenta;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal estimacionDeIngresosRentaDeEvaluacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal estimacionDeIngresosRentaEstimadaEeAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal estimacionDeIngresosRentaEstimadaEeTitular;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosTipoMontoRenta;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosTipoMontoRentaDeEvaluacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal estimacionDeIngresosTitularRentaDeEvaluacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCalendario;
    @XmlElement(defaultValue = "|")
    protected String llamarburosinacofichk;
    @XmlElement(defaultValue = "-99")
    protected int llamarburosinacofivigencia;
    @XmlElement(defaultValue = "|")
    protected String politicasDecisionCategory;
    @XmlElement(defaultValue = "|")
    protected String politicasDecisionText;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> politicasSortedDecisionTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> politicasSortedReasonCodeTable;
    @XmlElement(defaultValue = "|")
    protected String requiereburordb;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal scoreCliente;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoAutomotrizAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoAutomotrizDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoAutomotrizRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoAutomotrizScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoAutomotrizScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoAutomotrizScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoAutomotrizScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoAutomotrizScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoAutomotrizValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoCcAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoCcDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoCcRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoCcScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoCcScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoCcScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoCcScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoCcScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoCcValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoConsolidacionAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoConsolidacionDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoConsolidacionRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoConsolidacionScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoConsolidacionScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoConsolidacionScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoConsolidacionScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoConsolidacionScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoConsolidacionValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoFinanciamientoAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoFinanciamientoDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoFinanciamientoRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoFinanciamientoScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoFinanciamientoScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoFinanciamientoScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoFinanciamientoScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoFinanciamientoScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoFinanciamientoValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoHipotecarioAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoHipotecarioDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoHipotecarioRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoHipotecarioScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoHipotecarioScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoHipotecarioScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoHipotecarioScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoHipotecarioScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoHipotecarioValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoNoConocidoAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoNoConocidoDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoNoConocidoRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoNoConocidoScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoNoConocidoScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoNoConocidoScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoNoConocidoScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoNoConocidoScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoNoConocidoValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoTarjetaAdverseRcodes;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoTarjetaDeviationTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoTarjetaRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreRiesgoTarjetaScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreRiesgoTarjetaScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreRiesgoTarjetaScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreRiesgoTarjetaScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoTarjetaScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRiesgoTarjetaValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scorefraudeAdverseReasonCodes;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scorefraudeRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scorefraudeRankedScoreDeviation;
    @XmlElement(defaultValue = "-99.0")
    protected double scorefraudeScore;
    @XmlElement(defaultValue = "-99")
    protected int scorefraudeScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scorefraudeScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scorefraudeScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scorefraudeScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scorefraudeValue1;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreriesgoAdverseReasonCodes;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreriesgoRankedAdverseReasonCode;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreriesgoRankedScoreDeviation;
    @XmlElement(defaultValue = "-99.0")
    protected double scoreriesgoScore;
    @XmlElement(defaultValue = "-99")
    protected int scoreriesgoScoreIndex;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> scoreriesgoScoreValue;
    @XmlElement(defaultValue = "|")
    protected String scoreriesgoScorecardId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreriesgoScoringResultTable;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreriesgoValue1;
    @XmlElement(defaultValue = "|")
    protected String tipoPerfil;
    @XmlElement(defaultValue = "-99")
    protected int tipoPoliticaAutomotriz;

    /**
     * Gets the value of the codigoaccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoaccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoaccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodigoaccion() {
        if (codigoaccion == null) {
            codigoaccion = new ArrayList<String>();
        }
        return this.codigoaccion;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimacionDeIngresosAvalcodeudorRentaDeEvaluacion() {
        return estimacionDeIngresosAvalcodeudorRentaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimacionDeIngresosAvalcodeudorRentaDeEvaluacion(BigDecimal value) {
        this.estimacionDeIngresosAvalcodeudorRentaDeEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosAvalcodeudorTipoMontoRenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosAvalcodeudorTipoMontoRenta() {
        return estimacionDeIngresosAvalcodeudorTipoMontoRenta;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosAvalcodeudorTipoMontoRenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosAvalcodeudorTipoMontoRenta(String value) {
        this.estimacionDeIngresosAvalcodeudorTipoMontoRenta = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosRentaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimacionDeIngresosRentaDeEvaluacion() {
        return estimacionDeIngresosRentaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosRentaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimacionDeIngresosRentaDeEvaluacion(BigDecimal value) {
        this.estimacionDeIngresosRentaDeEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosRentaEstimadaEeAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimacionDeIngresosRentaEstimadaEeAvalcodeudor() {
        return estimacionDeIngresosRentaEstimadaEeAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosRentaEstimadaEeAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimacionDeIngresosRentaEstimadaEeAvalcodeudor(BigDecimal value) {
        this.estimacionDeIngresosRentaEstimadaEeAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosRentaEstimadaEeTitular.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimacionDeIngresosRentaEstimadaEeTitular() {
        return estimacionDeIngresosRentaEstimadaEeTitular;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosRentaEstimadaEeTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimacionDeIngresosRentaEstimadaEeTitular(BigDecimal value) {
        this.estimacionDeIngresosRentaEstimadaEeTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTipoMontoRenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosTipoMontoRenta() {
        return estimacionDeIngresosTipoMontoRenta;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTipoMontoRenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosTipoMontoRenta(String value) {
        this.estimacionDeIngresosTipoMontoRenta = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTipoMontoRentaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosTipoMontoRentaDeEvaluacion() {
        return estimacionDeIngresosTipoMontoRentaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTipoMontoRentaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosTipoMontoRentaDeEvaluacion(String value) {
        this.estimacionDeIngresosTipoMontoRentaDeEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimacionDeIngresosTitularRentaDeEvaluacion() {
        return estimacionDeIngresosTitularRentaDeEvaluacion;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimacionDeIngresosTitularRentaDeEvaluacion(BigDecimal value) {
        this.estimacionDeIngresosTitularRentaDeEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCalendario.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCalendario() {
        return fechaCalendario;
    }

    /**
     * Define el valor de la propiedad fechaCalendario.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCalendario(XMLGregorianCalendar value) {
        this.fechaCalendario = value;
    }

    /**
     * Obtiene el valor de la propiedad llamarburosinacofichk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlamarburosinacofichk() {
        return llamarburosinacofichk;
    }

    /**
     * Define el valor de la propiedad llamarburosinacofichk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlamarburosinacofichk(String value) {
        this.llamarburosinacofichk = value;
    }

    /**
     * Obtiene el valor de la propiedad llamarburosinacofivigencia.
     * 
     */
    public int getLlamarburosinacofivigencia() {
        return llamarburosinacofivigencia;
    }

    /**
     * Define el valor de la propiedad llamarburosinacofivigencia.
     * 
     */
    public void setLlamarburosinacofivigencia(int value) {
        this.llamarburosinacofivigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad politicasDecisionCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticasDecisionCategory() {
        return politicasDecisionCategory;
    }

    /**
     * Define el valor de la propiedad politicasDecisionCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticasDecisionCategory(String value) {
        this.politicasDecisionCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad politicasDecisionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticasDecisionText() {
        return politicasDecisionText;
    }

    /**
     * Define el valor de la propiedad politicasDecisionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticasDecisionText(String value) {
        this.politicasDecisionText = value;
    }

    /**
     * Gets the value of the politicasSortedDecisionTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the politicasSortedDecisionTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoliticasSortedDecisionTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPoliticasSortedDecisionTable() {
        if (politicasSortedDecisionTable == null) {
            politicasSortedDecisionTable = new ArrayList<String>();
        }
        return this.politicasSortedDecisionTable;
    }

    /**
     * Gets the value of the politicasSortedReasonCodeTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the politicasSortedReasonCodeTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoliticasSortedReasonCodeTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPoliticasSortedReasonCodeTable() {
        if (politicasSortedReasonCodeTable == null) {
            politicasSortedReasonCodeTable = new ArrayList<String>();
        }
        return this.politicasSortedReasonCodeTable;
    }

    /**
     * Obtiene el valor de la propiedad requiereburordb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiereburordb() {
        return requiereburordb;
    }

    /**
     * Define el valor de la propiedad requiereburordb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiereburordb(String value) {
        this.requiereburordb = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreCliente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScoreCliente() {
        return scoreCliente;
    }

    /**
     * Define el valor de la propiedad scoreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScoreCliente(BigDecimal value) {
        this.scoreCliente = value;
    }

    /**
     * Gets the value of the scoreRiesgoAutomotrizAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoAutomotrizAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoAutomotrizAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoAutomotrizAdverseRcodes() {
        if (scoreRiesgoAutomotrizAdverseRcodes == null) {
            scoreRiesgoAutomotrizAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoAutomotrizAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoAutomotrizDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoAutomotrizDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoAutomotrizDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoAutomotrizDeviationTable() {
        if (scoreRiesgoAutomotrizDeviationTable == null) {
            scoreRiesgoAutomotrizDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoAutomotrizDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoAutomotrizRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoAutomotrizRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoAutomotrizRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoAutomotrizRankedAdverseReasonCode() {
        if (scoreRiesgoAutomotrizRankedAdverseReasonCode == null) {
            scoreRiesgoAutomotrizRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoAutomotrizRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoAutomotrizScore.
     * 
     */
    public double getScoreRiesgoAutomotrizScore() {
        return scoreRiesgoAutomotrizScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoAutomotrizScore.
     * 
     */
    public void setScoreRiesgoAutomotrizScore(double value) {
        this.scoreRiesgoAutomotrizScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoAutomotrizScoreIndex.
     * 
     */
    public int getScoreRiesgoAutomotrizScoreIndex() {
        return scoreRiesgoAutomotrizScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoAutomotrizScoreIndex.
     * 
     */
    public void setScoreRiesgoAutomotrizScoreIndex(int value) {
        this.scoreRiesgoAutomotrizScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoAutomotrizScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoAutomotrizScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoAutomotrizScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoAutomotrizScoreValue() {
        if (scoreRiesgoAutomotrizScoreValue == null) {
            scoreRiesgoAutomotrizScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoAutomotrizScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoAutomotrizScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoAutomotrizScorecardId() {
        return scoreRiesgoAutomotrizScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoAutomotrizScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoAutomotrizScorecardId(String value) {
        this.scoreRiesgoAutomotrizScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoAutomotrizScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoAutomotrizScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoAutomotrizScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoAutomotrizScoringResultTable() {
        if (scoreRiesgoAutomotrizScoringResultTable == null) {
            scoreRiesgoAutomotrizScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoAutomotrizScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoAutomotrizValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoAutomotrizValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoAutomotrizValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoAutomotrizValue1() {
        if (scoreRiesgoAutomotrizValue1 == null) {
            scoreRiesgoAutomotrizValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoAutomotrizValue1;
    }

    /**
     * Gets the value of the scoreRiesgoCcAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoCcAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoCcAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoCcAdverseRcodes() {
        if (scoreRiesgoCcAdverseRcodes == null) {
            scoreRiesgoCcAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoCcAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoCcDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoCcDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoCcDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoCcDeviationTable() {
        if (scoreRiesgoCcDeviationTable == null) {
            scoreRiesgoCcDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoCcDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoCcRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoCcRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoCcRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoCcRankedAdverseReasonCode() {
        if (scoreRiesgoCcRankedAdverseReasonCode == null) {
            scoreRiesgoCcRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoCcRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoCcScore.
     * 
     */
    public double getScoreRiesgoCcScore() {
        return scoreRiesgoCcScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoCcScore.
     * 
     */
    public void setScoreRiesgoCcScore(double value) {
        this.scoreRiesgoCcScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoCcScoreIndex.
     * 
     */
    public int getScoreRiesgoCcScoreIndex() {
        return scoreRiesgoCcScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoCcScoreIndex.
     * 
     */
    public void setScoreRiesgoCcScoreIndex(int value) {
        this.scoreRiesgoCcScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoCcScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoCcScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoCcScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoCcScoreValue() {
        if (scoreRiesgoCcScoreValue == null) {
            scoreRiesgoCcScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoCcScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoCcScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoCcScorecardId() {
        return scoreRiesgoCcScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoCcScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoCcScorecardId(String value) {
        this.scoreRiesgoCcScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoCcScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoCcScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoCcScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoCcScoringResultTable() {
        if (scoreRiesgoCcScoringResultTable == null) {
            scoreRiesgoCcScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoCcScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoCcValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoCcValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoCcValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoCcValue1() {
        if (scoreRiesgoCcValue1 == null) {
            scoreRiesgoCcValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoCcValue1;
    }

    /**
     * Gets the value of the scoreRiesgoConsolidacionAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoConsolidacionAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoConsolidacionAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoConsolidacionAdverseRcodes() {
        if (scoreRiesgoConsolidacionAdverseRcodes == null) {
            scoreRiesgoConsolidacionAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoConsolidacionAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoConsolidacionDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoConsolidacionDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoConsolidacionDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoConsolidacionDeviationTable() {
        if (scoreRiesgoConsolidacionDeviationTable == null) {
            scoreRiesgoConsolidacionDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoConsolidacionDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoConsolidacionRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoConsolidacionRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoConsolidacionRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoConsolidacionRankedAdverseReasonCode() {
        if (scoreRiesgoConsolidacionRankedAdverseReasonCode == null) {
            scoreRiesgoConsolidacionRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoConsolidacionRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoConsolidacionScore.
     * 
     */
    public double getScoreRiesgoConsolidacionScore() {
        return scoreRiesgoConsolidacionScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoConsolidacionScore.
     * 
     */
    public void setScoreRiesgoConsolidacionScore(double value) {
        this.scoreRiesgoConsolidacionScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoConsolidacionScoreIndex.
     * 
     */
    public int getScoreRiesgoConsolidacionScoreIndex() {
        return scoreRiesgoConsolidacionScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoConsolidacionScoreIndex.
     * 
     */
    public void setScoreRiesgoConsolidacionScoreIndex(int value) {
        this.scoreRiesgoConsolidacionScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoConsolidacionScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoConsolidacionScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoConsolidacionScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoConsolidacionScoreValue() {
        if (scoreRiesgoConsolidacionScoreValue == null) {
            scoreRiesgoConsolidacionScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoConsolidacionScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoConsolidacionScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoConsolidacionScorecardId() {
        return scoreRiesgoConsolidacionScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoConsolidacionScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoConsolidacionScorecardId(String value) {
        this.scoreRiesgoConsolidacionScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoConsolidacionScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoConsolidacionScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoConsolidacionScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoConsolidacionScoringResultTable() {
        if (scoreRiesgoConsolidacionScoringResultTable == null) {
            scoreRiesgoConsolidacionScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoConsolidacionScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoConsolidacionValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoConsolidacionValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoConsolidacionValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoConsolidacionValue1() {
        if (scoreRiesgoConsolidacionValue1 == null) {
            scoreRiesgoConsolidacionValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoConsolidacionValue1;
    }

    /**
     * Gets the value of the scoreRiesgoFinanciamientoAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoFinanciamientoAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoFinanciamientoAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoFinanciamientoAdverseRcodes() {
        if (scoreRiesgoFinanciamientoAdverseRcodes == null) {
            scoreRiesgoFinanciamientoAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoFinanciamientoAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoFinanciamientoDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoFinanciamientoDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoFinanciamientoDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoFinanciamientoDeviationTable() {
        if (scoreRiesgoFinanciamientoDeviationTable == null) {
            scoreRiesgoFinanciamientoDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoFinanciamientoDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoFinanciamientoRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoFinanciamientoRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoFinanciamientoRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoFinanciamientoRankedAdverseReasonCode() {
        if (scoreRiesgoFinanciamientoRankedAdverseReasonCode == null) {
            scoreRiesgoFinanciamientoRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoFinanciamientoRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoFinanciamientoScore.
     * 
     */
    public double getScoreRiesgoFinanciamientoScore() {
        return scoreRiesgoFinanciamientoScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoFinanciamientoScore.
     * 
     */
    public void setScoreRiesgoFinanciamientoScore(double value) {
        this.scoreRiesgoFinanciamientoScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoFinanciamientoScoreIndex.
     * 
     */
    public int getScoreRiesgoFinanciamientoScoreIndex() {
        return scoreRiesgoFinanciamientoScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoFinanciamientoScoreIndex.
     * 
     */
    public void setScoreRiesgoFinanciamientoScoreIndex(int value) {
        this.scoreRiesgoFinanciamientoScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoFinanciamientoScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoFinanciamientoScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoFinanciamientoScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoFinanciamientoScoreValue() {
        if (scoreRiesgoFinanciamientoScoreValue == null) {
            scoreRiesgoFinanciamientoScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoFinanciamientoScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoFinanciamientoScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoFinanciamientoScorecardId() {
        return scoreRiesgoFinanciamientoScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoFinanciamientoScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoFinanciamientoScorecardId(String value) {
        this.scoreRiesgoFinanciamientoScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoFinanciamientoScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoFinanciamientoScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoFinanciamientoScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoFinanciamientoScoringResultTable() {
        if (scoreRiesgoFinanciamientoScoringResultTable == null) {
            scoreRiesgoFinanciamientoScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoFinanciamientoScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoFinanciamientoValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoFinanciamientoValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoFinanciamientoValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoFinanciamientoValue1() {
        if (scoreRiesgoFinanciamientoValue1 == null) {
            scoreRiesgoFinanciamientoValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoFinanciamientoValue1;
    }

    /**
     * Gets the value of the scoreRiesgoHipotecarioAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoHipotecarioAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoHipotecarioAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoHipotecarioAdverseRcodes() {
        if (scoreRiesgoHipotecarioAdverseRcodes == null) {
            scoreRiesgoHipotecarioAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoHipotecarioAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoHipotecarioDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoHipotecarioDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoHipotecarioDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoHipotecarioDeviationTable() {
        if (scoreRiesgoHipotecarioDeviationTable == null) {
            scoreRiesgoHipotecarioDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoHipotecarioDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoHipotecarioRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoHipotecarioRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoHipotecarioRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoHipotecarioRankedAdverseReasonCode() {
        if (scoreRiesgoHipotecarioRankedAdverseReasonCode == null) {
            scoreRiesgoHipotecarioRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoHipotecarioRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoHipotecarioScore.
     * 
     */
    public double getScoreRiesgoHipotecarioScore() {
        return scoreRiesgoHipotecarioScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoHipotecarioScore.
     * 
     */
    public void setScoreRiesgoHipotecarioScore(double value) {
        this.scoreRiesgoHipotecarioScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoHipotecarioScoreIndex.
     * 
     */
    public int getScoreRiesgoHipotecarioScoreIndex() {
        return scoreRiesgoHipotecarioScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoHipotecarioScoreIndex.
     * 
     */
    public void setScoreRiesgoHipotecarioScoreIndex(int value) {
        this.scoreRiesgoHipotecarioScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoHipotecarioScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoHipotecarioScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoHipotecarioScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoHipotecarioScoreValue() {
        if (scoreRiesgoHipotecarioScoreValue == null) {
            scoreRiesgoHipotecarioScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoHipotecarioScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoHipotecarioScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoHipotecarioScorecardId() {
        return scoreRiesgoHipotecarioScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoHipotecarioScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoHipotecarioScorecardId(String value) {
        this.scoreRiesgoHipotecarioScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoHipotecarioScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoHipotecarioScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoHipotecarioScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoHipotecarioScoringResultTable() {
        if (scoreRiesgoHipotecarioScoringResultTable == null) {
            scoreRiesgoHipotecarioScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoHipotecarioScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoHipotecarioValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoHipotecarioValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoHipotecarioValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoHipotecarioValue1() {
        if (scoreRiesgoHipotecarioValue1 == null) {
            scoreRiesgoHipotecarioValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoHipotecarioValue1;
    }

    /**
     * Gets the value of the scoreRiesgoNoConocidoAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoNoConocidoAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoNoConocidoAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoNoConocidoAdverseRcodes() {
        if (scoreRiesgoNoConocidoAdverseRcodes == null) {
            scoreRiesgoNoConocidoAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoNoConocidoAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoNoConocidoDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoNoConocidoDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoNoConocidoDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoNoConocidoDeviationTable() {
        if (scoreRiesgoNoConocidoDeviationTable == null) {
            scoreRiesgoNoConocidoDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoNoConocidoDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoNoConocidoRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoNoConocidoRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoNoConocidoRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoNoConocidoRankedAdverseReasonCode() {
        if (scoreRiesgoNoConocidoRankedAdverseReasonCode == null) {
            scoreRiesgoNoConocidoRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoNoConocidoRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoNoConocidoScore.
     * 
     */
    public double getScoreRiesgoNoConocidoScore() {
        return scoreRiesgoNoConocidoScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoNoConocidoScore.
     * 
     */
    public void setScoreRiesgoNoConocidoScore(double value) {
        this.scoreRiesgoNoConocidoScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoNoConocidoScoreIndex.
     * 
     */
    public int getScoreRiesgoNoConocidoScoreIndex() {
        return scoreRiesgoNoConocidoScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoNoConocidoScoreIndex.
     * 
     */
    public void setScoreRiesgoNoConocidoScoreIndex(int value) {
        this.scoreRiesgoNoConocidoScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoNoConocidoScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoNoConocidoScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoNoConocidoScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoNoConocidoScoreValue() {
        if (scoreRiesgoNoConocidoScoreValue == null) {
            scoreRiesgoNoConocidoScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoNoConocidoScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoNoConocidoScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoNoConocidoScorecardId() {
        return scoreRiesgoNoConocidoScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoNoConocidoScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoNoConocidoScorecardId(String value) {
        this.scoreRiesgoNoConocidoScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoNoConocidoScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoNoConocidoScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoNoConocidoScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoNoConocidoScoringResultTable() {
        if (scoreRiesgoNoConocidoScoringResultTable == null) {
            scoreRiesgoNoConocidoScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoNoConocidoScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoNoConocidoValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoNoConocidoValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoNoConocidoValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoNoConocidoValue1() {
        if (scoreRiesgoNoConocidoValue1 == null) {
            scoreRiesgoNoConocidoValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoNoConocidoValue1;
    }

    /**
     * Gets the value of the scoreRiesgoTarjetaAdverseRcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoTarjetaAdverseRcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoTarjetaAdverseRcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoTarjetaAdverseRcodes() {
        if (scoreRiesgoTarjetaAdverseRcodes == null) {
            scoreRiesgoTarjetaAdverseRcodes = new ArrayList<String>();
        }
        return this.scoreRiesgoTarjetaAdverseRcodes;
    }

    /**
     * Gets the value of the scoreRiesgoTarjetaDeviationTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoTarjetaDeviationTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoTarjetaDeviationTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoTarjetaDeviationTable() {
        if (scoreRiesgoTarjetaDeviationTable == null) {
            scoreRiesgoTarjetaDeviationTable = new ArrayList<Double>();
        }
        return this.scoreRiesgoTarjetaDeviationTable;
    }

    /**
     * Gets the value of the scoreRiesgoTarjetaRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoTarjetaRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoTarjetaRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoTarjetaRankedAdverseReasonCode() {
        if (scoreRiesgoTarjetaRankedAdverseReasonCode == null) {
            scoreRiesgoTarjetaRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreRiesgoTarjetaRankedAdverseReasonCode;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoTarjetaScore.
     * 
     */
    public double getScoreRiesgoTarjetaScore() {
        return scoreRiesgoTarjetaScore;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoTarjetaScore.
     * 
     */
    public void setScoreRiesgoTarjetaScore(double value) {
        this.scoreRiesgoTarjetaScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoTarjetaScoreIndex.
     * 
     */
    public int getScoreRiesgoTarjetaScoreIndex() {
        return scoreRiesgoTarjetaScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoTarjetaScoreIndex.
     * 
     */
    public void setScoreRiesgoTarjetaScoreIndex(int value) {
        this.scoreRiesgoTarjetaScoreIndex = value;
    }

    /**
     * Gets the value of the scoreRiesgoTarjetaScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoTarjetaScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoTarjetaScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreRiesgoTarjetaScoreValue() {
        if (scoreRiesgoTarjetaScoreValue == null) {
            scoreRiesgoTarjetaScoreValue = new ArrayList<Double>();
        }
        return this.scoreRiesgoTarjetaScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreRiesgoTarjetaScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRiesgoTarjetaScorecardId() {
        return scoreRiesgoTarjetaScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreRiesgoTarjetaScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRiesgoTarjetaScorecardId(String value) {
        this.scoreRiesgoTarjetaScorecardId = value;
    }

    /**
     * Gets the value of the scoreRiesgoTarjetaScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoTarjetaScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoTarjetaScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoTarjetaScoringResultTable() {
        if (scoreRiesgoTarjetaScoringResultTable == null) {
            scoreRiesgoTarjetaScoringResultTable = new ArrayList<String>();
        }
        return this.scoreRiesgoTarjetaScoringResultTable;
    }

    /**
     * Gets the value of the scoreRiesgoTarjetaValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRiesgoTarjetaValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRiesgoTarjetaValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRiesgoTarjetaValue1() {
        if (scoreRiesgoTarjetaValue1 == null) {
            scoreRiesgoTarjetaValue1 = new ArrayList<String>();
        }
        return this.scoreRiesgoTarjetaValue1;
    }

    /**
     * Gets the value of the scorefraudeAdverseReasonCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudeAdverseReasonCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudeAdverseReasonCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScorefraudeAdverseReasonCodes() {
        if (scorefraudeAdverseReasonCodes == null) {
            scorefraudeAdverseReasonCodes = new ArrayList<String>();
        }
        return this.scorefraudeAdverseReasonCodes;
    }

    /**
     * Gets the value of the scorefraudeRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudeRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudeRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScorefraudeRankedAdverseReasonCode() {
        if (scorefraudeRankedAdverseReasonCode == null) {
            scorefraudeRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scorefraudeRankedAdverseReasonCode;
    }

    /**
     * Gets the value of the scorefraudeRankedScoreDeviation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudeRankedScoreDeviation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudeRankedScoreDeviation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScorefraudeRankedScoreDeviation() {
        if (scorefraudeRankedScoreDeviation == null) {
            scorefraudeRankedScoreDeviation = new ArrayList<Double>();
        }
        return this.scorefraudeRankedScoreDeviation;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudeScore.
     * 
     */
    public double getScorefraudeScore() {
        return scorefraudeScore;
    }

    /**
     * Define el valor de la propiedad scorefraudeScore.
     * 
     */
    public void setScorefraudeScore(double value) {
        this.scorefraudeScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudeScoreIndex.
     * 
     */
    public int getScorefraudeScoreIndex() {
        return scorefraudeScoreIndex;
    }

    /**
     * Define el valor de la propiedad scorefraudeScoreIndex.
     * 
     */
    public void setScorefraudeScoreIndex(int value) {
        this.scorefraudeScoreIndex = value;
    }

    /**
     * Gets the value of the scorefraudeScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudeScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudeScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScorefraudeScoreValue() {
        if (scorefraudeScoreValue == null) {
            scorefraudeScoreValue = new ArrayList<Double>();
        }
        return this.scorefraudeScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudeScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorefraudeScorecardId() {
        return scorefraudeScorecardId;
    }

    /**
     * Define el valor de la propiedad scorefraudeScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorefraudeScorecardId(String value) {
        this.scorefraudeScorecardId = value;
    }

    /**
     * Gets the value of the scorefraudeScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudeScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudeScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScorefraudeScoringResultTable() {
        if (scorefraudeScoringResultTable == null) {
            scorefraudeScoringResultTable = new ArrayList<String>();
        }
        return this.scorefraudeScoringResultTable;
    }

    /**
     * Gets the value of the scorefraudeValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudeValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudeValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScorefraudeValue1() {
        if (scorefraudeValue1 == null) {
            scorefraudeValue1 = new ArrayList<String>();
        }
        return this.scorefraudeValue1;
    }

    /**
     * Gets the value of the scoreriesgoAdverseReasonCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoAdverseReasonCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoAdverseReasonCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreriesgoAdverseReasonCodes() {
        if (scoreriesgoAdverseReasonCodes == null) {
            scoreriesgoAdverseReasonCodes = new ArrayList<String>();
        }
        return this.scoreriesgoAdverseReasonCodes;
    }

    /**
     * Gets the value of the scoreriesgoRankedAdverseReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoRankedAdverseReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoRankedAdverseReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreriesgoRankedAdverseReasonCode() {
        if (scoreriesgoRankedAdverseReasonCode == null) {
            scoreriesgoRankedAdverseReasonCode = new ArrayList<String>();
        }
        return this.scoreriesgoRankedAdverseReasonCode;
    }

    /**
     * Gets the value of the scoreriesgoRankedScoreDeviation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoRankedScoreDeviation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoRankedScoreDeviation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreriesgoRankedScoreDeviation() {
        if (scoreriesgoRankedScoreDeviation == null) {
            scoreriesgoRankedScoreDeviation = new ArrayList<Double>();
        }
        return this.scoreriesgoRankedScoreDeviation;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoScore.
     * 
     */
    public double getScoreriesgoScore() {
        return scoreriesgoScore;
    }

    /**
     * Define el valor de la propiedad scoreriesgoScore.
     * 
     */
    public void setScoreriesgoScore(double value) {
        this.scoreriesgoScore = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoScoreIndex.
     * 
     */
    public int getScoreriesgoScoreIndex() {
        return scoreriesgoScoreIndex;
    }

    /**
     * Define el valor de la propiedad scoreriesgoScoreIndex.
     * 
     */
    public void setScoreriesgoScoreIndex(int value) {
        this.scoreriesgoScoreIndex = value;
    }

    /**
     * Gets the value of the scoreriesgoScoreValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoScoreValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoScoreValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getScoreriesgoScoreValue() {
        if (scoreriesgoScoreValue == null) {
            scoreriesgoScoreValue = new ArrayList<Double>();
        }
        return this.scoreriesgoScoreValue;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoScorecardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreriesgoScorecardId() {
        return scoreriesgoScorecardId;
    }

    /**
     * Define el valor de la propiedad scoreriesgoScorecardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreriesgoScorecardId(String value) {
        this.scoreriesgoScorecardId = value;
    }

    /**
     * Gets the value of the scoreriesgoScoringResultTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoScoringResultTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoScoringResultTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreriesgoScoringResultTable() {
        if (scoreriesgoScoringResultTable == null) {
            scoreriesgoScoringResultTable = new ArrayList<String>();
        }
        return this.scoreriesgoScoringResultTable;
    }

    /**
     * Gets the value of the scoreriesgoValue1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoValue1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoValue1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreriesgoValue1() {
        if (scoreriesgoValue1 == null) {
            scoreriesgoValue1 = new ArrayList<String>();
        }
        return this.scoreriesgoValue1;
    }

    /**
     * Obtiene el valor de la propiedad tipoPerfil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPerfil() {
        return tipoPerfil;
    }

    /**
     * Define el valor de la propiedad tipoPerfil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPerfil(String value) {
        this.tipoPerfil = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPoliticaAutomotriz.
     * 
     */
    public int getTipoPoliticaAutomotriz() {
        return tipoPoliticaAutomotriz;
    }

    /**
     * Define el valor de la propiedad tipoPoliticaAutomotriz.
     * 
     */
    public void setTipoPoliticaAutomotriz(int value) {
        this.tipoPoliticaAutomotriz = value;
    }

}
