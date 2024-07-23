 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_AllergenType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * allergenTypeCode �Ӽ��� ���� �����ɴϴ�.
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
     * allergenTypeCode �Ӽ��� ���� �����մϴ�.
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
     * levelOfContainmentCode �Ӽ��� ���� �����ɴϴ�.
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
     * levelOfContainmentCode �Ӽ��� ���� �����մϴ�.
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
     * avpList �Ӽ��� ���� �����ɴϴ�.
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
     * avpList �Ӽ��� ���� �����մϴ�.
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
