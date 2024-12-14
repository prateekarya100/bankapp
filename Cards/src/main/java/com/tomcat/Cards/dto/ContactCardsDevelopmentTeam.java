package com.tomcat.Cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.List;

@ConfigurationProperties(prefix = "cards")
public record ContactCardsDevelopmentTeam(String message, HashMap<String,String> contactDetails, List<String> onCallSupport) {
}
