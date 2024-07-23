 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NonBinaryLogicEnumerationType�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
