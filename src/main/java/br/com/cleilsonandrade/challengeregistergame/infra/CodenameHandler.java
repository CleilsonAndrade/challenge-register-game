package br.com.cleilsonandrade.challengeregistergame.infra;

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
      String firstMatch = codenameService.getAvengersCodenameList().stream().findFirst().orElseThrow();
      this.codenameService.getAvengersCodenameList().remove(firstMatch);
      return firstMatch;
    }
    String firstMatch = codenameService.getJusticeLeagueList().stream().findFirst().orElseThrow();
    this.codenameService.getJusticeLeagueList().remove(firstMatch);
    return firstMatch;
  }

}
