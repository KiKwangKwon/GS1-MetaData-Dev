 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeasurementRangeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MeasurementRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *         &lt;element name="minimumMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementRangeType", propOrder = {
    "maximumMeasurement",
    "minimumMeasurement"
})
public class MeasurementRangeType {

    protected MeasurementType maximumMeasurement;
    protected MeasurementType minimumMeasurement;

    /**
     * maximumMeasurement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMaximumMeasurement() {
        return maximumMeasurement;
    }

    /**
     * maximumMeasurement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMaximumMeasurement(MeasurementType value) {
        this.maximumMeasurement = value;
    }

    /**
     * minimumMeasurement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMinimumMeasurement() {
        return minimumMeasurement;
    }

    /**
     * minimumMeasurement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMinimumMeasurement(MeasurementType value) {
        this.minimumMeasurement = value;
    }

}
