package com.No9.no9;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerMapper playerMapper;

    public PlayerService(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    public Player findPlayer(int uniformNumber) {
        Optional<Player> player = this.playerMapper.findByUniformNumber(uniformNumber);
        return player.orElseThrow(() -> new PlayerNotFoundException("UniformNumber" + uniformNumber + "player not found"));
    }
}