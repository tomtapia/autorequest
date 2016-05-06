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
 * <p>Clase Java para inDCE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inDCE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.bfchfalabella.ch/}daBean">
 *       &lt;sequence>
 *         &lt;element name="bancofalabellaBfanticiposEnLosUltimos12Meses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcantidadDeCreditosConsumoVigentes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcantidadDeRenegociacionesHistoricas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcantidadDeSobregirosNoPactados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfcupoDeTarjetaDeCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfcupoLineaSobregiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfcupoLineaSobregiroAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdestinoProductoAConsolidar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdestinoProductoARefinanciar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdestinoProductoARenegociar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaComercial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaComercialAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaComercialCastigada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaConsumoAlDia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaConsumoAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaConsumoCastigada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaConsumoMorosa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaConsumoVencida" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaHipotecarioAlDia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaHipotecarioAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaHipotecarioCastigada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaHipotecarioMorosa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaHipotecarioVencida" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaLineaSobregiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaLineaSobregiroAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaLineaSobregiroCastigada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaTarjetaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaTarjetaCreditoAlDia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaTarjetaCreditoCastigada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaTarjetaCreditoMorosa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudaTarjetaCreditoVencida" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfestadoOperacionARenegociar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBffechaCancelacionUltimaRenegociacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBffechaDeUltimoCreditoOtorgado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBffechaIngresoRentaComprobada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBffechaMaximoDiasMoraConsumo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBffechaMaximoDiasMoraHipotecario" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBffechaMaximoDiasMoraTarjeta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmarcaCuentaCorriente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmarcaCuentaVistaVigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmarcaGarantiasVigentesAutomotriz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmarcaTieneAbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximoDiasMoraComercial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximoDiasMoraConsumo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximoDiasMoraHipotecario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximoDiasMoraSgnp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmaximoDiasMoraTarjeta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfmontoAhorro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoDap" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoEndeudamientoDisponibleMetd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoEndeudamientoMensualMem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoEndeudamientoTotalMet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoFfmm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaComprobada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaComprobadaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaDeclarada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaDeclaradaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaEstimada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaEvaluacionMasiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaIngresada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaIngresadaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoRentaUltimaEvaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoSaldosPromedioCuentaCorriente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfmontoSaldosPromedioCuentaVista" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfnumeroDeCuotasAResuscribir" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfnumeroDeRenegociacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfopcantidadDeDiasSgnpArrastre" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfopfechaActivacionCuentaCorriente" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfopmontoSgnp" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfopmontoSgnpArrastre" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfopnumeroOperacionCuentaCorriente" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfoptipoCuenta" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBforigenDeCierreCtaCte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBforigenRenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfprotestosInternosPorFondo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfprotestosInternosPorForma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBfsaldoAnticipoVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsaldoConsolidacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsaldoCreditoConvenioVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsaldoRefinanciamiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsaldoRenegociacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaValorCuotaComercialVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaValorCuotasConsumoVigentes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaValorDividendosVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoDeConvenioVigente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBftipoDeProductoAConsolidar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoDeProductoARefinanciar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoDeProductoARenegociar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoDeRenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bancofalabellaBftipoDeSubproductoAConsolidar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoDeSubproductoARefinanciar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoDeSubproductoARenegociar" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoMontoRentaEvaluacionMasiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoMontoRentaIngresada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBftipoMontoRentaUltimaEvaluacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfultimaFechaDeCastigoComercial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfultimaFechaDeCastigoConsumo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaBfvigenciaFechaComprobada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualArriendocmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualArriendocmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditocomercialcmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditoconsumocmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditodoscmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditodoscmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditoempleadorcmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditohipotecariocmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditotrescmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditotrescmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditounocmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualCreditounocmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualLineatarjetacmi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bancofalabellaLeverageYCargaMensualLineatarjetacmiaval" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inDCE", propOrder = {
    "bancofalabellaBfanticiposEnLosUltimos12Meses",
    "bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr",
    "bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN",
    "bancofalabellaBfcantidadDeCreditosConsumoVigentes",
    "bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion",
    "bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento",
    "bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir",
    "bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo",
    "bancofalabellaBfcantidadDeRenegociacionesHistoricas",
    "bancofalabellaBfcantidadDeSobregirosNoPactados",
    "bancofalabellaBfcupoDeTarjetaDeCredito",
    "bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor",
    "bancofalabellaBfcupoLineaSobregiro",
    "bancofalabellaBfcupoLineaSobregiroAvalcodeudor",
    "bancofalabellaBfdestinoProductoAConsolidar",
    "bancofalabellaBfdestinoProductoARefinanciar",
    "bancofalabellaBfdestinoProductoARenegociar",
    "bancofalabellaBfdeudaComercial",
    "bancofalabellaBfdeudaComercialAvalcodeudor",
    "bancofalabellaBfdeudaComercialCastigada",
    "bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN",
    "bancofalabellaBfdeudaConsumoAlDia",
    "bancofalabellaBfdeudaConsumoAvalcodeudor",
    "bancofalabellaBfdeudaConsumoCastigada",
    "bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN",
    "bancofalabellaBfdeudaConsumoMorosa",
    "bancofalabellaBfdeudaConsumoVencida",
    "bancofalabellaBfdeudaHipotecarioAlDia",
    "bancofalabellaBfdeudaHipotecarioAvalcodeudor",
    "bancofalabellaBfdeudaHipotecarioCastigada",
    "bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN",
    "bancofalabellaBfdeudaHipotecarioMorosa",
    "bancofalabellaBfdeudaHipotecarioVencida",
    "bancofalabellaBfdeudaLineaSobregiro",
    "bancofalabellaBfdeudaLineaSobregiroAvalcodeudor",
    "bancofalabellaBfdeudaLineaSobregiroCastigada",
    "bancofalabellaBfdeudaTarjetaAvalcodeudor",
    "bancofalabellaBfdeudaTarjetaCreditoAlDia",
    "bancofalabellaBfdeudaTarjetaCreditoCastigada",
    "bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN",
    "bancofalabellaBfdeudaTarjetaCreditoMorosa",
    "bancofalabellaBfdeudaTarjetaCreditoVencida",
    "bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses",
    "bancofalabellaBfestadoOperacionARenegociar",
    "bancofalabellaBffechaCancelacionUltimaRenegociacion",
    "bancofalabellaBffechaDeUltimoCreditoOtorgado",
    "bancofalabellaBffechaIngresoRentaComprobada",
    "bancofalabellaBffechaMaximoDiasMoraConsumo",
    "bancofalabellaBffechaMaximoDiasMoraHipotecario",
    "bancofalabellaBffechaMaximoDiasMoraTarjeta",
    "bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo",
    "bancofalabellaBfmarcaCuentaCorriente",
    "bancofalabellaBfmarcaCuentaVistaVigente",
    "bancofalabellaBfmarcaGarantiasVigentesAutomotriz",
    "bancofalabellaBfmarcaTieneAbr",
    "bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses",
    "bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses",
    "bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses",
    "bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses",
    "bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses",
    "bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses",
    "bancofalabellaBfmaximoDiasMoraComercial",
    "bancofalabellaBfmaximoDiasMoraConsumo",
    "bancofalabellaBfmaximoDiasMoraHipotecario",
    "bancofalabellaBfmaximoDiasMoraSgnp",
    "bancofalabellaBfmaximoDiasMoraTarjeta",
    "bancofalabellaBfmontoAhorro",
    "bancofalabellaBfmontoDap",
    "bancofalabellaBfmontoEndeudamientoDisponibleMetd",
    "bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd",
    "bancofalabellaBfmontoEndeudamientoMensualMem",
    "bancofalabellaBfmontoEndeudamientoTotalMet",
    "bancofalabellaBfmontoFfmm",
    "bancofalabellaBfmontoRentaComprobada",
    "bancofalabellaBfmontoRentaComprobadaAvalcodeudor",
    "bancofalabellaBfmontoRentaDeclarada",
    "bancofalabellaBfmontoRentaDeclaradaAvalcodeudor",
    "bancofalabellaBfmontoRentaEstimada",
    "bancofalabellaBfmontoRentaEvaluacionMasiva",
    "bancofalabellaBfmontoRentaIngresada",
    "bancofalabellaBfmontoRentaIngresadaAvalcodeudor",
    "bancofalabellaBfmontoRentaUltimaEvaluacion",
    "bancofalabellaBfmontoSaldosPromedioCuentaCorriente",
    "bancofalabellaBfmontoSaldosPromedioCuentaVista",
    "bancofalabellaBfnumeroDeCuotasAResuscribir",
    "bancofalabellaBfnumeroDeRenegociacion",
    "bancofalabellaBfopcantidadDeDiasSgnpArrastre",
    "bancofalabellaBfopfechaActivacionCuentaCorriente",
    "bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente",
    "bancofalabellaBfopmontoSgnp",
    "bancofalabellaBfopmontoSgnpArrastre",
    "bancofalabellaBfopnumeroOperacionCuentaCorriente",
    "bancofalabellaBfoptipoCuenta",
    "bancofalabellaBforigenDeCierreCtaCte",
    "bancofalabellaBforigenRenta",
    "bancofalabellaBfprotestosInternosPorFondo",
    "bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN",
    "bancofalabellaBfprotestosInternosPorForma",
    "bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN",
    "bancofalabellaBfsaldoAnticipoVigente",
    "bancofalabellaBfsaldoConsolidacion",
    "bancofalabellaBfsaldoCreditoConvenioVigente",
    "bancofalabellaBfsaldoRefinanciamiento",
    "bancofalabellaBfsaldoRenegociacion",
    "bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo",
    "bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario",
    "bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta",
    "bancofalabellaBfsumaValorCuotaComercialVigente",
    "bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor",
    "bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor",
    "bancofalabellaBfsumaValorCuotasConsumoVigentes",
    "bancofalabellaBfsumaValorDividendosVigente",
    "bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor",
    "bancofalabellaBftipoDeConvenioVigente",
    "bancofalabellaBftipoDeProductoAConsolidar",
    "bancofalabellaBftipoDeProductoARefinanciar",
    "bancofalabellaBftipoDeProductoARenegociar",
    "bancofalabellaBftipoDeRenta",
    "bancofalabellaBftipoDeSubproductoAConsolidar",
    "bancofalabellaBftipoDeSubproductoARefinanciar",
    "bancofalabellaBftipoDeSubproductoARenegociar",
    "bancofalabellaBftipoMontoRentaEvaluacionMasiva",
    "bancofalabellaBftipoMontoRentaIngresada",
    "bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor",
    "bancofalabellaBftipoMontoRentaUltimaEvaluacion",
    "bancofalabellaBfultimaFechaDeCastigoComercial",
    "bancofalabellaBfultimaFechaDeCastigoConsumo",
    "bancofalabellaBfvigenciaFechaComprobada",
    "bancofalabellaLeverageYCargaMensualArriendocmi",
    "bancofalabellaLeverageYCargaMensualArriendocmiaval",
    "bancofalabellaLeverageYCargaMensualCreditocomercialcmi",
    "bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval",
    "bancofalabellaLeverageYCargaMensualCreditoconsumocmi",
    "bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval",
    "bancofalabellaLeverageYCargaMensualCreditodoscmi",
    "bancofalabellaLeverageYCargaMensualCreditodoscmiaval",
    "bancofalabellaLeverageYCargaMensualCreditoempleadorcmi",
    "bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval",
    "bancofalabellaLeverageYCargaMensualCreditohipotecariocmi",
    "bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval",
    "bancofalabellaLeverageYCargaMensualCreditotrescmi",
    "bancofalabellaLeverageYCargaMensualCreditotrescmiaval",
    "bancofalabellaLeverageYCargaMensualCreditounocmi",
    "bancofalabellaLeverageYCargaMensualCreditounocmiaval",
    "bancofalabellaLeverageYCargaMensualLineatarjetacmi",
    "bancofalabellaLeverageYCargaMensualLineatarjetacmiaval"
})
public class InDCE
    extends DaBean
{

    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfanticiposEnLosUltimos12Meses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfcantidadDeCreditosConsumoVigentes;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfcantidadDeRenegociacionesHistoricas;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfcantidadDeSobregirosNoPactados;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfcupoDeTarjetaDeCredito;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfcupoLineaSobregiro;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfcupoLineaSobregiroAvalcodeudor;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfdestinoProductoAConsolidar;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfdestinoProductoARefinanciar;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfdestinoProductoARenegociar;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaComercial;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaComercialAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaComercialCastigada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaConsumoAlDia;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaConsumoAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaConsumoCastigada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaConsumoMorosa;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaConsumoVencida;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaHipotecarioAlDia;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaHipotecarioAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaHipotecarioCastigada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaHipotecarioMorosa;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaHipotecarioVencida;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaLineaSobregiro;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaLineaSobregiroAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaLineaSobregiroCastigada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaTarjetaAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaTarjetaCreditoAlDia;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaTarjetaCreditoCastigada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaTarjetaCreditoMorosa;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudaTarjetaCreditoVencida;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfestadoOperacionARenegociar;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBffechaCancelacionUltimaRenegociacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBffechaDeUltimoCreditoOtorgado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBffechaIngresoRentaComprobada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBffechaMaximoDiasMoraConsumo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBffechaMaximoDiasMoraHipotecario;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBffechaMaximoDiasMoraTarjeta;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo;
    @XmlElement(defaultValue = "|")
    protected String bancofalabellaBfmarcaCuentaCorriente;
    @XmlElement(defaultValue = "|")
    protected String bancofalabellaBfmarcaCuentaVistaVigente;
    @XmlElement(defaultValue = "|")
    protected String bancofalabellaBfmarcaGarantiasVigentesAutomotriz;
    @XmlElement(defaultValue = "|")
    protected String bancofalabellaBfmarcaTieneAbr;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximoDiasMoraComercial;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximoDiasMoraConsumo;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximoDiasMoraHipotecario;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximoDiasMoraSgnp;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfmaximoDiasMoraTarjeta;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoAhorro;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoDap;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoEndeudamientoDisponibleMetd;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoEndeudamientoMensualMem;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoEndeudamientoTotalMet;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoFfmm;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaComprobada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaComprobadaAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaDeclarada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaDeclaradaAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaEstimada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaEvaluacionMasiva;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaIngresada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaIngresadaAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoRentaUltimaEvaluacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoSaldosPromedioCuentaCorriente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfmontoSaldosPromedioCuentaVista;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfnumeroDeCuotasAResuscribir;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfnumeroDeRenegociacion;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfopcantidadDeDiasSgnpArrastre;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    @Size(min = 0)
    protected List<XMLGregorianCalendar> bancofalabellaBfopfechaActivacionCuentaCorriente;
    @XmlElement(defaultValue = "|", nillable = true)
    @Size(min = 0)
    protected List<String> bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> bancofalabellaBfopmontoSgnp;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<BigDecimal> bancofalabellaBfopmontoSgnpArrastre;
    @XmlElement(defaultValue = "-99.0", nillable = true)
    @Size(min = 0)
    protected List<Double> bancofalabellaBfopnumeroOperacionCuentaCorriente;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBfoptipoCuenta;
    @XmlElement(defaultValue = "|")
    protected String bancofalabellaBforigenDeCierreCtaCte;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBforigenRenta;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfprotestosInternosPorFondo;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfprotestosInternosPorForma;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsaldoAnticipoVigente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsaldoConsolidacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsaldoCreditoConvenioVigente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsaldoRefinanciamiento;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsaldoRenegociacion;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaValorCuotaComercialVigente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaValorCuotasConsumoVigentes;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaValorDividendosVigente;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBftipoDeConvenioVigente;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBftipoDeProductoAConsolidar;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBftipoDeProductoARefinanciar;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBftipoDeProductoARenegociar;
    @XmlElement(defaultValue = "-99")
    protected int bancofalabellaBftipoDeRenta;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBftipoDeSubproductoAConsolidar;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBftipoDeSubproductoARefinanciar;
    @XmlElement(defaultValue = "-99", nillable = true)
    @Size(min = 0)
    protected List<Integer> bancofalabellaBftipoDeSubproductoARenegociar;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBftipoMontoRentaEvaluacionMasiva;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBftipoMontoRentaIngresada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaBftipoMontoRentaUltimaEvaluacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBfultimaFechaDeCastigoComercial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBfultimaFechaDeCastigoConsumo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bancofalabellaBfvigenciaFechaComprobada;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualArriendocmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualArriendocmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditocomercialcmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditoconsumocmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditodoscmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditodoscmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditoempleadorcmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditohipotecariocmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditotrescmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditotrescmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditounocmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualCreditounocmiaval;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualLineatarjetacmi;
    @XmlElement(defaultValue = "-99.0")
    protected BigDecimal bancofalabellaLeverageYCargaMensualLineatarjetacmiaval;

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfanticiposEnLosUltimos12Meses.
     * 
     */
    public int getBancofalabellaBfanticiposEnLosUltimos12Meses() {
        return bancofalabellaBfanticiposEnLosUltimos12Meses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfanticiposEnLosUltimos12Meses.
     * 
     */
    public void setBancofalabellaBfanticiposEnLosUltimos12Meses(int value) {
        this.bancofalabellaBfanticiposEnLosUltimos12Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr.
     * 
     */
    public int getBancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr() {
        return bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr.
     * 
     */
    public void setBancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr(int value) {
        this.bancofalabellaBfcantidadAbonosEfectivosConsecutivosAbr = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN.
     * 
     */
    public int getBancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN() {
        return bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN.
     * 
     */
    public void setBancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN(int value) {
        this.bancofalabellaBfcantidadDeCreditosConsumoPagadosEnUnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcantidadDeCreditosConsumoVigentes.
     * 
     */
    public int getBancofalabellaBfcantidadDeCreditosConsumoVigentes() {
        return bancofalabellaBfcantidadDeCreditosConsumoVigentes;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcantidadDeCreditosConsumoVigentes.
     * 
     */
    public void setBancofalabellaBfcantidadDeCreditosConsumoVigentes(int value) {
        this.bancofalabellaBfcantidadDeCreditosConsumoVigentes = value;
    }

    /**
     * Gets the value of the bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion() {
        if (bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion == null) {
            bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfcantidadDeCuotasPagadasCreditoAConsolidacion;
    }

    /**
     * Gets the value of the bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento() {
        if (bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento == null) {
            bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfcantidadDeCuotasPagadasCreditoARefinanciamiento;
    }

    /**
     * Gets the value of the bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir() {
        if (bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir == null) {
            bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfcantidadDeCuotasPagadasCreditoARenegociacionresuscribir;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo.
     * 
     */
    public int getBancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo() {
        return bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo.
     * 
     */
    public void setBancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo(int value) {
        this.bancofalabellaBfcantidadDeCuotasPagadasCreditoMasNuevo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcantidadDeRenegociacionesHistoricas.
     * 
     */
    public int getBancofalabellaBfcantidadDeRenegociacionesHistoricas() {
        return bancofalabellaBfcantidadDeRenegociacionesHistoricas;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcantidadDeRenegociacionesHistoricas.
     * 
     */
    public void setBancofalabellaBfcantidadDeRenegociacionesHistoricas(int value) {
        this.bancofalabellaBfcantidadDeRenegociacionesHistoricas = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcantidadDeSobregirosNoPactados.
     * 
     */
    public int getBancofalabellaBfcantidadDeSobregirosNoPactados() {
        return bancofalabellaBfcantidadDeSobregirosNoPactados;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcantidadDeSobregirosNoPactados.
     * 
     */
    public void setBancofalabellaBfcantidadDeSobregirosNoPactados(int value) {
        this.bancofalabellaBfcantidadDeSobregirosNoPactados = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcupoDeTarjetaDeCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfcupoDeTarjetaDeCredito() {
        return bancofalabellaBfcupoDeTarjetaDeCredito;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcupoDeTarjetaDeCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfcupoDeTarjetaDeCredito(BigDecimal value) {
        this.bancofalabellaBfcupoDeTarjetaDeCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor() {
        return bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfcupoDeTarjetaDeCreditoAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcupoLineaSobregiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfcupoLineaSobregiro() {
        return bancofalabellaBfcupoLineaSobregiro;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcupoLineaSobregiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfcupoLineaSobregiro(BigDecimal value) {
        this.bancofalabellaBfcupoLineaSobregiro = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfcupoLineaSobregiroAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfcupoLineaSobregiroAvalcodeudor() {
        return bancofalabellaBfcupoLineaSobregiroAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfcupoLineaSobregiroAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfcupoLineaSobregiroAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfcupoLineaSobregiroAvalcodeudor = value;
    }

    /**
     * Gets the value of the bancofalabellaBfdestinoProductoAConsolidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfdestinoProductoAConsolidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfdestinoProductoAConsolidar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfdestinoProductoAConsolidar() {
        if (bancofalabellaBfdestinoProductoAConsolidar == null) {
            bancofalabellaBfdestinoProductoAConsolidar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfdestinoProductoAConsolidar;
    }

    /**
     * Gets the value of the bancofalabellaBfdestinoProductoARefinanciar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfdestinoProductoARefinanciar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfdestinoProductoARefinanciar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfdestinoProductoARefinanciar() {
        if (bancofalabellaBfdestinoProductoARefinanciar == null) {
            bancofalabellaBfdestinoProductoARefinanciar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfdestinoProductoARefinanciar;
    }

    /**
     * Gets the value of the bancofalabellaBfdestinoProductoARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfdestinoProductoARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfdestinoProductoARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfdestinoProductoARenegociar() {
        if (bancofalabellaBfdestinoProductoARenegociar == null) {
            bancofalabellaBfdestinoProductoARenegociar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfdestinoProductoARenegociar;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaComercial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaComercial() {
        return bancofalabellaBfdeudaComercial;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaComercial(BigDecimal value) {
        this.bancofalabellaBfdeudaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaComercialAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaComercialAvalcodeudor() {
        return bancofalabellaBfdeudaComercialAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaComercialAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaComercialAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfdeudaComercialAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaComercialCastigada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaComercialCastigada() {
        return bancofalabellaBfdeudaComercialCastigada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaComercialCastigada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaComercialCastigada(BigDecimal value) {
        this.bancofalabellaBfdeudaComercialCastigada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN() {
        return bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN(BigDecimal value) {
        this.bancofalabellaBfdeudaComercialCastigadaHistoricaMontoEnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaConsumoAlDia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaConsumoAlDia() {
        return bancofalabellaBfdeudaConsumoAlDia;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaConsumoAlDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaConsumoAlDia(BigDecimal value) {
        this.bancofalabellaBfdeudaConsumoAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaConsumoAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaConsumoAvalcodeudor() {
        return bancofalabellaBfdeudaConsumoAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaConsumoAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaConsumoAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfdeudaConsumoAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaConsumoCastigada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaConsumoCastigada() {
        return bancofalabellaBfdeudaConsumoCastigada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaConsumoCastigada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaConsumoCastigada(BigDecimal value) {
        this.bancofalabellaBfdeudaConsumoCastigada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN() {
        return bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN(BigDecimal value) {
        this.bancofalabellaBfdeudaConsumoCastigadaHistoricaMontoEnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaConsumoMorosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaConsumoMorosa() {
        return bancofalabellaBfdeudaConsumoMorosa;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaConsumoMorosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaConsumoMorosa(BigDecimal value) {
        this.bancofalabellaBfdeudaConsumoMorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaConsumoVencida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaConsumoVencida() {
        return bancofalabellaBfdeudaConsumoVencida;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaConsumoVencida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaConsumoVencida(BigDecimal value) {
        this.bancofalabellaBfdeudaConsumoVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaHipotecarioAlDia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaHipotecarioAlDia() {
        return bancofalabellaBfdeudaHipotecarioAlDia;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaHipotecarioAlDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaHipotecarioAlDia(BigDecimal value) {
        this.bancofalabellaBfdeudaHipotecarioAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaHipotecarioAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaHipotecarioAvalcodeudor() {
        return bancofalabellaBfdeudaHipotecarioAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaHipotecarioAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaHipotecarioAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfdeudaHipotecarioAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaHipotecarioCastigada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaHipotecarioCastigada() {
        return bancofalabellaBfdeudaHipotecarioCastigada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaHipotecarioCastigada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaHipotecarioCastigada(BigDecimal value) {
        this.bancofalabellaBfdeudaHipotecarioCastigada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN() {
        return bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN(BigDecimal value) {
        this.bancofalabellaBfdeudaHipotecarioCastigadaHistoricaMontoEnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaHipotecarioMorosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaHipotecarioMorosa() {
        return bancofalabellaBfdeudaHipotecarioMorosa;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaHipotecarioMorosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaHipotecarioMorosa(BigDecimal value) {
        this.bancofalabellaBfdeudaHipotecarioMorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaHipotecarioVencida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaHipotecarioVencida() {
        return bancofalabellaBfdeudaHipotecarioVencida;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaHipotecarioVencida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaHipotecarioVencida(BigDecimal value) {
        this.bancofalabellaBfdeudaHipotecarioVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaLineaSobregiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaLineaSobregiro() {
        return bancofalabellaBfdeudaLineaSobregiro;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaLineaSobregiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaLineaSobregiro(BigDecimal value) {
        this.bancofalabellaBfdeudaLineaSobregiro = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaLineaSobregiroAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaLineaSobregiroAvalcodeudor() {
        return bancofalabellaBfdeudaLineaSobregiroAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaLineaSobregiroAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaLineaSobregiroAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfdeudaLineaSobregiroAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaLineaSobregiroCastigada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaLineaSobregiroCastigada() {
        return bancofalabellaBfdeudaLineaSobregiroCastigada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaLineaSobregiroCastigada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaLineaSobregiroCastigada(BigDecimal value) {
        this.bancofalabellaBfdeudaLineaSobregiroCastigada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaTarjetaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaTarjetaAvalcodeudor() {
        return bancofalabellaBfdeudaTarjetaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaTarjetaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaTarjetaAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfdeudaTarjetaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoAlDia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaTarjetaCreditoAlDia() {
        return bancofalabellaBfdeudaTarjetaCreditoAlDia;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoAlDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaTarjetaCreditoAlDia(BigDecimal value) {
        this.bancofalabellaBfdeudaTarjetaCreditoAlDia = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoCastigada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaTarjetaCreditoCastigada() {
        return bancofalabellaBfdeudaTarjetaCreditoCastigada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoCastigada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaTarjetaCreditoCastigada(BigDecimal value) {
        this.bancofalabellaBfdeudaTarjetaCreditoCastigada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN() {
        return bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN(BigDecimal value) {
        this.bancofalabellaBfdeudaTarjetaCreditoCastigadaHistoricaMontoEnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoMorosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaTarjetaCreditoMorosa() {
        return bancofalabellaBfdeudaTarjetaCreditoMorosa;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoMorosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaTarjetaCreditoMorosa(BigDecimal value) {
        this.bancofalabellaBfdeudaTarjetaCreditoMorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoVencida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudaTarjetaCreditoVencida() {
        return bancofalabellaBfdeudaTarjetaCreditoVencida;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudaTarjetaCreditoVencida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudaTarjetaCreditoVencida(BigDecimal value) {
        this.bancofalabellaBfdeudaTarjetaCreditoVencida = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses() {
        return bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses(BigDecimal value) {
        this.bancofalabellaBfdeudamaximaMoraDelClienteEnLosUltimosTresMeses = value;
    }

    /**
     * Gets the value of the bancofalabellaBfestadoOperacionARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfestadoOperacionARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfestadoOperacionARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfestadoOperacionARenegociar() {
        if (bancofalabellaBfestadoOperacionARenegociar == null) {
            bancofalabellaBfestadoOperacionARenegociar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfestadoOperacionARenegociar;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBffechaCancelacionUltimaRenegociacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBffechaCancelacionUltimaRenegociacion() {
        return bancofalabellaBffechaCancelacionUltimaRenegociacion;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBffechaCancelacionUltimaRenegociacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBffechaCancelacionUltimaRenegociacion(XMLGregorianCalendar value) {
        this.bancofalabellaBffechaCancelacionUltimaRenegociacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBffechaDeUltimoCreditoOtorgado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBffechaDeUltimoCreditoOtorgado() {
        return bancofalabellaBffechaDeUltimoCreditoOtorgado;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBffechaDeUltimoCreditoOtorgado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBffechaDeUltimoCreditoOtorgado(XMLGregorianCalendar value) {
        this.bancofalabellaBffechaDeUltimoCreditoOtorgado = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBffechaIngresoRentaComprobada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBffechaIngresoRentaComprobada() {
        return bancofalabellaBffechaIngresoRentaComprobada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBffechaIngresoRentaComprobada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBffechaIngresoRentaComprobada(XMLGregorianCalendar value) {
        this.bancofalabellaBffechaIngresoRentaComprobada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBffechaMaximoDiasMoraConsumo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBffechaMaximoDiasMoraConsumo() {
        return bancofalabellaBffechaMaximoDiasMoraConsumo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBffechaMaximoDiasMoraConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBffechaMaximoDiasMoraConsumo(XMLGregorianCalendar value) {
        this.bancofalabellaBffechaMaximoDiasMoraConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBffechaMaximoDiasMoraHipotecario.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBffechaMaximoDiasMoraHipotecario() {
        return bancofalabellaBffechaMaximoDiasMoraHipotecario;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBffechaMaximoDiasMoraHipotecario.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBffechaMaximoDiasMoraHipotecario(XMLGregorianCalendar value) {
        this.bancofalabellaBffechaMaximoDiasMoraHipotecario = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBffechaMaximoDiasMoraTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBffechaMaximoDiasMoraTarjeta() {
        return bancofalabellaBffechaMaximoDiasMoraTarjeta;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBffechaMaximoDiasMoraTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBffechaMaximoDiasMoraTarjeta(XMLGregorianCalendar value) {
        this.bancofalabellaBffechaMaximoDiasMoraTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo() {
        return bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo(BigDecimal value) {
        this.bancofalabellaBfindicadorDePagoCuotaACuotaOPrepagoDeLaUltimaOperacionConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmarcaCuentaCorriente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancofalabellaBfmarcaCuentaCorriente() {
        return bancofalabellaBfmarcaCuentaCorriente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmarcaCuentaCorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancofalabellaBfmarcaCuentaCorriente(String value) {
        this.bancofalabellaBfmarcaCuentaCorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmarcaCuentaVistaVigente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancofalabellaBfmarcaCuentaVistaVigente() {
        return bancofalabellaBfmarcaCuentaVistaVigente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmarcaCuentaVistaVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancofalabellaBfmarcaCuentaVistaVigente(String value) {
        this.bancofalabellaBfmarcaCuentaVistaVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmarcaGarantiasVigentesAutomotriz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancofalabellaBfmarcaGarantiasVigentesAutomotriz() {
        return bancofalabellaBfmarcaGarantiasVigentesAutomotriz;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmarcaGarantiasVigentesAutomotriz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancofalabellaBfmarcaGarantiasVigentesAutomotriz(String value) {
        this.bancofalabellaBfmarcaGarantiasVigentesAutomotriz = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmarcaTieneAbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancofalabellaBfmarcaTieneAbr() {
        return bancofalabellaBfmarcaTieneAbr;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmarcaTieneAbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancofalabellaBfmarcaTieneAbr(String value) {
        this.bancofalabellaBfmarcaTieneAbr = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses.
     * 
     */
    public int getBancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses() {
        return bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses.
     * 
     */
    public void setBancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses(int value) {
        this.bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDieciochoMeses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses.
     * 
     */
    public int getBancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses() {
        return bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses.
     * 
     */
    public void setBancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses(int value) {
        this.bancofalabellaBfmaximaMoraDelClienteEnLosUltimosDoceMeses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses.
     * 
     */
    public int getBancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses() {
        return bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses.
     * 
     */
    public void setBancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses(int value) {
        this.bancofalabellaBfmaximaMoraDelClienteEnLosUltimosNueveMeses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses.
     * 
     */
    public int getBancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses() {
        return bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses.
     * 
     */
    public void setBancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses(int value) {
        this.bancofalabellaBfmaximaMoraDelClienteEnLosUltimosSeisMeses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses.
     * 
     */
    public int getBancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses() {
        return bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses.
     * 
     */
    public void setBancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses(int value) {
        this.bancofalabellaBfmaximaMoraDelClienteEnLosUltimosTresMeses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses.
     * 
     */
    public int getBancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses() {
        return bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses.
     * 
     */
    public void setBancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses(int value) {
        this.bancofalabellaBfmaximaMoraDelClienteEnLosUltimosVeinticuatroMeses = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximoDiasMoraComercial.
     * 
     */
    public int getBancofalabellaBfmaximoDiasMoraComercial() {
        return bancofalabellaBfmaximoDiasMoraComercial;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximoDiasMoraComercial.
     * 
     */
    public void setBancofalabellaBfmaximoDiasMoraComercial(int value) {
        this.bancofalabellaBfmaximoDiasMoraComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximoDiasMoraConsumo.
     * 
     */
    public int getBancofalabellaBfmaximoDiasMoraConsumo() {
        return bancofalabellaBfmaximoDiasMoraConsumo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximoDiasMoraConsumo.
     * 
     */
    public void setBancofalabellaBfmaximoDiasMoraConsumo(int value) {
        this.bancofalabellaBfmaximoDiasMoraConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximoDiasMoraHipotecario.
     * 
     */
    public int getBancofalabellaBfmaximoDiasMoraHipotecario() {
        return bancofalabellaBfmaximoDiasMoraHipotecario;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximoDiasMoraHipotecario.
     * 
     */
    public void setBancofalabellaBfmaximoDiasMoraHipotecario(int value) {
        this.bancofalabellaBfmaximoDiasMoraHipotecario = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximoDiasMoraSgnp.
     * 
     */
    public int getBancofalabellaBfmaximoDiasMoraSgnp() {
        return bancofalabellaBfmaximoDiasMoraSgnp;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximoDiasMoraSgnp.
     * 
     */
    public void setBancofalabellaBfmaximoDiasMoraSgnp(int value) {
        this.bancofalabellaBfmaximoDiasMoraSgnp = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmaximoDiasMoraTarjeta.
     * 
     */
    public int getBancofalabellaBfmaximoDiasMoraTarjeta() {
        return bancofalabellaBfmaximoDiasMoraTarjeta;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmaximoDiasMoraTarjeta.
     * 
     */
    public void setBancofalabellaBfmaximoDiasMoraTarjeta(int value) {
        this.bancofalabellaBfmaximoDiasMoraTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoAhorro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoAhorro() {
        return bancofalabellaBfmontoAhorro;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoAhorro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoAhorro(BigDecimal value) {
        this.bancofalabellaBfmontoAhorro = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoDap.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoDap() {
        return bancofalabellaBfmontoDap;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoDap.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoDap(BigDecimal value) {
        this.bancofalabellaBfmontoDap = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoEndeudamientoDisponibleMetd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoEndeudamientoDisponibleMetd() {
        return bancofalabellaBfmontoEndeudamientoDisponibleMetd;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoEndeudamientoDisponibleMetd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoEndeudamientoDisponibleMetd(BigDecimal value) {
        this.bancofalabellaBfmontoEndeudamientoDisponibleMetd = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoEndeudamientoMensualDisponibleMemd() {
        return bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoEndeudamientoMensualDisponibleMemd(BigDecimal value) {
        this.bancofalabellaBfmontoEndeudamientoMensualDisponibleMemd = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoEndeudamientoMensualMem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoEndeudamientoMensualMem() {
        return bancofalabellaBfmontoEndeudamientoMensualMem;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoEndeudamientoMensualMem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoEndeudamientoMensualMem(BigDecimal value) {
        this.bancofalabellaBfmontoEndeudamientoMensualMem = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoEndeudamientoTotalMet.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoEndeudamientoTotalMet() {
        return bancofalabellaBfmontoEndeudamientoTotalMet;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoEndeudamientoTotalMet.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoEndeudamientoTotalMet(BigDecimal value) {
        this.bancofalabellaBfmontoEndeudamientoTotalMet = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoFfmm.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoFfmm() {
        return bancofalabellaBfmontoFfmm;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoFfmm.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoFfmm(BigDecimal value) {
        this.bancofalabellaBfmontoFfmm = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaComprobada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaComprobada() {
        return bancofalabellaBfmontoRentaComprobada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaComprobada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaComprobada(BigDecimal value) {
        this.bancofalabellaBfmontoRentaComprobada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaComprobadaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaComprobadaAvalcodeudor() {
        return bancofalabellaBfmontoRentaComprobadaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaComprobadaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaComprobadaAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfmontoRentaComprobadaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaDeclarada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaDeclarada() {
        return bancofalabellaBfmontoRentaDeclarada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaDeclarada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaDeclarada(BigDecimal value) {
        this.bancofalabellaBfmontoRentaDeclarada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaDeclaradaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaDeclaradaAvalcodeudor() {
        return bancofalabellaBfmontoRentaDeclaradaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaDeclaradaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaDeclaradaAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfmontoRentaDeclaradaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaEstimada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaEstimada() {
        return bancofalabellaBfmontoRentaEstimada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaEstimada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaEstimada(BigDecimal value) {
        this.bancofalabellaBfmontoRentaEstimada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaEvaluacionMasiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaEvaluacionMasiva() {
        return bancofalabellaBfmontoRentaEvaluacionMasiva;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaEvaluacionMasiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaEvaluacionMasiva(BigDecimal value) {
        this.bancofalabellaBfmontoRentaEvaluacionMasiva = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaIngresada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaIngresada() {
        return bancofalabellaBfmontoRentaIngresada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaIngresada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaIngresada(BigDecimal value) {
        this.bancofalabellaBfmontoRentaIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaIngresadaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaIngresadaAvalcodeudor() {
        return bancofalabellaBfmontoRentaIngresadaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaIngresadaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaIngresadaAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfmontoRentaIngresadaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoRentaUltimaEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoRentaUltimaEvaluacion() {
        return bancofalabellaBfmontoRentaUltimaEvaluacion;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoRentaUltimaEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoRentaUltimaEvaluacion(BigDecimal value) {
        this.bancofalabellaBfmontoRentaUltimaEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoSaldosPromedioCuentaCorriente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoSaldosPromedioCuentaCorriente() {
        return bancofalabellaBfmontoSaldosPromedioCuentaCorriente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoSaldosPromedioCuentaCorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoSaldosPromedioCuentaCorriente(BigDecimal value) {
        this.bancofalabellaBfmontoSaldosPromedioCuentaCorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfmontoSaldosPromedioCuentaVista.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfmontoSaldosPromedioCuentaVista() {
        return bancofalabellaBfmontoSaldosPromedioCuentaVista;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfmontoSaldosPromedioCuentaVista.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfmontoSaldosPromedioCuentaVista(BigDecimal value) {
        this.bancofalabellaBfmontoSaldosPromedioCuentaVista = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfnumeroDeCuotasAResuscribir.
     * 
     */
    public int getBancofalabellaBfnumeroDeCuotasAResuscribir() {
        return bancofalabellaBfnumeroDeCuotasAResuscribir;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfnumeroDeCuotasAResuscribir.
     * 
     */
    public void setBancofalabellaBfnumeroDeCuotasAResuscribir(int value) {
        this.bancofalabellaBfnumeroDeCuotasAResuscribir = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfnumeroDeRenegociacion.
     * 
     */
    public int getBancofalabellaBfnumeroDeRenegociacion() {
        return bancofalabellaBfnumeroDeRenegociacion;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfnumeroDeRenegociacion.
     * 
     */
    public void setBancofalabellaBfnumeroDeRenegociacion(int value) {
        this.bancofalabellaBfnumeroDeRenegociacion = value;
    }

    /**
     * Gets the value of the bancofalabellaBfopcantidadDeDiasSgnpArrastre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfopcantidadDeDiasSgnpArrastre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfopcantidadDeDiasSgnpArrastre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfopcantidadDeDiasSgnpArrastre() {
        if (bancofalabellaBfopcantidadDeDiasSgnpArrastre == null) {
            bancofalabellaBfopcantidadDeDiasSgnpArrastre = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfopcantidadDeDiasSgnpArrastre;
    }

    /**
     * Gets the value of the bancofalabellaBfopfechaActivacionCuentaCorriente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfopfechaActivacionCuentaCorriente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfopfechaActivacionCuentaCorriente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getBancofalabellaBfopfechaActivacionCuentaCorriente() {
        if (bancofalabellaBfopfechaActivacionCuentaCorriente == null) {
            bancofalabellaBfopfechaActivacionCuentaCorriente = new ArrayList<XMLGregorianCalendar>();
        }
        return this.bancofalabellaBfopfechaActivacionCuentaCorriente;
    }

    /**
     * Gets the value of the bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente() {
        if (bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente == null) {
            bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente = new ArrayList<String>();
        }
        return this.bancofalabellaBfopindicadorDeBloqueoDeCuentaCorriente;
    }

    /**
     * Gets the value of the bancofalabellaBfopmontoSgnp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfopmontoSgnp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfopmontoSgnp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getBancofalabellaBfopmontoSgnp() {
        if (bancofalabellaBfopmontoSgnp == null) {
            bancofalabellaBfopmontoSgnp = new ArrayList<BigDecimal>();
        }
        return this.bancofalabellaBfopmontoSgnp;
    }

    /**
     * Gets the value of the bancofalabellaBfopmontoSgnpArrastre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfopmontoSgnpArrastre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfopmontoSgnpArrastre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getBancofalabellaBfopmontoSgnpArrastre() {
        if (bancofalabellaBfopmontoSgnpArrastre == null) {
            bancofalabellaBfopmontoSgnpArrastre = new ArrayList<BigDecimal>();
        }
        return this.bancofalabellaBfopmontoSgnpArrastre;
    }

    /**
     * Gets the value of the bancofalabellaBfopnumeroOperacionCuentaCorriente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfopnumeroOperacionCuentaCorriente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfopnumeroOperacionCuentaCorriente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBancofalabellaBfopnumeroOperacionCuentaCorriente() {
        if (bancofalabellaBfopnumeroOperacionCuentaCorriente == null) {
            bancofalabellaBfopnumeroOperacionCuentaCorriente = new ArrayList<Double>();
        }
        return this.bancofalabellaBfopnumeroOperacionCuentaCorriente;
    }

    /**
     * Gets the value of the bancofalabellaBfoptipoCuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBfoptipoCuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBfoptipoCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBfoptipoCuenta() {
        if (bancofalabellaBfoptipoCuenta == null) {
            bancofalabellaBfoptipoCuenta = new ArrayList<Integer>();
        }
        return this.bancofalabellaBfoptipoCuenta;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBforigenDeCierreCtaCte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancofalabellaBforigenDeCierreCtaCte() {
        return bancofalabellaBforigenDeCierreCtaCte;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBforigenDeCierreCtaCte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancofalabellaBforigenDeCierreCtaCte(String value) {
        this.bancofalabellaBforigenDeCierreCtaCte = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBforigenRenta.
     * 
     */
    public int getBancofalabellaBforigenRenta() {
        return bancofalabellaBforigenRenta;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBforigenRenta.
     * 
     */
    public void setBancofalabellaBforigenRenta(int value) {
        this.bancofalabellaBforigenRenta = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfprotestosInternosPorFondo.
     * 
     */
    public int getBancofalabellaBfprotestosInternosPorFondo() {
        return bancofalabellaBfprotestosInternosPorFondo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfprotestosInternosPorFondo.
     * 
     */
    public void setBancofalabellaBfprotestosInternosPorFondo(int value) {
        this.bancofalabellaBfprotestosInternosPorFondo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN.
     * 
     */
    public int getBancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN() {
        return bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN.
     * 
     */
    public void setBancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN(int value) {
        this.bancofalabellaBfprotestosInternosPorFondoHistoricoEnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfprotestosInternosPorForma.
     * 
     */
    public int getBancofalabellaBfprotestosInternosPorForma() {
        return bancofalabellaBfprotestosInternosPorForma;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfprotestosInternosPorForma.
     * 
     */
    public void setBancofalabellaBfprotestosInternosPorForma(int value) {
        this.bancofalabellaBfprotestosInternosPorForma = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN.
     * 
     */
    public int getBancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN() {
        return bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN.
     * 
     */
    public void setBancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN(int value) {
        this.bancofalabellaBfprotestosInternosPorFormaHistoricoEnPeriodoN = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsaldoAnticipoVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsaldoAnticipoVigente() {
        return bancofalabellaBfsaldoAnticipoVigente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsaldoAnticipoVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsaldoAnticipoVigente(BigDecimal value) {
        this.bancofalabellaBfsaldoAnticipoVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsaldoConsolidacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsaldoConsolidacion() {
        return bancofalabellaBfsaldoConsolidacion;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsaldoConsolidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsaldoConsolidacion(BigDecimal value) {
        this.bancofalabellaBfsaldoConsolidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsaldoCreditoConvenioVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsaldoCreditoConvenioVigente() {
        return bancofalabellaBfsaldoCreditoConvenioVigente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsaldoCreditoConvenioVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsaldoCreditoConvenioVigente(BigDecimal value) {
        this.bancofalabellaBfsaldoCreditoConvenioVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsaldoRefinanciamiento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsaldoRefinanciamiento() {
        return bancofalabellaBfsaldoRefinanciamiento;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsaldoRefinanciamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsaldoRefinanciamiento(BigDecimal value) {
        this.bancofalabellaBfsaldoRefinanciamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsaldoRenegociacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsaldoRenegociacion() {
        return bancofalabellaBfsaldoRenegociacion;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsaldoRenegociacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsaldoRenegociacion(BigDecimal value) {
        this.bancofalabellaBfsaldoRenegociacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo() {
        return bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo(BigDecimal value) {
        this.bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario() {
        return bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario(BigDecimal value) {
        this.bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraHipotecario = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta() {
        return bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta(BigDecimal value) {
        this.bancofalabellaBfsumaDeMoraOperacionMaximoDiasMoraTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaValorCuotaComercialVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaValorCuotaComercialVigente() {
        return bancofalabellaBfsumaValorCuotaComercialVigente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaValorCuotaComercialVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaValorCuotaComercialVigente(BigDecimal value) {
        this.bancofalabellaBfsumaValorCuotaComercialVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor() {
        return bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfsumaValorCuotaComercialVigenteAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor() {
        return bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfsumaValorCuotaConsumoVigenteAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaValorCuotasConsumoVigentes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaValorCuotasConsumoVigentes() {
        return bancofalabellaBfsumaValorCuotasConsumoVigentes;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaValorCuotasConsumoVigentes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaValorCuotasConsumoVigentes(BigDecimal value) {
        this.bancofalabellaBfsumaValorCuotasConsumoVigentes = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaValorDividendosVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaValorDividendosVigente() {
        return bancofalabellaBfsumaValorDividendosVigente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaValorDividendosVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaValorDividendosVigente(BigDecimal value) {
        this.bancofalabellaBfsumaValorDividendosVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBfsumaValorDividendosVigenteAvalcodeudor() {
        return bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBfsumaValorDividendosVigenteAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBfsumaValorDividendosVigenteAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBftipoDeConvenioVigente.
     * 
     */
    public int getBancofalabellaBftipoDeConvenioVigente() {
        return bancofalabellaBftipoDeConvenioVigente;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBftipoDeConvenioVigente.
     * 
     */
    public void setBancofalabellaBftipoDeConvenioVigente(int value) {
        this.bancofalabellaBftipoDeConvenioVigente = value;
    }

    /**
     * Gets the value of the bancofalabellaBftipoDeProductoAConsolidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBftipoDeProductoAConsolidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBftipoDeProductoAConsolidar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBftipoDeProductoAConsolidar() {
        if (bancofalabellaBftipoDeProductoAConsolidar == null) {
            bancofalabellaBftipoDeProductoAConsolidar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBftipoDeProductoAConsolidar;
    }

    /**
     * Gets the value of the bancofalabellaBftipoDeProductoARefinanciar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBftipoDeProductoARefinanciar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBftipoDeProductoARefinanciar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBftipoDeProductoARefinanciar() {
        if (bancofalabellaBftipoDeProductoARefinanciar == null) {
            bancofalabellaBftipoDeProductoARefinanciar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBftipoDeProductoARefinanciar;
    }

    /**
     * Gets the value of the bancofalabellaBftipoDeProductoARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBftipoDeProductoARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBftipoDeProductoARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBftipoDeProductoARenegociar() {
        if (bancofalabellaBftipoDeProductoARenegociar == null) {
            bancofalabellaBftipoDeProductoARenegociar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBftipoDeProductoARenegociar;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBftipoDeRenta.
     * 
     */
    public int getBancofalabellaBftipoDeRenta() {
        return bancofalabellaBftipoDeRenta;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBftipoDeRenta.
     * 
     */
    public void setBancofalabellaBftipoDeRenta(int value) {
        this.bancofalabellaBftipoDeRenta = value;
    }

    /**
     * Gets the value of the bancofalabellaBftipoDeSubproductoAConsolidar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBftipoDeSubproductoAConsolidar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBftipoDeSubproductoAConsolidar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBftipoDeSubproductoAConsolidar() {
        if (bancofalabellaBftipoDeSubproductoAConsolidar == null) {
            bancofalabellaBftipoDeSubproductoAConsolidar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBftipoDeSubproductoAConsolidar;
    }

    /**
     * Gets the value of the bancofalabellaBftipoDeSubproductoARefinanciar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBftipoDeSubproductoARefinanciar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBftipoDeSubproductoARefinanciar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBftipoDeSubproductoARefinanciar() {
        if (bancofalabellaBftipoDeSubproductoARefinanciar == null) {
            bancofalabellaBftipoDeSubproductoARefinanciar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBftipoDeSubproductoARefinanciar;
    }

    /**
     * Gets the value of the bancofalabellaBftipoDeSubproductoARenegociar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancofalabellaBftipoDeSubproductoARenegociar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBancofalabellaBftipoDeSubproductoARenegociar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBancofalabellaBftipoDeSubproductoARenegociar() {
        if (bancofalabellaBftipoDeSubproductoARenegociar == null) {
            bancofalabellaBftipoDeSubproductoARenegociar = new ArrayList<Integer>();
        }
        return this.bancofalabellaBftipoDeSubproductoARenegociar;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBftipoMontoRentaEvaluacionMasiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBftipoMontoRentaEvaluacionMasiva() {
        return bancofalabellaBftipoMontoRentaEvaluacionMasiva;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBftipoMontoRentaEvaluacionMasiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBftipoMontoRentaEvaluacionMasiva(BigDecimal value) {
        this.bancofalabellaBftipoMontoRentaEvaluacionMasiva = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBftipoMontoRentaIngresada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBftipoMontoRentaIngresada() {
        return bancofalabellaBftipoMontoRentaIngresada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBftipoMontoRentaIngresada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBftipoMontoRentaIngresada(BigDecimal value) {
        this.bancofalabellaBftipoMontoRentaIngresada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBftipoMontoRentaIngresadaAvalcodeudor() {
        return bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBftipoMontoRentaIngresadaAvalcodeudor(BigDecimal value) {
        this.bancofalabellaBftipoMontoRentaIngresadaAvalcodeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBftipoMontoRentaUltimaEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaBftipoMontoRentaUltimaEvaluacion() {
        return bancofalabellaBftipoMontoRentaUltimaEvaluacion;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBftipoMontoRentaUltimaEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaBftipoMontoRentaUltimaEvaluacion(BigDecimal value) {
        this.bancofalabellaBftipoMontoRentaUltimaEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfultimaFechaDeCastigoComercial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBfultimaFechaDeCastigoComercial() {
        return bancofalabellaBfultimaFechaDeCastigoComercial;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfultimaFechaDeCastigoComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBfultimaFechaDeCastigoComercial(XMLGregorianCalendar value) {
        this.bancofalabellaBfultimaFechaDeCastigoComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfultimaFechaDeCastigoConsumo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBfultimaFechaDeCastigoConsumo() {
        return bancofalabellaBfultimaFechaDeCastigoConsumo;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfultimaFechaDeCastigoConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBfultimaFechaDeCastigoConsumo(XMLGregorianCalendar value) {
        this.bancofalabellaBfultimaFechaDeCastigoConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaBfvigenciaFechaComprobada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBancofalabellaBfvigenciaFechaComprobada() {
        return bancofalabellaBfvigenciaFechaComprobada;
    }

    /**
     * Define el valor de la propiedad bancofalabellaBfvigenciaFechaComprobada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBancofalabellaBfvigenciaFechaComprobada(XMLGregorianCalendar value) {
        this.bancofalabellaBfvigenciaFechaComprobada = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualArriendocmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualArriendocmi() {
        return bancofalabellaLeverageYCargaMensualArriendocmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualArriendocmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualArriendocmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualArriendocmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualArriendocmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualArriendocmiaval() {
        return bancofalabellaLeverageYCargaMensualArriendocmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualArriendocmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualArriendocmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualArriendocmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditocomercialcmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditocomercialcmi() {
        return bancofalabellaLeverageYCargaMensualCreditocomercialcmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditocomercialcmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditocomercialcmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditocomercialcmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditocomercialcmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditocomercialcmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditocomercialcmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoconsumocmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditoconsumocmi() {
        return bancofalabellaLeverageYCargaMensualCreditoconsumocmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoconsumocmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditoconsumocmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditoconsumocmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditoconsumocmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditoconsumocmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditoconsumocmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditodoscmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditodoscmi() {
        return bancofalabellaLeverageYCargaMensualCreditodoscmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditodoscmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditodoscmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditodoscmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditodoscmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditodoscmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditodoscmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditodoscmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditodoscmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditodoscmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoempleadorcmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditoempleadorcmi() {
        return bancofalabellaLeverageYCargaMensualCreditoempleadorcmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoempleadorcmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditoempleadorcmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditoempleadorcmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditoempleadorcmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditohipotecariocmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditohipotecariocmi() {
        return bancofalabellaLeverageYCargaMensualCreditohipotecariocmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditohipotecariocmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditohipotecariocmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditohipotecariocmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditohipotecariocmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditotrescmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditotrescmi() {
        return bancofalabellaLeverageYCargaMensualCreditotrescmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditotrescmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditotrescmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditotrescmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditotrescmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditotrescmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditotrescmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditotrescmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditotrescmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditotrescmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditounocmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditounocmi() {
        return bancofalabellaLeverageYCargaMensualCreditounocmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditounocmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditounocmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditounocmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditounocmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualCreditounocmiaval() {
        return bancofalabellaLeverageYCargaMensualCreditounocmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualCreditounocmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualCreditounocmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualCreditounocmiaval = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualLineatarjetacmi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualLineatarjetacmi() {
        return bancofalabellaLeverageYCargaMensualLineatarjetacmi;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualLineatarjetacmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualLineatarjetacmi(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualLineatarjetacmi = value;
    }

    /**
     * Obtiene el valor de la propiedad bancofalabellaLeverageYCargaMensualLineatarjetacmiaval.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBancofalabellaLeverageYCargaMensualLineatarjetacmiaval() {
        return bancofalabellaLeverageYCargaMensualLineatarjetacmiaval;
    }

    /**
     * Define el valor de la propiedad bancofalabellaLeverageYCargaMensualLineatarjetacmiaval.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBancofalabellaLeverageYCargaMensualLineatarjetacmiaval(BigDecimal value) {
        this.bancofalabellaLeverageYCargaMensualLineatarjetacmiaval = value;
    }

}
