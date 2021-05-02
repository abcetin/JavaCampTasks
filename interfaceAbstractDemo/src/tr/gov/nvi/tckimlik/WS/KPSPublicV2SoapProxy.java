package tr.gov.nvi.tckimlik.WS;

public class KPSPublicV2SoapProxy implements tr.gov.nvi.tckimlik.WS.KPSPublicV2Soap {
  private String _endpoint = null;
  private tr.gov.nvi.tckimlik.WS.KPSPublicV2Soap kPSPublicV2Soap = null;
  
  public KPSPublicV2SoapProxy() {
    _initKPSPublicV2SoapProxy();
  }
  
  public KPSPublicV2SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initKPSPublicV2SoapProxy();
  }
  
  private void _initKPSPublicV2SoapProxy() {
    try {
      kPSPublicV2Soap = (new tr.gov.nvi.tckimlik.WS.KPSPublicV2Locator()).getKPSPublicV2Soap();
      if (kPSPublicV2Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)kPSPublicV2Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)kPSPublicV2Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (kPSPublicV2Soap != null)
      ((javax.xml.rpc.Stub)kPSPublicV2Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tr.gov.nvi.tckimlik.WS.KPSPublicV2Soap getKPSPublicV2Soap() {
    if (kPSPublicV2Soap == null)
      _initKPSPublicV2SoapProxy();
    return kPSPublicV2Soap;
  }
  
  public boolean kisiVeCuzdanDogrula(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, boolean soyadYok, int dogumGun, boolean dogumGunYok, int dogumAy, boolean dogumAyYok, int dogumYil, java.lang.String cuzdanSeri, int cuzdanNo, java.lang.String TCKKSeriNo) throws java.rmi.RemoteException{
    if (kPSPublicV2Soap == null)
      _initKPSPublicV2SoapProxy();
    return kPSPublicV2Soap.kisiVeCuzdanDogrula(TCKimlikNo, ad, soyad, soyadYok, dogumGun, dogumGunYok, dogumAy, dogumAyYok, dogumYil, cuzdanSeri, cuzdanNo, TCKKSeriNo);
  }
  
  
}