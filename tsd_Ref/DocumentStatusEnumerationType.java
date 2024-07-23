 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocumentStatusEnumerationType�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatusEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDITIONAL_TRANSMISSION"/>
 *     &lt;enumeration value="COPY"/>
 *     &lt;enumeration value="ORIGINAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatusEnumerationType")
@XmlEnum
public enum DocumentStatusEnumerationType {

    ADDITIONAL_TRANSMISSION,
    COPY,
    ORIGINAL;

    public String value() {
        return name();
    }

    public static DocumentStatusEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
