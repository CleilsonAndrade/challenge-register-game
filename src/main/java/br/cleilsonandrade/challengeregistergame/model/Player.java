package br.cleilsonandrade.challengeregistergame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "players")
@Table(name = "tb_player")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotBlank
  private Long id;

  private String name;

  @NotBlank
  @Email
  private String email;

  private String phoneNumber;

  private String codename;

  private GroupType groupType;

  public Player(PlayerDTO playerDTO) {
    this.name = playerDTO.name();
    this.email = playerDTO.email();
    this.phoneNumber = playerDTO.phoneNumber();
    this.groupType = playerDTO.groupType();
  }
}
