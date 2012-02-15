package src;
import java.util.*;
import org.apache.log4j.Logger;

public class Sklep {
	
	private static Logger logger = Logger.getLogger(Sklep.class);
	
	String nazwa;
	List<CD> CDs = new ArrayList<CD>();
	

	public Sklep(String nazwa){
		this.nazwa = nazwa;
		this.CDs = new ArrayList<CD>();
	}

	public void dodajCD(String tytul, String wykonawca, int rok, StyleWybor styl, int cena) throws Wyjatki {
		if (cena>0){
			CDs.add(new CD(tytul, wykonawca, rok, styl, cena));
			logger.info("Plyta: " +tytul+ " zostala dodana");
		}
		else{
			throw new Wyjatki("Cena nie moze byc nizsza od zera");
		}
	}
	
	public boolean wyswietlWszystkieCD(){
		boolean istnieje=false;
		logger.info(nazwa + "Posiada nastepujace plyty: ");
		for(CD cd : CDs){
			cd.wyswietlCD();
			istnieje=true;
		}
		if(!istnieje){
			logger.info("brak");
			return false;
		}
		return true;
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
			logger.info("Plyta: " +NazwaPlyty+ " zostala usunieta");
		}
		else{
			logger.info("nie mozna usunac plyty: " +NazwaPlyty+ " , nie ma takiego CD");
		}
	}
	
	public void usunWszystkieCD(){
		CDs.clear();
		logger.info("wszystkie plyty zostaly usuniete");
	}
	
	public boolean wyswietlCDpoStylach(StyleWybor styl){           
		boolean istnieje=false;
		logger.info("Lista plyt w stylu: " +styl);
		for (CD cd : CDs){
			if(styl==cd.pobierzStyl()){
				logger.info(cd.wyswietlCD());
				istnieje = true;
			}
		}
		if(!istnieje){
				logger.info("brak");
				return false;
		}
		return true;
		
	}
	
	public boolean wyswietlCDpoCenie(int cena){           
		boolean istnieje=false;
		logger.info("Lista plyt o cenie -"+cena+" zl");
		for (CD cd : CDs){
			if(cena==cd.pobierzCene()){
				logger.info(cd.wyswietlCD());
				istnieje = true;
			}
		}
		if(!istnieje){
			logger.info("brak");
			return false;
		}
		return true;
		
	}
	
	public boolean wyswietlCDpoTytule(String tytul){           
		boolean istnieje=false;
		logger.info("Lista plyt o tytule: " +tytul);
		for (CD cd : CDs){
			if(tytul==cd.pobierzTytul()){
				logger.info(cd.wyswietlCD());
				istnieje = true;
			}
		}
		if(!istnieje){
			logger.info("brak");
			return false;
		}
		return true;
	}	
	
	public void zmienCeneCD(String NazwaPlyty, int cena) throws Wyjatki {
		boolean istnieje = false;
		if(cena > 0) {
			for (CD cd : CDs){
				if(NazwaPlyty==cd.tytul){
					istnieje = true;
					cd.cena = cena;
					logger.info("Zmieniono cene na: " +cena+ " w tytule: "+NazwaPlyty);
					break;
				}
			}
			if(!istnieje){
				logger.info ("Nie mozna zmienic ceny, "+NazwaPlyty+" nie istnieje");
			}
		}
		else{
			throw new Wyjatki("Cena nie moze byc nizsza od zera");
		}
	}
	
	
	public void zmienStylCD(String NazwaPlyty, StyleWybor styl){
		boolean istnieje = false;
		for (CD cd : CDs){
			if(NazwaPlyty==cd.tytul){
				istnieje = true;
				cd.styl = styl;
				logger.info("Zmieniono rodzaj na: " +styl+ " w tytule: "+NazwaPlyty);
				break;
			}
		}
		if(!istnieje){
			logger.info ("Nie mozna zmienic ceny, "+NazwaPlyty+" nie istnieje");
		}
	}
	
	public void zmienRokCD(String NazwaPlyty, int rok){
		boolean istnieje = false;
		for (CD cd : CDs){
			if(NazwaPlyty==cd.tytul){
				istnieje = true;
				cd.rok = rok;
				logger.info("Zmieniono rok na: " +rok+ " w tytule: "+NazwaPlyty);
				break;
			}
		}
		if(!istnieje){
			logger.info ("Nie mozna zmienic ceny, "+NazwaPlyty+" nie istnieje");
		}
	}
	

	


}


