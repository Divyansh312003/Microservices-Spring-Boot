package microservices.limits_service.controller;

import microservices.limits_service.configuration.Configuration;
import microservices.limits_service.modal.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMini(),configuration.getMaxi());
//       return new Limits(10,100);
    }
}
