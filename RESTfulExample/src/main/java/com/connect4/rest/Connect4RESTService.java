package com.connect4.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.connect4.service.GameService;
import com.connect4.service.GameServiceImpl;
 
@Path("/resource")
public class Connect4RESTService {
	
	GameService gameService = GameServiceImpl.getInstance();
	
	@POST
	@Path("/game/start")
	public Response actionGame(@PathParam("param") String msg) {
 
		return Response.status(200).entity(String.valueOf(gameService.startGame())).build();
 	}
	
	@POST
	@Path("/game/{gameId}/drop/{playerId}/{column}")
	public Response dropDisk(@PathParam("gameId") int gameId,@PathParam("playerId") int playerId, @PathParam("column") int column) {
		System.out.println("gameId="+gameId);
		System.out.println("playerId="+playerId);
		return Response.status(200).entity(String.valueOf(gameService.dropDisk(gameId, playerId, column))).build();
 	}
	
	@GET
	@Path("/game/{gameId}/{playerId}/outcome")
	public Response CheckOutcome(@PathParam("gameId") int gameId,@PathParam("playerId") int playerId) {
		System.out.println("gameId="+gameId);
		System.out.println("playerId="+playerId);
		return Response.status(200).entity(String.valueOf(gameService.is4DiscConnected(gameId, playerId))).build();
 	}
 
}