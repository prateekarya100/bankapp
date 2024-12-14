package com.tomcat.Cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "cards")
public record ContactInfoDto(String message, Map<String,String> contactDetails, List<String> onCallSupport) {
}
