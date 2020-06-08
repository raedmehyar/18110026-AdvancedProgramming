package temDP;

public abstract class Trans {
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   //template method
	   public final void play(){

	      //initialize the game
	      initialize();

	      //start game
	      startPlay();

	      //end game
	      endPlay();
	   }
	}
