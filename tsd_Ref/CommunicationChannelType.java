 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommunicationChannelType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CommunicationChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communicationChannelCode" type="{urn:gs1:shared:shared_common:xsd:3}CommunicationChannelCodeType"/>
 *         &lt;element name="communicationValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="communicationChannelName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannelType", propOrder = {
    "communicationChannelCode",
    "communicationValue",
    "communicationChannelName"
})
public class CommunicationChannelType {

    @XmlElement(required = true)
    protected CommunicationChannelCodeType communicationChannelCode;
    @XmlElement(required = true)
    protected String communicationValue;
    protected String communicationChannelName;

    /**
     * communicationChannelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannelCodeType }
     *     
     */
    public CommunicationChannelCodeType getCommunicationChannelCode() {
        return communicationChannelCode;
    }

    /**
     * communicationChannelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannelCodeType }
     *     
     */
    public void setCommunicationChannelCode(CommunicationChannelCodeType value) {
        this.communicationChannelCode = value;
    }

    /**
     * communicationValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationValue() {
        return communicationValue;
    }

    /**
     * communicationValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationValue(String value) {
        this.communicationValue = value;
    }

    /**
     * communicationChannelName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationChannelName() {
        return communicationChannelName;
    }

    /**
     * communicationChannelName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationChannelName(String value) {
        this.communicationChannelName = value;
    }

}
