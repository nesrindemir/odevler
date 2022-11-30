


 class helloWorldTest {

	public static void main(String[] args) {
		helloWorld nesne = new helloWorld();

		String cevap = nesne.selamSoyle("nesrin");
		System.out.println(cevap);
		
		cevap = nesne.selamSoyle("Zeynep");
		System.out.println(cevap);
		
		System.out.println("World: " + nesne.world);
		
		cevap = nesne.selamSoyle("");
		System.out.println(cevap);
	}
}

 class helloWorld{
	
	String world = "everybody"; 
	
	public String selamSoyle(String whom) {
		String sentence;
		if (whom != "")
			sentence = "Selam " + whom + " :)";
		else
			sentence = "Selam " + world + " :)";
		return sentence;
 }
} 
