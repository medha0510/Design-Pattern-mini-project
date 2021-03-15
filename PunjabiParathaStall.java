class PunjabiParathaStall extends ParathaStall{
	Paratha paratha = null;
	Paratha createParatha(String type){
		if(type.equals("Aloo Paratha")){
			paratha = new PunjabiAlooParatha(); 	
		}
		if(type.equals("Momos Paratha")){
			paratha = new PunjabiMomosParatha(); 	
		}
		paratha.prepareDough();
		paratha.addStuffing();
                paratha.cook();
		paratha.serve();
		return paratha;
	}
}