package ar.edu.unlpam.ing.TP2.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ar.edu.unlpam.ing.TP2.interfaces.DogImageInterface;
import ar.edu.unlpam.ing.TP2.model.DogImageResponse;

@Service
public class DogImageService implements DogImageInterface {
    private final RestTemplate rt = new RestTemplate();
    private final String url = "https://dog.ceo/api/breeds/image/random";
    
    @Override
    public DogImageResponse getDogImage() {
        return rt.getForObject(url, DogImageResponse.class);
    }

}
