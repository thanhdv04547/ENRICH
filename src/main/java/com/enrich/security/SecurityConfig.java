package com.enrich.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/** SecurityConfig. */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

  /**
   * filterChain.
   *
   * @param http HttpSecurity
   * @return SecurityFilterChain
   * @throws Exception Exception
   */
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.oauth2ResourceServer(
        oauth2ResourceServerCustomizer ->
            oauth2ResourceServerCustomizer.jwt(
                jwtCustomizer ->
                    jwtCustomizer.jwtAuthenticationConverter(
                        new KeycloakJwtAuthenticationConverter())));
    http.cors(AbstractHttpConfigurer::disable);
    return http.build();
  }
}
