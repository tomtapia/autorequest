//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:22 PM CLT 
//


package s1motor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateStrategy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateStrategy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estrategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStrategy", propOrder = {
    "estrategy"
})
public class UpdateStrategy {

    @XmlElement(name = "Estrategy", defaultValue = "|")
    protected String estrategy;

    /**
     * Obtiene el valor de la propiedad estrategy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstrategy() {
        return estrategy;
    }

    /**
     * Define el valor de la propiedad estrategy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstrategy(String value) {
        this.estrategy = value;
    }

}
