
package com.lcrc.af.gw.client.stubs.vdabapi.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scopeStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="argStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "objName",
    "cmd",
    "scopeStr",
    "argStr"
})
@XmlRootElement(name = "execute")
public class Execute {

    protected String objName;
    protected String cmd;
    protected String scopeStr;
    protected String argStr;

    /**
     * Gets the value of the objName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * Sets the value of the objName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * Sets the value of the cmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmd(String value) {
        this.cmd = value;
    }

    /**
     * Gets the value of the scopeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeStr() {
        return scopeStr;
    }

    /**
     * Sets the value of the scopeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeStr(String value) {
        this.scopeStr = value;
    }

    /**
     * Gets the value of the argStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgStr() {
        return argStr;
    }

    /**
     * Sets the value of the argStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgStr(String value) {
        this.argStr = value;
    }

}
