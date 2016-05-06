//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:58 PM CLT 
//


package s1bus;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para entradaLlamada1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entradaLlamada1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdwcorp.falabella.com/OSB/schema/BCO/CL/persona/riesgoprimario/evaluar/Req-v2015.11}daBean">
 *       &lt;sequence>
 *         &lt;element name="v100dsolicitudPorcDescAutorizadoConv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v101dsolicitudPorcMaximaCuotaBf" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v102dsolicitudTitular" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v103dsolicitudReEval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v104dsolicitudInterviniente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v105dsolicitudMarcatoSolicitado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v10r04SfMontoDeudIndiVige" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v119dsolicitudMarcaPreAprobado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v11r04SfMontoDeudIndiVencida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v120dsolicitudFechUltimaLlamadaEval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v121dsolicitudNumIteracion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v122dcexistDeudaMaximaMoraClieUltimos3Meses" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v123dcexistMaximaMoraClieUltimos3Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v124dcexistMaximaMoraClieUltimos6Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v125dcexistMaximaMoraClieUltimos9Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v126dcexistMoraClieUltimos12Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v127dcexistMaximaMoraClieUltimos18Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v128dcexistMoraClieUltimos24Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v129dcexistDeudaConsumoAlDia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v12r04SfMontoDeudCastIndirecta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v130dcexistDeudaConsumoMorosa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v131dcexistDeudaConsumoVencida" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v132dcexistDeudaConsumoCastig" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v133dcexistDeudaConsumoAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v134dcexistSumaValorCuotasConsumoVigeS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v135dcexistValorCuotaConsumoVigeAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v136dcexistDeudaConsumoCastigHistoriPeriodo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v137dcexistUltimaFechCastigoConsumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v138dcexistCantCredConsumoViges" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v139dcexistCantCredPagadosPeriodo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v13r04SfFechaPeriodo" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v140dcexistindicadorPagoCuotaOperConsumo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v141dcexistCantCuotasPagadasCredConsumo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v142dcexistDeudaComeCastig" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v143dcexistDeudaComerc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v144dcexistDeudaComeAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v145dcexistValorCuotaComercVige" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v146dcexistSumaValorCuotaComeVigeAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v147dcexistDeudaComeCastigHistoriPeriodo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v148dcexistUltimaFechCastigoComerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v149dcexistTarjCredDia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v14r04SfMontoDeudComeCodeAval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v150dcexistDeudaTarjCredMorosa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v151dcexistDeudaTarjCredVencida" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v152dcexistDeudaTarjCredCastig" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v153dcexistDeudaTarjAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v154dcexistTarjCredCastigHistoriPeriodo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v155dcexistCupoTarjCred" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v156dcexistCupoTarjCredAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v157dcexistDeudaHipoAlDia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v158dcexistDeudaHipoMorosa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v159dcexistDeudaHipoVencida" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v15r04SfMontoDeudCredConsCodeAval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v160dcexistDeudaHipoCastig" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v161dcexistDeudaHipoAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v162dcexistSumaValorDividVige" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v163dcexistSumaValorDividVigeAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v164dcexistDeudaHipoCastigHistoriPeriodo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v165dcexistDeudaLineaSobreGiroCastig" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v166dcexistDeudaLineaSobreGiroAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v167dcexistDeudaLineaSobreGiro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v168dcexistCupLineaSobreGiro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v169dcexistCupLineaSobreGiroAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v16r04SfMontoDeudCredHipoCodeAval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v170dcexistMaxDiasMoraConsumo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v171dcexistSumaMoraMaxDiasConsumo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v172dcexistFechMaxDiasMoraConsumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v173dcexistMaxDiasMoraComerc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v174dcexistMaxDiasMoraHipo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v175dcexistSumaMoraMaxDiasHipo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v176dcexistFechMaxDiasMoraHipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v177dcexistMaxDiasMoraSgnp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v178dcexistMaxDiasMoraTarj" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v179dcexistSumaMoraMaxDiasTarj" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v17r04SfMontoLineaCredCodeAval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v180dcexistFechMaxDiasMoraTarj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v181dcexistCantSobreGiroSNoPactados" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v182dcexistProtInternFormaVige" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v183dcexistProtInternFormaHistoriPeriodo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v184dcexistProtInternFondoVige" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v185dcexistProtInternFondoHistoriPeriodo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v186dcexistMontoRentaIngresada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v187dcexistTipoMontoRentaIngresada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v188dcexistMontoRentaIngresadaAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v189dcexistTipoMontoRentaIngresadaAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v18dburoNProtestosImpagos" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="12" minOccurs="12"/>
 *         &lt;element name="v190dcexistMontoRentaCompro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v191dcexistMontoRentaDeclarada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v192dcexistMontoRentaUltimaEval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v193dcexistTipoMontoRentaUltimaEval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v194dcexistMontoRentaComproAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v195dcexistMontoRentaDeclaradaAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v196dcexistMontoRentaEstimada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v197dcexistTipoRenta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v198dcexistOrigenRenta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v199dcexistFechIngresoRentaCompro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v19dburoNMorosidadad" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="12" minOccurs="12"/>
 *         &lt;element name="v1r04SfMontoDeudDirecVige" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v200dcexistVigenciaFechCompro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v201dcexistMontoRentaEvalMasiva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v202dcexistTipoMontoRentaEvalMasiva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v203dcexistMarcaCtaCorriente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v204dcexistOrigenCierreCtaCorriente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="v205dcexistMarcaCtaVistaVige" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v206dcexistMarcaGarantiasVigeAutomo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v207dcexistMontoAhorro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v208dcexistMontoDap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v209dcexistMontoFfmm" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v20dburoBoletinConcursal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="v210dcexistOpNumOperCtaCorriente" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v211dcexistOpMontoSgnp" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v212dcexistOpMontoSgnpArrastre" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v213dcexistOpCantDiasSgnpArrastre" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v214dcexistOpFechActivCtaCorriente" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v215dcexistOpTipoCuenta" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v216dcexistOpIndicadorBloqCtaCorriente" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v217dcexistTipoConvenioVige" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v218dcexistSaldoCredConvenioVige" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v219dcexistMontoSaldoSPromCtaCorriente" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v21dburoNSerieCeduIdentidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="v220dcexistMontoSaldoSPromCtaVista" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v225dcexistSaldoRene" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v226dcexistCantReneHistori" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v227dcexistFechCancelacionUltimaRene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v228dcexistTipoProducRenegociar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v229dcexistTipoSubProducRenegociar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v22dburoFechBloqCeduIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v230dcexistDestinoProducRenegociar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v231dcexistEstadoOperRenegociar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v232dcexistCantCuotasPagadasCred" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v233dcexistNumCuotasResuscribir" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v234dcexistNumRene" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v235dcexistSaldoRefin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v236dcexistTipoProducRefinanciar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v237dcexistTipoSubProducRefinanciar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v238dcexistProducRefinanciar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v239dcexistCantCuotasPagadasCredRefin" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v23dburoFechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="12" minOccurs="12"/>
 *         &lt;element name="v240dcexistSaldoConsol" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v241dcexistTipoProdctoConsolidar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v242dcexistTipoSUBtoConsolidar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v243dcexistDestinotoConsolidar" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v244dcexistCantCuotasPagCredConsol" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="v245dcexistFechUltimoCredOtorgado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v24dsolicitanteRut" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v25dsolicitanteSexo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v264dcexistMarcaTieneAbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v265dcexistCantABonosAbr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v266dcexistAntiUltimos12Meses" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v267dcexistSaldoAnticipoVige" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v26dsolicitanteNacionalidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v279dprodAutomoCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v27dsolicitanteMarcaResiDediExtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v280dprodAutomoCodigoSubto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v281dprodAutomoCodigoDestino" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v282dprodAutomoTipoPolitica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v283dprodAutomoMontoSolicitado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v284dprodAutomoCuota" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v285dprodAutomoPlazoSolicitado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v286dprodAutomoNumCuotas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v287dprodAutomoMontoGiro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v288dprodAutomoTasa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v289dprodAutomoPieAuto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v28dsolicitanteMarcaFuncBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v290dprodAutomoValorAuto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v291dprodAutomoMarcaAuto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v292dprodAutomoModeloAuto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v293dprodAutomoFechaFabri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v294dprodAutomoCategoria" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v295dprodAutomoUso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v296dprodAutomoFinAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v29dsolicitanteTipoContrato" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v2r04SfMontoDeudComerc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v30dsolicitanteMarcaCupFirmado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v31dsolicitanteHabitoPago" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v32dsolicitanteFechNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v33dsolicitanteTipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v348dprodVariable1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v349dprodVariable2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v34dsolicitanteMarcaClieConocido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v350dprodVariable3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v351dprodVariable4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v352dprodVariable5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v353dprodVariable6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v354dprodVariable7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v355dprodVariable8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v356dprodVariable9" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v357dprodVariable10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v358dprodVariable11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v359dprodVariable12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v35dsolicitanteMarcaMatrizRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v360dprodVariable13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v361dprodVariable14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v362dprodVariable15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v363dprodVariable16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v364dprodVariable17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v365dprodVariable18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v366dprodVariable19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v367dprodVariable20" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v36solicitanteIndicePerdida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v37dsolicitantePuntajeMatrizRiesgo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v38dsolicitanteMarcaIncumpDeterioro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v39dsolicitanteTipoInterviniente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v3r04SfMontoDeudCredConsumo" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v40dsolicitanteEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v41dsolicitanteNivelcional" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v42dsolicitanteMarcaVetado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v43dsolicitanteMotivoVeto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v44dsolicitanteFechVeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="v45dsolicitanteTipoVivienda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v46dsolicitanteTotalHaberes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v47dsolicitanteCodigoDescInterno" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="5" minOccurs="5"/>
 *         &lt;element name="v48dsolicitanteDescSInternDeducibles" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="5" minOccurs="5"/>
 *         &lt;element name="v49dsolicitantePatrimonio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v4r04SfMontoDeudCredHipo" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v50dsolicitanteTipoActividad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v51dsolicitanteTipoEmpleo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v52dsolicitanteFechInicioEmpleoActual" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v53dsolicitanteFechInicioEmpleoAnterior" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v54dsolicitanteFechTerminoEmpleoAnterior" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v5r04SfMontoLineCred" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v64eexternDiasMora" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v65eexternSituacionCuenta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v66eexternEstado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v67eexternScoreBanco" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v68eexternScoreCmr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v69eexternHabitoPago" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="6" minOccurs="6"/>
 *         &lt;element name="v6r04SfNumInstAcreedoras" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v70eexternActividad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v71eexternCupo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v72eexternFechNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v73eexternFechIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v74eexternTipoVivienda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v75eexternMarcaActivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v76eexternMarcaSuperAvancista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v77eexternMarcaRenegociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v78eexternFechRene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v79eexternRenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v7r04SfMontoDeudDireMoro3090" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v80eexternRentaAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v81eexternTipoRentacomprobada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="v82eexternFechActualizacionRenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v83eexternSaldoDeudaTarj" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v84eexternSaldoDeudaConsumo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v85eexternSaldoDeudaTarjAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v86eexternSaldoDeudaConsumoAvalCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v87eexternUltimaFechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v88eexternMarcaPremiumElite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v89eexternTipoProdcto" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="4" minOccurs="4"/>
 *         &lt;element name="v8r04SfMontoDeudDireVencida" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *         &lt;element name="v8r04SfMontoDeudIndiVencida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v90dsolicitudCanal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v91dsolicitudSucursal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v92dsolicitudCodEjecutivo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v93dsolicitudUfDia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v94dsolicitudDolarDia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="v95dsolicitudIdLlamadoMotor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v96dsolicitudCodiCanalDealer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v97dsolicitudTipoConvenio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v98dsolicitudClasConvenio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="v99dsolicitudMarcaEstadConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v9r04SfMontoDeudCastDirec" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="24" minOccurs="24"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entradaLlamada1", propOrder = {
    "v100DsolicitudPorcDescAutorizadoConv",
    "v101DsolicitudPorcMaximaCuotaBf",
    "v102DsolicitudTitular",
    "v103DsolicitudReEval",
    "v104DsolicitudInterviniente",
    "v105DsolicitudMarcatoSolicitado",
    "v10R04SfMontoDeudIndiVige",
    "v119DsolicitudMarcaPreAprobado",
    "v11R04SfMontoDeudIndiVencida",
    "v120DsolicitudFechUltimaLlamadaEval",
    "v121DsolicitudNumIteracion",
    "v122DcexistDeudaMaximaMoraClieUltimos3Meses",
    "v123DcexistMaximaMoraClieUltimos3Meses",
    "v124DcexistMaximaMoraClieUltimos6Meses",
    "v125DcexistMaximaMoraClieUltimos9Meses",
    "v126DcexistMoraClieUltimos12Meses",
    "v127DcexistMaximaMoraClieUltimos18Meses",
    "v128DcexistMoraClieUltimos24Meses",
    "v129DcexistDeudaConsumoAlDia",
    "v12R04SfMontoDeudCastIndirecta",
    "v130DcexistDeudaConsumoMorosa",
    "v131DcexistDeudaConsumoVencida",
    "v132DcexistDeudaConsumoCastig",
    "v133DcexistDeudaConsumoAvalCode",
    "v134DcexistSumaValorCuotasConsumoVigeS",
    "v135DcexistValorCuotaConsumoVigeAvalCode",
    "v136DcexistDeudaConsumoCastigHistoriPeriodo",
    "v137DcexistUltimaFechCastigoConsumo",
    "v138DcexistCantCredConsumoViges",
    "v139DcexistCantCredPagadosPeriodo",
    "v13R04SfFechaPeriodo",
    "v140DcexistindicadorPagoCuotaOperConsumo",
    "v141DcexistCantCuotasPagadasCredConsumo",
    "v142DcexistDeudaComeCastig",
    "v143DcexistDeudaComerc",
    "v144DcexistDeudaComeAvalCode",
    "v145DcexistValorCuotaComercVige",
    "v146DcexistSumaValorCuotaComeVigeAvalCode",
    "v147DcexistDeudaComeCastigHistoriPeriodo",
    "v148DcexistUltimaFechCastigoComerc",
    "v149DcexistTarjCredDia",
    "v14R04SfMontoDeudComeCodeAval",
    "v150DcexistDeudaTarjCredMorosa",
    "v151DcexistDeudaTarjCredVencida",
    "v152DcexistDeudaTarjCredCastig",
    "v153DcexistDeudaTarjAvalCode",
    "v154DcexistTarjCredCastigHistoriPeriodo",
    "v155DcexistCupoTarjCred",
    "v156DcexistCupoTarjCredAvalCode",
    "v157DcexistDeudaHipoAlDia",
    "v158DcexistDeudaHipoMorosa",
    "v159DcexistDeudaHipoVencida",
    "v15R04SfMontoDeudCredConsCodeAval",
    "v160DcexistDeudaHipoCastig",
    "v161DcexistDeudaHipoAvalCode",
    "v162DcexistSumaValorDividVige",
    "v163DcexistSumaValorDividVigeAvalCode",
    "v164DcexistDeudaHipoCastigHistoriPeriodo",
    "v165DcexistDeudaLineaSobreGiroCastig",
    "v166DcexistDeudaLineaSobreGiroAvalCode",
    "v167DcexistDeudaLineaSobreGiro",
    "v168DcexistCupLineaSobreGiro",
    "v169DcexistCupLineaSobreGiroAvalCode",
    "v16R04SfMontoDeudCredHipoCodeAval",
    "v170DcexistMaxDiasMoraConsumo",
    "v171DcexistSumaMoraMaxDiasConsumo",
    "v172DcexistFechMaxDiasMoraConsumo",
    "v173DcexistMaxDiasMoraComerc",
    "v174DcexistMaxDiasMoraHipo",
    "v175DcexistSumaMoraMaxDiasHipo",
    "v176DcexistFechMaxDiasMoraHipo",
    "v177DcexistMaxDiasMoraSgnp",
    "v178DcexistMaxDiasMoraTarj",
    "v179DcexistSumaMoraMaxDiasTarj",
    "v17R04SfMontoLineaCredCodeAval",
    "v180DcexistFechMaxDiasMoraTarj",
    "v181DcexistCantSobreGiroSNoPactados",
    "v182DcexistProtInternFormaVige",
    "v183DcexistProtInternFormaHistoriPeriodo",
    "v184DcexistProtInternFondoVige",
    "v185DcexistProtInternFondoHistoriPeriodo",
    "v186DcexistMontoRentaIngresada",
    "v187DcexistTipoMontoRentaIngresada",
    "v188DcexistMontoRentaIngresadaAvalCode",
    "v189DcexistTipoMontoRentaIngresadaAvalCode",
    "v18DburoNProtestosImpagos",
    "v190DcexistMontoRentaCompro",
    "v191DcexistMontoRentaDeclarada",
    "v192DcexistMontoRentaUltimaEval",
    "v193DcexistTipoMontoRentaUltimaEval",
    "v194DcexistMontoRentaComproAvalCode",
    "v195DcexistMontoRentaDeclaradaAvalCode",
    "v196DcexistMontoRentaEstimada",
    "v197DcexistTipoRenta",
    "v198DcexistOrigenRenta",
    "v199DcexistFechIngresoRentaCompro",
    "v19DburoNMorosidadad",
    "v1R04SfMontoDeudDirecVige",
    "v200DcexistVigenciaFechCompro",
    "v201DcexistMontoRentaEvalMasiva",
    "v202DcexistTipoMontoRentaEvalMasiva",
    "v203DcexistMarcaCtaCorriente",
    "v204DcexistOrigenCierreCtaCorriente",
    "v205DcexistMarcaCtaVistaVige",
    "v206DcexistMarcaGarantiasVigeAutomo",
    "v207DcexistMontoAhorro",
    "v208DcexistMontoDap",
    "v209DcexistMontoFfmm",
    "v20DburoBoletinConcursal",
    "v210DcexistOpNumOperCtaCorriente",
    "v211DcexistOpMontoSgnp",
    "v212DcexistOpMontoSgnpArrastre",
    "v213DcexistOpCantDiasSgnpArrastre",
    "v214DcexistOpFechActivCtaCorriente",
    "v215DcexistOpTipoCuenta",
    "v216DcexistOpIndicadorBloqCtaCorriente",
    "v217DcexistTipoConvenioVige",
    "v218DcexistSaldoCredConvenioVige",
    "v219DcexistMontoSaldoSPromCtaCorriente",
    "v21DburoNSerieCeduIdentidad",
    "v220DcexistMontoSaldoSPromCtaVista",
    "v225DcexistSaldoRene",
    "v226DcexistCantReneHistori",
    "v227DcexistFechCancelacionUltimaRene",
    "v228DcexistTipoProducRenegociar",
    "v229DcexistTipoSubProducRenegociar",
    "v22DburoFechBloqCeduIdentidad",
    "v230DcexistDestinoProducRenegociar",
    "v231DcexistEstadoOperRenegociar",
    "v232DcexistCantCuotasPagadasCred",
    "v233DcexistNumCuotasResuscribir",
    "v234DcexistNumRene",
    "v235DcexistSaldoRefin",
    "v236DcexistTipoProducRefinanciar",
    "v237DcexistTipoSubProducRefinanciar",
    "v238DcexistProducRefinanciar",
    "v239DcexistCantCuotasPagadasCredRefin",
    "v23DburoFechaProceso",
    "v240DcexistSaldoConsol",
    "v241DcexistTipoProdctoConsolidar",
    "v242DcexistTipoSUBtoConsolidar",
    "v243DcexistDestinotoConsolidar",
    "v244DcexistCantCuotasPagCredConsol",
    "v245DcexistFechUltimoCredOtorgado",
    "v24DsolicitanteRut",
    "v25DsolicitanteSexo",
    "v264DcexistMarcaTieneAbr",
    "v265DcexistCantABonosAbr",
    "v266DcexistAntiUltimos12Meses",
    "v267DcexistSaldoAnticipoVige",
    "v26DsolicitanteNacionalidad",
    "v279DprodAutomoCodigoProducto",
    "v27DsolicitanteMarcaResiDediExtr",
    "v280DprodAutomoCodigoSubto",
    "v281DprodAutomoCodigoDestino",
    "v282DprodAutomoTipoPolitica",
    "v283DprodAutomoMontoSolicitado",
    "v284DprodAutomoCuota",
    "v285DprodAutomoPlazoSolicitado",
    "v286DprodAutomoNumCuotas",
    "v287DprodAutomoMontoGiro",
    "v288DprodAutomoTasa",
    "v289DprodAutomoPieAuto",
    "v28DsolicitanteMarcaFuncBanco",
    "v290DprodAutomoValorAuto",
    "v291DprodAutomoMarcaAuto",
    "v292DprodAutomoModeloAuto",
    "v293DprodAutomoFechaFabri",
    "v294DprodAutomoCategoria",
    "v295DprodAutomoUso",
    "v296DprodAutomoFinAuto",
    "v29DsolicitanteTipoContrato",
    "v2R04SfMontoDeudComerc",
    "v30DsolicitanteMarcaCupFirmado",
    "v31DsolicitanteHabitoPago",
    "v32DsolicitanteFechNacimiento",
    "v33DsolicitanteTipoPersona",
    "v348DprodVariable1",
    "v349DprodVariable2",
    "v34DsolicitanteMarcaClieConocido",
    "v350DprodVariable3",
    "v351DprodVariable4",
    "v352DprodVariable5",
    "v353DprodVariable6",
    "v354DprodVariable7",
    "v355DprodVariable8",
    "v356DprodVariable9",
    "v357DprodVariable10",
    "v358DprodVariable11",
    "v359DprodVariable12",
    "v35DsolicitanteMarcaMatrizRiesgo",
    "v360DprodVariable13",
    "v361DprodVariable14",
    "v362DprodVariable15",
    "v363DprodVariable16",
    "v364DprodVariable17",
    "v365DprodVariable18",
    "v366DprodVariable19",
    "v367DprodVariable20",
    "v36SolicitanteIndicePerdida",
    "v37DsolicitantePuntajeMatrizRiesgo",
    "v38DsolicitanteMarcaIncumpDeterioro",
    "v39DsolicitanteTipoInterviniente",
    "v3R04SfMontoDeudCredConsumo",
    "v40DsolicitanteEstadoCivil",
    "v41DsolicitanteNivelcional",
    "v42DsolicitanteMarcaVetado",
    "v43DsolicitanteMotivoVeto",
    "v44DsolicitanteFechVeto",
    "v45DsolicitanteTipoVivienda",
    "v46DsolicitanteTotalHaberes",
    "v47DsolicitanteCodigoDescInterno",
    "v48DsolicitanteDescSInternDeducibles",
    "v49DsolicitantePatrimonio",
    "v4R04SfMontoDeudCredHipo",
    "v50DsolicitanteTipoActividad",
    "v51DsolicitanteTipoEmpleo",
    "v52DsolicitanteFechInicioEmpleoActual",
    "v53DsolicitanteFechInicioEmpleoAnterior",
    "v54DsolicitanteFechTerminoEmpleoAnterior",
    "v5R04SfMontoLineCred",
    "v64EexternDiasMora",
    "v65EexternSituacionCuenta",
    "v66EexternEstado",
    "v67EexternScoreBanco",
    "v68EexternScoreCmr",
    "v69EexternHabitoPago",
    "v6R04SfNumInstAcreedoras",
    "v70EexternActividad",
    "v71EexternCupo",
    "v72EexternFechNacimiento",
    "v73EexternFechIngreso",
    "v74EexternTipoVivienda",
    "v75EexternMarcaActivo",
    "v76EexternMarcaSuperAvancista",
    "v77EexternMarcaRenegociado",
    "v78EexternFechRene",
    "v79EexternRenta",
    "v7R04SfMontoDeudDireMoro3090",
    "v80EexternRentaAvalCode",
    "v81EexternTipoRentacomprobada",
    "v82EexternFechActualizacionRenta",
    "v83EexternSaldoDeudaTarj",
    "v84EexternSaldoDeudaConsumo",
    "v85EexternSaldoDeudaTarjAvalCode",
    "v86EexternSaldoDeudaConsumoAvalCode",
    "v87EexternUltimaFechaPago",
    "v88EexternMarcaPremiumElite",
    "v89EexternTipoProdcto",
    "v8R04SfMontoDeudDireVencida",
    "v8R04SfMontoDeudIndiVencida",
    "v90DsolicitudCanal",
    "v91DsolicitudSucursal",
    "v92DsolicitudCodEjecutivo",
    "v93DsolicitudUfDia",
    "v94DsolicitudDolarDia",
    "v95DsolicitudIdLlamadoMotor",
    "v96DsolicitudCodiCanalDealer",
    "v97DsolicitudTipoConvenio",
    "v98DsolicitudClasConvenio",
    "v99DsolicitudMarcaEstadConvenio",
    "v9R04SfMontoDeudCastDirec"
})
public class EntradaLlamada1
    extends DaBean
{

    @XmlElement(name = "v100dsolicitudPorcDescAutorizadoConv", defaultValue = "-99.0")
    protected double v100DsolicitudPorcDescAutorizadoConv;
    @XmlElement(name = "v101dsolicitudPorcMaximaCuotaBf", defaultValue = "-99.0")
    protected double v101DsolicitudPorcMaximaCuotaBf;
    @XmlElement(name = "v102dsolicitudTitular", defaultValue = "-99")
    protected long v102DsolicitudTitular;
    @XmlElement(name = "v103dsolicitudReEval", defaultValue = "-99")
    protected long v103DsolicitudReEval;
    @XmlElement(name = "v104dsolicitudInterviniente", defaultValue = "-99")
    protected long v104DsolicitudInterviniente;
    @XmlElement(name = "v105dsolicitudMarcatoSolicitado", defaultValue = "-99")
    protected long v105DsolicitudMarcatoSolicitado;
    @XmlElement(name = "v10r04SfMontoDeudIndiVige", defaultValue = "-99")
    protected long v10R04SfMontoDeudIndiVige;
    @XmlElement(name = "v119dsolicitudMarcaPreAprobado", defaultValue = "-99")
    protected long v119DsolicitudMarcaPreAprobado;
    @XmlElement(name = "v11r04SfMontoDeudIndiVencida", defaultValue = "-99")
    protected long v11R04SfMontoDeudIndiVencida;
    @XmlElement(name = "v120dsolicitudFechUltimaLlamadaEval", defaultValue = "|")
    protected String v120DsolicitudFechUltimaLlamadaEval;
    @XmlElement(name = "v121dsolicitudNumIteracion", defaultValue = "-99")
    protected long v121DsolicitudNumIteracion;
    @XmlElement(name = "v122dcexistDeudaMaximaMoraClieUltimos3Meses", defaultValue = "-99.0")
    protected double v122DcexistDeudaMaximaMoraClieUltimos3Meses;
    @XmlElement(name = "v123dcexistMaximaMoraClieUltimos3Meses", defaultValue = "-99")
    protected long v123DcexistMaximaMoraClieUltimos3Meses;
    @XmlElement(name = "v124dcexistMaximaMoraClieUltimos6Meses", defaultValue = "-99")
    protected long v124DcexistMaximaMoraClieUltimos6Meses;
    @XmlElement(name = "v125dcexistMaximaMoraClieUltimos9Meses", defaultValue = "-99")
    protected long v125DcexistMaximaMoraClieUltimos9Meses;
    @XmlElement(name = "v126dcexistMoraClieUltimos12Meses", defaultValue = "-99")
    protected long v126DcexistMoraClieUltimos12Meses;
    @XmlElement(name = "v127dcexistMaximaMoraClieUltimos18Meses", defaultValue = "-99")
    protected long v127DcexistMaximaMoraClieUltimos18Meses;
    @XmlElement(name = "v128dcexistMoraClieUltimos24Meses", defaultValue = "-99")
    protected long v128DcexistMoraClieUltimos24Meses;
    @XmlElement(name = "v129dcexistDeudaConsumoAlDia", defaultValue = "-99.0")
    protected double v129DcexistDeudaConsumoAlDia;
    @XmlElement(name = "v12r04SfMontoDeudCastIndirecta", defaultValue = "-99")
    protected long v12R04SfMontoDeudCastIndirecta;
    @XmlElement(name = "v130dcexistDeudaConsumoMorosa", defaultValue = "-99.0")
    protected double v130DcexistDeudaConsumoMorosa;
    @XmlElement(name = "v131dcexistDeudaConsumoVencida", defaultValue = "-99.0")
    protected double v131DcexistDeudaConsumoVencida;
    @XmlElement(name = "v132dcexistDeudaConsumoCastig", defaultValue = "-99.0")
    protected double v132DcexistDeudaConsumoCastig;
    @XmlElement(name = "v133dcexistDeudaConsumoAvalCode", defaultValue = "-99.0")
    protected double v133DcexistDeudaConsumoAvalCode;
    @XmlElement(name = "v134dcexistSumaValorCuotasConsumoVigeS", defaultValue = "-99.0")
    protected double v134DcexistSumaValorCuotasConsumoVigeS;
    @XmlElement(name = "v135dcexistValorCuotaConsumoVigeAvalCode", defaultValue = "-99.0")
    protected double v135DcexistValorCuotaConsumoVigeAvalCode;
    @XmlElement(name = "v136dcexistDeudaConsumoCastigHistoriPeriodo", defaultValue = "-99.0")
    protected double v136DcexistDeudaConsumoCastigHistoriPeriodo;
    @XmlElement(name = "v137dcexistUltimaFechCastigoConsumo", defaultValue = "|")
    protected String v137DcexistUltimaFechCastigoConsumo;
    @XmlElement(name = "v138dcexistCantCredConsumoViges", defaultValue = "-99")
    protected long v138DcexistCantCredConsumoViges;
    @XmlElement(name = "v139dcexistCantCredPagadosPeriodo", defaultValue = "-99")
    protected long v139DcexistCantCredPagadosPeriodo;
    @XmlElement(name = "v13r04SfFechaPeriodo", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v13R04SfFechaPeriodo;
    @XmlElement(name = "v140dcexistindicadorPagoCuotaOperConsumo", defaultValue = "-99.0")
    protected double v140DcexistindicadorPagoCuotaOperConsumo;
    @XmlElement(name = "v141dcexistCantCuotasPagadasCredConsumo", defaultValue = "-99")
    protected long v141DcexistCantCuotasPagadasCredConsumo;
    @XmlElement(name = "v142dcexistDeudaComeCastig", defaultValue = "-99.0")
    protected double v142DcexistDeudaComeCastig;
    @XmlElement(name = "v143dcexistDeudaComerc", defaultValue = "-99.0")
    protected double v143DcexistDeudaComerc;
    @XmlElement(name = "v144dcexistDeudaComeAvalCode", defaultValue = "-99.0")
    protected double v144DcexistDeudaComeAvalCode;
    @XmlElement(name = "v145dcexistValorCuotaComercVige", defaultValue = "-99.0")
    protected double v145DcexistValorCuotaComercVige;
    @XmlElement(name = "v146dcexistSumaValorCuotaComeVigeAvalCode", defaultValue = "-99.0")
    protected double v146DcexistSumaValorCuotaComeVigeAvalCode;
    @XmlElement(name = "v147dcexistDeudaComeCastigHistoriPeriodo", defaultValue = "-99.0")
    protected double v147DcexistDeudaComeCastigHistoriPeriodo;
    @XmlElement(name = "v148dcexistUltimaFechCastigoComerc", defaultValue = "|")
    protected String v148DcexistUltimaFechCastigoComerc;
    @XmlElement(name = "v149dcexistTarjCredDia", defaultValue = "-99.0")
    protected double v149DcexistTarjCredDia;
    @XmlElement(name = "v14r04SfMontoDeudComeCodeAval", defaultValue = "-99")
    protected long v14R04SfMontoDeudComeCodeAval;
    @XmlElement(name = "v150dcexistDeudaTarjCredMorosa", defaultValue = "-99.0")
    protected double v150DcexistDeudaTarjCredMorosa;
    @XmlElement(name = "v151dcexistDeudaTarjCredVencida", defaultValue = "-99.0")
    protected double v151DcexistDeudaTarjCredVencida;
    @XmlElement(name = "v152dcexistDeudaTarjCredCastig", defaultValue = "-99.0")
    protected double v152DcexistDeudaTarjCredCastig;
    @XmlElement(name = "v153dcexistDeudaTarjAvalCode", defaultValue = "-99.0")
    protected double v153DcexistDeudaTarjAvalCode;
    @XmlElement(name = "v154dcexistTarjCredCastigHistoriPeriodo", defaultValue = "-99.0")
    protected double v154DcexistTarjCredCastigHistoriPeriodo;
    @XmlElement(name = "v155dcexistCupoTarjCred", defaultValue = "-99.0")
    protected double v155DcexistCupoTarjCred;
    @XmlElement(name = "v156dcexistCupoTarjCredAvalCode", defaultValue = "-99.0")
    protected double v156DcexistCupoTarjCredAvalCode;
    @XmlElement(name = "v157dcexistDeudaHipoAlDia", defaultValue = "-99.0")
    protected double v157DcexistDeudaHipoAlDia;
    @XmlElement(name = "v158dcexistDeudaHipoMorosa", defaultValue = "-99.0")
    protected double v158DcexistDeudaHipoMorosa;
    @XmlElement(name = "v159dcexistDeudaHipoVencida", defaultValue = "-99.0")
    protected double v159DcexistDeudaHipoVencida;
    @XmlElement(name = "v15r04SfMontoDeudCredConsCodeAval", defaultValue = "-99")
    protected long v15R04SfMontoDeudCredConsCodeAval;
    @XmlElement(name = "v160dcexistDeudaHipoCastig", defaultValue = "-99.0")
    protected double v160DcexistDeudaHipoCastig;
    @XmlElement(name = "v161dcexistDeudaHipoAvalCode", defaultValue = "-99.0")
    protected double v161DcexistDeudaHipoAvalCode;
    @XmlElement(name = "v162dcexistSumaValorDividVige", defaultValue = "-99.0")
    protected double v162DcexistSumaValorDividVige;
    @XmlElement(name = "v163dcexistSumaValorDividVigeAvalCode", defaultValue = "-99.0")
    protected double v163DcexistSumaValorDividVigeAvalCode;
    @XmlElement(name = "v164dcexistDeudaHipoCastigHistoriPeriodo", defaultValue = "-99.0")
    protected double v164DcexistDeudaHipoCastigHistoriPeriodo;
    @XmlElement(name = "v165dcexistDeudaLineaSobreGiroCastig", defaultValue = "-99.0")
    protected double v165DcexistDeudaLineaSobreGiroCastig;
    @XmlElement(name = "v166dcexistDeudaLineaSobreGiroAvalCode", defaultValue = "-99.0")
    protected double v166DcexistDeudaLineaSobreGiroAvalCode;
    @XmlElement(name = "v167dcexistDeudaLineaSobreGiro", defaultValue = "-99.0")
    protected double v167DcexistDeudaLineaSobreGiro;
    @XmlElement(name = "v168dcexistCupLineaSobreGiro", defaultValue = "-99.0")
    protected double v168DcexistCupLineaSobreGiro;
    @XmlElement(name = "v169dcexistCupLineaSobreGiroAvalCode", defaultValue = "-99.0")
    protected double v169DcexistCupLineaSobreGiroAvalCode;
    @XmlElement(name = "v16r04SfMontoDeudCredHipoCodeAval", defaultValue = "-99")
    protected long v16R04SfMontoDeudCredHipoCodeAval;
    @XmlElement(name = "v170dcexistMaxDiasMoraConsumo", defaultValue = "-99")
    protected long v170DcexistMaxDiasMoraConsumo;
    @XmlElement(name = "v171dcexistSumaMoraMaxDiasConsumo", defaultValue = "-99.0")
    protected double v171DcexistSumaMoraMaxDiasConsumo;
    @XmlElement(name = "v172dcexistFechMaxDiasMoraConsumo", defaultValue = "|")
    protected String v172DcexistFechMaxDiasMoraConsumo;
    @XmlElement(name = "v173dcexistMaxDiasMoraComerc", defaultValue = "-99")
    protected long v173DcexistMaxDiasMoraComerc;
    @XmlElement(name = "v174dcexistMaxDiasMoraHipo", defaultValue = "-99")
    protected long v174DcexistMaxDiasMoraHipo;
    @XmlElement(name = "v175dcexistSumaMoraMaxDiasHipo", defaultValue = "-99.0")
    protected double v175DcexistSumaMoraMaxDiasHipo;
    @XmlElement(name = "v176dcexistFechMaxDiasMoraHipo", defaultValue = "|")
    protected String v176DcexistFechMaxDiasMoraHipo;
    @XmlElement(name = "v177dcexistMaxDiasMoraSgnp", defaultValue = "-99")
    protected long v177DcexistMaxDiasMoraSgnp;
    @XmlElement(name = "v178dcexistMaxDiasMoraTarj", defaultValue = "-99")
    protected long v178DcexistMaxDiasMoraTarj;
    @XmlElement(name = "v179dcexistSumaMoraMaxDiasTarj", defaultValue = "-99.0")
    protected double v179DcexistSumaMoraMaxDiasTarj;
    @XmlElement(name = "v17r04SfMontoLineaCredCodeAval", defaultValue = "-99")
    protected long v17R04SfMontoLineaCredCodeAval;
    @XmlElement(name = "v180dcexistFechMaxDiasMoraTarj", defaultValue = "|")
    protected String v180DcexistFechMaxDiasMoraTarj;
    @XmlElement(name = "v181dcexistCantSobreGiroSNoPactados", defaultValue = "-99")
    protected long v181DcexistCantSobreGiroSNoPactados;
    @XmlElement(name = "v182dcexistProtInternFormaVige", defaultValue = "-99")
    protected long v182DcexistProtInternFormaVige;
    @XmlElement(name = "v183dcexistProtInternFormaHistoriPeriodo", defaultValue = "-99")
    protected long v183DcexistProtInternFormaHistoriPeriodo;
    @XmlElement(name = "v184dcexistProtInternFondoVige", defaultValue = "-99")
    protected long v184DcexistProtInternFondoVige;
    @XmlElement(name = "v185dcexistProtInternFondoHistoriPeriodo", defaultValue = "-99")
    protected long v185DcexistProtInternFondoHistoriPeriodo;
    @XmlElement(name = "v186dcexistMontoRentaIngresada", defaultValue = "-99.0")
    protected double v186DcexistMontoRentaIngresada;
    @XmlElement(name = "v187dcexistTipoMontoRentaIngresada", defaultValue = "-99.0")
    protected double v187DcexistTipoMontoRentaIngresada;
    @XmlElement(name = "v188dcexistMontoRentaIngresadaAvalCode", defaultValue = "-99.0")
    protected double v188DcexistMontoRentaIngresadaAvalCode;
    @XmlElement(name = "v189dcexistTipoMontoRentaIngresadaAvalCode", defaultValue = "-99.0")
    protected double v189DcexistTipoMontoRentaIngresadaAvalCode;
    @XmlElement(name = "v18dburoNProtestosImpagos", required = true, defaultValue = "-99", nillable = true)
    @Size(min = 12, max = 12)
    protected List<Long> v18DburoNProtestosImpagos;
    @XmlElement(name = "v190dcexistMontoRentaCompro", defaultValue = "-99.0")
    protected double v190DcexistMontoRentaCompro;
    @XmlElement(name = "v191dcexistMontoRentaDeclarada", defaultValue = "-99.0")
    protected double v191DcexistMontoRentaDeclarada;
    @XmlElement(name = "v192dcexistMontoRentaUltimaEval", defaultValue = "-99.0")
    protected double v192DcexistMontoRentaUltimaEval;
    @XmlElement(name = "v193dcexistTipoMontoRentaUltimaEval", defaultValue = "-99.0")
    protected double v193DcexistTipoMontoRentaUltimaEval;
    @XmlElement(name = "v194dcexistMontoRentaComproAvalCode", defaultValue = "-99.0")
    protected double v194DcexistMontoRentaComproAvalCode;
    @XmlElement(name = "v195dcexistMontoRentaDeclaradaAvalCode", defaultValue = "-99.0")
    protected double v195DcexistMontoRentaDeclaradaAvalCode;
    @XmlElement(name = "v196dcexistMontoRentaEstimada", defaultValue = "-99.0")
    protected double v196DcexistMontoRentaEstimada;
    @XmlElement(name = "v197dcexistTipoRenta", defaultValue = "-99")
    protected long v197DcexistTipoRenta;
    @XmlElement(name = "v198dcexistOrigenRenta", defaultValue = "-99")
    protected long v198DcexistOrigenRenta;
    @XmlElement(name = "v199dcexistFechIngresoRentaCompro", defaultValue = "|")
    protected String v199DcexistFechIngresoRentaCompro;
    @XmlElement(name = "v19dburoNMorosidadad", required = true, defaultValue = "-99", nillable = true)
    @Size(min = 12, max = 12)
    protected List<Long> v19DburoNMorosidadad;
    @XmlElement(name = "v1r04SfMontoDeudDirecVige", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v1R04SfMontoDeudDirecVige;
    @XmlElement(name = "v200dcexistVigenciaFechCompro", defaultValue = "|")
    protected String v200DcexistVigenciaFechCompro;
    @XmlElement(name = "v201dcexistMontoRentaEvalMasiva", defaultValue = "-99.0")
    protected double v201DcexistMontoRentaEvalMasiva;
    @XmlElement(name = "v202dcexistTipoMontoRentaEvalMasiva", defaultValue = "-99.0")
    protected double v202DcexistTipoMontoRentaEvalMasiva;
    @XmlElement(name = "v203dcexistMarcaCtaCorriente", defaultValue = "|")
    protected String v203DcexistMarcaCtaCorriente;
    @XmlElement(name = "v204dcexistOrigenCierreCtaCorriente", required = true, defaultValue = "|")
    protected String v204DcexistOrigenCierreCtaCorriente;
    @XmlElement(name = "v205dcexistMarcaCtaVistaVige", defaultValue = "|")
    protected String v205DcexistMarcaCtaVistaVige;
    @XmlElement(name = "v206dcexistMarcaGarantiasVigeAutomo", defaultValue = "|")
    protected String v206DcexistMarcaGarantiasVigeAutomo;
    @XmlElement(name = "v207dcexistMontoAhorro", defaultValue = "-99.0")
    protected double v207DcexistMontoAhorro;
    @XmlElement(name = "v208dcexistMontoDap", defaultValue = "-99.0")
    protected double v208DcexistMontoDap;
    @XmlElement(name = "v209dcexistMontoFfmm", defaultValue = "-99.0")
    protected double v209DcexistMontoFfmm;
    @XmlElement(name = "v20dburoBoletinConcursal", required = true, defaultValue = "|", nillable = true)
    protected String v20DburoBoletinConcursal;
    @XmlElement(name = "v210dcexistOpNumOperCtaCorriente", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v210DcexistOpNumOperCtaCorriente;
    @XmlElement(name = "v211dcexistOpMontoSgnp", type = Double.class, defaultValue = "-99.0")
    @Size(min = 3, max = 3)
    protected List<Double> v211DcexistOpMontoSgnp;
    @XmlElement(name = "v212dcexistOpMontoSgnpArrastre", type = Double.class, defaultValue = "-99.0")
    @Size(min = 3, max = 3)
    protected List<Double> v212DcexistOpMontoSgnpArrastre;
    @XmlElement(name = "v213dcexistOpCantDiasSgnpArrastre", required = true, defaultValue = "-99", nillable = true)
    @Size(min = 3, max = 3)
    protected List<Long> v213DcexistOpCantDiasSgnpArrastre;
    @XmlElement(name = "v214dcexistOpFechActivCtaCorriente", required = true, defaultValue = "|")
    @Size(min = 3, max = 3)
    protected List<String> v214DcexistOpFechActivCtaCorriente;
    @XmlElement(name = "v215dcexistOpTipoCuenta", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v215DcexistOpTipoCuenta;
    @XmlElement(name = "v216dcexistOpIndicadorBloqCtaCorriente", required = true, defaultValue = "|", nillable = true)
    @Size(min = 3, max = 3)
    protected List<String> v216DcexistOpIndicadorBloqCtaCorriente;
    @XmlElement(name = "v217dcexistTipoConvenioVige", defaultValue = "-99")
    protected long v217DcexistTipoConvenioVige;
    @XmlElement(name = "v218dcexistSaldoCredConvenioVige", defaultValue = "-99.0")
    protected double v218DcexistSaldoCredConvenioVige;
    @XmlElement(name = "v219dcexistMontoSaldoSPromCtaCorriente", defaultValue = "-99.0")
    protected double v219DcexistMontoSaldoSPromCtaCorriente;
    @XmlElement(name = "v21dburoNSerieCeduIdentidad", required = true, defaultValue = "|")
    protected String v21DburoNSerieCeduIdentidad;
    @XmlElement(name = "v220dcexistMontoSaldoSPromCtaVista", defaultValue = "-99.0")
    protected double v220DcexistMontoSaldoSPromCtaVista;
    @XmlElement(name = "v225dcexistSaldoRene", defaultValue = "-99.0")
    protected double v225DcexistSaldoRene;
    @XmlElement(name = "v226dcexistCantReneHistori", defaultValue = "-99")
    protected long v226DcexistCantReneHistori;
    @XmlElement(name = "v227dcexistFechCancelacionUltimaRene", defaultValue = "|")
    protected String v227DcexistFechCancelacionUltimaRene;
    @XmlElement(name = "v228dcexistTipoProducRenegociar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v228DcexistTipoProducRenegociar;
    @XmlElement(name = "v229dcexistTipoSubProducRenegociar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v229DcexistTipoSubProducRenegociar;
    @XmlElement(name = "v22dburoFechBloqCeduIdentidad", defaultValue = "|")
    protected String v22DburoFechBloqCeduIdentidad;
    @XmlElement(name = "v230dcexistDestinoProducRenegociar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v230DcexistDestinoProducRenegociar;
    @XmlElement(name = "v231dcexistEstadoOperRenegociar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v231DcexistEstadoOperRenegociar;
    @XmlElement(name = "v232dcexistCantCuotasPagadasCred", required = true, defaultValue = "-99", nillable = true)
    @Size(min = 3, max = 3)
    protected List<Long> v232DcexistCantCuotasPagadasCred;
    @XmlElement(name = "v233dcexistNumCuotasResuscribir", defaultValue = "-99")
    protected long v233DcexistNumCuotasResuscribir;
    @XmlElement(name = "v234dcexistNumRene", defaultValue = "-99")
    protected long v234DcexistNumRene;
    @XmlElement(name = "v235dcexistSaldoRefin", defaultValue = "-99.0")
    protected double v235DcexistSaldoRefin;
    @XmlElement(name = "v236dcexistTipoProducRefinanciar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v236DcexistTipoProducRefinanciar;
    @XmlElement(name = "v237dcexistTipoSubProducRefinanciar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v237DcexistTipoSubProducRefinanciar;
    @XmlElement(name = "v238dcexistProducRefinanciar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v238DcexistProducRefinanciar;
    @XmlElement(name = "v239dcexistCantCuotasPagadasCredRefin", required = true, defaultValue = "-99", nillable = true)
    @Size(min = 3, max = 3)
    protected List<Long> v239DcexistCantCuotasPagadasCredRefin;
    @XmlElement(name = "v23dburoFechaProceso", required = true, defaultValue = "|")
    @Size(min = 12, max = 12)
    protected List<String> v23DburoFechaProceso;
    @XmlElement(name = "v240dcexistSaldoConsol", defaultValue = "-99.0")
    protected double v240DcexistSaldoConsol;
    @XmlElement(name = "v241dcexistTipoProdctoConsolidar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v241DcexistTipoProdctoConsolidar;
    @XmlElement(name = "v242dcexistTipoSUBtoConsolidar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v242DcexistTipoSUBtoConsolidar;
    @XmlElement(name = "v243dcexistDestinotoConsolidar", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v243DcexistDestinotoConsolidar;
    @XmlElement(name = "v244dcexistCantCuotasPagCredConsol", type = Long.class, defaultValue = "-99")
    @Size(min = 3, max = 3)
    protected List<Long> v244DcexistCantCuotasPagCredConsol;
    @XmlElement(name = "v245dcexistFechUltimoCredOtorgado", defaultValue = "|")
    protected String v245DcexistFechUltimoCredOtorgado;
    @XmlElement(name = "v24dsolicitanteRut", defaultValue = "-99")
    protected long v24DsolicitanteRut;
    @XmlElement(name = "v25dsolicitanteSexo", defaultValue = "-99")
    protected long v25DsolicitanteSexo;
    @XmlElement(name = "v264dcexistMarcaTieneAbr", defaultValue = "|")
    protected String v264DcexistMarcaTieneAbr;
    @XmlElement(name = "v265dcexistCantABonosAbr", defaultValue = "-99")
    protected long v265DcexistCantABonosAbr;
    @XmlElement(name = "v266dcexistAntiUltimos12Meses", defaultValue = "-99")
    protected long v266DcexistAntiUltimos12Meses;
    @XmlElement(name = "v267dcexistSaldoAnticipoVige", defaultValue = "-99.0")
    protected double v267DcexistSaldoAnticipoVige;
    @XmlElement(name = "v26dsolicitanteNacionalidad", defaultValue = "-99")
    protected long v26DsolicitanteNacionalidad;
    @XmlElement(name = "v279dprodAutomoCodigoProducto", defaultValue = "-99")
    protected long v279DprodAutomoCodigoProducto;
    @XmlElement(name = "v27dsolicitanteMarcaResiDediExtr", defaultValue = "|")
    protected String v27DsolicitanteMarcaResiDediExtr;
    @XmlElement(name = "v280dprodAutomoCodigoSubto", defaultValue = "-99")
    protected long v280DprodAutomoCodigoSubto;
    @XmlElement(name = "v281dprodAutomoCodigoDestino", defaultValue = "-99")
    protected long v281DprodAutomoCodigoDestino;
    @XmlElement(name = "v282dprodAutomoTipoPolitica", defaultValue = "-99")
    protected long v282DprodAutomoTipoPolitica;
    @XmlElement(name = "v283dprodAutomoMontoSolicitado", defaultValue = "-99.0")
    protected double v283DprodAutomoMontoSolicitado;
    @XmlElement(name = "v284dprodAutomoCuota", defaultValue = "-99.0")
    protected double v284DprodAutomoCuota;
    @XmlElement(name = "v285dprodAutomoPlazoSolicitado", defaultValue = "-99")
    protected long v285DprodAutomoPlazoSolicitado;
    @XmlElement(name = "v286dprodAutomoNumCuotas", defaultValue = "-99")
    protected long v286DprodAutomoNumCuotas;
    @XmlElement(name = "v287dprodAutomoMontoGiro", defaultValue = "-99")
    protected long v287DprodAutomoMontoGiro;
    @XmlElement(name = "v288dprodAutomoTasa", defaultValue = "-99.0")
    protected double v288DprodAutomoTasa;
    @XmlElement(name = "v289dprodAutomoPieAuto", defaultValue = "-99.0")
    protected double v289DprodAutomoPieAuto;
    @XmlElement(name = "v28dsolicitanteMarcaFuncBanco", defaultValue = "|")
    protected String v28DsolicitanteMarcaFuncBanco;
    @XmlElement(name = "v290dprodAutomoValorAuto", defaultValue = "-99.0")
    protected double v290DprodAutomoValorAuto;
    @XmlElement(name = "v291dprodAutomoMarcaAuto", defaultValue = "-99")
    protected long v291DprodAutomoMarcaAuto;
    @XmlElement(name = "v292dprodAutomoModeloAuto", defaultValue = "-99")
    protected long v292DprodAutomoModeloAuto;
    @XmlElement(name = "v293dprodAutomoFechaFabri", defaultValue = "|")
    protected String v293DprodAutomoFechaFabri;
    @XmlElement(name = "v294dprodAutomoCategoria", defaultValue = "-99")
    protected long v294DprodAutomoCategoria;
    @XmlElement(name = "v295dprodAutomoUso", defaultValue = "-99")
    protected long v295DprodAutomoUso;
    @XmlElement(name = "v296dprodAutomoFinAuto", defaultValue = "|")
    protected String v296DprodAutomoFinAuto;
    @XmlElement(name = "v29dsolicitanteTipoContrato", defaultValue = "-99")
    protected long v29DsolicitanteTipoContrato;
    @XmlElement(name = "v2r04SfMontoDeudComerc", defaultValue = "-99")
    protected long v2R04SfMontoDeudComerc;
    @XmlElement(name = "v30dsolicitanteMarcaCupFirmado", defaultValue = "|")
    protected String v30DsolicitanteMarcaCupFirmado;
    @XmlElement(name = "v31dsolicitanteHabitoPago", defaultValue = "-99")
    protected long v31DsolicitanteHabitoPago;
    @XmlElement(name = "v32dsolicitanteFechNacimiento", defaultValue = "|")
    protected String v32DsolicitanteFechNacimiento;
    @XmlElement(name = "v33dsolicitanteTipoPersona", defaultValue = "|")
    protected String v33DsolicitanteTipoPersona;
    @XmlElement(name = "v348dprodVariable1", defaultValue = "-99.0")
    protected double v348DprodVariable1;
    @XmlElement(name = "v349dprodVariable2", defaultValue = "-99.0")
    protected double v349DprodVariable2;
    @XmlElement(name = "v34dsolicitanteMarcaClieConocido", defaultValue = "|")
    protected String v34DsolicitanteMarcaClieConocido;
    @XmlElement(name = "v350dprodVariable3", defaultValue = "-99.0")
    protected double v350DprodVariable3;
    @XmlElement(name = "v351dprodVariable4", defaultValue = "-99.0")
    protected double v351DprodVariable4;
    @XmlElement(name = "v352dprodVariable5", defaultValue = "-99.0")
    protected double v352DprodVariable5;
    @XmlElement(name = "v353dprodVariable6", defaultValue = "-99.0")
    protected double v353DprodVariable6;
    @XmlElement(name = "v354dprodVariable7", defaultValue = "-99.0")
    protected double v354DprodVariable7;
    @XmlElement(name = "v355dprodVariable8", defaultValue = "-99.0")
    protected double v355DprodVariable8;
    @XmlElement(name = "v356dprodVariable9", defaultValue = "-99.0")
    protected double v356DprodVariable9;
    @XmlElement(name = "v357dprodVariable10", defaultValue = "|")
    protected String v357DprodVariable10;
    @XmlElement(name = "v358dprodVariable11", defaultValue = "|")
    protected String v358DprodVariable11;
    @XmlElement(name = "v359dprodVariable12", defaultValue = "|")
    protected String v359DprodVariable12;
    @XmlElement(name = "v35dsolicitanteMarcaMatrizRiesgo", defaultValue = "|")
    protected String v35DsolicitanteMarcaMatrizRiesgo;
    @XmlElement(name = "v360dprodVariable13", defaultValue = "|")
    protected String v360DprodVariable13;
    @XmlElement(name = "v361dprodVariable14", defaultValue = "|")
    protected String v361DprodVariable14;
    @XmlElement(name = "v362dprodVariable15", defaultValue = "|")
    protected String v362DprodVariable15;
    @XmlElement(name = "v363dprodVariable16", defaultValue = "|")
    protected String v363DprodVariable16;
    @XmlElement(name = "v364dprodVariable17", defaultValue = "|")
    protected String v364DprodVariable17;
    @XmlElement(name = "v365dprodVariable18", defaultValue = "|")
    protected String v365DprodVariable18;
    @XmlElement(name = "v366dprodVariable19", defaultValue = "|")
    protected String v366DprodVariable19;
    @XmlElement(name = "v367dprodVariable20", defaultValue = "-99.0")
    protected double v367DprodVariable20;
    @XmlElement(name = "v36solicitanteIndicePerdida", defaultValue = "-99")
    protected long v36SolicitanteIndicePerdida;
    @XmlElement(name = "v37dsolicitantePuntajeMatrizRiesgo", defaultValue = "-99")
    protected long v37DsolicitantePuntajeMatrizRiesgo;
    @XmlElement(name = "v38dsolicitanteMarcaIncumpDeterioro", defaultValue = "-99")
    protected long v38DsolicitanteMarcaIncumpDeterioro;
    @XmlElement(name = "v39dsolicitanteTipoInterviniente", defaultValue = "|")
    protected String v39DsolicitanteTipoInterviniente;
    @XmlElement(name = "v3r04SfMontoDeudCredConsumo", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v3R04SfMontoDeudCredConsumo;
    @XmlElement(name = "v40dsolicitanteEstadoCivil", defaultValue = "-99")
    protected long v40DsolicitanteEstadoCivil;
    @XmlElement(name = "v41dsolicitanteNivelcional", defaultValue = "-99")
    protected long v41DsolicitanteNivelcional;
    @XmlElement(name = "v42dsolicitanteMarcaVetado", defaultValue = "|")
    protected String v42DsolicitanteMarcaVetado;
    @XmlElement(name = "v43dsolicitanteMotivoVeto", defaultValue = "-99")
    protected long v43DsolicitanteMotivoVeto;
    @XmlElement(name = "v44dsolicitanteFechVeto", required = true, defaultValue = "|")
    protected String v44DsolicitanteFechVeto;
    @XmlElement(name = "v45dsolicitanteTipoVivienda", defaultValue = "-99")
    protected long v45DsolicitanteTipoVivienda;
    @XmlElement(name = "v46dsolicitanteTotalHaberes", defaultValue = "-99.0")
    protected double v46DsolicitanteTotalHaberes;
    @XmlElement(name = "v47dsolicitanteCodigoDescInterno", required = true, defaultValue = "-99.0", nillable = true)
    @Size(min = 5, max = 5)
    protected List<Double> v47DsolicitanteCodigoDescInterno;
    @XmlElement(name = "v48dsolicitanteDescSInternDeducibles", required = true, defaultValue = "-99.0", nillable = true)
    @Size(min = 5, max = 5)
    protected List<Double> v48DsolicitanteDescSInternDeducibles;
    @XmlElement(name = "v49dsolicitantePatrimonio", defaultValue = "-99.0")
    protected double v49DsolicitantePatrimonio;
    @XmlElement(name = "v4r04SfMontoDeudCredHipo", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v4R04SfMontoDeudCredHipo;
    @XmlElement(name = "v50dsolicitanteTipoActividad", defaultValue = "-99")
    protected long v50DsolicitanteTipoActividad;
    @XmlElement(name = "v51dsolicitanteTipoEmpleo", defaultValue = "-99")
    protected long v51DsolicitanteTipoEmpleo;
    @XmlElement(name = "v52dsolicitanteFechInicioEmpleoActual", defaultValue = "-99")
    protected long v52DsolicitanteFechInicioEmpleoActual;
    @XmlElement(name = "v53dsolicitanteFechInicioEmpleoAnterior", defaultValue = "-99")
    protected long v53DsolicitanteFechInicioEmpleoAnterior;
    @XmlElement(name = "v54dsolicitanteFechTerminoEmpleoAnterior", defaultValue = "-99")
    protected long v54DsolicitanteFechTerminoEmpleoAnterior;
    @XmlElement(name = "v5r04SfMontoLineCred", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v5R04SfMontoLineCred;
    @XmlElement(name = "v64eexternDiasMora", defaultValue = "-99")
    protected long v64EexternDiasMora;
    @XmlElement(name = "v65eexternSituacionCuenta", defaultValue = "-99")
    protected long v65EexternSituacionCuenta;
    @XmlElement(name = "v66eexternEstado", defaultValue = "-99")
    protected long v66EexternEstado;
    @XmlElement(name = "v67eexternScoreBanco", defaultValue = "-99")
    protected long v67EexternScoreBanco;
    @XmlElement(name = "v68eexternScoreCmr", defaultValue = "-99")
    protected long v68EexternScoreCmr;
    @XmlElement(name = "v69eexternHabitoPago", type = Long.class, defaultValue = "-99")
    @Size(min = 6, max = 6)
    protected List<Long> v69EexternHabitoPago;
    @XmlElement(name = "v6r04SfNumInstAcreedoras", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v6R04SfNumInstAcreedoras;
    @XmlElement(name = "v70eexternActividad", defaultValue = "-99")
    protected long v70EexternActividad;
    @XmlElement(name = "v71eexternCupo", defaultValue = "-99.0")
    protected double v71EexternCupo;
    @XmlElement(name = "v72eexternFechNacimiento", defaultValue = "|")
    protected String v72EexternFechNacimiento;
    @XmlElement(name = "v73eexternFechIngreso", defaultValue = "|")
    protected String v73EexternFechIngreso;
    @XmlElement(name = "v74eexternTipoVivienda", defaultValue = "-99")
    protected long v74EexternTipoVivienda;
    @XmlElement(name = "v75eexternMarcaActivo", defaultValue = "|")
    protected String v75EexternMarcaActivo;
    @XmlElement(name = "v76eexternMarcaSuperAvancista", defaultValue = "|")
    protected String v76EexternMarcaSuperAvancista;
    @XmlElement(name = "v77eexternMarcaRenegociado", defaultValue = "|")
    protected String v77EexternMarcaRenegociado;
    @XmlElement(name = "v78eexternFechRene", defaultValue = "|")
    protected String v78EexternFechRene;
    @XmlElement(name = "v79eexternRenta", defaultValue = "-99.0")
    protected double v79EexternRenta;
    @XmlElement(name = "v7r04SfMontoDeudDireMoro3090", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v7R04SfMontoDeudDireMoro3090;
    @XmlElement(name = "v80eexternRentaAvalCode", defaultValue = "-99.0")
    protected double v80EexternRentaAvalCode;
    @XmlElement(name = "v81eexternTipoRentacomprobada", required = true, defaultValue = "|")
    protected String v81EexternTipoRentacomprobada;
    @XmlElement(name = "v82eexternFechActualizacionRenta", defaultValue = "|")
    protected String v82EexternFechActualizacionRenta;
    @XmlElement(name = "v83eexternSaldoDeudaTarj", defaultValue = "-99.0")
    protected double v83EexternSaldoDeudaTarj;
    @XmlElement(name = "v84eexternSaldoDeudaConsumo", defaultValue = "-99.0")
    protected double v84EexternSaldoDeudaConsumo;
    @XmlElement(name = "v85eexternSaldoDeudaTarjAvalCode", defaultValue = "-99.0")
    protected double v85EexternSaldoDeudaTarjAvalCode;
    @XmlElement(name = "v86eexternSaldoDeudaConsumoAvalCode", defaultValue = "-99.0")
    protected double v86EexternSaldoDeudaConsumoAvalCode;
    @XmlElement(name = "v87eexternUltimaFechaPago", defaultValue = "|")
    protected String v87EexternUltimaFechaPago;
    @XmlElement(name = "v88eexternMarcaPremiumElite", defaultValue = "|")
    protected String v88EexternMarcaPremiumElite;
    @XmlElement(name = "v89eexternTipoProdcto", type = Long.class, defaultValue = "-99")
    @Size(min = 4, max = 4)
    protected List<Long> v89EexternTipoProdcto;
    @XmlElement(name = "v8r04SfMontoDeudDireVencida", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v8R04SfMontoDeudDireVencida;
    @XmlElement(name = "v8r04SfMontoDeudIndiVencida", defaultValue = "-99")
    protected long v8R04SfMontoDeudIndiVencida;
    @XmlElement(name = "v90dsolicitudCanal", defaultValue = "-99")
    protected long v90DsolicitudCanal;
    @XmlElement(name = "v91dsolicitudSucursal", defaultValue = "-99")
    protected long v91DsolicitudSucursal;
    @XmlElement(name = "v92dsolicitudCodEjecutivo", defaultValue = "-99")
    protected long v92DsolicitudCodEjecutivo;
    @XmlElement(name = "v93dsolicitudUfDia", defaultValue = "-99.0")
    protected double v93DsolicitudUfDia;
    @XmlElement(name = "v94dsolicitudDolarDia", defaultValue = "-99.0")
    protected double v94DsolicitudDolarDia;
    @XmlElement(name = "v95dsolicitudIdLlamadoMotor", defaultValue = "-99")
    protected long v95DsolicitudIdLlamadoMotor;
    @XmlElement(name = "v96dsolicitudCodiCanalDealer", defaultValue = "-99")
    protected long v96DsolicitudCodiCanalDealer;
    @XmlElement(name = "v97dsolicitudTipoConvenio", defaultValue = "-99")
    protected long v97DsolicitudTipoConvenio;
    @XmlElement(name = "v98dsolicitudClasConvenio", defaultValue = "-99")
    protected long v98DsolicitudClasConvenio;
    @XmlElement(name = "v99dsolicitudMarcaEstadConvenio", defaultValue = "|")
    protected String v99DsolicitudMarcaEstadConvenio;
    @XmlElement(name = "v9r04SfMontoDeudCastDirec", type = Long.class, defaultValue = "-99")
    @Size(min = 24, max = 24)
    protected List<Long> v9R04SfMontoDeudCastDirec;

    /**
     * Obtiene el valor de la propiedad v100DsolicitudPorcDescAutorizadoConv.
     * 
     */
    public double getV100DsolicitudPorcDescAutorizadoConv() {
        return v100DsolicitudPorcDescAutorizadoConv;
    }

    /**
     * Define el valor de la propiedad v100DsolicitudPorcDescAutorizadoConv.
     * 
     */
    public void setV100DsolicitudPorcDescAutorizadoConv(double value) {
        this.v100DsolicitudPorcDescAutorizadoConv = value;
    }

    /**
     * Obtiene el valor de la propiedad v101DsolicitudPorcMaximaCuotaBf.
     * 
     */
    public double getV101DsolicitudPorcMaximaCuotaBf() {
        return v101DsolicitudPorcMaximaCuotaBf;
    }

    /**
     * Define el valor de la propiedad v101DsolicitudPorcMaximaCuotaBf.
     * 
     */
    public void setV101DsolicitudPorcMaximaCuotaBf(double value) {
        this.v101DsolicitudPorcMaximaCuotaBf = value;
    }

    /**
     * Obtiene el valor de la propiedad v102DsolicitudTitular.
     * 
     */
    public long getV102DsolicitudTitular() {
        return v102DsolicitudTitular;
    }

    /**
     * Define el valor de la propiedad v102DsolicitudTitular.
     * 
     */
    public void setV102DsolicitudTitular(long value) {
        this.v102DsolicitudTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad v103DsolicitudReEval.
     * 
     */
    public long getV103DsolicitudReEval() {
        return v103DsolicitudReEval;
    }

    /**
     * Define el valor de la propiedad v103DsolicitudReEval.
     * 
     */
    public void setV103DsolicitudReEval(long value) {
        this.v103DsolicitudReEval = value;
    }

    /**
     * Obtiene el valor de la propiedad v104DsolicitudInterviniente.
     * 
     */
    public long getV104DsolicitudInterviniente() {
        return v104DsolicitudInterviniente;
    }

    /**
     * Define el valor de la propiedad v104DsolicitudInterviniente.
     * 
     */
    public void setV104DsolicitudInterviniente(long value) {
        this.v104DsolicitudInterviniente = value;
    }

    /**
     * Obtiene el valor de la propiedad v105DsolicitudMarcatoSolicitado.
     * 
     */
    public long getV105DsolicitudMarcatoSolicitado() {
        return v105DsolicitudMarcatoSolicitado;
    }

    /**
     * Define el valor de la propiedad v105DsolicitudMarcatoSolicitado.
     * 
     */
    public void setV105DsolicitudMarcatoSolicitado(long value) {
        this.v105DsolicitudMarcatoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad v10R04SfMontoDeudIndiVige.
     * 
     */
    public long getV10R04SfMontoDeudIndiVige() {
        return v10R04SfMontoDeudIndiVige;
    }

    /**
     * Define el valor de la propiedad v10R04SfMontoDeudIndiVige.
     * 
     */
    public void setV10R04SfMontoDeudIndiVige(long value) {
        this.v10R04SfMontoDeudIndiVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v119DsolicitudMarcaPreAprobado.
     * 
     */
    public long getV119DsolicitudMarcaPreAprobado() {
        return v119DsolicitudMarcaPreAprobado;
    }

    /**
     * Define el valor de la propiedad v119DsolicitudMarcaPreAprobado.
     * 
     */
    public void setV119DsolicitudMarcaPreAprobado(long value) {
        this.v119DsolicitudMarcaPreAprobado = value;
    }

    /**
     * Obtiene el valor de la propiedad v11R04SfMontoDeudIndiVencida.
     * 
     */
    public long getV11R04SfMontoDeudIndiVencida() {
        return v11R04SfMontoDeudIndiVencida;
    }

    /**
     * Define el valor de la propiedad v11R04SfMontoDeudIndiVencida.
     * 
     */
    public void setV11R04SfMontoDeudIndiVencida(long value) {
        this.v11R04SfMontoDeudIndiVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad v120DsolicitudFechUltimaLlamadaEval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV120DsolicitudFechUltimaLlamadaEval() {
        return v120DsolicitudFechUltimaLlamadaEval;
    }

    /**
     * Define el valor de la propiedad v120DsolicitudFechUltimaLlamadaEval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV120DsolicitudFechUltimaLlamadaEval(String value) {
        this.v120DsolicitudFechUltimaLlamadaEval = value;
    }

    /**
     * Obtiene el valor de la propiedad v121DsolicitudNumIteracion.
     * 
     */
    public long getV121DsolicitudNumIteracion() {
        return v121DsolicitudNumIteracion;
    }

    /**
     * Define el valor de la propiedad v121DsolicitudNumIteracion.
     * 
     */
    public void setV121DsolicitudNumIteracion(long value) {
        this.v121DsolicitudNumIteracion = value;
    }

    /**
     * Obtiene el valor de la propiedad v122DcexistDeudaMaximaMoraClieUltimos3Meses.
     * 
     */
    public double getV122DcexistDeudaMaximaMoraClieUltimos3Meses() {
        return v122DcexistDeudaMaximaMoraClieUltimos3Meses;
    }

    /**
     * Define el valor de la propiedad v122DcexistDeudaMaximaMoraClieUltimos3Meses.
     * 
     */
    public void setV122DcexistDeudaMaximaMoraClieUltimos3Meses(double value) {
        this.v122DcexistDeudaMaximaMoraClieUltimos3Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v123DcexistMaximaMoraClieUltimos3Meses.
     * 
     */
    public long getV123DcexistMaximaMoraClieUltimos3Meses() {
        return v123DcexistMaximaMoraClieUltimos3Meses;
    }

    /**
     * Define el valor de la propiedad v123DcexistMaximaMoraClieUltimos3Meses.
     * 
     */
    public void setV123DcexistMaximaMoraClieUltimos3Meses(long value) {
        this.v123DcexistMaximaMoraClieUltimos3Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v124DcexistMaximaMoraClieUltimos6Meses.
     * 
     */
    public long getV124DcexistMaximaMoraClieUltimos6Meses() {
        return v124DcexistMaximaMoraClieUltimos6Meses;
    }

    /**
     * Define el valor de la propiedad v124DcexistMaximaMoraClieUltimos6Meses.
     * 
     */
    public void setV124DcexistMaximaMoraClieUltimos6Meses(long value) {
        this.v124DcexistMaximaMoraClieUltimos6Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v125DcexistMaximaMoraClieUltimos9Meses.
     * 
     */
    public long getV125DcexistMaximaMoraClieUltimos9Meses() {
        return v125DcexistMaximaMoraClieUltimos9Meses;
    }

    /**
     * Define el valor de la propiedad v125DcexistMaximaMoraClieUltimos9Meses.
     * 
     */
    public void setV125DcexistMaximaMoraClieUltimos9Meses(long value) {
        this.v125DcexistMaximaMoraClieUltimos9Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v126DcexistMoraClieUltimos12Meses.
     * 
     */
    public long getV126DcexistMoraClieUltimos12Meses() {
        return v126DcexistMoraClieUltimos12Meses;
    }

    /**
     * Define el valor de la propiedad v126DcexistMoraClieUltimos12Meses.
     * 
     */
    public void setV126DcexistMoraClieUltimos12Meses(long value) {
        this.v126DcexistMoraClieUltimos12Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v127DcexistMaximaMoraClieUltimos18Meses.
     * 
     */
    public long getV127DcexistMaximaMoraClieUltimos18Meses() {
        return v127DcexistMaximaMoraClieUltimos18Meses;
    }

    /**
     * Define el valor de la propiedad v127DcexistMaximaMoraClieUltimos18Meses.
     * 
     */
    public void setV127DcexistMaximaMoraClieUltimos18Meses(long value) {
        this.v127DcexistMaximaMoraClieUltimos18Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v128DcexistMoraClieUltimos24Meses.
     * 
     */
    public long getV128DcexistMoraClieUltimos24Meses() {
        return v128DcexistMoraClieUltimos24Meses;
    }

    /**
     * Define el valor de la propiedad v128DcexistMoraClieUltimos24Meses.
     * 
     */
    public void setV128DcexistMoraClieUltimos24Meses(long value) {
        this.v128DcexistMoraClieUltimos24Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v129DcexistDeudaConsumoAlDia.
     * 
     */
    public double getV129DcexistDeudaConsumoAlDia() {
        return v129DcexistDeudaConsumoAlDia;
    }

    /**
     * Define el valor de la propiedad v129DcexistDeudaConsumoAlDia.
     * 
     */
    public void setV129DcexistDeudaConsumoAlDia(double value) {
        this.v129DcexistDeudaConsumoAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad v12R04SfMontoDeudCastIndirecta.
     * 
     */
    public long getV12R04SfMontoDeudCastIndirecta() {
        return v12R04SfMontoDeudCastIndirecta;
    }

    /**
     * Define el valor de la propiedad v12R04SfMontoDeudCastIndirecta.
     * 
     */
    public void setV12R04SfMontoDeudCastIndirecta(long value) {
        this.v12R04SfMontoDeudCastIndirecta = value;
    }

    /**
     * Obtiene el valor de la propiedad v130DcexistDeudaConsumoMorosa.
     * 
     */
    public double getV130DcexistDeudaConsumoMorosa() {
        return v130DcexistDeudaConsumoMorosa;
    }

    /**
     * Define el valor de la propiedad v130DcexistDeudaConsumoMorosa.
     * 
     */
    public void setV130DcexistDeudaConsumoMorosa(double value) {
        this.v130DcexistDeudaConsumoMorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad v131DcexistDeudaConsumoVencida.
     * 
     */
    public double getV131DcexistDeudaConsumoVencida() {
        return v131DcexistDeudaConsumoVencida;
    }

    /**
     * Define el valor de la propiedad v131DcexistDeudaConsumoVencida.
     * 
     */
    public void setV131DcexistDeudaConsumoVencida(double value) {
        this.v131DcexistDeudaConsumoVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad v132DcexistDeudaConsumoCastig.
     * 
     */
    public double getV132DcexistDeudaConsumoCastig() {
        return v132DcexistDeudaConsumoCastig;
    }

    /**
     * Define el valor de la propiedad v132DcexistDeudaConsumoCastig.
     * 
     */
    public void setV132DcexistDeudaConsumoCastig(double value) {
        this.v132DcexistDeudaConsumoCastig = value;
    }

    /**
     * Obtiene el valor de la propiedad v133DcexistDeudaConsumoAvalCode.
     * 
     */
    public double getV133DcexistDeudaConsumoAvalCode() {
        return v133DcexistDeudaConsumoAvalCode;
    }

    /**
     * Define el valor de la propiedad v133DcexistDeudaConsumoAvalCode.
     * 
     */
    public void setV133DcexistDeudaConsumoAvalCode(double value) {
        this.v133DcexistDeudaConsumoAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v134DcexistSumaValorCuotasConsumoVigeS.
     * 
     */
    public double getV134DcexistSumaValorCuotasConsumoVigeS() {
        return v134DcexistSumaValorCuotasConsumoVigeS;
    }

    /**
     * Define el valor de la propiedad v134DcexistSumaValorCuotasConsumoVigeS.
     * 
     */
    public void setV134DcexistSumaValorCuotasConsumoVigeS(double value) {
        this.v134DcexistSumaValorCuotasConsumoVigeS = value;
    }

    /**
     * Obtiene el valor de la propiedad v135DcexistValorCuotaConsumoVigeAvalCode.
     * 
     */
    public double getV135DcexistValorCuotaConsumoVigeAvalCode() {
        return v135DcexistValorCuotaConsumoVigeAvalCode;
    }

    /**
     * Define el valor de la propiedad v135DcexistValorCuotaConsumoVigeAvalCode.
     * 
     */
    public void setV135DcexistValorCuotaConsumoVigeAvalCode(double value) {
        this.v135DcexistValorCuotaConsumoVigeAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v136DcexistDeudaConsumoCastigHistoriPeriodo.
     * 
     */
    public double getV136DcexistDeudaConsumoCastigHistoriPeriodo() {
        return v136DcexistDeudaConsumoCastigHistoriPeriodo;
    }

    /**
     * Define el valor de la propiedad v136DcexistDeudaConsumoCastigHistoriPeriodo.
     * 
     */
    public void setV136DcexistDeudaConsumoCastigHistoriPeriodo(double value) {
        this.v136DcexistDeudaConsumoCastigHistoriPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad v137DcexistUltimaFechCastigoConsumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV137DcexistUltimaFechCastigoConsumo() {
        return v137DcexistUltimaFechCastigoConsumo;
    }

    /**
     * Define el valor de la propiedad v137DcexistUltimaFechCastigoConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV137DcexistUltimaFechCastigoConsumo(String value) {
        this.v137DcexistUltimaFechCastigoConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v138DcexistCantCredConsumoViges.
     * 
     */
    public long getV138DcexistCantCredConsumoViges() {
        return v138DcexistCantCredConsumoViges;
    }

    /**
     * Define el valor de la propiedad v138DcexistCantCredConsumoViges.
     * 
     */
    public void setV138DcexistCantCredConsumoViges(long value) {
        this.v138DcexistCantCredConsumoViges = value;
    }

    /**
     * Obtiene el valor de la propiedad v139DcexistCantCredPagadosPeriodo.
     * 
     */
    public long getV139DcexistCantCredPagadosPeriodo() {
        return v139DcexistCantCredPagadosPeriodo;
    }

    /**
     * Define el valor de la propiedad v139DcexistCantCredPagadosPeriodo.
     * 
     */
    public void setV139DcexistCantCredPagadosPeriodo(long value) {
        this.v139DcexistCantCredPagadosPeriodo = value;
    }

    /**
     * Gets the value of the v13R04SfFechaPeriodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v13R04SfFechaPeriodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV13R04SfFechaPeriodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV13R04SfFechaPeriodo() {
        if (v13R04SfFechaPeriodo == null) {
            v13R04SfFechaPeriodo = new ArrayList<Long>();
        }
        return this.v13R04SfFechaPeriodo;
    }

    /**
     * Obtiene el valor de la propiedad v140DcexistindicadorPagoCuotaOperConsumo.
     * 
     */
    public double getV140DcexistindicadorPagoCuotaOperConsumo() {
        return v140DcexistindicadorPagoCuotaOperConsumo;
    }

    /**
     * Define el valor de la propiedad v140DcexistindicadorPagoCuotaOperConsumo.
     * 
     */
    public void setV140DcexistindicadorPagoCuotaOperConsumo(double value) {
        this.v140DcexistindicadorPagoCuotaOperConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v141DcexistCantCuotasPagadasCredConsumo.
     * 
     */
    public long getV141DcexistCantCuotasPagadasCredConsumo() {
        return v141DcexistCantCuotasPagadasCredConsumo;
    }

    /**
     * Define el valor de la propiedad v141DcexistCantCuotasPagadasCredConsumo.
     * 
     */
    public void setV141DcexistCantCuotasPagadasCredConsumo(long value) {
        this.v141DcexistCantCuotasPagadasCredConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v142DcexistDeudaComeCastig.
     * 
     */
    public double getV142DcexistDeudaComeCastig() {
        return v142DcexistDeudaComeCastig;
    }

    /**
     * Define el valor de la propiedad v142DcexistDeudaComeCastig.
     * 
     */
    public void setV142DcexistDeudaComeCastig(double value) {
        this.v142DcexistDeudaComeCastig = value;
    }

    /**
     * Obtiene el valor de la propiedad v143DcexistDeudaComerc.
     * 
     */
    public double getV143DcexistDeudaComerc() {
        return v143DcexistDeudaComerc;
    }

    /**
     * Define el valor de la propiedad v143DcexistDeudaComerc.
     * 
     */
    public void setV143DcexistDeudaComerc(double value) {
        this.v143DcexistDeudaComerc = value;
    }

    /**
     * Obtiene el valor de la propiedad v144DcexistDeudaComeAvalCode.
     * 
     */
    public double getV144DcexistDeudaComeAvalCode() {
        return v144DcexistDeudaComeAvalCode;
    }

    /**
     * Define el valor de la propiedad v144DcexistDeudaComeAvalCode.
     * 
     */
    public void setV144DcexistDeudaComeAvalCode(double value) {
        this.v144DcexistDeudaComeAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v145DcexistValorCuotaComercVige.
     * 
     */
    public double getV145DcexistValorCuotaComercVige() {
        return v145DcexistValorCuotaComercVige;
    }

    /**
     * Define el valor de la propiedad v145DcexistValorCuotaComercVige.
     * 
     */
    public void setV145DcexistValorCuotaComercVige(double value) {
        this.v145DcexistValorCuotaComercVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v146DcexistSumaValorCuotaComeVigeAvalCode.
     * 
     */
    public double getV146DcexistSumaValorCuotaComeVigeAvalCode() {
        return v146DcexistSumaValorCuotaComeVigeAvalCode;
    }

    /**
     * Define el valor de la propiedad v146DcexistSumaValorCuotaComeVigeAvalCode.
     * 
     */
    public void setV146DcexistSumaValorCuotaComeVigeAvalCode(double value) {
        this.v146DcexistSumaValorCuotaComeVigeAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v147DcexistDeudaComeCastigHistoriPeriodo.
     * 
     */
    public double getV147DcexistDeudaComeCastigHistoriPeriodo() {
        return v147DcexistDeudaComeCastigHistoriPeriodo;
    }

    /**
     * Define el valor de la propiedad v147DcexistDeudaComeCastigHistoriPeriodo.
     * 
     */
    public void setV147DcexistDeudaComeCastigHistoriPeriodo(double value) {
        this.v147DcexistDeudaComeCastigHistoriPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad v148DcexistUltimaFechCastigoComerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV148DcexistUltimaFechCastigoComerc() {
        return v148DcexistUltimaFechCastigoComerc;
    }

    /**
     * Define el valor de la propiedad v148DcexistUltimaFechCastigoComerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV148DcexistUltimaFechCastigoComerc(String value) {
        this.v148DcexistUltimaFechCastigoComerc = value;
    }

    /**
     * Obtiene el valor de la propiedad v149DcexistTarjCredDia.
     * 
     */
    public double getV149DcexistTarjCredDia() {
        return v149DcexistTarjCredDia;
    }

    /**
     * Define el valor de la propiedad v149DcexistTarjCredDia.
     * 
     */
    public void setV149DcexistTarjCredDia(double value) {
        this.v149DcexistTarjCredDia = value;
    }

    /**
     * Obtiene el valor de la propiedad v14R04SfMontoDeudComeCodeAval.
     * 
     */
    public long getV14R04SfMontoDeudComeCodeAval() {
        return v14R04SfMontoDeudComeCodeAval;
    }

    /**
     * Define el valor de la propiedad v14R04SfMontoDeudComeCodeAval.
     * 
     */
    public void setV14R04SfMontoDeudComeCodeAval(long value) {
        this.v14R04SfMontoDeudComeCodeAval = value;
    }

    /**
     * Obtiene el valor de la propiedad v150DcexistDeudaTarjCredMorosa.
     * 
     */
    public double getV150DcexistDeudaTarjCredMorosa() {
        return v150DcexistDeudaTarjCredMorosa;
    }

    /**
     * Define el valor de la propiedad v150DcexistDeudaTarjCredMorosa.
     * 
     */
    public void setV150DcexistDeudaTarjCredMorosa(double value) {
        this.v150DcexistDeudaTarjCredMorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad v151DcexistDeudaTarjCredVencida.
     * 
     */
    public double getV151DcexistDeudaTarjCredVencida() {
        return v151DcexistDeudaTarjCredVencida;
    }

    /**
     * Define el valor de la propiedad v151DcexistDeudaTarjCredVencida.
     * 
     */
    public void setV151DcexistDeudaTarjCredVencida(double value) {
        this.v151DcexistDeudaTarjCredVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad v152DcexistDeudaTarjCredCastig.
     * 
     */
    public double getV152DcexistDeudaTarjCredCastig() {
        return v152DcexistDeudaTarjCredCastig;
    }

    /**
     * Define el valor de la propiedad v152DcexistDeudaTarjCredCastig.
     * 
     */
    public void setV152DcexistDeudaTarjCredCastig(double value) {
        this.v152DcexistDeudaTarjCredCastig = value;
    }

    /**
     * Obtiene el valor de la propiedad v153DcexistDeudaTarjAvalCode.
     * 
     */
    public double getV153DcexistDeudaTarjAvalCode() {
        return v153DcexistDeudaTarjAvalCode;
    }

    /**
     * Define el valor de la propiedad v153DcexistDeudaTarjAvalCode.
     * 
     */
    public void setV153DcexistDeudaTarjAvalCode(double value) {
        this.v153DcexistDeudaTarjAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v154DcexistTarjCredCastigHistoriPeriodo.
     * 
     */
    public double getV154DcexistTarjCredCastigHistoriPeriodo() {
        return v154DcexistTarjCredCastigHistoriPeriodo;
    }

    /**
     * Define el valor de la propiedad v154DcexistTarjCredCastigHistoriPeriodo.
     * 
     */
    public void setV154DcexistTarjCredCastigHistoriPeriodo(double value) {
        this.v154DcexistTarjCredCastigHistoriPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad v155DcexistCupoTarjCred.
     * 
     */
    public double getV155DcexistCupoTarjCred() {
        return v155DcexistCupoTarjCred;
    }

    /**
     * Define el valor de la propiedad v155DcexistCupoTarjCred.
     * 
     */
    public void setV155DcexistCupoTarjCred(double value) {
        this.v155DcexistCupoTarjCred = value;
    }

    /**
     * Obtiene el valor de la propiedad v156DcexistCupoTarjCredAvalCode.
     * 
     */
    public double getV156DcexistCupoTarjCredAvalCode() {
        return v156DcexistCupoTarjCredAvalCode;
    }

    /**
     * Define el valor de la propiedad v156DcexistCupoTarjCredAvalCode.
     * 
     */
    public void setV156DcexistCupoTarjCredAvalCode(double value) {
        this.v156DcexistCupoTarjCredAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v157DcexistDeudaHipoAlDia.
     * 
     */
    public double getV157DcexistDeudaHipoAlDia() {
        return v157DcexistDeudaHipoAlDia;
    }

    /**
     * Define el valor de la propiedad v157DcexistDeudaHipoAlDia.
     * 
     */
    public void setV157DcexistDeudaHipoAlDia(double value) {
        this.v157DcexistDeudaHipoAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad v158DcexistDeudaHipoMorosa.
     * 
     */
    public double getV158DcexistDeudaHipoMorosa() {
        return v158DcexistDeudaHipoMorosa;
    }

    /**
     * Define el valor de la propiedad v158DcexistDeudaHipoMorosa.
     * 
     */
    public void setV158DcexistDeudaHipoMorosa(double value) {
        this.v158DcexistDeudaHipoMorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad v159DcexistDeudaHipoVencida.
     * 
     */
    public double getV159DcexistDeudaHipoVencida() {
        return v159DcexistDeudaHipoVencida;
    }

    /**
     * Define el valor de la propiedad v159DcexistDeudaHipoVencida.
     * 
     */
    public void setV159DcexistDeudaHipoVencida(double value) {
        this.v159DcexistDeudaHipoVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad v15R04SfMontoDeudCredConsCodeAval.
     * 
     */
    public long getV15R04SfMontoDeudCredConsCodeAval() {
        return v15R04SfMontoDeudCredConsCodeAval;
    }

    /**
     * Define el valor de la propiedad v15R04SfMontoDeudCredConsCodeAval.
     * 
     */
    public void setV15R04SfMontoDeudCredConsCodeAval(long value) {
        this.v15R04SfMontoDeudCredConsCodeAval = value;
    }

    /**
     * Obtiene el valor de la propiedad v160DcexistDeudaHipoCastig.
     * 
     */
    public double getV160DcexistDeudaHipoCastig() {
        return v160DcexistDeudaHipoCastig;
    }

    /**
     * Define el valor de la propiedad v160DcexistDeudaHipoCastig.
     * 
     */
    public void setV160DcexistDeudaHipoCastig(double value) {
        this.v160DcexistDeudaHipoCastig = value;
    }

    /**
     * Obtiene el valor de la propiedad v161DcexistDeudaHipoAvalCode.
     * 
     */
    public double getV161DcexistDeudaHipoAvalCode() {
        return v161DcexistDeudaHipoAvalCode;
    }

    /**
     * Define el valor de la propiedad v161DcexistDeudaHipoAvalCode.
     * 
     */
    public void setV161DcexistDeudaHipoAvalCode(double value) {
        this.v161DcexistDeudaHipoAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v162DcexistSumaValorDividVige.
     * 
     */
    public double getV162DcexistSumaValorDividVige() {
        return v162DcexistSumaValorDividVige;
    }

    /**
     * Define el valor de la propiedad v162DcexistSumaValorDividVige.
     * 
     */
    public void setV162DcexistSumaValorDividVige(double value) {
        this.v162DcexistSumaValorDividVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v163DcexistSumaValorDividVigeAvalCode.
     * 
     */
    public double getV163DcexistSumaValorDividVigeAvalCode() {
        return v163DcexistSumaValorDividVigeAvalCode;
    }

    /**
     * Define el valor de la propiedad v163DcexistSumaValorDividVigeAvalCode.
     * 
     */
    public void setV163DcexistSumaValorDividVigeAvalCode(double value) {
        this.v163DcexistSumaValorDividVigeAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v164DcexistDeudaHipoCastigHistoriPeriodo.
     * 
     */
    public double getV164DcexistDeudaHipoCastigHistoriPeriodo() {
        return v164DcexistDeudaHipoCastigHistoriPeriodo;
    }

    /**
     * Define el valor de la propiedad v164DcexistDeudaHipoCastigHistoriPeriodo.
     * 
     */
    public void setV164DcexistDeudaHipoCastigHistoriPeriodo(double value) {
        this.v164DcexistDeudaHipoCastigHistoriPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad v165DcexistDeudaLineaSobreGiroCastig.
     * 
     */
    public double getV165DcexistDeudaLineaSobreGiroCastig() {
        return v165DcexistDeudaLineaSobreGiroCastig;
    }

    /**
     * Define el valor de la propiedad v165DcexistDeudaLineaSobreGiroCastig.
     * 
     */
    public void setV165DcexistDeudaLineaSobreGiroCastig(double value) {
        this.v165DcexistDeudaLineaSobreGiroCastig = value;
    }

    /**
     * Obtiene el valor de la propiedad v166DcexistDeudaLineaSobreGiroAvalCode.
     * 
     */
    public double getV166DcexistDeudaLineaSobreGiroAvalCode() {
        return v166DcexistDeudaLineaSobreGiroAvalCode;
    }

    /**
     * Define el valor de la propiedad v166DcexistDeudaLineaSobreGiroAvalCode.
     * 
     */
    public void setV166DcexistDeudaLineaSobreGiroAvalCode(double value) {
        this.v166DcexistDeudaLineaSobreGiroAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v167DcexistDeudaLineaSobreGiro.
     * 
     */
    public double getV167DcexistDeudaLineaSobreGiro() {
        return v167DcexistDeudaLineaSobreGiro;
    }

    /**
     * Define el valor de la propiedad v167DcexistDeudaLineaSobreGiro.
     * 
     */
    public void setV167DcexistDeudaLineaSobreGiro(double value) {
        this.v167DcexistDeudaLineaSobreGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad v168DcexistCupLineaSobreGiro.
     * 
     */
    public double getV168DcexistCupLineaSobreGiro() {
        return v168DcexistCupLineaSobreGiro;
    }

    /**
     * Define el valor de la propiedad v168DcexistCupLineaSobreGiro.
     * 
     */
    public void setV168DcexistCupLineaSobreGiro(double value) {
        this.v168DcexistCupLineaSobreGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad v169DcexistCupLineaSobreGiroAvalCode.
     * 
     */
    public double getV169DcexistCupLineaSobreGiroAvalCode() {
        return v169DcexistCupLineaSobreGiroAvalCode;
    }

    /**
     * Define el valor de la propiedad v169DcexistCupLineaSobreGiroAvalCode.
     * 
     */
    public void setV169DcexistCupLineaSobreGiroAvalCode(double value) {
        this.v169DcexistCupLineaSobreGiroAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v16R04SfMontoDeudCredHipoCodeAval.
     * 
     */
    public long getV16R04SfMontoDeudCredHipoCodeAval() {
        return v16R04SfMontoDeudCredHipoCodeAval;
    }

    /**
     * Define el valor de la propiedad v16R04SfMontoDeudCredHipoCodeAval.
     * 
     */
    public void setV16R04SfMontoDeudCredHipoCodeAval(long value) {
        this.v16R04SfMontoDeudCredHipoCodeAval = value;
    }

    /**
     * Obtiene el valor de la propiedad v170DcexistMaxDiasMoraConsumo.
     * 
     */
    public long getV170DcexistMaxDiasMoraConsumo() {
        return v170DcexistMaxDiasMoraConsumo;
    }

    /**
     * Define el valor de la propiedad v170DcexistMaxDiasMoraConsumo.
     * 
     */
    public void setV170DcexistMaxDiasMoraConsumo(long value) {
        this.v170DcexistMaxDiasMoraConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v171DcexistSumaMoraMaxDiasConsumo.
     * 
     */
    public double getV171DcexistSumaMoraMaxDiasConsumo() {
        return v171DcexistSumaMoraMaxDiasConsumo;
    }

    /**
     * Define el valor de la propiedad v171DcexistSumaMoraMaxDiasConsumo.
     * 
     */
    public void setV171DcexistSumaMoraMaxDiasConsumo(double value) {
        this.v171DcexistSumaMoraMaxDiasConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v172DcexistFechMaxDiasMoraConsumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV172DcexistFechMaxDiasMoraConsumo() {
        return v172DcexistFechMaxDiasMoraConsumo;
    }

    /**
     * Define el valor de la propiedad v172DcexistFechMaxDiasMoraConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV172DcexistFechMaxDiasMoraConsumo(String value) {
        this.v172DcexistFechMaxDiasMoraConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v173DcexistMaxDiasMoraComerc.
     * 
     */
    public long getV173DcexistMaxDiasMoraComerc() {
        return v173DcexistMaxDiasMoraComerc;
    }

    /**
     * Define el valor de la propiedad v173DcexistMaxDiasMoraComerc.
     * 
     */
    public void setV173DcexistMaxDiasMoraComerc(long value) {
        this.v173DcexistMaxDiasMoraComerc = value;
    }

    /**
     * Obtiene el valor de la propiedad v174DcexistMaxDiasMoraHipo.
     * 
     */
    public long getV174DcexistMaxDiasMoraHipo() {
        return v174DcexistMaxDiasMoraHipo;
    }

    /**
     * Define el valor de la propiedad v174DcexistMaxDiasMoraHipo.
     * 
     */
    public void setV174DcexistMaxDiasMoraHipo(long value) {
        this.v174DcexistMaxDiasMoraHipo = value;
    }

    /**
     * Obtiene el valor de la propiedad v175DcexistSumaMoraMaxDiasHipo.
     * 
     */
    public double getV175DcexistSumaMoraMaxDiasHipo() {
        return v175DcexistSumaMoraMaxDiasHipo;
    }

    /**
     * Define el valor de la propiedad v175DcexistSumaMoraMaxDiasHipo.
     * 
     */
    public void setV175DcexistSumaMoraMaxDiasHipo(double value) {
        this.v175DcexistSumaMoraMaxDiasHipo = value;
    }

    /**
     * Obtiene el valor de la propiedad v176DcexistFechMaxDiasMoraHipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV176DcexistFechMaxDiasMoraHipo() {
        return v176DcexistFechMaxDiasMoraHipo;
    }

    /**
     * Define el valor de la propiedad v176DcexistFechMaxDiasMoraHipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV176DcexistFechMaxDiasMoraHipo(String value) {
        this.v176DcexistFechMaxDiasMoraHipo = value;
    }

    /**
     * Obtiene el valor de la propiedad v177DcexistMaxDiasMoraSgnp.
     * 
     */
    public long getV177DcexistMaxDiasMoraSgnp() {
        return v177DcexistMaxDiasMoraSgnp;
    }

    /**
     * Define el valor de la propiedad v177DcexistMaxDiasMoraSgnp.
     * 
     */
    public void setV177DcexistMaxDiasMoraSgnp(long value) {
        this.v177DcexistMaxDiasMoraSgnp = value;
    }

    /**
     * Obtiene el valor de la propiedad v178DcexistMaxDiasMoraTarj.
     * 
     */
    public long getV178DcexistMaxDiasMoraTarj() {
        return v178DcexistMaxDiasMoraTarj;
    }

    /**
     * Define el valor de la propiedad v178DcexistMaxDiasMoraTarj.
     * 
     */
    public void setV178DcexistMaxDiasMoraTarj(long value) {
        this.v178DcexistMaxDiasMoraTarj = value;
    }

    /**
     * Obtiene el valor de la propiedad v179DcexistSumaMoraMaxDiasTarj.
     * 
     */
    public double getV179DcexistSumaMoraMaxDiasTarj() {
        return v179DcexistSumaMoraMaxDiasTarj;
    }

    /**
     * Define el valor de la propiedad v179DcexistSumaMoraMaxDiasTarj.
     * 
     */
    public void setV179DcexistSumaMoraMaxDiasTarj(double value) {
        this.v179DcexistSumaMoraMaxDiasTarj = value;
    }

    /**
     * Obtiene el valor de la propiedad v17R04SfMontoLineaCredCodeAval.
     * 
     */
    public long getV17R04SfMontoLineaCredCodeAval() {
        return v17R04SfMontoLineaCredCodeAval;
    }

    /**
     * Define el valor de la propiedad v17R04SfMontoLineaCredCodeAval.
     * 
     */
    public void setV17R04SfMontoLineaCredCodeAval(long value) {
        this.v17R04SfMontoLineaCredCodeAval = value;
    }

    /**
     * Obtiene el valor de la propiedad v180DcexistFechMaxDiasMoraTarj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV180DcexistFechMaxDiasMoraTarj() {
        return v180DcexistFechMaxDiasMoraTarj;
    }

    /**
     * Define el valor de la propiedad v180DcexistFechMaxDiasMoraTarj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV180DcexistFechMaxDiasMoraTarj(String value) {
        this.v180DcexistFechMaxDiasMoraTarj = value;
    }

    /**
     * Obtiene el valor de la propiedad v181DcexistCantSobreGiroSNoPactados.
     * 
     */
    public long getV181DcexistCantSobreGiroSNoPactados() {
        return v181DcexistCantSobreGiroSNoPactados;
    }

    /**
     * Define el valor de la propiedad v181DcexistCantSobreGiroSNoPactados.
     * 
     */
    public void setV181DcexistCantSobreGiroSNoPactados(long value) {
        this.v181DcexistCantSobreGiroSNoPactados = value;
    }

    /**
     * Obtiene el valor de la propiedad v182DcexistProtInternFormaVige.
     * 
     */
    public long getV182DcexistProtInternFormaVige() {
        return v182DcexistProtInternFormaVige;
    }

    /**
     * Define el valor de la propiedad v182DcexistProtInternFormaVige.
     * 
     */
    public void setV182DcexistProtInternFormaVige(long value) {
        this.v182DcexistProtInternFormaVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v183DcexistProtInternFormaHistoriPeriodo.
     * 
     */
    public long getV183DcexistProtInternFormaHistoriPeriodo() {
        return v183DcexistProtInternFormaHistoriPeriodo;
    }

    /**
     * Define el valor de la propiedad v183DcexistProtInternFormaHistoriPeriodo.
     * 
     */
    public void setV183DcexistProtInternFormaHistoriPeriodo(long value) {
        this.v183DcexistProtInternFormaHistoriPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad v184DcexistProtInternFondoVige.
     * 
     */
    public long getV184DcexistProtInternFondoVige() {
        return v184DcexistProtInternFondoVige;
    }

    /**
     * Define el valor de la propiedad v184DcexistProtInternFondoVige.
     * 
     */
    public void setV184DcexistProtInternFondoVige(long value) {
        this.v184DcexistProtInternFondoVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v185DcexistProtInternFondoHistoriPeriodo.
     * 
     */
    public long getV185DcexistProtInternFondoHistoriPeriodo() {
        return v185DcexistProtInternFondoHistoriPeriodo;
    }

    /**
     * Define el valor de la propiedad v185DcexistProtInternFondoHistoriPeriodo.
     * 
     */
    public void setV185DcexistProtInternFondoHistoriPeriodo(long value) {
        this.v185DcexistProtInternFondoHistoriPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad v186DcexistMontoRentaIngresada.
     * 
     */
    public double getV186DcexistMontoRentaIngresada() {
        return v186DcexistMontoRentaIngresada;
    }

    /**
     * Define el valor de la propiedad v186DcexistMontoRentaIngresada.
     * 
     */
    public void setV186DcexistMontoRentaIngresada(double value) {
        this.v186DcexistMontoRentaIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad v187DcexistTipoMontoRentaIngresada.
     * 
     */
    public double getV187DcexistTipoMontoRentaIngresada() {
        return v187DcexistTipoMontoRentaIngresada;
    }

    /**
     * Define el valor de la propiedad v187DcexistTipoMontoRentaIngresada.
     * 
     */
    public void setV187DcexistTipoMontoRentaIngresada(double value) {
        this.v187DcexistTipoMontoRentaIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad v188DcexistMontoRentaIngresadaAvalCode.
     * 
     */
    public double getV188DcexistMontoRentaIngresadaAvalCode() {
        return v188DcexistMontoRentaIngresadaAvalCode;
    }

    /**
     * Define el valor de la propiedad v188DcexistMontoRentaIngresadaAvalCode.
     * 
     */
    public void setV188DcexistMontoRentaIngresadaAvalCode(double value) {
        this.v188DcexistMontoRentaIngresadaAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v189DcexistTipoMontoRentaIngresadaAvalCode.
     * 
     */
    public double getV189DcexistTipoMontoRentaIngresadaAvalCode() {
        return v189DcexistTipoMontoRentaIngresadaAvalCode;
    }

    /**
     * Define el valor de la propiedad v189DcexistTipoMontoRentaIngresadaAvalCode.
     * 
     */
    public void setV189DcexistTipoMontoRentaIngresadaAvalCode(double value) {
        this.v189DcexistTipoMontoRentaIngresadaAvalCode = value;
    }

    /**
     * Gets the value of the v18DburoNProtestosImpagos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v18DburoNProtestosImpagos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV18DburoNProtestosImpagos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV18DburoNProtestosImpagos() {
        if (v18DburoNProtestosImpagos == null) {
            v18DburoNProtestosImpagos = new ArrayList<Long>();
        }
        return this.v18DburoNProtestosImpagos;
    }

    /**
     * Obtiene el valor de la propiedad v190DcexistMontoRentaCompro.
     * 
     */
    public double getV190DcexistMontoRentaCompro() {
        return v190DcexistMontoRentaCompro;
    }

    /**
     * Define el valor de la propiedad v190DcexistMontoRentaCompro.
     * 
     */
    public void setV190DcexistMontoRentaCompro(double value) {
        this.v190DcexistMontoRentaCompro = value;
    }

    /**
     * Obtiene el valor de la propiedad v191DcexistMontoRentaDeclarada.
     * 
     */
    public double getV191DcexistMontoRentaDeclarada() {
        return v191DcexistMontoRentaDeclarada;
    }

    /**
     * Define el valor de la propiedad v191DcexistMontoRentaDeclarada.
     * 
     */
    public void setV191DcexistMontoRentaDeclarada(double value) {
        this.v191DcexistMontoRentaDeclarada = value;
    }

    /**
     * Obtiene el valor de la propiedad v192DcexistMontoRentaUltimaEval.
     * 
     */
    public double getV192DcexistMontoRentaUltimaEval() {
        return v192DcexistMontoRentaUltimaEval;
    }

    /**
     * Define el valor de la propiedad v192DcexistMontoRentaUltimaEval.
     * 
     */
    public void setV192DcexistMontoRentaUltimaEval(double value) {
        this.v192DcexistMontoRentaUltimaEval = value;
    }

    /**
     * Obtiene el valor de la propiedad v193DcexistTipoMontoRentaUltimaEval.
     * 
     */
    public double getV193DcexistTipoMontoRentaUltimaEval() {
        return v193DcexistTipoMontoRentaUltimaEval;
    }

    /**
     * Define el valor de la propiedad v193DcexistTipoMontoRentaUltimaEval.
     * 
     */
    public void setV193DcexistTipoMontoRentaUltimaEval(double value) {
        this.v193DcexistTipoMontoRentaUltimaEval = value;
    }

    /**
     * Obtiene el valor de la propiedad v194DcexistMontoRentaComproAvalCode.
     * 
     */
    public double getV194DcexistMontoRentaComproAvalCode() {
        return v194DcexistMontoRentaComproAvalCode;
    }

    /**
     * Define el valor de la propiedad v194DcexistMontoRentaComproAvalCode.
     * 
     */
    public void setV194DcexistMontoRentaComproAvalCode(double value) {
        this.v194DcexistMontoRentaComproAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v195DcexistMontoRentaDeclaradaAvalCode.
     * 
     */
    public double getV195DcexistMontoRentaDeclaradaAvalCode() {
        return v195DcexistMontoRentaDeclaradaAvalCode;
    }

    /**
     * Define el valor de la propiedad v195DcexistMontoRentaDeclaradaAvalCode.
     * 
     */
    public void setV195DcexistMontoRentaDeclaradaAvalCode(double value) {
        this.v195DcexistMontoRentaDeclaradaAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v196DcexistMontoRentaEstimada.
     * 
     */
    public double getV196DcexistMontoRentaEstimada() {
        return v196DcexistMontoRentaEstimada;
    }

    /**
     * Define el valor de la propiedad v196DcexistMontoRentaEstimada.
     * 
     */
    public void setV196DcexistMontoRentaEstimada(double value) {
        this.v196DcexistMontoRentaEstimada = value;
    }

    /**
     * Obtiene el valor de la propiedad v197DcexistTipoRenta.
     * 
     */
    public long getV197DcexistTipoRenta() {
        return v197DcexistTipoRenta;
    }

    /**
     * Define el valor de la propiedad v197DcexistTipoRenta.
     * 
     */
    public void setV197DcexistTipoRenta(long value) {
        this.v197DcexistTipoRenta = value;
    }

    /**
     * Obtiene el valor de la propiedad v198DcexistOrigenRenta.
     * 
     */
    public long getV198DcexistOrigenRenta() {
        return v198DcexistOrigenRenta;
    }

    /**
     * Define el valor de la propiedad v198DcexistOrigenRenta.
     * 
     */
    public void setV198DcexistOrigenRenta(long value) {
        this.v198DcexistOrigenRenta = value;
    }

    /**
     * Obtiene el valor de la propiedad v199DcexistFechIngresoRentaCompro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV199DcexistFechIngresoRentaCompro() {
        return v199DcexistFechIngresoRentaCompro;
    }

    /**
     * Define el valor de la propiedad v199DcexistFechIngresoRentaCompro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV199DcexistFechIngresoRentaCompro(String value) {
        this.v199DcexistFechIngresoRentaCompro = value;
    }

    /**
     * Gets the value of the v19DburoNMorosidadad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v19DburoNMorosidadad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV19DburoNMorosidadad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV19DburoNMorosidadad() {
        if (v19DburoNMorosidadad == null) {
            v19DburoNMorosidadad = new ArrayList<Long>();
        }
        return this.v19DburoNMorosidadad;
    }

    /**
     * Gets the value of the v1R04SfMontoDeudDirecVige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v1R04SfMontoDeudDirecVige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV1R04SfMontoDeudDirecVige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV1R04SfMontoDeudDirecVige() {
        if (v1R04SfMontoDeudDirecVige == null) {
            v1R04SfMontoDeudDirecVige = new ArrayList<Long>();
        }
        return this.v1R04SfMontoDeudDirecVige;
    }

    /**
     * Obtiene el valor de la propiedad v200DcexistVigenciaFechCompro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV200DcexistVigenciaFechCompro() {
        return v200DcexistVigenciaFechCompro;
    }

    /**
     * Define el valor de la propiedad v200DcexistVigenciaFechCompro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV200DcexistVigenciaFechCompro(String value) {
        this.v200DcexistVigenciaFechCompro = value;
    }

    /**
     * Obtiene el valor de la propiedad v201DcexistMontoRentaEvalMasiva.
     * 
     */
    public double getV201DcexistMontoRentaEvalMasiva() {
        return v201DcexistMontoRentaEvalMasiva;
    }

    /**
     * Define el valor de la propiedad v201DcexistMontoRentaEvalMasiva.
     * 
     */
    public void setV201DcexistMontoRentaEvalMasiva(double value) {
        this.v201DcexistMontoRentaEvalMasiva = value;
    }

    /**
     * Obtiene el valor de la propiedad v202DcexistTipoMontoRentaEvalMasiva.
     * 
     */
    public double getV202DcexistTipoMontoRentaEvalMasiva() {
        return v202DcexistTipoMontoRentaEvalMasiva;
    }

    /**
     * Define el valor de la propiedad v202DcexistTipoMontoRentaEvalMasiva.
     * 
     */
    public void setV202DcexistTipoMontoRentaEvalMasiva(double value) {
        this.v202DcexistTipoMontoRentaEvalMasiva = value;
    }

    /**
     * Obtiene el valor de la propiedad v203DcexistMarcaCtaCorriente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV203DcexistMarcaCtaCorriente() {
        return v203DcexistMarcaCtaCorriente;
    }

    /**
     * Define el valor de la propiedad v203DcexistMarcaCtaCorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV203DcexistMarcaCtaCorriente(String value) {
        this.v203DcexistMarcaCtaCorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad v204DcexistOrigenCierreCtaCorriente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV204DcexistOrigenCierreCtaCorriente() {
        return v204DcexistOrigenCierreCtaCorriente;
    }

    /**
     * Define el valor de la propiedad v204DcexistOrigenCierreCtaCorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV204DcexistOrigenCierreCtaCorriente(String value) {
        this.v204DcexistOrigenCierreCtaCorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad v205DcexistMarcaCtaVistaVige.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV205DcexistMarcaCtaVistaVige() {
        return v205DcexistMarcaCtaVistaVige;
    }

    /**
     * Define el valor de la propiedad v205DcexistMarcaCtaVistaVige.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV205DcexistMarcaCtaVistaVige(String value) {
        this.v205DcexistMarcaCtaVistaVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v206DcexistMarcaGarantiasVigeAutomo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV206DcexistMarcaGarantiasVigeAutomo() {
        return v206DcexistMarcaGarantiasVigeAutomo;
    }

    /**
     * Define el valor de la propiedad v206DcexistMarcaGarantiasVigeAutomo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV206DcexistMarcaGarantiasVigeAutomo(String value) {
        this.v206DcexistMarcaGarantiasVigeAutomo = value;
    }

    /**
     * Obtiene el valor de la propiedad v207DcexistMontoAhorro.
     * 
     */
    public double getV207DcexistMontoAhorro() {
        return v207DcexistMontoAhorro;
    }

    /**
     * Define el valor de la propiedad v207DcexistMontoAhorro.
     * 
     */
    public void setV207DcexistMontoAhorro(double value) {
        this.v207DcexistMontoAhorro = value;
    }

    /**
     * Obtiene el valor de la propiedad v208DcexistMontoDap.
     * 
     */
    public double getV208DcexistMontoDap() {
        return v208DcexistMontoDap;
    }

    /**
     * Define el valor de la propiedad v208DcexistMontoDap.
     * 
     */
    public void setV208DcexistMontoDap(double value) {
        this.v208DcexistMontoDap = value;
    }

    /**
     * Obtiene el valor de la propiedad v209DcexistMontoFfmm.
     * 
     */
    public double getV209DcexistMontoFfmm() {
        return v209DcexistMontoFfmm;
    }

    /**
     * Define el valor de la propiedad v209DcexistMontoFfmm.
     * 
     */
    public void setV209DcexistMontoFfmm(double value) {
        this.v209DcexistMontoFfmm = value;
    }

    /**
     * Obtiene el valor de la propiedad v20DburoBoletinConcursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV20DburoBoletinConcursal() {
        return v20DburoBoletinConcursal;
    }

    /**
     * Define el valor de la propiedad v20DburoBoletinConcursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV20DburoBoletinConcursal(String value) {
        this.v20DburoBoletinConcursal = value;
    }

    /**
     * Gets the value of the v210DcexistOpNumOperCtaCorriente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v210DcexistOpNumOperCtaCorriente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV210DcexistOpNumOperCtaCorriente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV210DcexistOpNumOperCtaCorriente() {
        if (v210DcexistOpNumOperCtaCorriente == null) {
            v210DcexistOpNumOperCtaCorriente = new ArrayList<Long>();
        }
        return this.v210DcexistOpNumOperCtaCorriente;
    }

    /**
     * Gets the value of the v211DcexistOpMontoSgnp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v211DcexistOpMontoSgnp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV211DcexistOpMontoSgnp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getV211DcexistOpMontoSgnp() {
        if (v211DcexistOpMontoSgnp == null) {
            v211DcexistOpMontoSgnp = new ArrayList<Double>();
        }
        return this.v211DcexistOpMontoSgnp;
    }

    /**
     * Gets the value of the v212DcexistOpMontoSgnpArrastre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v212DcexistOpMontoSgnpArrastre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV212DcexistOpMontoSgnpArrastre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getV212DcexistOpMontoSgnpArrastre() {
        if (v212DcexistOpMontoSgnpArrastre == null) {
            v212DcexistOpMontoSgnpArrastre = new ArrayList<Double>();
        }
        return this.v212DcexistOpMontoSgnpArrastre;
    }

    /**
     * Gets the value of the v213DcexistOpCantDiasSgnpArrastre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v213DcexistOpCantDiasSgnpArrastre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV213DcexistOpCantDiasSgnpArrastre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV213DcexistOpCantDiasSgnpArrastre() {
        if (v213DcexistOpCantDiasSgnpArrastre == null) {
            v213DcexistOpCantDiasSgnpArrastre = new ArrayList<Long>();
        }
        return this.v213DcexistOpCantDiasSgnpArrastre;
    }

    /**
     * Gets the value of the v214DcexistOpFechActivCtaCorriente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v214DcexistOpFechActivCtaCorriente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV214DcexistOpFechActivCtaCorriente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getV214DcexistOpFechActivCtaCorriente() {
        if (v214DcexistOpFechActivCtaCorriente == null) {
            v214DcexistOpFechActivCtaCorriente = new ArrayList<String>();
        }
        return this.v214DcexistOpFechActivCtaCorriente;
    }

    /**
     * Gets the value of the v215DcexistOpTipoCuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v215DcexistOpTipoCuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV215DcexistOpTipoCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV215DcexistOpTipoCuenta() {
        if (v215DcexistOpTipoCuenta == null) {
            v215DcexistOpTipoCuenta = new ArrayList<Long>();
        }
        return this.v215DcexistOpTipoCuenta;
    }

    /**
     * Gets the value of the v216DcexistOpIndicadorBloqCtaCorriente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v216DcexistOpIndicadorBloqCtaCorriente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV216DcexistOpIndicadorBloqCtaCorriente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getV216DcexistOpIndicadorBloqCtaCorriente() {
        if (v216DcexistOpIndicadorBloqCtaCorriente == null) {
            v216DcexistOpIndicadorBloqCtaCorriente = new ArrayList<String>();
        }
        return this.v216DcexistOpIndicadorBloqCtaCorriente;
    }

    /**
     * Obtiene el valor de la propiedad v217DcexistTipoConvenioVige.
     * 
     */
    public long getV217DcexistTipoConvenioVige() {
        return v217DcexistTipoConvenioVige;
    }

    /**
     * Define el valor de la propiedad v217DcexistTipoConvenioVige.
     * 
     */
    public void setV217DcexistTipoConvenioVige(long value) {
        this.v217DcexistTipoConvenioVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v218DcexistSaldoCredConvenioVige.
     * 
     */
    public double getV218DcexistSaldoCredConvenioVige() {
        return v218DcexistSaldoCredConvenioVige;
    }

    /**
     * Define el valor de la propiedad v218DcexistSaldoCredConvenioVige.
     * 
     */
    public void setV218DcexistSaldoCredConvenioVige(double value) {
        this.v218DcexistSaldoCredConvenioVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v219DcexistMontoSaldoSPromCtaCorriente.
     * 
     */
    public double getV219DcexistMontoSaldoSPromCtaCorriente() {
        return v219DcexistMontoSaldoSPromCtaCorriente;
    }

    /**
     * Define el valor de la propiedad v219DcexistMontoSaldoSPromCtaCorriente.
     * 
     */
    public void setV219DcexistMontoSaldoSPromCtaCorriente(double value) {
        this.v219DcexistMontoSaldoSPromCtaCorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad v21DburoNSerieCeduIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV21DburoNSerieCeduIdentidad() {
        return v21DburoNSerieCeduIdentidad;
    }

    /**
     * Define el valor de la propiedad v21DburoNSerieCeduIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV21DburoNSerieCeduIdentidad(String value) {
        this.v21DburoNSerieCeduIdentidad = value;
    }

    /**
     * Obtiene el valor de la propiedad v220DcexistMontoSaldoSPromCtaVista.
     * 
     */
    public double getV220DcexistMontoSaldoSPromCtaVista() {
        return v220DcexistMontoSaldoSPromCtaVista;
    }

    /**
     * Define el valor de la propiedad v220DcexistMontoSaldoSPromCtaVista.
     * 
     */
    public void setV220DcexistMontoSaldoSPromCtaVista(double value) {
        this.v220DcexistMontoSaldoSPromCtaVista = value;
    }

    /**
     * Obtiene el valor de la propiedad v225DcexistSaldoRene.
     * 
     */
    public double getV225DcexistSaldoRene() {
        return v225DcexistSaldoRene;
    }

    /**
     * Define el valor de la propiedad v225DcexistSaldoRene.
     * 
     */
    public void setV225DcexistSaldoRene(double value) {
        this.v225DcexistSaldoRene = value;
    }

    /**
     * Obtiene el valor de la propiedad v226DcexistCantReneHistori.
     * 
     */
    public long getV226DcexistCantReneHistori() {
        return v226DcexistCantReneHistori;
    }

    /**
     * Define el valor de la propiedad v226DcexistCantReneHistori.
     * 
     */
    public void setV226DcexistCantReneHistori(long value) {
        this.v226DcexistCantReneHistori = value;
    }

    /**
     * Obtiene el valor de la propiedad v227DcexistFechCancelacionUltimaRene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV227DcexistFechCancelacionUltimaRene() {
        return v227DcexistFechCancelacionUltimaRene;
    }

    /**
     * Define el valor de la propiedad v227DcexistFechCancelacionUltimaRene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV227DcexistFechCancelacionUltimaRene(String value) {
        this.v227DcexistFechCancelacionUltimaRene = value;
    }

    /**
     * Gets the value of the v228DcexistTipoProducRenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v228DcexistTipoProducRenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV228DcexistTipoProducRenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV228DcexistTipoProducRenegociar() {
        if (v228DcexistTipoProducRenegociar == null) {
            v228DcexistTipoProducRenegociar = new ArrayList<Long>();
        }
        return this.v228DcexistTipoProducRenegociar;
    }

    /**
     * Gets the value of the v229DcexistTipoSubProducRenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v229DcexistTipoSubProducRenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV229DcexistTipoSubProducRenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV229DcexistTipoSubProducRenegociar() {
        if (v229DcexistTipoSubProducRenegociar == null) {
            v229DcexistTipoSubProducRenegociar = new ArrayList<Long>();
        }
        return this.v229DcexistTipoSubProducRenegociar;
    }

    /**
     * Obtiene el valor de la propiedad v22DburoFechBloqCeduIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV22DburoFechBloqCeduIdentidad() {
        return v22DburoFechBloqCeduIdentidad;
    }

    /**
     * Define el valor de la propiedad v22DburoFechBloqCeduIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV22DburoFechBloqCeduIdentidad(String value) {
        this.v22DburoFechBloqCeduIdentidad = value;
    }

    /**
     * Gets the value of the v230DcexistDestinoProducRenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v230DcexistDestinoProducRenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV230DcexistDestinoProducRenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV230DcexistDestinoProducRenegociar() {
        if (v230DcexistDestinoProducRenegociar == null) {
            v230DcexistDestinoProducRenegociar = new ArrayList<Long>();
        }
        return this.v230DcexistDestinoProducRenegociar;
    }

    /**
     * Gets the value of the v231DcexistEstadoOperRenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v231DcexistEstadoOperRenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV231DcexistEstadoOperRenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV231DcexistEstadoOperRenegociar() {
        if (v231DcexistEstadoOperRenegociar == null) {
            v231DcexistEstadoOperRenegociar = new ArrayList<Long>();
        }
        return this.v231DcexistEstadoOperRenegociar;
    }

    /**
     * Gets the value of the v232DcexistCantCuotasPagadasCred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v232DcexistCantCuotasPagadasCred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV232DcexistCantCuotasPagadasCred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV232DcexistCantCuotasPagadasCred() {
        if (v232DcexistCantCuotasPagadasCred == null) {
            v232DcexistCantCuotasPagadasCred = new ArrayList<Long>();
        }
        return this.v232DcexistCantCuotasPagadasCred;
    }

    /**
     * Obtiene el valor de la propiedad v233DcexistNumCuotasResuscribir.
     * 
     */
    public long getV233DcexistNumCuotasResuscribir() {
        return v233DcexistNumCuotasResuscribir;
    }

    /**
     * Define el valor de la propiedad v233DcexistNumCuotasResuscribir.
     * 
     */
    public void setV233DcexistNumCuotasResuscribir(long value) {
        this.v233DcexistNumCuotasResuscribir = value;
    }

    /**
     * Obtiene el valor de la propiedad v234DcexistNumRene.
     * 
     */
    public long getV234DcexistNumRene() {
        return v234DcexistNumRene;
    }

    /**
     * Define el valor de la propiedad v234DcexistNumRene.
     * 
     */
    public void setV234DcexistNumRene(long value) {
        this.v234DcexistNumRene = value;
    }

    /**
     * Obtiene el valor de la propiedad v235DcexistSaldoRefin.
     * 
     */
    public double getV235DcexistSaldoRefin() {
        return v235DcexistSaldoRefin;
    }

    /**
     * Define el valor de la propiedad v235DcexistSaldoRefin.
     * 
     */
    public void setV235DcexistSaldoRefin(double value) {
        this.v235DcexistSaldoRefin = value;
    }

    /**
     * Gets the value of the v236DcexistTipoProducRefinanciar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v236DcexistTipoProducRefinanciar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV236DcexistTipoProducRefinanciar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV236DcexistTipoProducRefinanciar() {
        if (v236DcexistTipoProducRefinanciar == null) {
            v236DcexistTipoProducRefinanciar = new ArrayList<Long>();
        }
        return this.v236DcexistTipoProducRefinanciar;
    }

    /**
     * Gets the value of the v237DcexistTipoSubProducRefinanciar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v237DcexistTipoSubProducRefinanciar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV237DcexistTipoSubProducRefinanciar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV237DcexistTipoSubProducRefinanciar() {
        if (v237DcexistTipoSubProducRefinanciar == null) {
            v237DcexistTipoSubProducRefinanciar = new ArrayList<Long>();
        }
        return this.v237DcexistTipoSubProducRefinanciar;
    }

    /**
     * Gets the value of the v238DcexistProducRefinanciar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v238DcexistProducRefinanciar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV238DcexistProducRefinanciar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV238DcexistProducRefinanciar() {
        if (v238DcexistProducRefinanciar == null) {
            v238DcexistProducRefinanciar = new ArrayList<Long>();
        }
        return this.v238DcexistProducRefinanciar;
    }

    /**
     * Gets the value of the v239DcexistCantCuotasPagadasCredRefin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v239DcexistCantCuotasPagadasCredRefin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV239DcexistCantCuotasPagadasCredRefin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV239DcexistCantCuotasPagadasCredRefin() {
        if (v239DcexistCantCuotasPagadasCredRefin == null) {
            v239DcexistCantCuotasPagadasCredRefin = new ArrayList<Long>();
        }
        return this.v239DcexistCantCuotasPagadasCredRefin;
    }

    /**
     * Gets the value of the v23DburoFechaProceso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v23DburoFechaProceso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV23DburoFechaProceso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getV23DburoFechaProceso() {
        if (v23DburoFechaProceso == null) {
            v23DburoFechaProceso = new ArrayList<String>();
        }
        return this.v23DburoFechaProceso;
    }

    /**
     * Obtiene el valor de la propiedad v240DcexistSaldoConsol.
     * 
     */
    public double getV240DcexistSaldoConsol() {
        return v240DcexistSaldoConsol;
    }

    /**
     * Define el valor de la propiedad v240DcexistSaldoConsol.
     * 
     */
    public void setV240DcexistSaldoConsol(double value) {
        this.v240DcexistSaldoConsol = value;
    }

    /**
     * Gets the value of the v241DcexistTipoProdctoConsolidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v241DcexistTipoProdctoConsolidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV241DcexistTipoProdctoConsolidar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV241DcexistTipoProdctoConsolidar() {
        if (v241DcexistTipoProdctoConsolidar == null) {
            v241DcexistTipoProdctoConsolidar = new ArrayList<Long>();
        }
        return this.v241DcexistTipoProdctoConsolidar;
    }

    /**
     * Gets the value of the v242DcexistTipoSUBtoConsolidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v242DcexistTipoSUBtoConsolidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV242DcexistTipoSUBtoConsolidar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV242DcexistTipoSUBtoConsolidar() {
        if (v242DcexistTipoSUBtoConsolidar == null) {
            v242DcexistTipoSUBtoConsolidar = new ArrayList<Long>();
        }
        return this.v242DcexistTipoSUBtoConsolidar;
    }

    /**
     * Gets the value of the v243DcexistDestinotoConsolidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v243DcexistDestinotoConsolidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV243DcexistDestinotoConsolidar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV243DcexistDestinotoConsolidar() {
        if (v243DcexistDestinotoConsolidar == null) {
            v243DcexistDestinotoConsolidar = new ArrayList<Long>();
        }
        return this.v243DcexistDestinotoConsolidar;
    }

    /**
     * Gets the value of the v244DcexistCantCuotasPagCredConsol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v244DcexistCantCuotasPagCredConsol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV244DcexistCantCuotasPagCredConsol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV244DcexistCantCuotasPagCredConsol() {
        if (v244DcexistCantCuotasPagCredConsol == null) {
            v244DcexistCantCuotasPagCredConsol = new ArrayList<Long>();
        }
        return this.v244DcexistCantCuotasPagCredConsol;
    }

    /**
     * Obtiene el valor de la propiedad v245DcexistFechUltimoCredOtorgado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV245DcexistFechUltimoCredOtorgado() {
        return v245DcexistFechUltimoCredOtorgado;
    }

    /**
     * Define el valor de la propiedad v245DcexistFechUltimoCredOtorgado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV245DcexistFechUltimoCredOtorgado(String value) {
        this.v245DcexistFechUltimoCredOtorgado = value;
    }

    /**
     * Obtiene el valor de la propiedad v24DsolicitanteRut.
     * 
     */
    public long getV24DsolicitanteRut() {
        return v24DsolicitanteRut;
    }

    /**
     * Define el valor de la propiedad v24DsolicitanteRut.
     * 
     */
    public void setV24DsolicitanteRut(long value) {
        this.v24DsolicitanteRut = value;
    }

    /**
     * Obtiene el valor de la propiedad v25DsolicitanteSexo.
     * 
     */
    public long getV25DsolicitanteSexo() {
        return v25DsolicitanteSexo;
    }

    /**
     * Define el valor de la propiedad v25DsolicitanteSexo.
     * 
     */
    public void setV25DsolicitanteSexo(long value) {
        this.v25DsolicitanteSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad v264DcexistMarcaTieneAbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV264DcexistMarcaTieneAbr() {
        return v264DcexistMarcaTieneAbr;
    }

    /**
     * Define el valor de la propiedad v264DcexistMarcaTieneAbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV264DcexistMarcaTieneAbr(String value) {
        this.v264DcexistMarcaTieneAbr = value;
    }

    /**
     * Obtiene el valor de la propiedad v265DcexistCantABonosAbr.
     * 
     */
    public long getV265DcexistCantABonosAbr() {
        return v265DcexistCantABonosAbr;
    }

    /**
     * Define el valor de la propiedad v265DcexistCantABonosAbr.
     * 
     */
    public void setV265DcexistCantABonosAbr(long value) {
        this.v265DcexistCantABonosAbr = value;
    }

    /**
     * Obtiene el valor de la propiedad v266DcexistAntiUltimos12Meses.
     * 
     */
    public long getV266DcexistAntiUltimos12Meses() {
        return v266DcexistAntiUltimos12Meses;
    }

    /**
     * Define el valor de la propiedad v266DcexistAntiUltimos12Meses.
     * 
     */
    public void setV266DcexistAntiUltimos12Meses(long value) {
        this.v266DcexistAntiUltimos12Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad v267DcexistSaldoAnticipoVige.
     * 
     */
    public double getV267DcexistSaldoAnticipoVige() {
        return v267DcexistSaldoAnticipoVige;
    }

    /**
     * Define el valor de la propiedad v267DcexistSaldoAnticipoVige.
     * 
     */
    public void setV267DcexistSaldoAnticipoVige(double value) {
        this.v267DcexistSaldoAnticipoVige = value;
    }

    /**
     * Obtiene el valor de la propiedad v26DsolicitanteNacionalidad.
     * 
     */
    public long getV26DsolicitanteNacionalidad() {
        return v26DsolicitanteNacionalidad;
    }

    /**
     * Define el valor de la propiedad v26DsolicitanteNacionalidad.
     * 
     */
    public void setV26DsolicitanteNacionalidad(long value) {
        this.v26DsolicitanteNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad v279DprodAutomoCodigoProducto.
     * 
     */
    public long getV279DprodAutomoCodigoProducto() {
        return v279DprodAutomoCodigoProducto;
    }

    /**
     * Define el valor de la propiedad v279DprodAutomoCodigoProducto.
     * 
     */
    public void setV279DprodAutomoCodigoProducto(long value) {
        this.v279DprodAutomoCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad v27DsolicitanteMarcaResiDediExtr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV27DsolicitanteMarcaResiDediExtr() {
        return v27DsolicitanteMarcaResiDediExtr;
    }

    /**
     * Define el valor de la propiedad v27DsolicitanteMarcaResiDediExtr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV27DsolicitanteMarcaResiDediExtr(String value) {
        this.v27DsolicitanteMarcaResiDediExtr = value;
    }

    /**
     * Obtiene el valor de la propiedad v280DprodAutomoCodigoSubto.
     * 
     */
    public long getV280DprodAutomoCodigoSubto() {
        return v280DprodAutomoCodigoSubto;
    }

    /**
     * Define el valor de la propiedad v280DprodAutomoCodigoSubto.
     * 
     */
    public void setV280DprodAutomoCodigoSubto(long value) {
        this.v280DprodAutomoCodigoSubto = value;
    }

    /**
     * Obtiene el valor de la propiedad v281DprodAutomoCodigoDestino.
     * 
     */
    public long getV281DprodAutomoCodigoDestino() {
        return v281DprodAutomoCodigoDestino;
    }

    /**
     * Define el valor de la propiedad v281DprodAutomoCodigoDestino.
     * 
     */
    public void setV281DprodAutomoCodigoDestino(long value) {
        this.v281DprodAutomoCodigoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad v282DprodAutomoTipoPolitica.
     * 
     */
    public long getV282DprodAutomoTipoPolitica() {
        return v282DprodAutomoTipoPolitica;
    }

    /**
     * Define el valor de la propiedad v282DprodAutomoTipoPolitica.
     * 
     */
    public void setV282DprodAutomoTipoPolitica(long value) {
        this.v282DprodAutomoTipoPolitica = value;
    }

    /**
     * Obtiene el valor de la propiedad v283DprodAutomoMontoSolicitado.
     * 
     */
    public double getV283DprodAutomoMontoSolicitado() {
        return v283DprodAutomoMontoSolicitado;
    }

    /**
     * Define el valor de la propiedad v283DprodAutomoMontoSolicitado.
     * 
     */
    public void setV283DprodAutomoMontoSolicitado(double value) {
        this.v283DprodAutomoMontoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad v284DprodAutomoCuota.
     * 
     */
    public double getV284DprodAutomoCuota() {
        return v284DprodAutomoCuota;
    }

    /**
     * Define el valor de la propiedad v284DprodAutomoCuota.
     * 
     */
    public void setV284DprodAutomoCuota(double value) {
        this.v284DprodAutomoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad v285DprodAutomoPlazoSolicitado.
     * 
     */
    public long getV285DprodAutomoPlazoSolicitado() {
        return v285DprodAutomoPlazoSolicitado;
    }

    /**
     * Define el valor de la propiedad v285DprodAutomoPlazoSolicitado.
     * 
     */
    public void setV285DprodAutomoPlazoSolicitado(long value) {
        this.v285DprodAutomoPlazoSolicitado = value;
    }

    /**
     * Obtiene el valor de la propiedad v286DprodAutomoNumCuotas.
     * 
     */
    public long getV286DprodAutomoNumCuotas() {
        return v286DprodAutomoNumCuotas;
    }

    /**
     * Define el valor de la propiedad v286DprodAutomoNumCuotas.
     * 
     */
    public void setV286DprodAutomoNumCuotas(long value) {
        this.v286DprodAutomoNumCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad v287DprodAutomoMontoGiro.
     * 
     */
    public long getV287DprodAutomoMontoGiro() {
        return v287DprodAutomoMontoGiro;
    }

    /**
     * Define el valor de la propiedad v287DprodAutomoMontoGiro.
     * 
     */
    public void setV287DprodAutomoMontoGiro(long value) {
        this.v287DprodAutomoMontoGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad v288DprodAutomoTasa.
     * 
     */
    public double getV288DprodAutomoTasa() {
        return v288DprodAutomoTasa;
    }

    /**
     * Define el valor de la propiedad v288DprodAutomoTasa.
     * 
     */
    public void setV288DprodAutomoTasa(double value) {
        this.v288DprodAutomoTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad v289DprodAutomoPieAuto.
     * 
     */
    public double getV289DprodAutomoPieAuto() {
        return v289DprodAutomoPieAuto;
    }

    /**
     * Define el valor de la propiedad v289DprodAutomoPieAuto.
     * 
     */
    public void setV289DprodAutomoPieAuto(double value) {
        this.v289DprodAutomoPieAuto = value;
    }

    /**
     * Obtiene el valor de la propiedad v28DsolicitanteMarcaFuncBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV28DsolicitanteMarcaFuncBanco() {
        return v28DsolicitanteMarcaFuncBanco;
    }

    /**
     * Define el valor de la propiedad v28DsolicitanteMarcaFuncBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV28DsolicitanteMarcaFuncBanco(String value) {
        this.v28DsolicitanteMarcaFuncBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad v290DprodAutomoValorAuto.
     * 
     */
    public double getV290DprodAutomoValorAuto() {
        return v290DprodAutomoValorAuto;
    }

    /**
     * Define el valor de la propiedad v290DprodAutomoValorAuto.
     * 
     */
    public void setV290DprodAutomoValorAuto(double value) {
        this.v290DprodAutomoValorAuto = value;
    }

    /**
     * Obtiene el valor de la propiedad v291DprodAutomoMarcaAuto.
     * 
     */
    public long getV291DprodAutomoMarcaAuto() {
        return v291DprodAutomoMarcaAuto;
    }

    /**
     * Define el valor de la propiedad v291DprodAutomoMarcaAuto.
     * 
     */
    public void setV291DprodAutomoMarcaAuto(long value) {
        this.v291DprodAutomoMarcaAuto = value;
    }

    /**
     * Obtiene el valor de la propiedad v292DprodAutomoModeloAuto.
     * 
     */
    public long getV292DprodAutomoModeloAuto() {
        return v292DprodAutomoModeloAuto;
    }

    /**
     * Define el valor de la propiedad v292DprodAutomoModeloAuto.
     * 
     */
    public void setV292DprodAutomoModeloAuto(long value) {
        this.v292DprodAutomoModeloAuto = value;
    }

    /**
     * Obtiene el valor de la propiedad v293DprodAutomoFechaFabri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV293DprodAutomoFechaFabri() {
        return v293DprodAutomoFechaFabri;
    }

    /**
     * Define el valor de la propiedad v293DprodAutomoFechaFabri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV293DprodAutomoFechaFabri(String value) {
        this.v293DprodAutomoFechaFabri = value;
    }

    /**
     * Obtiene el valor de la propiedad v294DprodAutomoCategoria.
     * 
     */
    public long getV294DprodAutomoCategoria() {
        return v294DprodAutomoCategoria;
    }

    /**
     * Define el valor de la propiedad v294DprodAutomoCategoria.
     * 
     */
    public void setV294DprodAutomoCategoria(long value) {
        this.v294DprodAutomoCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad v295DprodAutomoUso.
     * 
     */
    public long getV295DprodAutomoUso() {
        return v295DprodAutomoUso;
    }

    /**
     * Define el valor de la propiedad v295DprodAutomoUso.
     * 
     */
    public void setV295DprodAutomoUso(long value) {
        this.v295DprodAutomoUso = value;
    }

    /**
     * Obtiene el valor de la propiedad v296DprodAutomoFinAuto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV296DprodAutomoFinAuto() {
        return v296DprodAutomoFinAuto;
    }

    /**
     * Define el valor de la propiedad v296DprodAutomoFinAuto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV296DprodAutomoFinAuto(String value) {
        this.v296DprodAutomoFinAuto = value;
    }

    /**
     * Obtiene el valor de la propiedad v29DsolicitanteTipoContrato.
     * 
     */
    public long getV29DsolicitanteTipoContrato() {
        return v29DsolicitanteTipoContrato;
    }

    /**
     * Define el valor de la propiedad v29DsolicitanteTipoContrato.
     * 
     */
    public void setV29DsolicitanteTipoContrato(long value) {
        this.v29DsolicitanteTipoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad v2R04SfMontoDeudComerc.
     * 
     */
    public long getV2R04SfMontoDeudComerc() {
        return v2R04SfMontoDeudComerc;
    }

    /**
     * Define el valor de la propiedad v2R04SfMontoDeudComerc.
     * 
     */
    public void setV2R04SfMontoDeudComerc(long value) {
        this.v2R04SfMontoDeudComerc = value;
    }

    /**
     * Obtiene el valor de la propiedad v30DsolicitanteMarcaCupFirmado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV30DsolicitanteMarcaCupFirmado() {
        return v30DsolicitanteMarcaCupFirmado;
    }

    /**
     * Define el valor de la propiedad v30DsolicitanteMarcaCupFirmado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV30DsolicitanteMarcaCupFirmado(String value) {
        this.v30DsolicitanteMarcaCupFirmado = value;
    }

    /**
     * Obtiene el valor de la propiedad v31DsolicitanteHabitoPago.
     * 
     */
    public long getV31DsolicitanteHabitoPago() {
        return v31DsolicitanteHabitoPago;
    }

    /**
     * Define el valor de la propiedad v31DsolicitanteHabitoPago.
     * 
     */
    public void setV31DsolicitanteHabitoPago(long value) {
        this.v31DsolicitanteHabitoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad v32DsolicitanteFechNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV32DsolicitanteFechNacimiento() {
        return v32DsolicitanteFechNacimiento;
    }

    /**
     * Define el valor de la propiedad v32DsolicitanteFechNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV32DsolicitanteFechNacimiento(String value) {
        this.v32DsolicitanteFechNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad v33DsolicitanteTipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV33DsolicitanteTipoPersona() {
        return v33DsolicitanteTipoPersona;
    }

    /**
     * Define el valor de la propiedad v33DsolicitanteTipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV33DsolicitanteTipoPersona(String value) {
        this.v33DsolicitanteTipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad v348DprodVariable1.
     * 
     */
    public double getV348DprodVariable1() {
        return v348DprodVariable1;
    }

    /**
     * Define el valor de la propiedad v348DprodVariable1.
     * 
     */
    public void setV348DprodVariable1(double value) {
        this.v348DprodVariable1 = value;
    }

    /**
     * Obtiene el valor de la propiedad v349DprodVariable2.
     * 
     */
    public double getV349DprodVariable2() {
        return v349DprodVariable2;
    }

    /**
     * Define el valor de la propiedad v349DprodVariable2.
     * 
     */
    public void setV349DprodVariable2(double value) {
        this.v349DprodVariable2 = value;
    }

    /**
     * Obtiene el valor de la propiedad v34DsolicitanteMarcaClieConocido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV34DsolicitanteMarcaClieConocido() {
        return v34DsolicitanteMarcaClieConocido;
    }

    /**
     * Define el valor de la propiedad v34DsolicitanteMarcaClieConocido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV34DsolicitanteMarcaClieConocido(String value) {
        this.v34DsolicitanteMarcaClieConocido = value;
    }

    /**
     * Obtiene el valor de la propiedad v350DprodVariable3.
     * 
     */
    public double getV350DprodVariable3() {
        return v350DprodVariable3;
    }

    /**
     * Define el valor de la propiedad v350DprodVariable3.
     * 
     */
    public void setV350DprodVariable3(double value) {
        this.v350DprodVariable3 = value;
    }

    /**
     * Obtiene el valor de la propiedad v351DprodVariable4.
     * 
     */
    public double getV351DprodVariable4() {
        return v351DprodVariable4;
    }

    /**
     * Define el valor de la propiedad v351DprodVariable4.
     * 
     */
    public void setV351DprodVariable4(double value) {
        this.v351DprodVariable4 = value;
    }

    /**
     * Obtiene el valor de la propiedad v352DprodVariable5.
     * 
     */
    public double getV352DprodVariable5() {
        return v352DprodVariable5;
    }

    /**
     * Define el valor de la propiedad v352DprodVariable5.
     * 
     */
    public void setV352DprodVariable5(double value) {
        this.v352DprodVariable5 = value;
    }

    /**
     * Obtiene el valor de la propiedad v353DprodVariable6.
     * 
     */
    public double getV353DprodVariable6() {
        return v353DprodVariable6;
    }

    /**
     * Define el valor de la propiedad v353DprodVariable6.
     * 
     */
    public void setV353DprodVariable6(double value) {
        this.v353DprodVariable6 = value;
    }

    /**
     * Obtiene el valor de la propiedad v354DprodVariable7.
     * 
     */
    public double getV354DprodVariable7() {
        return v354DprodVariable7;
    }

    /**
     * Define el valor de la propiedad v354DprodVariable7.
     * 
     */
    public void setV354DprodVariable7(double value) {
        this.v354DprodVariable7 = value;
    }

    /**
     * Obtiene el valor de la propiedad v355DprodVariable8.
     * 
     */
    public double getV355DprodVariable8() {
        return v355DprodVariable8;
    }

    /**
     * Define el valor de la propiedad v355DprodVariable8.
     * 
     */
    public void setV355DprodVariable8(double value) {
        this.v355DprodVariable8 = value;
    }

    /**
     * Obtiene el valor de la propiedad v356DprodVariable9.
     * 
     */
    public double getV356DprodVariable9() {
        return v356DprodVariable9;
    }

    /**
     * Define el valor de la propiedad v356DprodVariable9.
     * 
     */
    public void setV356DprodVariable9(double value) {
        this.v356DprodVariable9 = value;
    }

    /**
     * Obtiene el valor de la propiedad v357DprodVariable10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV357DprodVariable10() {
        return v357DprodVariable10;
    }

    /**
     * Define el valor de la propiedad v357DprodVariable10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV357DprodVariable10(String value) {
        this.v357DprodVariable10 = value;
    }

    /**
     * Obtiene el valor de la propiedad v358DprodVariable11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV358DprodVariable11() {
        return v358DprodVariable11;
    }

    /**
     * Define el valor de la propiedad v358DprodVariable11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV358DprodVariable11(String value) {
        this.v358DprodVariable11 = value;
    }

    /**
     * Obtiene el valor de la propiedad v359DprodVariable12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV359DprodVariable12() {
        return v359DprodVariable12;
    }

    /**
     * Define el valor de la propiedad v359DprodVariable12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV359DprodVariable12(String value) {
        this.v359DprodVariable12 = value;
    }

    /**
     * Obtiene el valor de la propiedad v35DsolicitanteMarcaMatrizRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV35DsolicitanteMarcaMatrizRiesgo() {
        return v35DsolicitanteMarcaMatrizRiesgo;
    }

    /**
     * Define el valor de la propiedad v35DsolicitanteMarcaMatrizRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV35DsolicitanteMarcaMatrizRiesgo(String value) {
        this.v35DsolicitanteMarcaMatrizRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad v360DprodVariable13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV360DprodVariable13() {
        return v360DprodVariable13;
    }

    /**
     * Define el valor de la propiedad v360DprodVariable13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV360DprodVariable13(String value) {
        this.v360DprodVariable13 = value;
    }

    /**
     * Obtiene el valor de la propiedad v361DprodVariable14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV361DprodVariable14() {
        return v361DprodVariable14;
    }

    /**
     * Define el valor de la propiedad v361DprodVariable14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV361DprodVariable14(String value) {
        this.v361DprodVariable14 = value;
    }

    /**
     * Obtiene el valor de la propiedad v362DprodVariable15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV362DprodVariable15() {
        return v362DprodVariable15;
    }

    /**
     * Define el valor de la propiedad v362DprodVariable15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV362DprodVariable15(String value) {
        this.v362DprodVariable15 = value;
    }

    /**
     * Obtiene el valor de la propiedad v363DprodVariable16.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV363DprodVariable16() {
        return v363DprodVariable16;
    }

    /**
     * Define el valor de la propiedad v363DprodVariable16.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV363DprodVariable16(String value) {
        this.v363DprodVariable16 = value;
    }

    /**
     * Obtiene el valor de la propiedad v364DprodVariable17.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV364DprodVariable17() {
        return v364DprodVariable17;
    }

    /**
     * Define el valor de la propiedad v364DprodVariable17.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV364DprodVariable17(String value) {
        this.v364DprodVariable17 = value;
    }

    /**
     * Obtiene el valor de la propiedad v365DprodVariable18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV365DprodVariable18() {
        return v365DprodVariable18;
    }

    /**
     * Define el valor de la propiedad v365DprodVariable18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV365DprodVariable18(String value) {
        this.v365DprodVariable18 = value;
    }

    /**
     * Obtiene el valor de la propiedad v366DprodVariable19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV366DprodVariable19() {
        return v366DprodVariable19;
    }

    /**
     * Define el valor de la propiedad v366DprodVariable19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV366DprodVariable19(String value) {
        this.v366DprodVariable19 = value;
    }

    /**
     * Obtiene el valor de la propiedad v367DprodVariable20.
     * 
     */
    public double getV367DprodVariable20() {
        return v367DprodVariable20;
    }

    /**
     * Define el valor de la propiedad v367DprodVariable20.
     * 
     */
    public void setV367DprodVariable20(double value) {
        this.v367DprodVariable20 = value;
    }

    /**
     * Obtiene el valor de la propiedad v36SolicitanteIndicePerdida.
     * 
     */
    public long getV36SolicitanteIndicePerdida() {
        return v36SolicitanteIndicePerdida;
    }

    /**
     * Define el valor de la propiedad v36SolicitanteIndicePerdida.
     * 
     */
    public void setV36SolicitanteIndicePerdida(long value) {
        this.v36SolicitanteIndicePerdida = value;
    }

    /**
     * Obtiene el valor de la propiedad v37DsolicitantePuntajeMatrizRiesgo.
     * 
     */
    public long getV37DsolicitantePuntajeMatrizRiesgo() {
        return v37DsolicitantePuntajeMatrizRiesgo;
    }

    /**
     * Define el valor de la propiedad v37DsolicitantePuntajeMatrizRiesgo.
     * 
     */
    public void setV37DsolicitantePuntajeMatrizRiesgo(long value) {
        this.v37DsolicitantePuntajeMatrizRiesgo = value;
    }

    /**
     * Obtiene el valor de la propiedad v38DsolicitanteMarcaIncumpDeterioro.
     * 
     */
    public long getV38DsolicitanteMarcaIncumpDeterioro() {
        return v38DsolicitanteMarcaIncumpDeterioro;
    }

    /**
     * Define el valor de la propiedad v38DsolicitanteMarcaIncumpDeterioro.
     * 
     */
    public void setV38DsolicitanteMarcaIncumpDeterioro(long value) {
        this.v38DsolicitanteMarcaIncumpDeterioro = value;
    }

    /**
     * Obtiene el valor de la propiedad v39DsolicitanteTipoInterviniente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV39DsolicitanteTipoInterviniente() {
        return v39DsolicitanteTipoInterviniente;
    }

    /**
     * Define el valor de la propiedad v39DsolicitanteTipoInterviniente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV39DsolicitanteTipoInterviniente(String value) {
        this.v39DsolicitanteTipoInterviniente = value;
    }

    /**
     * Gets the value of the v3R04SfMontoDeudCredConsumo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v3R04SfMontoDeudCredConsumo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV3R04SfMontoDeudCredConsumo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV3R04SfMontoDeudCredConsumo() {
        if (v3R04SfMontoDeudCredConsumo == null) {
            v3R04SfMontoDeudCredConsumo = new ArrayList<Long>();
        }
        return this.v3R04SfMontoDeudCredConsumo;
    }

    /**
     * Obtiene el valor de la propiedad v40DsolicitanteEstadoCivil.
     * 
     */
    public long getV40DsolicitanteEstadoCivil() {
        return v40DsolicitanteEstadoCivil;
    }

    /**
     * Define el valor de la propiedad v40DsolicitanteEstadoCivil.
     * 
     */
    public void setV40DsolicitanteEstadoCivil(long value) {
        this.v40DsolicitanteEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad v41DsolicitanteNivelcional.
     * 
     */
    public long getV41DsolicitanteNivelcional() {
        return v41DsolicitanteNivelcional;
    }

    /**
     * Define el valor de la propiedad v41DsolicitanteNivelcional.
     * 
     */
    public void setV41DsolicitanteNivelcional(long value) {
        this.v41DsolicitanteNivelcional = value;
    }

    /**
     * Obtiene el valor de la propiedad v42DsolicitanteMarcaVetado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV42DsolicitanteMarcaVetado() {
        return v42DsolicitanteMarcaVetado;
    }

    /**
     * Define el valor de la propiedad v42DsolicitanteMarcaVetado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV42DsolicitanteMarcaVetado(String value) {
        this.v42DsolicitanteMarcaVetado = value;
    }

    /**
     * Obtiene el valor de la propiedad v43DsolicitanteMotivoVeto.
     * 
     */
    public long getV43DsolicitanteMotivoVeto() {
        return v43DsolicitanteMotivoVeto;
    }

    /**
     * Define el valor de la propiedad v43DsolicitanteMotivoVeto.
     * 
     */
    public void setV43DsolicitanteMotivoVeto(long value) {
        this.v43DsolicitanteMotivoVeto = value;
    }

    /**
     * Obtiene el valor de la propiedad v44DsolicitanteFechVeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV44DsolicitanteFechVeto() {
        return v44DsolicitanteFechVeto;
    }

    /**
     * Define el valor de la propiedad v44DsolicitanteFechVeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV44DsolicitanteFechVeto(String value) {
        this.v44DsolicitanteFechVeto = value;
    }

    /**
     * Obtiene el valor de la propiedad v45DsolicitanteTipoVivienda.
     * 
     */
    public long getV45DsolicitanteTipoVivienda() {
        return v45DsolicitanteTipoVivienda;
    }

    /**
     * Define el valor de la propiedad v45DsolicitanteTipoVivienda.
     * 
     */
    public void setV45DsolicitanteTipoVivienda(long value) {
        this.v45DsolicitanteTipoVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad v46DsolicitanteTotalHaberes.
     * 
     */
    public double getV46DsolicitanteTotalHaberes() {
        return v46DsolicitanteTotalHaberes;
    }

    /**
     * Define el valor de la propiedad v46DsolicitanteTotalHaberes.
     * 
     */
    public void setV46DsolicitanteTotalHaberes(double value) {
        this.v46DsolicitanteTotalHaberes = value;
    }

    /**
     * Gets the value of the v47DsolicitanteCodigoDescInterno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v47DsolicitanteCodigoDescInterno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV47DsolicitanteCodigoDescInterno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getV47DsolicitanteCodigoDescInterno() {
        if (v47DsolicitanteCodigoDescInterno == null) {
            v47DsolicitanteCodigoDescInterno = new ArrayList<Double>();
        }
        return this.v47DsolicitanteCodigoDescInterno;
    }

    /**
     * Gets the value of the v48DsolicitanteDescSInternDeducibles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v48DsolicitanteDescSInternDeducibles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV48DsolicitanteDescSInternDeducibles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getV48DsolicitanteDescSInternDeducibles() {
        if (v48DsolicitanteDescSInternDeducibles == null) {
            v48DsolicitanteDescSInternDeducibles = new ArrayList<Double>();
        }
        return this.v48DsolicitanteDescSInternDeducibles;
    }

    /**
     * Obtiene el valor de la propiedad v49DsolicitantePatrimonio.
     * 
     */
    public double getV49DsolicitantePatrimonio() {
        return v49DsolicitantePatrimonio;
    }

    /**
     * Define el valor de la propiedad v49DsolicitantePatrimonio.
     * 
     */
    public void setV49DsolicitantePatrimonio(double value) {
        this.v49DsolicitantePatrimonio = value;
    }

    /**
     * Gets the value of the v4R04SfMontoDeudCredHipo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v4R04SfMontoDeudCredHipo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV4R04SfMontoDeudCredHipo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV4R04SfMontoDeudCredHipo() {
        if (v4R04SfMontoDeudCredHipo == null) {
            v4R04SfMontoDeudCredHipo = new ArrayList<Long>();
        }
        return this.v4R04SfMontoDeudCredHipo;
    }

    /**
     * Obtiene el valor de la propiedad v50DsolicitanteTipoActividad.
     * 
     */
    public long getV50DsolicitanteTipoActividad() {
        return v50DsolicitanteTipoActividad;
    }

    /**
     * Define el valor de la propiedad v50DsolicitanteTipoActividad.
     * 
     */
    public void setV50DsolicitanteTipoActividad(long value) {
        this.v50DsolicitanteTipoActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad v51DsolicitanteTipoEmpleo.
     * 
     */
    public long getV51DsolicitanteTipoEmpleo() {
        return v51DsolicitanteTipoEmpleo;
    }

    /**
     * Define el valor de la propiedad v51DsolicitanteTipoEmpleo.
     * 
     */
    public void setV51DsolicitanteTipoEmpleo(long value) {
        this.v51DsolicitanteTipoEmpleo = value;
    }

    /**
     * Obtiene el valor de la propiedad v52DsolicitanteFechInicioEmpleoActual.
     * 
     */
    public long getV52DsolicitanteFechInicioEmpleoActual() {
        return v52DsolicitanteFechInicioEmpleoActual;
    }

    /**
     * Define el valor de la propiedad v52DsolicitanteFechInicioEmpleoActual.
     * 
     */
    public void setV52DsolicitanteFechInicioEmpleoActual(long value) {
        this.v52DsolicitanteFechInicioEmpleoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad v53DsolicitanteFechInicioEmpleoAnterior.
     * 
     */
    public long getV53DsolicitanteFechInicioEmpleoAnterior() {
        return v53DsolicitanteFechInicioEmpleoAnterior;
    }

    /**
     * Define el valor de la propiedad v53DsolicitanteFechInicioEmpleoAnterior.
     * 
     */
    public void setV53DsolicitanteFechInicioEmpleoAnterior(long value) {
        this.v53DsolicitanteFechInicioEmpleoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad v54DsolicitanteFechTerminoEmpleoAnterior.
     * 
     */
    public long getV54DsolicitanteFechTerminoEmpleoAnterior() {
        return v54DsolicitanteFechTerminoEmpleoAnterior;
    }

    /**
     * Define el valor de la propiedad v54DsolicitanteFechTerminoEmpleoAnterior.
     * 
     */
    public void setV54DsolicitanteFechTerminoEmpleoAnterior(long value) {
        this.v54DsolicitanteFechTerminoEmpleoAnterior = value;
    }

    /**
     * Gets the value of the v5R04SfMontoLineCred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v5R04SfMontoLineCred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV5R04SfMontoLineCred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV5R04SfMontoLineCred() {
        if (v5R04SfMontoLineCred == null) {
            v5R04SfMontoLineCred = new ArrayList<Long>();
        }
        return this.v5R04SfMontoLineCred;
    }

    /**
     * Obtiene el valor de la propiedad v64EexternDiasMora.
     * 
     */
    public long getV64EexternDiasMora() {
        return v64EexternDiasMora;
    }

    /**
     * Define el valor de la propiedad v64EexternDiasMora.
     * 
     */
    public void setV64EexternDiasMora(long value) {
        this.v64EexternDiasMora = value;
    }

    /**
     * Obtiene el valor de la propiedad v65EexternSituacionCuenta.
     * 
     */
    public long getV65EexternSituacionCuenta() {
        return v65EexternSituacionCuenta;
    }

    /**
     * Define el valor de la propiedad v65EexternSituacionCuenta.
     * 
     */
    public void setV65EexternSituacionCuenta(long value) {
        this.v65EexternSituacionCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad v66EexternEstado.
     * 
     */
    public long getV66EexternEstado() {
        return v66EexternEstado;
    }

    /**
     * Define el valor de la propiedad v66EexternEstado.
     * 
     */
    public void setV66EexternEstado(long value) {
        this.v66EexternEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad v67EexternScoreBanco.
     * 
     */
    public long getV67EexternScoreBanco() {
        return v67EexternScoreBanco;
    }

    /**
     * Define el valor de la propiedad v67EexternScoreBanco.
     * 
     */
    public void setV67EexternScoreBanco(long value) {
        this.v67EexternScoreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad v68EexternScoreCmr.
     * 
     */
    public long getV68EexternScoreCmr() {
        return v68EexternScoreCmr;
    }

    /**
     * Define el valor de la propiedad v68EexternScoreCmr.
     * 
     */
    public void setV68EexternScoreCmr(long value) {
        this.v68EexternScoreCmr = value;
    }

    /**
     * Gets the value of the v69EexternHabitoPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v69EexternHabitoPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV69EexternHabitoPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV69EexternHabitoPago() {
        if (v69EexternHabitoPago == null) {
            v69EexternHabitoPago = new ArrayList<Long>();
        }
        return this.v69EexternHabitoPago;
    }

    /**
     * Gets the value of the v6R04SfNumInstAcreedoras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v6R04SfNumInstAcreedoras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV6R04SfNumInstAcreedoras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV6R04SfNumInstAcreedoras() {
        if (v6R04SfNumInstAcreedoras == null) {
            v6R04SfNumInstAcreedoras = new ArrayList<Long>();
        }
        return this.v6R04SfNumInstAcreedoras;
    }

    /**
     * Obtiene el valor de la propiedad v70EexternActividad.
     * 
     */
    public long getV70EexternActividad() {
        return v70EexternActividad;
    }

    /**
     * Define el valor de la propiedad v70EexternActividad.
     * 
     */
    public void setV70EexternActividad(long value) {
        this.v70EexternActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad v71EexternCupo.
     * 
     */
    public double getV71EexternCupo() {
        return v71EexternCupo;
    }

    /**
     * Define el valor de la propiedad v71EexternCupo.
     * 
     */
    public void setV71EexternCupo(double value) {
        this.v71EexternCupo = value;
    }

    /**
     * Obtiene el valor de la propiedad v72EexternFechNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV72EexternFechNacimiento() {
        return v72EexternFechNacimiento;
    }

    /**
     * Define el valor de la propiedad v72EexternFechNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV72EexternFechNacimiento(String value) {
        this.v72EexternFechNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad v73EexternFechIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV73EexternFechIngreso() {
        return v73EexternFechIngreso;
    }

    /**
     * Define el valor de la propiedad v73EexternFechIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV73EexternFechIngreso(String value) {
        this.v73EexternFechIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad v74EexternTipoVivienda.
     * 
     */
    public long getV74EexternTipoVivienda() {
        return v74EexternTipoVivienda;
    }

    /**
     * Define el valor de la propiedad v74EexternTipoVivienda.
     * 
     */
    public void setV74EexternTipoVivienda(long value) {
        this.v74EexternTipoVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad v75EexternMarcaActivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV75EexternMarcaActivo() {
        return v75EexternMarcaActivo;
    }

    /**
     * Define el valor de la propiedad v75EexternMarcaActivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV75EexternMarcaActivo(String value) {
        this.v75EexternMarcaActivo = value;
    }

    /**
     * Obtiene el valor de la propiedad v76EexternMarcaSuperAvancista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV76EexternMarcaSuperAvancista() {
        return v76EexternMarcaSuperAvancista;
    }

    /**
     * Define el valor de la propiedad v76EexternMarcaSuperAvancista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV76EexternMarcaSuperAvancista(String value) {
        this.v76EexternMarcaSuperAvancista = value;
    }

    /**
     * Obtiene el valor de la propiedad v77EexternMarcaRenegociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV77EexternMarcaRenegociado() {
        return v77EexternMarcaRenegociado;
    }

    /**
     * Define el valor de la propiedad v77EexternMarcaRenegociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV77EexternMarcaRenegociado(String value) {
        this.v77EexternMarcaRenegociado = value;
    }

    /**
     * Obtiene el valor de la propiedad v78EexternFechRene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV78EexternFechRene() {
        return v78EexternFechRene;
    }

    /**
     * Define el valor de la propiedad v78EexternFechRene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV78EexternFechRene(String value) {
        this.v78EexternFechRene = value;
    }

    /**
     * Obtiene el valor de la propiedad v79EexternRenta.
     * 
     */
    public double getV79EexternRenta() {
        return v79EexternRenta;
    }

    /**
     * Define el valor de la propiedad v79EexternRenta.
     * 
     */
    public void setV79EexternRenta(double value) {
        this.v79EexternRenta = value;
    }

    /**
     * Gets the value of the v7R04SfMontoDeudDireMoro3090 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v7R04SfMontoDeudDireMoro3090 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV7R04SfMontoDeudDireMoro3090().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV7R04SfMontoDeudDireMoro3090() {
        if (v7R04SfMontoDeudDireMoro3090 == null) {
            v7R04SfMontoDeudDireMoro3090 = new ArrayList<Long>();
        }
        return this.v7R04SfMontoDeudDireMoro3090;
    }

    /**
     * Obtiene el valor de la propiedad v80EexternRentaAvalCode.
     * 
     */
    public double getV80EexternRentaAvalCode() {
        return v80EexternRentaAvalCode;
    }

    /**
     * Define el valor de la propiedad v80EexternRentaAvalCode.
     * 
     */
    public void setV80EexternRentaAvalCode(double value) {
        this.v80EexternRentaAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v81EexternTipoRentacomprobada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV81EexternTipoRentacomprobada() {
        return v81EexternTipoRentacomprobada;
    }

    /**
     * Define el valor de la propiedad v81EexternTipoRentacomprobada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV81EexternTipoRentacomprobada(String value) {
        this.v81EexternTipoRentacomprobada = value;
    }

    /**
     * Obtiene el valor de la propiedad v82EexternFechActualizacionRenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV82EexternFechActualizacionRenta() {
        return v82EexternFechActualizacionRenta;
    }

    /**
     * Define el valor de la propiedad v82EexternFechActualizacionRenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV82EexternFechActualizacionRenta(String value) {
        this.v82EexternFechActualizacionRenta = value;
    }

    /**
     * Obtiene el valor de la propiedad v83EexternSaldoDeudaTarj.
     * 
     */
    public double getV83EexternSaldoDeudaTarj() {
        return v83EexternSaldoDeudaTarj;
    }

    /**
     * Define el valor de la propiedad v83EexternSaldoDeudaTarj.
     * 
     */
    public void setV83EexternSaldoDeudaTarj(double value) {
        this.v83EexternSaldoDeudaTarj = value;
    }

    /**
     * Obtiene el valor de la propiedad v84EexternSaldoDeudaConsumo.
     * 
     */
    public double getV84EexternSaldoDeudaConsumo() {
        return v84EexternSaldoDeudaConsumo;
    }

    /**
     * Define el valor de la propiedad v84EexternSaldoDeudaConsumo.
     * 
     */
    public void setV84EexternSaldoDeudaConsumo(double value) {
        this.v84EexternSaldoDeudaConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad v85EexternSaldoDeudaTarjAvalCode.
     * 
     */
    public double getV85EexternSaldoDeudaTarjAvalCode() {
        return v85EexternSaldoDeudaTarjAvalCode;
    }

    /**
     * Define el valor de la propiedad v85EexternSaldoDeudaTarjAvalCode.
     * 
     */
    public void setV85EexternSaldoDeudaTarjAvalCode(double value) {
        this.v85EexternSaldoDeudaTarjAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v86EexternSaldoDeudaConsumoAvalCode.
     * 
     */
    public double getV86EexternSaldoDeudaConsumoAvalCode() {
        return v86EexternSaldoDeudaConsumoAvalCode;
    }

    /**
     * Define el valor de la propiedad v86EexternSaldoDeudaConsumoAvalCode.
     * 
     */
    public void setV86EexternSaldoDeudaConsumoAvalCode(double value) {
        this.v86EexternSaldoDeudaConsumoAvalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad v87EexternUltimaFechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV87EexternUltimaFechaPago() {
        return v87EexternUltimaFechaPago;
    }

    /**
     * Define el valor de la propiedad v87EexternUltimaFechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV87EexternUltimaFechaPago(String value) {
        this.v87EexternUltimaFechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad v88EexternMarcaPremiumElite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV88EexternMarcaPremiumElite() {
        return v88EexternMarcaPremiumElite;
    }

    /**
     * Define el valor de la propiedad v88EexternMarcaPremiumElite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV88EexternMarcaPremiumElite(String value) {
        this.v88EexternMarcaPremiumElite = value;
    }

    /**
     * Gets the value of the v89EexternTipoProdcto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v89EexternTipoProdcto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV89EexternTipoProdcto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV89EexternTipoProdcto() {
        if (v89EexternTipoProdcto == null) {
            v89EexternTipoProdcto = new ArrayList<Long>();
        }
        return this.v89EexternTipoProdcto;
    }

    /**
     * Gets the value of the v8R04SfMontoDeudDireVencida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v8R04SfMontoDeudDireVencida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV8R04SfMontoDeudDireVencida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV8R04SfMontoDeudDireVencida() {
        if (v8R04SfMontoDeudDireVencida == null) {
            v8R04SfMontoDeudDireVencida = new ArrayList<Long>();
        }
        return this.v8R04SfMontoDeudDireVencida;
    }

    /**
     * Obtiene el valor de la propiedad v8R04SfMontoDeudIndiVencida.
     * 
     */
    public long getV8R04SfMontoDeudIndiVencida() {
        return v8R04SfMontoDeudIndiVencida;
    }

    /**
     * Define el valor de la propiedad v8R04SfMontoDeudIndiVencida.
     * 
     */
    public void setV8R04SfMontoDeudIndiVencida(long value) {
        this.v8R04SfMontoDeudIndiVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad v90DsolicitudCanal.
     * 
     */
    public long getV90DsolicitudCanal() {
        return v90DsolicitudCanal;
    }

    /**
     * Define el valor de la propiedad v90DsolicitudCanal.
     * 
     */
    public void setV90DsolicitudCanal(long value) {
        this.v90DsolicitudCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad v91DsolicitudSucursal.
     * 
     */
    public long getV91DsolicitudSucursal() {
        return v91DsolicitudSucursal;
    }

    /**
     * Define el valor de la propiedad v91DsolicitudSucursal.
     * 
     */
    public void setV91DsolicitudSucursal(long value) {
        this.v91DsolicitudSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad v92DsolicitudCodEjecutivo.
     * 
     */
    public long getV92DsolicitudCodEjecutivo() {
        return v92DsolicitudCodEjecutivo;
    }

    /**
     * Define el valor de la propiedad v92DsolicitudCodEjecutivo.
     * 
     */
    public void setV92DsolicitudCodEjecutivo(long value) {
        this.v92DsolicitudCodEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad v93DsolicitudUfDia.
     * 
     */
    public double getV93DsolicitudUfDia() {
        return v93DsolicitudUfDia;
    }

    /**
     * Define el valor de la propiedad v93DsolicitudUfDia.
     * 
     */
    public void setV93DsolicitudUfDia(double value) {
        this.v93DsolicitudUfDia = value;
    }

    /**
     * Obtiene el valor de la propiedad v94DsolicitudDolarDia.
     * 
     */
    public double getV94DsolicitudDolarDia() {
        return v94DsolicitudDolarDia;
    }

    /**
     * Define el valor de la propiedad v94DsolicitudDolarDia.
     * 
     */
    public void setV94DsolicitudDolarDia(double value) {
        this.v94DsolicitudDolarDia = value;
    }

    /**
     * Obtiene el valor de la propiedad v95DsolicitudIdLlamadoMotor.
     * 
     */
    public long getV95DsolicitudIdLlamadoMotor() {
        return v95DsolicitudIdLlamadoMotor;
    }

    /**
     * Define el valor de la propiedad v95DsolicitudIdLlamadoMotor.
     * 
     */
    public void setV95DsolicitudIdLlamadoMotor(long value) {
        this.v95DsolicitudIdLlamadoMotor = value;
    }

    /**
     * Obtiene el valor de la propiedad v96DsolicitudCodiCanalDealer.
     * 
     */
    public long getV96DsolicitudCodiCanalDealer() {
        return v96DsolicitudCodiCanalDealer;
    }

    /**
     * Define el valor de la propiedad v96DsolicitudCodiCanalDealer.
     * 
     */
    public void setV96DsolicitudCodiCanalDealer(long value) {
        this.v96DsolicitudCodiCanalDealer = value;
    }

    /**
     * Obtiene el valor de la propiedad v97DsolicitudTipoConvenio.
     * 
     */
    public long getV97DsolicitudTipoConvenio() {
        return v97DsolicitudTipoConvenio;
    }

    /**
     * Define el valor de la propiedad v97DsolicitudTipoConvenio.
     * 
     */
    public void setV97DsolicitudTipoConvenio(long value) {
        this.v97DsolicitudTipoConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad v98DsolicitudClasConvenio.
     * 
     */
    public long getV98DsolicitudClasConvenio() {
        return v98DsolicitudClasConvenio;
    }

    /**
     * Define el valor de la propiedad v98DsolicitudClasConvenio.
     * 
     */
    public void setV98DsolicitudClasConvenio(long value) {
        this.v98DsolicitudClasConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad v99DsolicitudMarcaEstadConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV99DsolicitudMarcaEstadConvenio() {
        return v99DsolicitudMarcaEstadConvenio;
    }

    /**
     * Define el valor de la propiedad v99DsolicitudMarcaEstadConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV99DsolicitudMarcaEstadConvenio(String value) {
        this.v99DsolicitudMarcaEstadConvenio = value;
    }

    /**
     * Gets the value of the v9R04SfMontoDeudCastDirec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v9R04SfMontoDeudCastDirec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV9R04SfMontoDeudCastDirec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getV9R04SfMontoDeudCastDirec() {
        if (v9R04SfMontoDeudCastDirec == null) {
            v9R04SfMontoDeudCastDirec = new ArrayList<Long>();
        }
        return this.v9R04SfMontoDeudCastDirec;
    }

}
