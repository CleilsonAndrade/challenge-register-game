package br.com.cleilsonandrade.challengeregistergame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleilsonandrade.challengeregistergame.model.Player;
import br.com.cleilsonandrade.challengeregistergame.model.PlayerDTO;
import br.com.cleilsonandrade.challengeregistergame.service.PlayerService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/players")
public class PlayerController {
  @Autowired
  private PlayerService playerService;

  @PostMapping
  public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO playerDTO) {
    Player newPlayers = this.playerService.createPlayer(playerDTO);
    return new ResponseEntity<>(newPlayers, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<Object> getAllPlayers() {
    return ResponseEntity.status(HttpStatus.OK).body(this.playerService.getAllPlayers());
  }
}
