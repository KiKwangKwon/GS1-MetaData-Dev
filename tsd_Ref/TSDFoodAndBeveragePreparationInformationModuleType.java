 


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_FoodAndBeveragePreparationInformationModuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_FoodAndBeveragePreparationInformationModuleType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModuleType">
 *       &lt;sequence>
 *         &lt;element name="servingSuggestion" type="{urn:gs1:shared:shared_common:xsd:3}Description1000Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preparationMethod" type="{urn:gs1:tsd:food_and_beverage_preparation_information_module:xsd:1}TSD_PreparationMethodType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_FoodAndBeveragePreparationInformationModuleType", namespace = "urn:gs1:tsd:food_and_beverage_preparation_information_module:xsd:1", propOrder = {
    "servingSuggestion",
    "preparationMethod",
    "avpList"
})
public class TSDFoodAndBeveragePreparationInformationModuleType
    extends TSDModuleType
{

    protected List<Description1000Type> servingSuggestion;
    protected List<TSDPreparationMethodType> preparationMethod;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the servingSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servingSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServingSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description1000Type }
     * 
     * 
     */
    public List<Description1000Type> getServingSuggestion() {
        if (servingSuggestion == null) {
            servingSuggestion = new ArrayList<Description1000Type>();
        }
        return this.servingSuggestion;
    }

    /**
     * Gets the value of the preparationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDPreparationMethodType }
     * 
     * 
     */
    public List<TSDPreparationMethodType> getPreparationMethod() {
        if (preparationMethod == null) {
            preparationMethod = new ArrayList<TSDPreparationMethodType>();
        }
        return this.preparationMethod;
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
