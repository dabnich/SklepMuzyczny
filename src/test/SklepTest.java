package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import src.*;


public class SklepTest {

	String tytul="title";
	String wykonawca="wykonawca";
	int rok=1990;
	StyleWybor styl=StyleWybor.Jazz;
	StyleWybor nowyStyl=StyleWybor.Rock;
	int cena=30;
	int nowaCena=40;
	
	String nazwaSklepu;
	
	Sklep sklep = new Sklep(nazwaSklepu);
	
	CD cd = new CD(tytul, wykonawca, rok, styl, cena);
	
	@Before
	public void setUp() throws Exception {
		sklep.dodajCD(tytul, wykonawca, rok, styl, cena);
	}

	@After
	public void tearDown() throws Exception {
		sklep.usunWybranyCD(tytul);
	}
	
	@Test
	public void dodajCDtest() throws Exception{
		assertTrue(sklep.wyswietlCDpoTytule(tytul));
	}
	
	@Test
	public void zmienCeneCDtest() throws Exception{
		sklep.zmienCeneCD(tytul, nowaCena);
		assertTrue(sklep.wyswietlCDpoCenie(nowaCena));
	}
	
	@Test
	public void wyswietlWszystkieCDtest() throws Exception{
		sklep.zmienCeneCD(tytul, nowaCena);
		assertTrue(sklep.wyswietlWszystkieCD());
	}
	
	@Test
	public void zmienStylCDtest() throws Exception{
		sklep.zmienStylCD(tytul, nowyStyl);
		assertTrue(sklep.wyswietlCDpoStylach(nowyStyl));
	}
	
}
