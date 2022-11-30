<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>api test</name>
   <tag></tag>
   <elementGuidId>322d78ad-1b43-4395-bedb-ca534e685958</elementGuidId>
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
      &quot;value&quot;: &quot;{\&quot;JSONFile\&quot;: {\&quot;userid\&quot;: \&quot;adminpp@tandatanganku.com\&quot;,\&quot;document_id\&quot;: \&quot;DOCCDIGROUP_001\&quot;,\&quot;payment\&quot;: \&quot;3\&quot;,\&quot;send-to\&quot;: [{\&quot;name\&quot;: \&quot;signer 1\&quot;,\&quot;email\&quot;: \&quot;cdigroup1@tandatanganku.com\&quot;},{\&quot;name\&quot;: \&quot;signer 2\&quot;,\&quot;email\&quot;: \&quot;cdigroup2@tandatanganku.com\&quot;}],\&quot;req-sign\&quot;: [{\&quot;name\&quot;: \&quot;signer 2\&quot;,\&quot;email\&quot;: \&quot;cdigroup2@tandatanganku.com\&quot;,\&quot;user\&quot;: \&quot;ttd1\&quot;,\&quot;page\&quot;: \&quot;1\&quot;,\&quot;llx\&quot;: \&quot;357\&quot;,\&quot;lly\&quot;: \&quot;348\&quot;,\&quot;urx\&quot;: \&quot;487\&quot;,\&quot;ury\&quot;: \&quot;413\&quot;,\&quot;visible\&quot;: \&quot;1\&quot;}],\&quot;redirect\&quot;: true}}&quot;,
      &quot;type&quot;: &quot;Text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;file&quot;,
      &quot;value&quot;: &quot;C:\\Users\\dignitas\\Downloads\\Prospektus.pdf&quot;,
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
      <value>multipart/form-data; boundary=&lt;calculated when request is sent></value>
      <webElementGuid>a247e554-65d2-444f-af7f-b03c3e0c1915</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer NsOQOUUiUOTCMUaHXSJDbYWQUWFLAqShq1JlICE4CwK1ThwrMgXZR1Kh1dNbjP</value>
      <webElementGuid>9ba480f2-ee70-4326-a3d7-6d0d55310ef3</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.tandatanganku.com/SendDocMitraAT.html</restUrl>
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
