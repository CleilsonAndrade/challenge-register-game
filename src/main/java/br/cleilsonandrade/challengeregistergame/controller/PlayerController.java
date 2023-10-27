package br.cleilsonandrade.challengeregistergame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cleilsonandrade.challengeregistergame.model.Player;
import br.cleilsonandrade.challengeregistergame.model.PlayerDTO;
import br.cleilsonandrade.challengeregistergame.service.PlayerService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/players")
public class PlayerController {
  @Autowired
  private PlayerService playerService;

  @PutMapping
  public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO playerDTO) {
    Player newPlayers = this.playerService.createPlayer(playerDTO);
    return new ResponseEntity<>(newPlayers, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<Object> getAllPlayers() {

    return ResponseEntity.status(HttpStatus.OK).body(this.playerService.getAllPlayers());
  }
}
