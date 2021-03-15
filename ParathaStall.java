abstract class ParathaStall{
	Paratha paratha = null;
	abstract Paratha createParatha(String type);
	Paratha orderParatha(String type){
		paratha=createParatha(type);
		paratha.prepareDough();
		paratha.addStuffing();
		paratha.cook();
		paratha.serve();
		return paratha;
	}
}