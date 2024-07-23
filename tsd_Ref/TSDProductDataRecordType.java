 


package org.gs1.source.tsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TSD_ProductDataRecordType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ProductDataRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productionVariantDescription" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" minOccurs="0"/>
 *         &lt;element name="productionVariantEffectiveDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modules" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_ModulesType" maxOccurs="unbounded"/>
 *         &lt;element name="productComponentRecord" type="{urn:gs1:tsd:product_data:xsd:1}TSD_ProductComponentRecordType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TSD_ProductDataRecordType", namespace = "urn:gs1:tsd:product_data:xsd:1", propOrder = {
    "productionVariantDescription",
    "productionVariantEffectiveDateTime",
    "modules",
    "productComponentRecord",
    "avpList"
})
public class TSDProductDataRecordType {

    protected Description70Type productionVariantDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productionVariantEffectiveDateTime;
    @XmlElement(required = true)
    protected List<TSDModulesType> modules;
    protected List<TSDProductComponentRecordType> productComponentRecord;
    protected TSDAttributeValuePairListType avpList;

    /**
     * productionVariantDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Description70Type }
     *     
     */
    public Description70Type getProductionVariantDescription() {
        return productionVariantDescription;
    }

    /**
     * productionVariantDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Description70Type }
     *     
     */
    public void setProductionVariantDescription(Description70Type value) {
        this.productionVariantDescription = value;
    }

    /**
     * productionVariantEffectiveDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionVariantEffectiveDateTime() {
        return productionVariantEffectiveDateTime;
    }

    /**
     * productionVariantEffectiveDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionVariantEffectiveDateTime(XMLGregorianCalendar value) {
        this.productionVariantEffectiveDateTime = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDModulesType }
     * 
     * 
     */
    public List<TSDModulesType> getModules() {
        if (modules == null) {
            modules = new ArrayList<TSDModulesType>();
        }
        return this.modules;
    }

    /**
     * Gets the value of the productComponentRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productComponentRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductComponentRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDProductComponentRecordType }
     * 
     * 
     */
    public List<TSDProductComponentRecordType> getProductComponentRecord() {
        if (productComponentRecord == null) {
            productComponentRecord = new ArrayList<TSDProductComponentRecordType>();
        }
        return this.productComponentRecord;
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
