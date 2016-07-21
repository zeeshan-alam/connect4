package com.connect4;

public interface Connect4Game {
	public boolean is4DiscConnected(int playerId);
	public boolean dropDisk(int playerId, int column);	
	public void reset();
}
