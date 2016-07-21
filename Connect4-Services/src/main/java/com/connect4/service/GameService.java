package com.connect4.service;

import com.connect4.Player;

public interface GameService {
	int startGame(); 
	boolean dropDisk(int gameId, int playerId, int column);
	boolean is4DiscConnected(int gameId, int playerId);
}
