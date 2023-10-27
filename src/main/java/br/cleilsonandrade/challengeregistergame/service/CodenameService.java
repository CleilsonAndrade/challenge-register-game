package br.cleilsonandrade.challengeregistergame.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import jakarta.annotation.PostConstruct;
import lombok.Getter;

@Service
@Getter
public class CodenameService {
  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private Environment env;

  private List<String> avengersCodenameList = new ArrayList<>();
  private List<String> justiceLeagueList = new ArrayList<>();

  ObjectMapper objectMapper = new ObjectMapper();

  @PostConstruct
  public void loadJsonData() {
    try {
      String codenameResponse = restTemplate.getForObject(env.getProperty("avangers"), String.class);
      JsonNode jsonNode = objectMapper.readTree(codenameResponse);

      ArrayNode avengers = (ArrayNode) jsonNode.get("vingadores");

      for (JsonNode item : avengers) {
        this.avengersCodenameList.add(item.get("codename").asText());
      }

    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  @PostConstruct
  public void loadXMLData() {
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(env.getProperty("justice.league"));

      NodeList codenameList = document.getElementsByTagName("codinome");

      for (int i = 0; i < codenameList.getLength(); i++) {
        Element codenameElement = (Element) codenameList.item(i);
        String codename = codenameElement.getTextContent();
        this.justiceLeagueList.add(codename);
      }

    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
