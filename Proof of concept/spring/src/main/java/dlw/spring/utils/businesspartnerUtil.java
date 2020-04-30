package dlw.spring.utils;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dlw.spring.entities.businessPartnerDTO;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class businesspartnerUtil {


    public List<businessPartnerDTO> getBusinesspartners() {

        //Fetch businessPartners
        String fetchUrl = "http://localhost:8080/businesspartners";
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Accept", "application/json;charset=ISO-8859-1");
        HttpEntity<?> requestEntity = new HttpEntity(requestHeaders);
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> responseEntity = template.exchange(fetchUrl, HttpMethod.GET, requestEntity, String.class);
        String responseString=  responseEntity.getBody();

        //Convert responseString to jsonArray
        JsonElement jElement = new JsonParser().parse(responseString);
        JsonArray jsonArray = jsonArray = jElement.getAsJsonArray();


        List<businessPartnerDTO> businessPartnerList = new ArrayList<>();

       for(int i = 0 ; i < jsonArray.size(); i++){
           String businessPartner;
           String creationDate;
           String firstName;
           String lastName;
           boolean isFemale;
           boolean isMale;
           businessPartner = jsonArray.get(i).getAsJsonObject().get("BusinessPartner").toString().replace("\"","");
           creationDate = jsonArray.get(i).getAsJsonObject().get("CreationDate").toString().replace("\"","");
           firstName = jsonArray.get(i).getAsJsonObject().get("FirstName").toString().replace("\"","");
           lastName = jsonArray.get(i).getAsJsonObject().get("LastName").toString().replace("\"","");
           isFemale = Boolean.parseBoolean(jsonArray.get(i).getAsJsonObject().get("IsFemale").toString());
           isMale = Boolean.parseBoolean(jsonArray.get(i).getAsJsonObject().get("IsMale").toString());
           businessPartnerList.add(new businessPartnerDTO(businessPartner, creationDate, firstName, lastName, isFemale, isMale));
       }

        return  businessPartnerList;
    }
}
