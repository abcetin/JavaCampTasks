/**
 * KPSPublicV2Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

public interface KPSPublicV2Soap extends java.rmi.Remote {
    public boolean kisiVeCuzdanDogrula(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, boolean soyadYok, int dogumGun, boolean dogumGunYok, int dogumAy, boolean dogumAyYok, int dogumYil, java.lang.String cuzdanSeri, int cuzdanNo, java.lang.String TCKKSeriNo) throws java.rmi.RemoteException;
}
