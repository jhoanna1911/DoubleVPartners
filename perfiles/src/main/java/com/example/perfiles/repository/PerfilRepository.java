package com.example.perfiles.repository;

import com.example.perfiles.model.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Repository
public class PerfilRepository {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${github.api.url}")
    private String githubApiUrl;

    public Perfil getUserByUsername(String username) {
        String url = UriComponentsBuilder
                .fromHttpUrl(githubApiUrl + "/users/{username}")
                .buildAndExpand(username)
                .toUriString();

        return restTemplate.getForObject(url, Perfil.class);
    }
}
