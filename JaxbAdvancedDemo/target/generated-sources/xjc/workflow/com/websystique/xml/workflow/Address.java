//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.30 at 10:28:12 AM CET 
//


package com.websystique.xml.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line6" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "line1",
    "line2",
    "line3",
    "line4",
    "line5",
    "line6"
})
@XmlRootElement(name = "Address")
public class Address
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String line1;
    @XmlElement(required = true)
    protected String line2;
    @XmlElement(required = true)
    protected String line3;
    @XmlElement(required = true)
    protected String line4;
    @XmlElement(required = true)
    protected String line5;
    @XmlElement(required = true)
    protected String line6;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the line4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the value of the line4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine4(String value) {
        this.line4 = value;
    }

    /**
     * Gets the value of the line5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine5() {
        return line5;
    }

    /**
     * Sets the value of the line5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine5(String value) {
        this.line5 = value;
    }

    /**
     * Gets the value of the line6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine6() {
        return line6;
    }

    /**
     * Sets the value of the line6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine6(String value) {
        this.line6 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Address)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Address that = ((Address) object);
        {
            String lhsLine1;
            lhsLine1 = this.getLine1();
            String rhsLine1;
            rhsLine1 = that.getLine1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line1", lhsLine1), LocatorUtils.property(thatLocator, "line1", rhsLine1), lhsLine1, rhsLine1)) {
                return false;
            }
        }
        {
            String lhsLine2;
            lhsLine2 = this.getLine2();
            String rhsLine2;
            rhsLine2 = that.getLine2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line2", lhsLine2), LocatorUtils.property(thatLocator, "line2", rhsLine2), lhsLine2, rhsLine2)) {
                return false;
            }
        }
        {
            String lhsLine3;
            lhsLine3 = this.getLine3();
            String rhsLine3;
            rhsLine3 = that.getLine3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line3", lhsLine3), LocatorUtils.property(thatLocator, "line3", rhsLine3), lhsLine3, rhsLine3)) {
                return false;
            }
        }
        {
            String lhsLine4;
            lhsLine4 = this.getLine4();
            String rhsLine4;
            rhsLine4 = that.getLine4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line4", lhsLine4), LocatorUtils.property(thatLocator, "line4", rhsLine4), lhsLine4, rhsLine4)) {
                return false;
            }
        }
        {
            String lhsLine5;
            lhsLine5 = this.getLine5();
            String rhsLine5;
            rhsLine5 = that.getLine5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line5", lhsLine5), LocatorUtils.property(thatLocator, "line5", rhsLine5), lhsLine5, rhsLine5)) {
                return false;
            }
        }
        {
            String lhsLine6;
            lhsLine6 = this.getLine6();
            String rhsLine6;
            rhsLine6 = that.getLine6();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line6", lhsLine6), LocatorUtils.property(thatLocator, "line6", rhsLine6), lhsLine6, rhsLine6)) {
                return false;
            }
        }
        {
            Integer lhsId;
            lhsId = this.getId();
            Integer rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theLine1;
            theLine1 = this.getLine1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line1", theLine1), currentHashCode, theLine1);
        }
        {
            String theLine2;
            theLine2 = this.getLine2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line2", theLine2), currentHashCode, theLine2);
        }
        {
            String theLine3;
            theLine3 = this.getLine3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line3", theLine3), currentHashCode, theLine3);
        }
        {
            String theLine4;
            theLine4 = this.getLine4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line4", theLine4), currentHashCode, theLine4);
        }
        {
            String theLine5;
            theLine5 = this.getLine5();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line5", theLine5), currentHashCode, theLine5);
        }
        {
            String theLine6;
            theLine6 = this.getLine6();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line6", theLine6), currentHashCode, theLine6);
        }
        {
            Integer theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theLine1;
            theLine1 = this.getLine1();
            strategy.appendField(locator, this, "line1", buffer, theLine1);
        }
        {
            String theLine2;
            theLine2 = this.getLine2();
            strategy.appendField(locator, this, "line2", buffer, theLine2);
        }
        {
            String theLine3;
            theLine3 = this.getLine3();
            strategy.appendField(locator, this, "line3", buffer, theLine3);
        }
        {
            String theLine4;
            theLine4 = this.getLine4();
            strategy.appendField(locator, this, "line4", buffer, theLine4);
        }
        {
            String theLine5;
            theLine5 = this.getLine5();
            strategy.appendField(locator, this, "line5", buffer, theLine5);
        }
        {
            String theLine6;
            theLine6 = this.getLine6();
            strategy.appendField(locator, this, "line6", buffer, theLine6);
        }
        {
            Integer theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

}
