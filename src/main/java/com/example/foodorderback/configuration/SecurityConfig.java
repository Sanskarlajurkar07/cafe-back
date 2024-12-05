//package com.example.foodorderback.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	 @Bean(name = "securityConfigSecurity")
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.cors().configurationSource(request -> {
//            CorsConfiguration config = new CorsConfiguration();
//            config.setAllowCredentials(true);
//            config.addAllowedOriginPattern("*");
//            config.addAllowedHeader("*");
//            config.addAllowedMethod("*");
//            return config;
//        });
//
//        http.csrf().disable();  // Disable CSRF for simplicity (enable it in production)
//
//        return http.build();
//    }
//}
//
