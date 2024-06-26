package br.com.cleilsonandrade.challengeregistergame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cleilsonandrade.challengeregistergame.infra.CodenameHandler;
import br.com.cleilsonandrade.challengeregistergame.model.GroupType;
import br.com.cleilsonandrade.challengeregistergame.model.Player;
import br.com.cleilsonandrade.challengeregistergame.model.PlayerDTO;
import br.com.cleilsonandrade.challengeregistergame.repositories.PlayerRepository;

@Service
public class PlayerService {
  @Autowired
  private PlayerRepository playerRepository;

  @Autowired
  private CodenameHandler codenameHandler;

  @Transactional
  public Player createPlayer(PlayerDTO playerDTO) {
    Player newPlayer = new Player(playerDTO);
    String codename = getCodename(playerDTO.groupType());
    newPlayer.setCodename(codename);
    return this.playerRepository.save(newPlayer);
  }

  @Transactional(readOnly = true)
  private String getCodename(GroupType groupType) {
    return codenameHandler.findCodename(groupType);
  }

  @Transactional(readOnly = true)
  public Object getAllPlayers() {
    return this.playerRepository.findAll();
  }
}
