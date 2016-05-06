//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:58 PM CLT 
//


package s1bus;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bExtLlamada1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bExtLlamada1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada_1" type="{http://mdwcorp.falabella.com/OSB/schema/BCO/CL/persona/riesgoprimario/evaluar/Req-v2015.11}entradaLlamada1"/>
 *         &lt;element name="OCONTROL" type="{http://mdwcorp.falabella.com/OSB/schema/BCO/CL/persona/riesgoprimario/evaluar/Req-v2015.11}ocontrol"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bExtLlamada1", propOrder = {
    "entrada1",
    "ocontrol"
})
public class BExtLlamada1 {

    @XmlElement(name = "entrada_1", required = true)
    @Valid
    @NotNull
    protected EntradaLlamada1 entrada1;
    @XmlElement(name = "OCONTROL", required = true)
    @Valid
    @NotNull
    protected Ocontrol ocontrol;

    /**
     * Obtiene el valor de la propiedad entrada1.
     * 
     * @return
     *     possible object is
     *     {@link EntradaLlamada1 }
     *     
     */
    public EntradaLlamada1 getEntrada1() {
        return entrada1;
    }

    /**
     * Define el valor de la propiedad entrada1.
     * 
     * @param value
     *     allowed object is
     *     {@link EntradaLlamada1 }
     *     
     */
    public void setEntrada1(EntradaLlamada1 value) {
        this.entrada1 = value;
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

}
