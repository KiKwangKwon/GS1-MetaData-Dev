 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmountRangeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AmountRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/>
 *         &lt;element name="minimumAmount" type="{urn:gs1:shared:shared_common:xsd:3}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountRangeType", propOrder = {
    "maximumAmount",
    "minimumAmount"
})
public class AmountRangeType {

    protected AmountType maximumAmount;
    protected AmountType minimumAmount;

    /**
     * maximumAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * maximumAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumAmount(AmountType value) {
        this.maximumAmount = value;
    }

    /**
     * minimumAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * minimumAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumAmount(AmountType value) {
        this.minimumAmount = value;
    }

}
