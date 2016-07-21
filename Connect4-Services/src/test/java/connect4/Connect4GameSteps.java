package connect4;

import org.junit.Assert;
import static org.junit.Assert.*;

import com.connect4.Connect4Game;
import com.connect4.Connect4Player;
import com.connect4.Player;
import com.connect4.service.GameService;
import com.connect4.service.GameServiceImpl;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Connect4GameSteps {
	int playerId;
	int gameId;
	GameService gameService = GameServiceImpl.getInstance();
	@Given("^I am a player \\((\\d+)\\)$")
	public void i_am_a_player(int playerId) throws Throwable {
		playerId = playerId;
	}

	@When("^I start a game$")
	public void i_start_a_game() throws Throwable {
		gameId = gameService.startGame();
	}

	//TODO Need to rewrite step to innclude user identification.
	@Then("^I play connect four with a friend$")
	public void i_play_connect_four_with_a_friend() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	//TODO Need discussion about player identity in step.
	@Given("^I am a player$")
	public void i_am_a_player() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	//TODO Need discussion about including column information in step.
	@When("^I drop my colour disc into a non full column on a gameboard$")
	public void i_drop_my_colour_disc_into_a_non_full_column_on_a_gameboard() throws Throwable {
		//gameService.dropDisk(gameId, playerId, column)
	}

	@Then("^so that I can participate in a game of connect four with a friend$")
	public void so_that_I_can_participate_in_a_game_of_connect_four_with_a_friend() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I need to determine the outcome of the game$")
	public void i_need_to_determine_the_outcome_of_the_game() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I know if I have won , lost, or drawn\\.$")
	public void i_know_if_I_have_won_lost_or_drawn() throws Throwable {
	    Assert.assertTrue(gameService.is4DiscConnected(gameId, playerId));
	}

	@Then("^Game service need to enforce the rules of connect four$")
	public void game_service_need_to_enforce_the_rules_of_connect_four() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Multiple player play the game concurrently$")
	public void multiple_player_play_the_game_concurrently() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The game gervice support multiple concurrent games$")
	public void the_game_gervice_support_multiple_concurrent_games() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
