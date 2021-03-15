public abstract class Paratha{
		void prepareDough()
		{
		   System.out.println("Knead the dough");
		}
		abstract void addStuffing();
		void cook()
		  {
		    System.out.println("Cook the paratha using lots of butter");
		  }
		abstract void serve();
}