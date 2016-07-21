Feature: Connect 4  

  	Scenario: Start a game    
	Given I am a player (1)
	When I start a game
	Then I play connect four with a friend
	
	Scenario: Start a move	
	Given I am a player
	When I drop my colour disc into a non full column on a gameboard
	Then so that I can participate in a game of connect four with a friend
	
	Scenario: Determine the outcome	
	Given I am a player
	When I need to determine the outcome of the game
	Then I know if I have won , lost, or drawn.
	
	Scenario: Verify rules of game
	Given I am a player
	When  I drop my colour disc into a non full column on a gameboard
	Then Game service need to enforce the rules of connect four
	
	Scenario: Multiple player capability
	When Multiple player play the game concurrently
	Then The game gervice support multiple concurrent games