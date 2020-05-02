package dlw.spring.service;

import dlw.spring.entities.businessPartnerDTO;
import dlw.spring.utils.businesspartnerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class businesspartnerService {

    @Autowired
    private businesspartnerUtil businesspartnerUtil;

    public List<businessPartnerDTO> getBusinesspartners(){
        return businesspartnerUtil.getBusinesspartners();
    }
}
