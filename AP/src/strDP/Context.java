package strDP;

public class Context {
	   private Interface strategy;

	   public Context(Interface strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
}
