//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 08:19:45 PM PET 
//


package pe.edu.cibertec.ws.obrero;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obrero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obrero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salarioxhora" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="salarioxhoraextra" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="horasxlimite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="horasxextra" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salarioxfinal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obrero", propOrder = {
    "horas",
    "salarioxhora",
    "salarioxhoraextra",
    "horasxlimite",
    "horasxextra",
    "salarioxfinal"
})
public class Obrero {

    protected int horas;
    protected double salarioxhora;
    protected double salarioxhoraextra;
    protected int horasxlimite;
    protected int horasxextra;
    protected double salarioxfinal;

    /**
     * Obtiene el valor de la propiedad horas.
     * 
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Define el valor de la propiedad horas.
     * 
     */
    public void setHoras(int value) {
        this.horas = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioxhora.
     * 
     */
    public double getSalarioxhora() {
        return salarioxhora;
    }

    /**
     * Define el valor de la propiedad salarioxhora.
     * 
     */
    public void setSalarioxhora(double value) {
        this.salarioxhora = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioxhoraextra.
     * 
     */
    public double getSalarioxhoraextra() {
        return salarioxhoraextra;
    }

    /**
     * Define el valor de la propiedad salarioxhoraextra.
     * 
     */
    public void setSalarioxhoraextra(double value) {
        this.salarioxhoraextra = value;
    }

    /**
     * Obtiene el valor de la propiedad horasxlimite.
     * 
     */
    public int getHorasxlimite() {
        return horasxlimite;
    }

    /**
     * Define el valor de la propiedad horasxlimite.
     * 
     */
    public void setHorasxlimite(int value) {
        this.horasxlimite = value;
    }

    /**
     * Obtiene el valor de la propiedad horasxextra.
     * 
     */
    public int getHorasxextra() {
        return horasxextra;
    }

    /**
     * Define el valor de la propiedad horasxextra.
     * 
     */
    public void setHorasxextra(int value) {
        this.horasxextra = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioxfinal.
     * 
     */
    public double getSalarioxfinal() {
        return salarioxfinal;
    }

    /**
     * Define el valor de la propiedad salarioxfinal.
     * 
     */
    public void setSalarioxfinal(double value) {
        this.salarioxfinal = value;
    }

}
