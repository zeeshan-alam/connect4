package com.connect4.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.connect4.Connect4Game;
import com.connect4.Connect4GameImpl;
import com.connect4.Player;

public class GameServiceImpl implements GameService {
	
	
	private static GameServiceImpl instance = null;
	   protected GameServiceImpl() {
	      // Exists only to defeat instantiation.
	   }
	   public static GameServiceImpl getInstance() {
	      if(instance == null) {
	         instance = new GameServiceImpl();
	      }
	      System.out.println("ASD");
	      return instance;
	   }
	   

	private Map<Integer,Connect4Game> gameMap = new ConcurrentHashMap<Integer,Connect4Game>();
	AtomicInteger gameId = new AtomicInteger(); 
	
	public int startGame() {
		Connect4Game connect4Game = new Connect4GameImpl();
		int nextGameId = gameId.incrementAndGet();
		gameMap.put(nextGameId, connect4Game);
		return nextGameId;
	}

	public boolean dropDisk(int gameId, int playerId, int column) {
		return gameMap.get(gameId).dropDisk(playerId, column);
		 
	}

	public boolean is4DiscConnected(int gameId, int playerId) {
		return gameMap.get(gameId).is4DiscConnected(playerId);
		 
	}

}
