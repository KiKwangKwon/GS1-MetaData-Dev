 


package org.gs1.source.tsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AllowanceOrChargeEnumerationType�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="AllowanceOrChargeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOWANCE"/>
 *     &lt;enumeration value="CHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllowanceOrChargeEnumerationType")
@XmlEnum
public enum AllowanceOrChargeEnumerationType {

    ALLOWANCE,
    CHARGE;

    public String value() {
        return name();
    }

    public static AllowanceOrChargeEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
