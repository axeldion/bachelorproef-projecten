package dlw.spring.controller;

import dlw.spring.entities.businessPartnerDTO;
import dlw.spring.service.businesspartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/")
@RestController
public class businesspartnerController {

    private final businesspartnerService businesspartnerService;

    @Autowired
    public businesspartnerController(businesspartnerService businesspartnerService){
        this.businesspartnerService = businesspartnerService;
    }

    @GetMapping(path = "getBusinesspartners")
    public List<businessPartnerDTO> getBusinesspartners(){
        return businesspartnerService.getBusinesspartners();
    }
}
