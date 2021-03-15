class DelhiParathaStall extends ParathaStall{
	Paratha paratha = null;
	Paratha createParatha(String type){
		if(type.equals("Aloo Paratha")){
			paratha = new DelhiAlooParatha(); 	
		}
		if(type.equals("Momos Paratha")){
			paratha = new DelhiMomosParatha(); 	
		}
		paratha.prepareDough();
		paratha.addStuffing();
                paratha.cook();
		paratha.serve();
		return paratha;
	}
}