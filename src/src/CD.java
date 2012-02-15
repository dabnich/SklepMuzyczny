package src;

public class CD {

	public String tytul;
	public String wykonawca;
	public int rok;
	public StyleWybor styl;
	public int cena;
	
	public CD (String tytul, String wykonawca, int rok, StyleWybor styl, int cena){
		
		this.tytul = tytul;
		this.wykonawca = wykonawca;
		this.rok = rok;
		this.styl = styl;
		this.cena = cena;
	}
	
	public CD (int rok){
		this.rok = rok;
	}
	
	
	public String wyswietlCD(){
		//System.out.println("Tytul: "+tytul+"\tWykonawca: " +wykonawca+"\tRodzaj: "+styl+"\tRok wydania: "+rok+"\tCena: " +cena);
		//logger.info
		return("Tytul: "+tytul+"\tWykonawca: " +wykonawca+"\tRodzaj: "+styl+"\tRok wydania: "+rok+"\tCena: " +cena);
	}
	
	
	public String pobierzTytul(){
		return this.tytul;
	}
	
	public String pobierzWykonawce(){
		return this.wykonawca;
	}
	
	public int pobierzRok(){
		return this.rok;
	}
	
	public StyleWybor pobierzStyl(){
		return this.styl;
	}
	
	public int pobierzCene(){
		return this.cena;
	}
	



	
}
