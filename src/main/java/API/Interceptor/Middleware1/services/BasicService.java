package API.Interceptor.Middleware1.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BasicService {

    public LocalDateTime currentTime() {
        LocalDateTime localDate = LocalDateTime.now();
        return localDate;
    }
}