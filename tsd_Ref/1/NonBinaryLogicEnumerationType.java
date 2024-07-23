 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NonBinaryLogicEnumerationType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="NonBinaryLogicEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FALSE"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="TRUE"/>
 *     &lt;enumeration value="UNSPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonBinaryLogicEnumerationType")
@XmlEnum
public enum NonBinaryLogicEnumerationType {

    FALSE,
    NOT_APPLICABLE,
    TRUE,
    UNSPECIFIED;

    public String value() {
        return name();
    }

    public static NonBinaryLogicEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
