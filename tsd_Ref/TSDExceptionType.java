 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ExceptionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptionReason" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ExceptionType", namespace = "urn:gs1:tsd:tsd_common:xsd:1", propOrder = {
    "exceptionReason"
})
@XmlSeeAlso({
    TSDUnsupportedVersionExceptionType.class,
    TSDImplementationExceptionType.class,
    TSDInvalidGTINExceptionType.class,
    TSDInvalidRequestExceptionType.class,
    TSDSecurityExceptionType.class,
    TSDInvalidTargetMarketExceptionType.class,
    TSDNoDataExceptionType.class
})
public class TSDExceptionType {

    @XmlElement(required = true)
    protected Description200Type exceptionReason;

    /**
     * exceptionReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getExceptionReason() {
        return exceptionReason;
    }

    /**
     * exceptionReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setExceptionReason(Description200Type value) {
        this.exceptionReason = value;
    }

}
