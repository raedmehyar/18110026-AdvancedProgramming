package temDP;

public class Bus extends Trans {

	   @Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}
