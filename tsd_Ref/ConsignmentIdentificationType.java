 


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsignmentIdentificationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ginc" type="{urn:gs1:shared:shared_common:xsd:3}GINCType"/>
 *         &lt;element name="additionalConsignmentIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalConsignmentIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentIdentificationType", propOrder = {
    "ginc",
    "additionalConsignmentIdentification"
})
public class ConsignmentIdentificationType {

    @XmlElement(required = true)
    protected String ginc;
    protected List<AdditionalConsignmentIdentificationType> additionalConsignmentIdentification;

    /**
     * ginc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGinc() {
        return ginc;
    }

    /**
     * ginc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGinc(String value) {
        this.ginc = value;
    }

    /**
     * Gets the value of the additionalConsignmentIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalConsignmentIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalConsignmentIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalConsignmentIdentificationType }
     * 
     * 
     */
    public List<AdditionalConsignmentIdentificationType> getAdditionalConsignmentIdentification() {
        if (additionalConsignmentIdentification == null) {
            additionalConsignmentIdentification = new ArrayList<AdditionalConsignmentIdentificationType>();
        }
        return this.additionalConsignmentIdentification;
    }

}
