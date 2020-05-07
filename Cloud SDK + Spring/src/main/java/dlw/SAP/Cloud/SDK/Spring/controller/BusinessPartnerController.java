package dlw.SAP.Cloud.SDK.Spring.controller;

import com.google.gson.Gson;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestination;
import com.sap.cloud.sdk.datamodel.odata.helper.Order;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.DefaultErpHttpDestination;
import com.sap.cloud.sdk.s4hana.connectivity.ErpHttpDestination;

import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;
import dlw.SAP.Cloud.SDK.Spring.config.DestinationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api")
@RestController
public class BusinessPartnerController {

    @Autowired
    private DestinationConfig config;

    private final Logger logger = LoggerFactory.getLogger(BusinessPartnerController.class);

    @GetMapping(path = "businesspartners", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllBusinessPartners(){
        try {
            final List<BusinessPartner> businessPartners =
                    new DefaultBusinessPartnerService()
                            .getAllBusinessPartner()
                            .select(BusinessPartner.BUSINESS_PARTNER,
                                    BusinessPartner.LAST_NAME,
                                    BusinessPartner.FIRST_NAME,
                                    BusinessPartner.IS_MALE,
                                    BusinessPartner.IS_FEMALE,
                                    BusinessPartner.CREATION_DATE)
                            .filter(BusinessPartner.BUSINESS_PARTNER_CATEGORY.eq("1"))
                            .orderBy(BusinessPartner.LAST_NAME, Order.ASC)
                            .top(200)
                            .execute(config.getDestination());

            return new Gson().toJson(businessPartners);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
