 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_SecurityExceptionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_SecurityExceptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ExceptionType">
 *       &lt;sequence>
 *         &lt;element name="exceptionContactDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_SecurityExceptionType", namespace = "urn:gs1:tsd:query_by_gtin_response:xsd:1", propOrder = {
    "exceptionContactDescription"
})
public class TSDSecurityExceptionType
    extends TSDExceptionType
{

    protected Description200Type exceptionContactDescription;

    /**
     * exceptionContactDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Description200Type }
     *     
     */
    public Description200Type getExceptionContactDescription() {
        return exceptionContactDescription;
    }

    /**
     * exceptionContactDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Description200Type }
     *     
     */
    public void setExceptionContactDescription(Description200Type value) {
        this.exceptionContactDescription = value;
    }

}
