<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>register API</name>
   <tag></tag>
   <elementGuidId>94b86e2a-1092-47e3-9d71-0a603ffb2f24</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>NsOQOUUiUOTCMUaHXSJDbYWQUWFLAqShq1JlICE4CwK1ThwrMgXZR1Kh1dNbjP</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;jsonfield&quot;,
      &quot;value&quot;: &quot;{\&quot;JSONFile\&quot;:{\&quot;userid\&quot;:\&quot;adminpp@tandatanganku.com\&quot;,\&quot;alamat\&quot;:\&quot; \&quot;,\&quot;jenis_kelamin\&quot;:\&quot;laki-laki\&quot;,\&quot;kecamatan\&quot;:\&quot; \&quot;,\&quot;kelurahan\&quot;:\&quot; \&quot;,\&quot;kode-pos\&quot;:\&quot; \&quot;,\&quot;kota\&quot;:\&quot; \&quot;,\&quot;nama\&quot;:\&quot;CDI GROUP\&quot;,\&quot;tlp\&quot;:\&quot;080752000729\&quot;,\&quot;tgl_lahir\&quot;:\&quot;01-01-1990\&quot;,\&quot;provinci\&quot;:\&quot; \&quot;,\&quot;idktp\&quot;:\&quot;2389889884958899\&quot;,\&quot;tmp_lahir\&quot;:\&quot;Jakarta\&quot;,\&quot;email\&quot;:\&quot;cdigroup@tandatanganku.com\&quot;,\&quot;npwp\&quot;:\&quot; \&quot;,\&quot;redirect\&quot;:\&quot;true\&quot;}}&quot;,
      &quot;type&quot;: &quot;Text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;fotodiri&quot;,
      &quot;value&quot;: &quot;C:\\Users\\dignitas\\Downloads\\046976900_1665479129-cepmek.jpg&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;fotoktp&quot;,
      &quot;value&quot;: &quot;C:\\Users\\dignitas\\Downloads\\signature (1).png&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;ttd&quot;,
      &quot;value&quot;: &quot;C:\\Users\\dignitas\\Downloads\\signature (1).png&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;fotonpwp&quot;,
      &quot;value&quot;: &quot;C:\\Users\\dignitas\\Downloads\\signature.png&quot;,
      &quot;type&quot;: &quot;File&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
      <webElementGuid>5d3f4f3f-cf06-42c5-8ffd-8c495c4e8dcd</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer NsOQOUUiUOTCMUaHXSJDbYWQUWFLAqShq1JlICE4CwK1ThwrMgXZR1Kh1dNbjP</value>
      <webElementGuid>525573e1-35da-4fe0-b70e-cc5fa79b4d89</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.tandatanganku.com/REG-MITRA.html</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
