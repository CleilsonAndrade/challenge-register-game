package br.com.cleilsonandrade.challengeregistergame.model;

public record PlayerDTO(
        String name,
        String email,
        String phoneNumber,
        GroupType groupType) {

}
