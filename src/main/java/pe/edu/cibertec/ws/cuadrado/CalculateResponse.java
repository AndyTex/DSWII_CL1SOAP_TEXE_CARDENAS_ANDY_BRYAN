//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 06:14:26 PM PET 
//


package pe.edu.cibertec.ws.cuadrado;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberDetail" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Square" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Half" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberDetail"
})
@XmlRootElement(name = "CalculateResponse")
public class CalculateResponse {

    @XmlElement(name = "NumberDetail", required = true)
    protected List<CalculateResponse.NumberDetail> numberDetail;

    /**
     * Gets the value of the numberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculateResponse.NumberDetail }
     * 
     * 
     */
    public List<CalculateResponse.NumberDetail> getNumberDetail() {
        if (numberDetail == null) {
            numberDetail = new ArrayList<CalculateResponse.NumberDetail>();
        }
        return this.numberDetail;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Square" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Half" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "number",
        "square",
        "half"
    })
    public static class NumberDetail {

        @XmlElement(name = "Number")
        protected int number;
        @XmlElement(name = "Square")
        protected int square;
        @XmlElement(name = "Half")
        protected double half;

        /**
         * Obtiene el valor de la propiedad number.
         * 
         */
        public int getNumber() {
            return number;
        }

        /**
         * Define el valor de la propiedad number.
         * 
         */
        public void setNumber(int value) {
            this.number = value;
        }

        /**
         * Obtiene el valor de la propiedad square.
         * 
         */
        public int getSquare() {
            return square;
        }

        /**
         * Define el valor de la propiedad square.
         * 
         */
        public void setSquare(int value) {
            this.square = value;
        }

        /**
         * Obtiene el valor de la propiedad half.
         * 
         */
        public double getHalf() {
            return half;
        }

        /**
         * Define el valor de la propiedad half.
         * 
         */
        public void setHalf(double value) {
            this.half = value;
        }

    }

}
