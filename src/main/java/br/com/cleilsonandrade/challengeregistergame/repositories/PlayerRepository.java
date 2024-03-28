package br.com.cleilsonandrade.challengeregistergame.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cleilsonandrade.challengeregistergame.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {

}
