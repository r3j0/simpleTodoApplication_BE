package org.example.simpleTodo.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        @Value("${WEB_URL}")
        private String webUrl;
        
        // 모든 요청에 대해 CORS 허용
        registry.addMapping("/**")
                .allowedOrigins(webUrl)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
                .allowedHeaders(
                        "Content-Type",     // JSON 데이터
                        "Authorization",    // JWT 또는 인증 토큰
                        "Accept",           // 응답 타입
                        "X-Requested-With", // Ajax
                        "Origin",           // CORS
                        "Access-Control-Allow-Headers",  // CORS
                        "Access-Control-Allow-Origin"   // CORS
                )
                .allowCredentials(true)
                .maxAge(3600);
    }
}
