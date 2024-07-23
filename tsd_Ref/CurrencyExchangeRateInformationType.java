 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CurrencyExchangeRateInformationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeRateInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyConversionFromCode" type="{urn:gs1:shared:shared_common:xsd:3}CurrencyCodeType"/>
 *         &lt;element name="currencyConversionToCode" type="{urn:gs1:shared:shared_common:xsd:3}CurrencyCodeType"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="exchangeRateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeRateInformationType", propOrder = {
    "currencyConversionFromCode",
    "currencyConversionToCode",
    "exchangeRate",
    "exchangeRateDateTime"
})
public class CurrencyExchangeRateInformationType {

    @XmlElement(required = true)
    protected CurrencyCodeType currencyConversionFromCode;
    @XmlElement(required = true)
    protected CurrencyCodeType currencyConversionToCode;
    protected Float exchangeRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeRateDateTime;

    /**
     * currencyConversionFromCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyConversionFromCode() {
        return currencyConversionFromCode;
    }

    /**
     * currencyConversionFromCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyConversionFromCode(CurrencyCodeType value) {
        this.currencyConversionFromCode = value;
    }

    /**
     * currencyConversionToCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyConversionToCode() {
        return currencyConversionToCode;
    }

    /**
     * currencyConversionToCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyConversionToCode(CurrencyCodeType value) {
        this.currencyConversionToCode = value;
    }

    /**
     * exchangeRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExchangeRate() {
        return exchangeRate;
    }

    /**
     * exchangeRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExchangeRate(Float value) {
        this.exchangeRate = value;
    }

    /**
     * exchangeRateDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDateTime() {
        return exchangeRateDateTime;
    }

    /**
     * exchangeRateDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDateTime(XMLGregorianCalendar value) {
        this.exchangeRateDateTime = value;
    }

}
