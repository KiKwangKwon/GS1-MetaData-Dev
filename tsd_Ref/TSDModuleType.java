 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSD_ModuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TSD_ModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_ModuleType", namespace = "urn:gs1:tsd:tsd_common:xsd:1")
@XmlSeeAlso({
    TSDBasicProductInformationModuleType.class,
    TSDModulesType.class,
    TSDFoodAndBeverageIngredientInformationModuleType.class,
    TSDFoodAndBeveragePreparationInformationModuleType.class,
    TSDNutritionalProductInformationModuleType.class,
    TSDProductAllergenInformationModuleType.class,
    TSDProductClaimsAndEndorsementsModuleType.class,
    TSDProductInstructionsModuleType.class,
    TSDProductOriginInformationModuleType.class,
    TSDProductQuantityInformationModuleType.class
})
public class TSDModuleType {


}
