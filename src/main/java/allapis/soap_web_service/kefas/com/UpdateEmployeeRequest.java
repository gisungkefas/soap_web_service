//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.21 at 09:30:25 pm WAT 
//


package allapis.soap_web_service.kefas.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="employeeInfo" type="{http://com.kefas.soap_web_service.allapis}employeeInfo"/>
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
    "employeeInfo"
})
@XmlRootElement(name = "updateEmployeeRequest")
public class UpdateEmployeeRequest {

    @XmlElement(required = true)
    protected EmployeeInfo employeeInfo;

    /**
     * Gets the value of the employeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeInfo }
     *     
     */
    public EmployeeInfo getEmployeeInfo() {
        return employeeInfo;
    }

    /**
     * Sets the value of the employeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeInfo }
     *     
     */
    public void setEmployeeInfo(EmployeeInfo value) {
        this.employeeInfo = value;
    }

}
