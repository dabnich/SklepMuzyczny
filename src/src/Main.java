package src;
import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws Wyjatki{
		
		//BasicConfigurator.configure();
		
		Sklep s1 = new Sklep("Rock&Roll Mania");
		Sklep s2 = new Sklep("Dzem fanclub");
		
		try {
			s1.dodajCD("Pulse", "Pink Floyd", 1991, StyleWybor.Rock, 55);
			s1.dodajCD("Call Me Irresponsible", "Michael Bubble", 2007, StyleWybor.Jazz, 33);
			s1.dodajCD("A Momentary Lapse of Reason", "Pink Floyd", 1987, StyleWybor.Rock, 35);
			s1.dodajCD("The Black Album", "Jay-Z", 2003, StyleWybor.Rap, 50);
			s1.dodajCD("Island in the Sea", "Willie Nelson", 1987, StyleWybor.Country, 20);
			s1.dodajCD("Once Upon a Time in America", "Enno Morricone", 1984, StyleWybor.Soundtrack, 20);
			s1.dodajCD("Saban", "Šaban Bajramovic", 2006, StyleWybor.Etniczna, 30);
			s1.dodajCD("Ragas & Sagas", "Jan Garbarek", 1994, StyleWybor.Klasyka, 35);
			s1.usunWybranyCD("Pulse");
			s1.zmienCeneCD("Saban", 20);
			s1.zmienStylCD("Ragas & Sagas", StyleWybor.Etniczna);
			s1.wyswietlCDpoStylach(StyleWybor.Etniczna);
		} 
		catch (Wyjatki wyj) {
			logger.error(wyj);
		}
	}
}


	

