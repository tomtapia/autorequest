//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11-b140731.1112 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.05.05 a las 05:22:58 PM CLT 
//


package s1bus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the s1bus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PersonalRiesgoprimarioEvaluarRequest_QNAME = new QName("http://mdwcorp.falabella.com/OSB/schema/BCO/CL/persona/riesgoprimario/evaluar/Req-v2015.11", "personalRiesgoprimarioEvaluarRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: s1bus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EvaluacionsinBuro }
     * 
     */
    public EvaluacionsinBuro createEvaluacionsinBuro() {
        return new EvaluacionsinBuro();
    }

    /**
     * Create an instance of {@link Ocontrol }
     * 
     */
    public Ocontrol createOcontrol() {
        return new Ocontrol();
    }

    /**
     * Create an instance of {@link EntradaLlamada1 }
     * 
     */
    public EntradaLlamada1 createEntradaLlamada1() {
        return new EntradaLlamada1();
    }

    /**
     * Create an instance of {@link BExtLlamada1 }
     * 
     */
    public BExtLlamada1 createBExtLlamada1() {
        return new BExtLlamada1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionsinBuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdwcorp.falabella.com/OSB/schema/BCO/CL/persona/riesgoprimario/evaluar/Req-v2015.11", name = "personalRiesgoprimarioEvaluarRequest")
    public JAXBElement<EvaluacionsinBuro> createPersonalRiesgoprimarioEvaluarRequest(EvaluacionsinBuro value) {
        return new JAXBElement<EvaluacionsinBuro>(_PersonalRiesgoprimarioEvaluarRequest_QNAME, EvaluacionsinBuro.class, null, value);
    }

}
