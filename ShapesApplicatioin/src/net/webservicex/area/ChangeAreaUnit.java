
package net.webservicex.area;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromAreaUnit" type="{http://www.webserviceX.NET/}Areas"/>
 *         &lt;element name="toAreaUnit" type="{http://www.webserviceX.NET/}Areas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areaValue",
    "fromAreaUnit",
    "toAreaUnit"
})
@XmlRootElement(name = "ChangeAreaUnit")
public class ChangeAreaUnit {

    @XmlElement(name = "AreaValue")
    protected double areaValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Areas fromAreaUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Areas toAreaUnit;

    /**
     * Gets the value of the areaValue property.
     * 
     */
    public double getAreaValue() {
        return areaValue;
    }

    /**
     * Sets the value of the areaValue property.
     * 
     */
    public void setAreaValue(double value) {
        this.areaValue = value;
    }

    /**
     * Gets the value of the fromAreaUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Areas }
     *     
     */
    public Areas getFromAreaUnit() {
        return fromAreaUnit;
    }

    /**
     * Sets the value of the fromAreaUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Areas }
     *     
     */
    public void setFromAreaUnit(Areas value) {
        this.fromAreaUnit = value;
    }

    /**
     * Gets the value of the toAreaUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Areas }
     *     
     */
    public Areas getToAreaUnit() {
        return toAreaUnit;
    }

    /**
     * Sets the value of the toAreaUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Areas }
     *     
     */
    public void setToAreaUnit(Areas value) {
        this.toAreaUnit = value;
    }

}
