package com.github.vaibhavsinha.kong.api.plugin;

/**
 * Created by vaibhav on 15/06/17.
 */
public interface BasicAuthService {
    void addCredentials(String consumerIdOrUsername, String username, String password);
}
