 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>GS1CodeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GS1CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3>String80Type">
 *       &lt;attribute name="codeListVersion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="35"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    FinancialAccountNumberTypeCodeType.class,
    AdditionalTradeItemIdentificationTypeCodeType.class,
    IncotermsCodeType.class,
    AdditionalReturnableAssetIdentificationTypeCodeType.class,
    AdditionalShipmentIdentificationTypeCodeType.class,
    PaymentMethodCodeType.class,
    MeasurementUnitCodeType.class,
    FinancialRoutingNumberTypeCodeType.class,
    CommunicationChannelCodeType.class,
    AllowanceChargeTypeCodeType.class,
    TemperatureMeasurementUnitCodeType.class,
    AdditionalPartyIdentificationTypeCodeType.class,
    NutrientTypeCodeType.class,
    TimeMeasurementUnitCodeType.class,
    AdditionalIndividualAssetIdentificationTypeCodeType.class,
    AdditionalConsignmentIdentificationTypeCodeType.class,
    TaxCategoryCodeType.class,
    CountrySubdivisionCodeType.class,
    ContactTypeCodeType.class,
    LanguageCodeType.class,
    PaymentTermsTypeCodeType.class,
    AdditionalServiceRelationIdentificationTypeCodeType.class,
    EntityTypeCodeType.class,
    AdditionalLogisticUnitIdentificationTypeCodeType.class,
    CountryCodeType.class,
    CurrencyCodeType.class,
    BarCodeTypeCodeType.class,
    PartyRoleCodeType.class,
    DateFormatCodeType.class,
    TSDPartyContactRoleCodeType.class,
    TSDMeasurementPrecisionCodeType.class,
    TSDImageTypeCodeType.class,
    TSDProductInformationTypeCodeType.class,
    TSDPreparationTypeCodeType.class,
    TSDNutrientTypeCodeType.class,
    TSDPreparationStateCodeType.class,
    TSDAllergenTypeCodeType.class,
    TSDLevelOfContainmentCodeType.class,
    TSDDietaryClaimCodeType.class,
    TSDRegulatoryComplianceCodeType.class,
    TSDNutritionalClaimCodeType.class,
    TSDAccreditationCodeType.class,
    TSDProductActivityTypeCodeType.class
})
public class GS1CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * codeListVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * codeListVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

}
