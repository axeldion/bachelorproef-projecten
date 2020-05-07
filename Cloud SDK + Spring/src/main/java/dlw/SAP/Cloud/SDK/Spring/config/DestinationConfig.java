package dlw.SAP.Cloud.SDK.Spring.config;

import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestination;
import com.sap.cloud.sdk.s4hana.connectivity.DefaultErpHttpDestination;
import com.sap.cloud.sdk.s4hana.connectivity.ErpHttpDestination;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DestinationConfig {

    private final DefaultDestination dest = DefaultDestination.builder()
            .property("Name", "MyErpSystem")
            .property("URL", "https://my300031-api.s4hana.ondemand.com/sap/opu/odata/sap/")
            .property("Type", "HTTP")
            .property("Authentication", "BasicAuthentication")
            .property("User", "xxx")
            .property("Password", "xxx")
            .build();

    private final ErpHttpDestination destination = dest.asHttp().decorate(DefaultErpHttpDestination::new);

    public DestinationConfig() {
    }

    public ErpHttpDestination getDestination() {
        return destination;
    }

}
