package API.Interceptor.Middleware1.controllers;

import API.Interceptor.Middleware1.services.LegacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @Autowired
    private LegacyService legacyService;

    @GetMapping
    public String message(){
        return legacyService.message();
    }
}