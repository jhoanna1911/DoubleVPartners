package com.example.perfiles.service;

import com.example.perfiles.model.Perfil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class PerfilService {
    @Value("${github.api.url}")
    private String githubApiUrl;

    public Perfil getUserByUsername(String username) {
        String url = UriComponentsBuilder
                .fromHttpUrl(githubApiUrl + "/users/" + username)
                .build()
                .toUriString();

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Perfil.class);
    }
}
