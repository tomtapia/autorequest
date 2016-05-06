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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para auBI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="auBI">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="calculosfinalesDerivedDataScriptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesLeafNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesscoreDerivedDataScriptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesscoreLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesscoreLeafNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesscoreOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosfinalesscoreTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosinicialesDerivedDataScriptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosinicialesLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosinicialesLeafNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosinicialesOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosinicialesTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosvariosDerivedDataScriptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosvariosLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosvariosLeafNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosvariosOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculosvariosTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionpoliticasLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionpoliticasOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionpoliticasTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llamarburoLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llamarburoOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llamarburoTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llamarburoTreatmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noConocidoElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noConocidoLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noConocidoOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noConocidoOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noConocidoScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noConocidoTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreAutomotrizElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreAutomotrizLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreAutomotrizOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreAutomotrizOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreAutomotrizScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreAutomotrizTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreCcElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreCcLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreCcOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreCcOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreCcScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreCcTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreConsolidacionElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreConsolidacionLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreConsolidacionOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreConsolidacionOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreConsolidacionScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreConsolidacionTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreHipotecarioElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreHipotecarioLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreHipotecarioOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreHipotecarioOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreHipotecarioScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreHipotecarioTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRefinanciamientoElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRefinanciamientoLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRefinanciamientoOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreRefinanciamientoOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRefinanciamientoScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreRefinanciamientoTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreTarjetaElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreTarjetaLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreTarjetaOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreTarjetaOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreTarjetaScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreTarjetaTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorefraudesElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudesLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorefraudesOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scorefraudesOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorefraudesScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorefraudesTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreriesgoElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoLeafNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreriesgoOutcome" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scoreriesgoOutcomeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreriesgoScorecardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoreriesgoTestGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auBI", propOrder = {
    "calculosfinalesDerivedDataScriptName",
    "calculosfinalesLeafNodeId",
    "calculosfinalesLeafNodeName",
    "calculosfinalesOutcomeName",
    "calculosfinalesTestGroupName",
    "calculosfinalesscoreDerivedDataScriptName",
    "calculosfinalesscoreLeafNodeId",
    "calculosfinalesscoreLeafNodeName",
    "calculosfinalesscoreOutcomeName",
    "calculosfinalesscoreTestGroupName",
    "calculosinicialesDerivedDataScriptName",
    "calculosinicialesLeafNodeId",
    "calculosinicialesLeafNodeName",
    "calculosinicialesOutcomeName",
    "calculosinicialesTestGroupName",
    "calculosvariosDerivedDataScriptName",
    "calculosvariosLeafNodeId",
    "calculosvariosLeafNodeName",
    "calculosvariosOutcomeName",
    "calculosvariosTestGroupName",
    "decisionpoliticasLeafNodeId",
    "decisionpoliticasOutcomeName",
    "decisionpoliticasTestGroupName",
    "estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId",
    "estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName",
    "estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName",
    "estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName",
    "estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId",
    "estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName",
    "estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName",
    "estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName",
    "llamarburoLeafNodeId",
    "llamarburoOutcomeName",
    "llamarburoTestGroupName",
    "llamarburoTreatmentName",
    "noConocidoElement",
    "noConocidoLeafNodeId",
    "noConocidoOutcome",
    "noConocidoOutcomeName",
    "noConocidoScorecardName",
    "noConocidoTestGroupName",
    "scoreAutomotrizElement",
    "scoreAutomotrizLeafNodeId",
    "scoreAutomotrizOutcome",
    "scoreAutomotrizOutcomeName",
    "scoreAutomotrizScorecardName",
    "scoreAutomotrizTestGroupName",
    "scoreCcElement",
    "scoreCcLeafNodeId",
    "scoreCcOutcome",
    "scoreCcOutcomeName",
    "scoreCcScorecardName",
    "scoreCcTestGroupName",
    "scoreConsolidacionElement",
    "scoreConsolidacionLeafNodeId",
    "scoreConsolidacionOutcome",
    "scoreConsolidacionOutcomeName",
    "scoreConsolidacionScorecardName",
    "scoreConsolidacionTestGroupName",
    "scoreHipotecarioElement",
    "scoreHipotecarioLeafNodeId",
    "scoreHipotecarioOutcome",
    "scoreHipotecarioOutcomeName",
    "scoreHipotecarioScorecardName",
    "scoreHipotecarioTestGroupName",
    "scoreRefinanciamientoElement",
    "scoreRefinanciamientoLeafNodeId",
    "scoreRefinanciamientoOutcome",
    "scoreRefinanciamientoOutcomeName",
    "scoreRefinanciamientoScorecardName",
    "scoreRefinanciamientoTestGroupName",
    "scoreTarjetaElement",
    "scoreTarjetaLeafNodeId",
    "scoreTarjetaOutcome",
    "scoreTarjetaOutcomeName",
    "scoreTarjetaScorecardName",
    "scoreTarjetaTestGroupName",
    "scorefraudesElement",
    "scorefraudesLeafNodeId",
    "scorefraudesOutcome",
    "scorefraudesOutcomeName",
    "scorefraudesScorecardName",
    "scorefraudesTestGroupName",
    "scoreriesgoElement",
    "scoreriesgoLeafNodeId",
    "scoreriesgoOutcome",
    "scoreriesgoOutcomeName",
    "scoreriesgoScorecardName",
    "scoreriesgoTestGroupName"
})
public class AuBI
    extends DaBean
{

    @XmlElement(defaultValue = "|")
    protected String calculosfinalesDerivedDataScriptName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesLeafNodeName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesscoreDerivedDataScriptName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesscoreLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesscoreLeafNodeName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesscoreOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String calculosfinalesscoreTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String calculosinicialesDerivedDataScriptName;
    @XmlElement(defaultValue = "|")
    protected String calculosinicialesLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String calculosinicialesLeafNodeName;
    @XmlElement(defaultValue = "|")
    protected String calculosinicialesOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String calculosinicialesTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String calculosvariosDerivedDataScriptName;
    @XmlElement(defaultValue = "|")
    protected String calculosvariosLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String calculosvariosLeafNodeName;
    @XmlElement(defaultValue = "|")
    protected String calculosvariosOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String calculosvariosTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String decisionpoliticasLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String decisionpoliticasOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String decisionpoliticasTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName;
    @XmlElement(defaultValue = "|")
    protected String llamarburoLeafNodeId;
    @XmlElement(defaultValue = "|")
    protected String llamarburoOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String llamarburoTestGroupName;
    @XmlElement(defaultValue = "|")
    protected String llamarburoTreatmentName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> noConocidoElement;
    @XmlElement(defaultValue = "|")
    protected String noConocidoLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> noConocidoOutcome;
    @XmlElement(defaultValue = "|")
    protected String noConocidoOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String noConocidoScorecardName;
    @XmlElement(defaultValue = "|")
    protected String noConocidoTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreAutomotrizElement;
    @XmlElement(defaultValue = "|")
    protected String scoreAutomotrizLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreAutomotrizOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreAutomotrizOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreAutomotrizScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreAutomotrizTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreCcElement;
    @XmlElement(defaultValue = "|")
    protected String scoreCcLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreCcOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreCcOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreCcScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreCcTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreConsolidacionElement;
    @XmlElement(defaultValue = "|")
    protected String scoreConsolidacionLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreConsolidacionOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreConsolidacionOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreConsolidacionScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreConsolidacionTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreHipotecarioElement;
    @XmlElement(defaultValue = "|")
    protected String scoreHipotecarioLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreHipotecarioOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreHipotecarioOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreHipotecarioScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreHipotecarioTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRefinanciamientoElement;
    @XmlElement(defaultValue = "|")
    protected String scoreRefinanciamientoLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreRefinanciamientoOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreRefinanciamientoOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreRefinanciamientoScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreRefinanciamientoTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreTarjetaElement;
    @XmlElement(defaultValue = "|")
    protected String scoreTarjetaLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreTarjetaOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreTarjetaOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreTarjetaScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreTarjetaTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scorefraudesElement;
    @XmlElement(defaultValue = "|")
    protected String scorefraudesLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scorefraudesOutcome;
    @XmlElement(defaultValue = "|")
    protected String scorefraudesOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scorefraudesScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scorefraudesTestGroupName;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreriesgoElement;
    @XmlElement(defaultValue = "|")
    protected String scoreriesgoLeafNodeId;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> scoreriesgoOutcome;
    @XmlElement(defaultValue = "|")
    protected String scoreriesgoOutcomeName;
    @XmlElement(defaultValue = "|")
    protected String scoreriesgoScorecardName;
    @XmlElement(defaultValue = "|")
    protected String scoreriesgoTestGroupName;

    /**
     * Obtiene el valor de la propiedad calculosfinalesDerivedDataScriptName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesDerivedDataScriptName() {
        return calculosfinalesDerivedDataScriptName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesDerivedDataScriptName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesDerivedDataScriptName(String value) {
        this.calculosfinalesDerivedDataScriptName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesLeafNodeId() {
        return calculosfinalesLeafNodeId;
    }

    /**
     * Define el valor de la propiedad calculosfinalesLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesLeafNodeId(String value) {
        this.calculosfinalesLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesLeafNodeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesLeafNodeName() {
        return calculosfinalesLeafNodeName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesLeafNodeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesLeafNodeName(String value) {
        this.calculosfinalesLeafNodeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesOutcomeName() {
        return calculosfinalesOutcomeName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesOutcomeName(String value) {
        this.calculosfinalesOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesTestGroupName() {
        return calculosfinalesTestGroupName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesTestGroupName(String value) {
        this.calculosfinalesTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesscoreDerivedDataScriptName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesscoreDerivedDataScriptName() {
        return calculosfinalesscoreDerivedDataScriptName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesscoreDerivedDataScriptName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesscoreDerivedDataScriptName(String value) {
        this.calculosfinalesscoreDerivedDataScriptName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesscoreLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesscoreLeafNodeId() {
        return calculosfinalesscoreLeafNodeId;
    }

    /**
     * Define el valor de la propiedad calculosfinalesscoreLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesscoreLeafNodeId(String value) {
        this.calculosfinalesscoreLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesscoreLeafNodeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesscoreLeafNodeName() {
        return calculosfinalesscoreLeafNodeName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesscoreLeafNodeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesscoreLeafNodeName(String value) {
        this.calculosfinalesscoreLeafNodeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesscoreOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesscoreOutcomeName() {
        return calculosfinalesscoreOutcomeName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesscoreOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesscoreOutcomeName(String value) {
        this.calculosfinalesscoreOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosfinalesscoreTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosfinalesscoreTestGroupName() {
        return calculosfinalesscoreTestGroupName;
    }

    /**
     * Define el valor de la propiedad calculosfinalesscoreTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosfinalesscoreTestGroupName(String value) {
        this.calculosfinalesscoreTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosinicialesDerivedDataScriptName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosinicialesDerivedDataScriptName() {
        return calculosinicialesDerivedDataScriptName;
    }

    /**
     * Define el valor de la propiedad calculosinicialesDerivedDataScriptName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosinicialesDerivedDataScriptName(String value) {
        this.calculosinicialesDerivedDataScriptName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosinicialesLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosinicialesLeafNodeId() {
        return calculosinicialesLeafNodeId;
    }

    /**
     * Define el valor de la propiedad calculosinicialesLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosinicialesLeafNodeId(String value) {
        this.calculosinicialesLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosinicialesLeafNodeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosinicialesLeafNodeName() {
        return calculosinicialesLeafNodeName;
    }

    /**
     * Define el valor de la propiedad calculosinicialesLeafNodeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosinicialesLeafNodeName(String value) {
        this.calculosinicialesLeafNodeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosinicialesOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosinicialesOutcomeName() {
        return calculosinicialesOutcomeName;
    }

    /**
     * Define el valor de la propiedad calculosinicialesOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosinicialesOutcomeName(String value) {
        this.calculosinicialesOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosinicialesTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosinicialesTestGroupName() {
        return calculosinicialesTestGroupName;
    }

    /**
     * Define el valor de la propiedad calculosinicialesTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosinicialesTestGroupName(String value) {
        this.calculosinicialesTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosvariosDerivedDataScriptName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosvariosDerivedDataScriptName() {
        return calculosvariosDerivedDataScriptName;
    }

    /**
     * Define el valor de la propiedad calculosvariosDerivedDataScriptName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosvariosDerivedDataScriptName(String value) {
        this.calculosvariosDerivedDataScriptName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosvariosLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosvariosLeafNodeId() {
        return calculosvariosLeafNodeId;
    }

    /**
     * Define el valor de la propiedad calculosvariosLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosvariosLeafNodeId(String value) {
        this.calculosvariosLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosvariosLeafNodeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosvariosLeafNodeName() {
        return calculosvariosLeafNodeName;
    }

    /**
     * Define el valor de la propiedad calculosvariosLeafNodeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosvariosLeafNodeName(String value) {
        this.calculosvariosLeafNodeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosvariosOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosvariosOutcomeName() {
        return calculosvariosOutcomeName;
    }

    /**
     * Define el valor de la propiedad calculosvariosOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosvariosOutcomeName(String value) {
        this.calculosvariosOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad calculosvariosTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculosvariosTestGroupName() {
        return calculosvariosTestGroupName;
    }

    /**
     * Define el valor de la propiedad calculosvariosTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculosvariosTestGroupName(String value) {
        this.calculosvariosTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad decisionpoliticasLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionpoliticasLeafNodeId() {
        return decisionpoliticasLeafNodeId;
    }

    /**
     * Define el valor de la propiedad decisionpoliticasLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionpoliticasLeafNodeId(String value) {
        this.decisionpoliticasLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad decisionpoliticasOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionpoliticasOutcomeName() {
        return decisionpoliticasOutcomeName;
    }

    /**
     * Define el valor de la propiedad decisionpoliticasOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionpoliticasOutcomeName(String value) {
        this.decisionpoliticasOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad decisionpoliticasTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionpoliticasTestGroupName() {
        return decisionpoliticasTestGroupName;
    }

    /**
     * Define el valor de la propiedad decisionpoliticasTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionpoliticasTestGroupName(String value) {
        this.decisionpoliticasTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId() {
        return estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId(String value) {
        this.estimacionDeIngresosAvalcodeudorRentaDeEvaluacionLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName() {
        return estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName(String value) {
        this.estimacionDeIngresosAvalcodeudorRentaDeEvaluacionOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName() {
        return estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName(String value) {
        this.estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName() {
        return estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName(String value) {
        this.estimacionDeIngresosAvalcodeudorRentaDeEvaluacionTreatmentName = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId() {
        return estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId(String value) {
        this.estimacionDeIngresosTitularRentaDeEvaluacionLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosTitularRentaDeEvaluacionOutcomeName() {
        return estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosTitularRentaDeEvaluacionOutcomeName(String value) {
        this.estimacionDeIngresosTitularRentaDeEvaluacionOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosTitularRentaDeEvaluacionTestGroupName() {
        return estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosTitularRentaDeEvaluacionTestGroupName(String value) {
        this.estimacionDeIngresosTitularRentaDeEvaluacionTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimacionDeIngresosTitularRentaDeEvaluacionTreatmentName() {
        return estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName;
    }

    /**
     * Define el valor de la propiedad estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimacionDeIngresosTitularRentaDeEvaluacionTreatmentName(String value) {
        this.estimacionDeIngresosTitularRentaDeEvaluacionTreatmentName = value;
    }

    /**
     * Obtiene el valor de la propiedad llamarburoLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlamarburoLeafNodeId() {
        return llamarburoLeafNodeId;
    }

    /**
     * Define el valor de la propiedad llamarburoLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlamarburoLeafNodeId(String value) {
        this.llamarburoLeafNodeId = value;
    }

    /**
     * Obtiene el valor de la propiedad llamarburoOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlamarburoOutcomeName() {
        return llamarburoOutcomeName;
    }

    /**
     * Define el valor de la propiedad llamarburoOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlamarburoOutcomeName(String value) {
        this.llamarburoOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad llamarburoTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlamarburoTestGroupName() {
        return llamarburoTestGroupName;
    }

    /**
     * Define el valor de la propiedad llamarburoTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlamarburoTestGroupName(String value) {
        this.llamarburoTestGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad llamarburoTreatmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLlamarburoTreatmentName() {
        return llamarburoTreatmentName;
    }

    /**
     * Define el valor de la propiedad llamarburoTreatmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLlamarburoTreatmentName(String value) {
        this.llamarburoTreatmentName = value;
    }

    /**
     * Gets the value of the noConocidoElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noConocidoElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoConocidoElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoConocidoElement() {
        if (noConocidoElement == null) {
            noConocidoElement = new ArrayList<String>();
        }
        return this.noConocidoElement;
    }

    /**
     * Obtiene el valor de la propiedad noConocidoLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoConocidoLeafNodeId() {
        return noConocidoLeafNodeId;
    }

    /**
     * Define el valor de la propiedad noConocidoLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoConocidoLeafNodeId(String value) {
        this.noConocidoLeafNodeId = value;
    }

    /**
     * Gets the value of the noConocidoOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noConocidoOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoConocidoOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoConocidoOutcome() {
        if (noConocidoOutcome == null) {
            noConocidoOutcome = new ArrayList<String>();
        }
        return this.noConocidoOutcome;
    }

    /**
     * Obtiene el valor de la propiedad noConocidoOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoConocidoOutcomeName() {
        return noConocidoOutcomeName;
    }

    /**
     * Define el valor de la propiedad noConocidoOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoConocidoOutcomeName(String value) {
        this.noConocidoOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad noConocidoScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoConocidoScorecardName() {
        return noConocidoScorecardName;
    }

    /**
     * Define el valor de la propiedad noConocidoScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoConocidoScorecardName(String value) {
        this.noConocidoScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad noConocidoTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoConocidoTestGroupName() {
        return noConocidoTestGroupName;
    }

    /**
     * Define el valor de la propiedad noConocidoTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoConocidoTestGroupName(String value) {
        this.noConocidoTestGroupName = value;
    }

    /**
     * Gets the value of the scoreAutomotrizElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreAutomotrizElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreAutomotrizElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreAutomotrizElement() {
        if (scoreAutomotrizElement == null) {
            scoreAutomotrizElement = new ArrayList<String>();
        }
        return this.scoreAutomotrizElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreAutomotrizLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreAutomotrizLeafNodeId() {
        return scoreAutomotrizLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreAutomotrizLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreAutomotrizLeafNodeId(String value) {
        this.scoreAutomotrizLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreAutomotrizOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreAutomotrizOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreAutomotrizOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreAutomotrizOutcome() {
        if (scoreAutomotrizOutcome == null) {
            scoreAutomotrizOutcome = new ArrayList<String>();
        }
        return this.scoreAutomotrizOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreAutomotrizOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreAutomotrizOutcomeName() {
        return scoreAutomotrizOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreAutomotrizOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreAutomotrizOutcomeName(String value) {
        this.scoreAutomotrizOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreAutomotrizScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreAutomotrizScorecardName() {
        return scoreAutomotrizScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreAutomotrizScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreAutomotrizScorecardName(String value) {
        this.scoreAutomotrizScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreAutomotrizTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreAutomotrizTestGroupName() {
        return scoreAutomotrizTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreAutomotrizTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreAutomotrizTestGroupName(String value) {
        this.scoreAutomotrizTestGroupName = value;
    }

    /**
     * Gets the value of the scoreCcElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreCcElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreCcElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreCcElement() {
        if (scoreCcElement == null) {
            scoreCcElement = new ArrayList<String>();
        }
        return this.scoreCcElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreCcLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreCcLeafNodeId() {
        return scoreCcLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreCcLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreCcLeafNodeId(String value) {
        this.scoreCcLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreCcOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreCcOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreCcOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreCcOutcome() {
        if (scoreCcOutcome == null) {
            scoreCcOutcome = new ArrayList<String>();
        }
        return this.scoreCcOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreCcOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreCcOutcomeName() {
        return scoreCcOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreCcOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreCcOutcomeName(String value) {
        this.scoreCcOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreCcScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreCcScorecardName() {
        return scoreCcScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreCcScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreCcScorecardName(String value) {
        this.scoreCcScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreCcTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreCcTestGroupName() {
        return scoreCcTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreCcTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreCcTestGroupName(String value) {
        this.scoreCcTestGroupName = value;
    }

    /**
     * Gets the value of the scoreConsolidacionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreConsolidacionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreConsolidacionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreConsolidacionElement() {
        if (scoreConsolidacionElement == null) {
            scoreConsolidacionElement = new ArrayList<String>();
        }
        return this.scoreConsolidacionElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreConsolidacionLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreConsolidacionLeafNodeId() {
        return scoreConsolidacionLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreConsolidacionLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreConsolidacionLeafNodeId(String value) {
        this.scoreConsolidacionLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreConsolidacionOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreConsolidacionOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreConsolidacionOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreConsolidacionOutcome() {
        if (scoreConsolidacionOutcome == null) {
            scoreConsolidacionOutcome = new ArrayList<String>();
        }
        return this.scoreConsolidacionOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreConsolidacionOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreConsolidacionOutcomeName() {
        return scoreConsolidacionOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreConsolidacionOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreConsolidacionOutcomeName(String value) {
        this.scoreConsolidacionOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreConsolidacionScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreConsolidacionScorecardName() {
        return scoreConsolidacionScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreConsolidacionScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreConsolidacionScorecardName(String value) {
        this.scoreConsolidacionScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreConsolidacionTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreConsolidacionTestGroupName() {
        return scoreConsolidacionTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreConsolidacionTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreConsolidacionTestGroupName(String value) {
        this.scoreConsolidacionTestGroupName = value;
    }

    /**
     * Gets the value of the scoreHipotecarioElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreHipotecarioElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreHipotecarioElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreHipotecarioElement() {
        if (scoreHipotecarioElement == null) {
            scoreHipotecarioElement = new ArrayList<String>();
        }
        return this.scoreHipotecarioElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreHipotecarioLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreHipotecarioLeafNodeId() {
        return scoreHipotecarioLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreHipotecarioLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreHipotecarioLeafNodeId(String value) {
        this.scoreHipotecarioLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreHipotecarioOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreHipotecarioOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreHipotecarioOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreHipotecarioOutcome() {
        if (scoreHipotecarioOutcome == null) {
            scoreHipotecarioOutcome = new ArrayList<String>();
        }
        return this.scoreHipotecarioOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreHipotecarioOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreHipotecarioOutcomeName() {
        return scoreHipotecarioOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreHipotecarioOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreHipotecarioOutcomeName(String value) {
        this.scoreHipotecarioOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreHipotecarioScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreHipotecarioScorecardName() {
        return scoreHipotecarioScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreHipotecarioScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreHipotecarioScorecardName(String value) {
        this.scoreHipotecarioScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreHipotecarioTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreHipotecarioTestGroupName() {
        return scoreHipotecarioTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreHipotecarioTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreHipotecarioTestGroupName(String value) {
        this.scoreHipotecarioTestGroupName = value;
    }

    /**
     * Gets the value of the scoreRefinanciamientoElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRefinanciamientoElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRefinanciamientoElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRefinanciamientoElement() {
        if (scoreRefinanciamientoElement == null) {
            scoreRefinanciamientoElement = new ArrayList<String>();
        }
        return this.scoreRefinanciamientoElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreRefinanciamientoLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRefinanciamientoLeafNodeId() {
        return scoreRefinanciamientoLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreRefinanciamientoLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRefinanciamientoLeafNodeId(String value) {
        this.scoreRefinanciamientoLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreRefinanciamientoOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreRefinanciamientoOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreRefinanciamientoOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreRefinanciamientoOutcome() {
        if (scoreRefinanciamientoOutcome == null) {
            scoreRefinanciamientoOutcome = new ArrayList<String>();
        }
        return this.scoreRefinanciamientoOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreRefinanciamientoOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRefinanciamientoOutcomeName() {
        return scoreRefinanciamientoOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreRefinanciamientoOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRefinanciamientoOutcomeName(String value) {
        this.scoreRefinanciamientoOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRefinanciamientoScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRefinanciamientoScorecardName() {
        return scoreRefinanciamientoScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreRefinanciamientoScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRefinanciamientoScorecardName(String value) {
        this.scoreRefinanciamientoScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreRefinanciamientoTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreRefinanciamientoTestGroupName() {
        return scoreRefinanciamientoTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreRefinanciamientoTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreRefinanciamientoTestGroupName(String value) {
        this.scoreRefinanciamientoTestGroupName = value;
    }

    /**
     * Gets the value of the scoreTarjetaElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreTarjetaElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreTarjetaElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreTarjetaElement() {
        if (scoreTarjetaElement == null) {
            scoreTarjetaElement = new ArrayList<String>();
        }
        return this.scoreTarjetaElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreTarjetaLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreTarjetaLeafNodeId() {
        return scoreTarjetaLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreTarjetaLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreTarjetaLeafNodeId(String value) {
        this.scoreTarjetaLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreTarjetaOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreTarjetaOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreTarjetaOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreTarjetaOutcome() {
        if (scoreTarjetaOutcome == null) {
            scoreTarjetaOutcome = new ArrayList<String>();
        }
        return this.scoreTarjetaOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreTarjetaOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreTarjetaOutcomeName() {
        return scoreTarjetaOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreTarjetaOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreTarjetaOutcomeName(String value) {
        this.scoreTarjetaOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreTarjetaScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreTarjetaScorecardName() {
        return scoreTarjetaScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreTarjetaScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreTarjetaScorecardName(String value) {
        this.scoreTarjetaScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreTarjetaTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreTarjetaTestGroupName() {
        return scoreTarjetaTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreTarjetaTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreTarjetaTestGroupName(String value) {
        this.scoreTarjetaTestGroupName = value;
    }

    /**
     * Gets the value of the scorefraudesElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudesElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudesElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScorefraudesElement() {
        if (scorefraudesElement == null) {
            scorefraudesElement = new ArrayList<String>();
        }
        return this.scorefraudesElement;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudesLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorefraudesLeafNodeId() {
        return scorefraudesLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scorefraudesLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorefraudesLeafNodeId(String value) {
        this.scorefraudesLeafNodeId = value;
    }

    /**
     * Gets the value of the scorefraudesOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorefraudesOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorefraudesOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScorefraudesOutcome() {
        if (scorefraudesOutcome == null) {
            scorefraudesOutcome = new ArrayList<String>();
        }
        return this.scorefraudesOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudesOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorefraudesOutcomeName() {
        return scorefraudesOutcomeName;
    }

    /**
     * Define el valor de la propiedad scorefraudesOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorefraudesOutcomeName(String value) {
        this.scorefraudesOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudesScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorefraudesScorecardName() {
        return scorefraudesScorecardName;
    }

    /**
     * Define el valor de la propiedad scorefraudesScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorefraudesScorecardName(String value) {
        this.scorefraudesScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scorefraudesTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorefraudesTestGroupName() {
        return scorefraudesTestGroupName;
    }

    /**
     * Define el valor de la propiedad scorefraudesTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorefraudesTestGroupName(String value) {
        this.scorefraudesTestGroupName = value;
    }

    /**
     * Gets the value of the scoreriesgoElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreriesgoElement() {
        if (scoreriesgoElement == null) {
            scoreriesgoElement = new ArrayList<String>();
        }
        return this.scoreriesgoElement;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoLeafNodeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreriesgoLeafNodeId() {
        return scoreriesgoLeafNodeId;
    }

    /**
     * Define el valor de la propiedad scoreriesgoLeafNodeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreriesgoLeafNodeId(String value) {
        this.scoreriesgoLeafNodeId = value;
    }

    /**
     * Gets the value of the scoreriesgoOutcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreriesgoOutcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreriesgoOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreriesgoOutcome() {
        if (scoreriesgoOutcome == null) {
            scoreriesgoOutcome = new ArrayList<String>();
        }
        return this.scoreriesgoOutcome;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoOutcomeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreriesgoOutcomeName() {
        return scoreriesgoOutcomeName;
    }

    /**
     * Define el valor de la propiedad scoreriesgoOutcomeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreriesgoOutcomeName(String value) {
        this.scoreriesgoOutcomeName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoScorecardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreriesgoScorecardName() {
        return scoreriesgoScorecardName;
    }

    /**
     * Define el valor de la propiedad scoreriesgoScorecardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreriesgoScorecardName(String value) {
        this.scoreriesgoScorecardName = value;
    }

    /**
     * Obtiene el valor de la propiedad scoreriesgoTestGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreriesgoTestGroupName() {
        return scoreriesgoTestGroupName;
    }

    /**
     * Define el valor de la propiedad scoreriesgoTestGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreriesgoTestGroupName(String value) {
        this.scoreriesgoTestGroupName = value;
    }

}
