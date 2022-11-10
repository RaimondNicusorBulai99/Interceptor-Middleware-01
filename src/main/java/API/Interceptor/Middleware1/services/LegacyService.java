package API.Interceptor.Middleware1.services;

import org.springframework.stereotype.Service;

@Service
public class LegacyService {

    public String message() {
        return "This is just old code";
    }
}