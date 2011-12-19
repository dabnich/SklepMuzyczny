import java.util.*;

public class Sklep {
	
	String nazwa;
	List<CD> CDs = new ArrayList<CD>();
	

	public Sklep(String nazwa){
		this.nazwa = nazwa;
		this.CDs = new ArrayList<CD>();
	}

	public void dodajCD(String tytul, String wykonawca, int rok, StyleWybor styl, int cena){
		if (cena>0){
			CDs.add(new CD(tytul, wykonawca, rok, styl, cena));
		}
		else{
			//Wyjatek
		}
	}
	
	public void wyswietlWszystkieCD(){
		for(CD cd : CDs){
			cd.wyswietlCD();
		}
	}
	
	public void usunWybranyCD(String NazwaPlyty){
		int i=0;
		boolean istnieje=false;
		for(CD cd : CDs){
			if(cd.tytul==NazwaPlyty) {
				istnieje=true;
				break;
			}
			i++;
		}
		if(istnieje==true){
			CDs.remove(i);
			//logger
		}
		else{
			//logger nie mozna usunac, nie ma takiego CD
		}
	}
	
	public void usunWszystkieCD(){
		CDs.clear();
		//logger
	}
	
	public void wyswietlCDpoStylach(StyleWybor styl){           
		for (CD cd : CDs){
			if(styl==cd.pobierzStyl()){
				cd.wyswietlCD();
			}
		}
	}
	
	public void zmienCeneCD(String NazwaPlyty, int cena){
		boolean istnieje = false;
		for (CD cd : CDs){
			if(NazwaPlyty==cd.tytul){
				istnieje = true;
				cd.cena = cena;
				break;
			}
		}
		if(!istnieje){
			//logger zmienic ceny, nie ma takiego CD
		}
	}
	
	
	public void zmienStylCD(String NazwaPlyty, StyleWybor styl){
		boolean istnieje = false;
		for (CD cd : CDs){
			if(NazwaPlyty==cd.tytul){
				istnieje = true;
				cd.styl = styl;
				break;
			}
		}
		if(!istnieje){
			//logger zmienic stylu, nie ma takiego CD
		}
	}
	

	


}


