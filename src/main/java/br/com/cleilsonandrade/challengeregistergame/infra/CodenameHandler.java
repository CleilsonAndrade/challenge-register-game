package br.com.cleilsonandrade.challengeregistergame.infra;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cleilsonandrade.challengeregistergame.model.GroupType;
import br.com.cleilsonandrade.challengeregistergame.service.CodenameService;

@Component
public class CodenameHandler {
  @Autowired
  private CodenameService codenameService;

  public String findCodename(GroupType groupType) {
    if (groupType == GroupType.AVENGERS) {
      return codenameService.getAvengersCodenameList().stream()
          .collect(Collectors.joining(" "));
    } else {
      return codenameService.getJusticeLeagueList().stream()
          .collect(Collectors.joining(" "));
    }
  }

}
