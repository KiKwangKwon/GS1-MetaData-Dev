 


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_NutritionalProductInformationModuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_NutritionalProductInformationModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="nutrientHeader" type="{urn:gs1:tsd:nutritional_product_information_module:xsd:1}TSD_NutrientHeaderType" maxOccurs="unbounded"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_NutritionalProductInformationModuleType", namespace = "urn:gs1:tsd:nutritional_product_information_module:xsd:1", propOrder = {
    "nutrientHeader",
    "avpList"
})
public class TSDNutritionalProductInformationModuleType
    extends TSDModuleType
{

    @XmlElement(required = true)
    protected List<TSDNutrientHeaderType> nutrientHeader;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the nutrientHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrientHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrientHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDNutrientHeaderType }
     * 
     * 
     */
    public List<TSDNutrientHeaderType> getNutrientHeader() {
        if (nutrientHeader == null) {
            nutrientHeader = new ArrayList<TSDNutrientHeaderType>();
        }
        return this.nutrientHeader;
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
