 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TemperatureRangeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TemperatureRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/>
 *         &lt;element name="minimumTemperature" type="{urn:gs1:shared:shared_common:xsd:3}TemperatureMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureRangeType", propOrder = {
    "maximumTemperature",
    "minimumTemperature"
})
public class TemperatureRangeType {

    protected TemperatureMeasurementType maximumTemperature;
    protected TemperatureMeasurementType minimumTemperature;

    /**
     * maximumTemperature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public TemperatureMeasurementType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * maximumTemperature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public void setMaximumTemperature(TemperatureMeasurementType value) {
        this.maximumTemperature = value;
    }

    /**
     * minimumTemperature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public TemperatureMeasurementType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * minimumTemperature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasurementType }
     *     
     */
    public void setMinimumTemperature(TemperatureMeasurementType value) {
        this.minimumTemperature = value;
    }

}
