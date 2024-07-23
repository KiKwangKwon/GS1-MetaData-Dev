 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaymentTimePeriodType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimePeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dayOfMonthDue" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/>
 *         &lt;element name="timePeriodDue" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimePeriodType", propOrder = {
    "dateDue",
    "dayOfMonthDue",
    "timePeriodDue"
})
public class PaymentTimePeriodType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDue;
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar dayOfMonthDue;
    protected TimeMeasurementType timePeriodDue;

    /**
     * dateDue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDue() {
        return dateDue;
    }

    /**
     * dateDue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDue(XMLGregorianCalendar value) {
        this.dateDue = value;
    }

    /**
     * dayOfMonthDue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfMonthDue() {
        return dayOfMonthDue;
    }

    /**
     * dayOfMonthDue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfMonthDue(XMLGregorianCalendar value) {
        this.dayOfMonthDue = value;
    }

    /**
     * timePeriodDue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getTimePeriodDue() {
        return timePeriodDue;
    }

    /**
     * timePeriodDue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setTimePeriodDue(TimeMeasurementType value) {
        this.timePeriodDue = value;
    }

}
