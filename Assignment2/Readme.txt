Class Hierarchy:
.Main :-Runs entire program

.AbstractCharacter :- Template for NPC

.NPC (Template for the main NPC)
   -Nurse :-when interacted with, player's pokemon is healed
   -Villager :-when interacted with, gives player money($1~$30), and talks to player
   -PokemonTrainer :-when interacted with, challenges player with one pokemon, gives money($1~$300) if player wins]
      -GymLeader :-when interacted with, challenges player with two pokemon, gives money($1~$450)

.PokemonData (Countains attributes:id,name,type,move,maxHP,currentHP,attack,speed with getters and setters)

.PokemonList (Stores a list of starter pokemon for player to choose from when openning program)

.NPCGenerator (Generates a list of NPC characters for the player to interact with)
	Villagers(3):
	- name: Mr. Fuji, job: Oldman, quote: "Without deep love for PokeMon, your quest may fail"
	- name: Blue, job: Professor's Grandson, quote:"Smell ya later!"
	- name: Lillie, job: Researcher, quote:"You want to go up to the ruins? I don't know what you hope to find there..."

	Nurse(1):
	- name: Joy, job: Nurse, quote:"Do you need some help?"	
	
	PokemonTrainer(3):
	- name: Ryan, job: Pokemon Trainer, quote: "I challenge you!", PokemonData: pikachu;
	- name: Hannah, job: Pokemon Trainer, quote: "My Pokemon is better than yours!", PokemonData: alakazam;
	- name: Kev, job: Pokemon Trainer, quote: "I'm going to destroy you!", PokemonData: machamp;
	
	Gym Leaders(3):

	- name: Giovanni, job: Gym Leader, quote: "Don't play with fire, or you will get burnt!'",gymType: Fire, PokeMon: chamander, charizard;
	- name: Jessica, job: Gym Leader, quote: "Lets see how good you are then!", gymType: Grass, pokeMon: oddish, gloom
	- name: Brock, job: Gym Leader, quote: "Hmm, another Pokemon Trainer?", gymType: Water, pokeMon: squirtle, wartortle
	
.Player (Since player has unique attributes (money, wings, badgeList, Pokemon) a separate class was created to accomodate)

Important Gameplay Design info:
	battle() :- returns true if the player Pokemon wins battle, false if player Pokemon loses the battle. 
	In the case of the GymLeader, if player Pokemon wins both battles then the function will return true. 
	After returning true, giveMoney() will be executed which increases player obj money.

	createPlayer() :- this method instantiates a Player module and assigns to him a Pokemon of his choice.

	choosePokemon() :- this method creates a PokemonList obj for the player to select a pokeMon. The player will
	talk to Professor Oak who will let player select pokemon of their choice. When Pokemon
	is selected, it will return a PokemonData obj to createPlayer() to complete creation of new player.
	Exeption handling prevents user from entering wrong data that will cause program to crash.

	meetPeople() :- this method creates an NPCGenerator object and removes the Nurse obj because we will not
	meet her while walking around the town as she is in the Pokemon Center. Then a random id (size of NPCGenerator list)
	will be created and then toString() will show the NPC's info. Then the user is given the option to either (Talk,Ignore,Quit).
	When user inputs "talk" the NPC obj interact() will be called which would then call the giveMoney() or battle(), etc.




