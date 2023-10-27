package br.cleilsonandrade.challengeregistergame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cleilsonandrade.challengeregistergame.infra.CodenameHandler;
import br.cleilsonandrade.challengeregistergame.model.GroupType;
import br.cleilsonandrade.challengeregistergame.model.Player;
import br.cleilsonandrade.challengeregistergame.model.PlayerDTO;
import br.cleilsonandrade.challengeregistergame.repositories.PlayerRepository;

@Service
public class PlayerService {
  @Autowired
  private PlayerRepository playerRepository;

  @Autowired
  private CodenameHandler codenameHandler;

  public Player createPlayer(PlayerDTO playerDTO) {
    Player newPlayer = new Player(playerDTO);
    String codename = getCodename(playerDTO.groupType());
    newPlayer.setCodename(codename);

    return this.playerRepository.save(newPlayer);
  }

  private String getCodename(GroupType groupType) {
    return codenameHandler.findCodename(groupType);
  }

  public Object getAllPlayers() {
    return this.playerRepository.findAll();
  }
}
