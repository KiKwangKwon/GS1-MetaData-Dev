 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_AllergenType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_AllergenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergenTypeCode" type="{urn:gs1:tsd:product_allergen_information_module:xsd:1}TSD_AllergenTypeCodeType"/>
 *         &lt;element name="levelOfContainmentCode" type="{urn:gs1:tsd:product_allergen_information_module:xsd:1}TSD_LevelOfContainmentCodeType"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_AllergenType", namespace = "urn:gs1:tsd:product_allergen_information_module:xsd:1", propOrder = {
    "allergenTypeCode",
    "levelOfContainmentCode",
    "avpList"
})
public class TSDAllergenType {

    @XmlElement(required = true)
    protected TSDAllergenTypeCodeType allergenTypeCode;
    @XmlElement(required = true)
    protected TSDLevelOfContainmentCodeType levelOfContainmentCode;
    protected TSDAttributeValuePairListType avpList;

    /**
     * allergenTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDAllergenTypeCodeType }
     *     
     */
    public TSDAllergenTypeCodeType getAllergenTypeCode() {
        return allergenTypeCode;
    }

    /**
     * allergenTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAllergenTypeCodeType }
     *     
     */
    public void setAllergenTypeCode(TSDAllergenTypeCodeType value) {
        this.allergenTypeCode = value;
    }

    /**
     * levelOfContainmentCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDLevelOfContainmentCodeType }
     *     
     */
    public TSDLevelOfContainmentCodeType getLevelOfContainmentCode() {
        return levelOfContainmentCode;
    }

    /**
     * levelOfContainmentCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDLevelOfContainmentCodeType }
     *     
     */
    public void setLevelOfContainmentCode(TSDLevelOfContainmentCodeType value) {
        this.levelOfContainmentCode = value;
    }

    /**
     * avpList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public TSDAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * avpList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public void setAvpList(TSDAttributeValuePairListType value) {
        this.avpList = value;
    }

}
