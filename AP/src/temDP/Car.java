package temDP;

public class Car extends Trans {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}