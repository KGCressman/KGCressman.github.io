package picker;

import java.util.ArrayList;
import java.util.Arrays;

public class Lists {
	
	ArrayList<character> tanks = new ArrayList<character>();
	ArrayList<character> dps = new ArrayList<character>();
	ArrayList<character> supports = new ArrayList<character>();
	ArrayList<character> characterList = new ArrayList<character>();
	
	public ArrayList<character> getTanks() {
		return tanks;
	}
	public ArrayList<character> getDps() {
		return dps;
	}

	public ArrayList<character> getSupports() {
		return supports;
	}

	
	public void createNewCharacterArrayList() {	
	
	//ADD DVA

	ArrayList<String> dvaGood = new ArrayList<String>(
			Arrays.asList( "Widowmaker","Junkrat","Reinhardt","Ashe","Reaper","Ana","Bastion","Hanzo",
					"Genji","Moira","Zenyatta")
			);	
	ArrayList<String> dvaBad = new ArrayList<String>(
			Arrays.asList( "Echo","Torbjorn","Sigma","Baptiste")
			);
	ArrayList<String> dvaAwful = new ArrayList<String>(
			Arrays.asList( "Sombra","Zarya","Orisa","Symmetra","Mei","Brigitte")
			);
	ArrayList<String> dvaSynergies = new ArrayList<String>(
			Arrays.asList( "Winston","Wrecking Ball","Zenyatta","Genji","Tracer","Ana")
			);
	character dva = new character("DVa","Tank", dvaGood, dvaBad, dvaAwful, dvaSynergies,1);
	
	tanks.add(dva);
	characterList.add(dva);
	
		//ADD ORISA
		
	ArrayList<String> oriGood = new ArrayList<String>(
			Arrays.asList( "Soldier 76","Ashe","McCree","Winston","Wrecking Ball","DVa","Ana","Mei","Doomfist","Brigitte")
			);	
	ArrayList<String> oriBad = new ArrayList<String>(
			Arrays.asList( "Sigma","Zarya","Genji","Lucio","Hanzo","Junkrat")
			);
	ArrayList<String> oriAwful = new ArrayList<String>(
			Arrays.asList( "Roadhog","Reinhardt","Echo","Pharah","Bastion")
			);
	ArrayList<String> oriSynergies = new ArrayList<String>(
			Arrays.asList("Roadhog","Bastion","Sigma","Ashe","Junkrat","Ana","Mercy","Baptiste","Torbjorn")
			);
	character orisa = new character("Orisa","Tank", oriGood, oriBad, oriAwful, oriSynergies,2);
	
	tanks.add(orisa);
	characterList.add(orisa);
	
	//ADD Reinhardt

	ArrayList<String> reinGood = new ArrayList<String>(
		Arrays.asList( "Widowmaker","Soldier 76","Zarya","Baptiste","Ana","McCree","Reinhardt","Orisa")
		);	
	ArrayList<String> reinBad = new ArrayList<String>(
		Arrays.asList( "Symmetra","Mercy","Zenyatta","Roadhog","Bastion","Junkrat")
		);
	ArrayList<String> reinAwful = new ArrayList<String>(
		Arrays.asList( "Sombra","Mei","Echo","Pharah","Wrecking Ball","Doomfist")
		);
	ArrayList<String> reinSynergies = new ArrayList<String>(
		Arrays.asList("Zarya","Lucio","Moira","Brigitte","Reaper","McCree","Ana","Hanzo")
		);
	character rein = new character("Reinhardt","Tank", reinGood, reinBad, reinAwful, reinSynergies,3);

	tanks.add(rein);
	characterList.add(rein);
		
	//ADD Roadhog

	ArrayList<String> hogGood = new ArrayList<String>(
		Arrays.asList( "Soldier 76","Reinhardt","Ashe","Wrecking Ball","Winston","Baptiste")
		);	
	ArrayList<String> hogBad = new ArrayList<String>(
		Arrays.asList( "Symmetra","Pharah","Echo","Torbjorn","Mercy","Sigma","Reaper")
		);
	ArrayList<String> hogAwful = new ArrayList<String>(
		Arrays.asList( "Sombra","Roadhog","Orisa","McCree","Mei")
		);
	ArrayList<String> hogSynergies = new ArrayList<String>(
		Arrays.asList("Zenyatta","Orisa","Lucio","Symmetra","Ana","Moira")
		);
	character hog = new character("Roadhog","Tank", hogGood, hogBad, hogAwful, hogSynergies,4);

	tanks.add(hog);
	characterList.add(hog);
	
	//ADD Sigma

	ArrayList<String> sigGood = new ArrayList<String>(
		Arrays.asList( "Widowmaker","Soldier 76","Junkrat","Ashe","Reaper","DVa","Torbjorn","Tracer","Genji","Bastion")
		);	
	ArrayList<String> sigBad = new ArrayList<String>(
		Arrays.asList( "Symmetra","Echo","Zarya","Winston","Reinhardt","Brigitte","Lucio")
		);
	ArrayList<String> sigAwful = new ArrayList<String>(
		Arrays.asList( "Sombra","Roadhog","Orisa","McCree","Mei","Doomfist")
		);
	ArrayList<String> sigSynergies = new ArrayList<String>(
		Arrays.asList("Orisa","Reinhardt","Zenyatta","Lucio","Mercy","McCree","Ana")
		);
	character sig = new character("Sigma","Tank", sigGood, sigBad, sigAwful, sigSynergies,5);

	tanks.add(sig);
	characterList.add(sig);

	//ADD Winston

	ArrayList<String> winstonGood = new ArrayList<String>(
		Arrays.asList( "Widowmaker","Genji","Reinhardt","Sombra","Zarya","Tracer","Ana","Symmetra","Sigma","Zenyatta","Baptiste")
		);	
	ArrayList<String> winstonBad = new ArrayList<String>(
		Arrays.asList( "McCree","Mercy","Hanzo","Wrecking Ball","Junkrat","Mei","Echo","Lucio","Moira")
		);
	ArrayList<String> winstonAwful = new ArrayList<String>(
		Arrays.asList( "Roadhog","Orisa","Torbjorn","Reaper","Bastion","Doomfist","Brigitte")
		);
	ArrayList<String> winstonSynergies = new ArrayList<String>(
		Arrays.asList("Mercy","DVa","Zenyatta","Genji","Tracer","Widowmaker","Ana")
		);
	character winston = new character("Winston","Tank", winstonGood, winstonBad, winstonAwful, winstonSynergies,6);

	tanks.add(winston);
	characterList.add(winston);

	//ADD Wrecking Ball

	ArrayList<String> ballGood = new ArrayList<String>(
		Arrays.asList( "Widowmaker","Genji","Reinhardt","Sombra","Zarya","Tracer","Ana","Symmetra","Sigma","Zenyatta","Baptiste")
		);	
	ArrayList<String> ballBad = new ArrayList<String>(
		Arrays.asList( "McCree","Mercy","Hanzo","Wrecking Ball","Junkrat","Mei","Echo","Lucio","Moira")
		);
	ArrayList<String> ballAwful = new ArrayList<String>(
		Arrays.asList( "Roadhog","Orisa","Torbjorn","Reaper","Bastion","Doomfist","Brigitte")
		);
	ArrayList<String> ballSynergies = new ArrayList<String>(
		Arrays.asList("Mercy","DVa","Zenyatta","Genji","Tracer","Widowmaker","Ana")
		);
	character ball = new character("Wrecking Ball","Tank", ballGood, ballBad, ballAwful, ballSynergies,7);

	tanks.add(ball);
	characterList.add(ball);
	
	//ADD Zarya

	ArrayList<String> zaryaGood = new ArrayList<String>(
		Arrays.asList( "Mei","Symmetra","Sigma","DVa","Ashe","Torbjorn","Genji","Zenyatta")
		);	
	ArrayList<String> zaryaBad = new ArrayList<String>(
		Arrays.asList("Wrecking Ball","Winston","Hanzo","Reinhardt","Lucio")
		);
	ArrayList<String> zaryaAwful = new ArrayList<String>(
		Arrays.asList( "Widowmaker","Pharah","Hanzo")
		);
	ArrayList<String> zaryaSynergies = new ArrayList<String>(
		Arrays.asList("Lucio","Reinhardt","Moira","Brigitte","Reaper","Genji","McCree")
		);
	character zarya = new character("Zarya","Tank", zaryaGood, zaryaBad, zaryaAwful, zaryaSynergies,8);

	tanks.add(zarya);
	characterList.add(zarya);
	

	//ADD Ashe

	ArrayList<String> asheGood = new ArrayList<String>(
		Arrays.asList("Pharah","Mercy","Ana","Zenyatta","Wrecking Ball","Roadhog","Soldier 76", "Reaper")
		);	
	ArrayList<String> asheBad = new ArrayList<String>(
		Arrays.asList("Reinhardt","Orisa","Doomfist","Genji")
		);
	ArrayList<String> asheAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Hanzo","Zarya","DVa")
		);
	ArrayList<String> asheSynergies = new ArrayList<String>(
		Arrays.asList("Orisa","Mercy","Ana","Reinhardt")
		);
	character ashe = new character("Ashe","Dps", asheGood, asheBad, asheAwful, asheSynergies,9);

	dps.add(ashe);
	characterList.add(ashe);

	//ADD Bastion

	ArrayList<String> bastionGood = new ArrayList<String>(
		Arrays.asList("Doomfist","Winston","Wrecking Ball","Reinhardt","Zarya","Soldier 76","Torbjorn","Orisa")
		);	
	ArrayList<String> bastionBad = new ArrayList<String>(
		Arrays.asList("Genji","Widowmaker","Pharah","Tracer","Echo","Hanzo","Baptiste")
		);
		ArrayList<String> bastionAwful = new ArrayList<String>(
		Arrays.asList("Roadhog","DVa","Sigma","Sombra","Junkrat")
		);
	ArrayList<String> bastionSynergies = new ArrayList<String>(
		Arrays.asList("Orisa","Sigma","Reinhardt","Ana","Mercy","Moira","DVa","Symmetra","McCree","Baptiste")
		);
character bastion = new character("Bastion","Dps", bastionGood, bastionBad, bastionAwful, bastionSynergies,10);

	dps.add(bastion);
	characterList.add(bastion);
	
	
	//ADD Doomfist
	ArrayList<String> doomfistGood = new ArrayList<String>(
		Arrays.asList("Reinhardt","Winston","Soldier 76","Ana","DVa","Genji","Zarya","Sigma","Tracer")
		);	
	ArrayList<String> doomfistBad = new ArrayList<String>(
		Arrays.asList("Brigitte","Mercy","Moira","McCree","Symmetra","Wrecking Ball","Reaper")
		);
	ArrayList<String> doomfistAwful = new ArrayList<String>(
		Arrays.asList("Sombra","Mei","Pharah","Echo","Torbjorn","Bastion","Orisa")
		);
	ArrayList<String> doomfistSynergies = new ArrayList<String>(
		Arrays.asList("Mercy","Winston","Wrecking Ball","DVa","Ana","Zenyatta","McCree","Sombra")
		);
character doomfist = new character("Doomfist","Dps", doomfistGood, doomfistBad, doomfistAwful, doomfistSynergies,11);

	dps.add(doomfist);
	characterList.add(doomfist);
	
	
	//ADD Echo
	ArrayList<String> echoGood = new ArrayList<String>(
		Arrays.asList("Reinhardt","Zarya","Roadhog","Doomfist","Bastion","Junkrat","Mei","Symmetra","Brigitte","Lucio")
		);	
	ArrayList<String> echoBad = new ArrayList<String>(
		Arrays.asList("DVa","Tracer","Wrecking Ball","Winston","Hanzo","Sigma","Baptiste","Mercy")
		);
	ArrayList<String> echoAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","McCree","Ashe","Soldier 76","Sombra","Torbjorn")
		);
	ArrayList<String> echoSynergies = new ArrayList<String>(
		Arrays.asList("Mercy","Winston","Reinhardt","Zarya","DVa")
		);
character echo = new character("Echo","Dps", echoGood, echoBad, echoAwful, echoSynergies,12);

	dps.add(echo);
	characterList.add(echo);
	
	
	//ADD Genji
	ArrayList<String> genjiGood = new ArrayList<String>(
		Arrays.asList("Ana","Zenyatta","Reinhardt","Wrecking Ball","Widowmaker","Junkrat","Bastion","Ashe","Mercy","Tracer","Reaper")
		);	
	ArrayList<String> genjiBad = new ArrayList<String>(
		Arrays.asList("Orisa","Roadhog","Sigma","DVa","Zarya","Moira","Lucio","Baptiste","Sombra","McCree")
		);
	ArrayList<String> genjiAwful = new ArrayList<String>(
		Arrays.asList("Doomfist","Winston","Symmetra","Mei","Torbjorn","Mei","Brigitte")
		);
	ArrayList<String> genjiSynergies = new ArrayList<String>(
		Arrays.asList("Mercy","Ana","Winston","DVa","Wrecking Ball","Zenyatta","Tracer","Sombra","Widowmaker","Pharah")
		);
character genji = new character("Genji","Dps", genjiGood, genjiBad, genjiAwful, genjiSynergies,13);

	dps.add(genji);
	characterList.add(genji);
	
	//ADD Hanzo
	ArrayList<String> hanzoGood = new ArrayList<String>(
		Arrays.asList("Bastion","Orisa","Reinhardt","Torbjorn","Soldier 76","Sombra")
		);	
	ArrayList<String> hanzoBad = new ArrayList<String>(
		Arrays.asList("Ashe","Mercy","Zarya","Winston","Pharah")
		);
	ArrayList<String> hanzoAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Echo","DVa")
		);
	ArrayList<String> hanzoSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character hanzo = new character("Hanzo","Dps", hanzoGood, hanzoBad, hanzoAwful, hanzoSynergies,14);

	dps.add(hanzo);
	characterList.add(hanzo);	
	
	//ADD Junkrat
	ArrayList<String> junkratGood = new ArrayList<String>(
		Arrays.asList("Bastion","Ana","Zenyatta","Reinhardt","Roadhog","Torbjorn","Brigitte")
		);	
	ArrayList<String> junkratBad = new ArrayList<String>(
		Arrays.asList("Dva","McCree","Soldier 76","Genji","Baptiste","Sigma","Zarya")
		);
	ArrayList<String> junkratAwful = new ArrayList<String>(
		Arrays.asList("Pharah","Widowmaker","Ashe","Echo","Hanzo")
		);
	ArrayList<String> junkratSynergies = new ArrayList<String>(
		Arrays.asList("Orisa","Reinhardt","Mercy","Widowmaker","Ashe","McCree","Soldier 76","Hanzo","Baptiste")
		);
character junkrat = new character("Junkrat","Dps", junkratGood, junkratBad, junkratAwful, junkratSynergies,15);

	dps.add(junkrat);
	characterList.add(junkrat);	
	
	//ADD McCree
	ArrayList<String> mcCreeGood = new ArrayList<String>(
		Arrays.asList("Junkrat","Doomfist","Wrecking Ball","Pharah","Mercy","Tracer","Reaper","Winston","Echo")
		);	
	ArrayList<String> mcCreeBad = new ArrayList<String>(
		Arrays.asList("Reinhardt","Zarya","Symmetra","Bastion","Genji","Ashe","Roadhog","Baptiste")
		);
	ArrayList<String> mcCreeAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Hanzo","Sigma","Orisa")
		);
	ArrayList<String> mcCreeSynergies = new ArrayList<String>(
		Arrays.asList("Reinhardt","Orisa","Zarya","DVa","Mercy","Lucio","Baptiste")
		);
character mcCree = new character("McCree","Dps", mcCreeGood, mcCreeBad, mcCreeAwful, mcCreeSynergies,16);

	dps.add(mcCree);
	characterList.add(mcCree);	
	
	//ADD Mei
	ArrayList<String> meiGood = new ArrayList<String>(
		Arrays.asList("Wrecking Ball","DVa","Doomfist","Reaper","Tracer","Genji","Reinhardt","Sigma")
		);	
	ArrayList<String> meiBad = new ArrayList<String>(
		Arrays.asList("Zarya","Orisa","Soldier 76","Sombra","Ashe","Torbjorn")
		);
	ArrayList<String> meiAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Pharah","Echo","Hanzo","Junkrat")
		);
	ArrayList<String> meiSynergies = new ArrayList<String>(
		Arrays.asList("Orisa","Reinhardt","Widowmaker","Ashe","McCree")
		);
character mei = new character("Mei","Dps", meiGood, meiBad, meiAwful, meiSynergies,17);

	dps.add(mei);
	characterList.add(mei);	
	
	//ADD Pharah
	ArrayList<String> pharahGood = new ArrayList<String>(
		Arrays.asList("Orisa","Reinhardt","Symmetra","Junkrat","Reaper","Mei","Bastion","Doomfist","Brigitte","Lucio","Roadhog")
		);	
	ArrayList<String> pharahBad = new ArrayList<String>(
		Arrays.asList("Ana","Zenyatta","Baptiste","Winston","Wrecking Ball","Mercy","Hanzo","Sigma")
		);
	ArrayList<String> pharahAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Ashe","Soldier 76","McCree","DVa","Echo")
		);
	ArrayList<String> pharahSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character pharah = new character("Pharah","Dps", pharahGood, pharahBad, pharahAwful, pharahSynergies,18);

	dps.add(pharah);	
	characterList.add(pharah);

//ADD Reaper
	ArrayList<String> reaperGood = new ArrayList<String>(
		Arrays.asList("Winston","Wrecking Ball","Zarya","Tracer","Zenyatta","Ana","Soldier 76","Mei")
		);	
	ArrayList<String> reaperBad = new ArrayList<String>(
		Arrays.asList("Orisa","Widowmaker","Mercy","Lucio","Junkrat")
		);
	ArrayList<String> reaperAwful = new ArrayList<String>(
		Arrays.asList("DVa","Sigma","Pharah","Echo")
		);
	ArrayList<String> reaperSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character reaper = new character("Reaper","Dps", reaperGood, reaperBad, reaperAwful, reaperSynergies,19);

	dps.add(reaper);	
	characterList.add(reaper);	
	
	//ADD Soldier 76
	ArrayList<String> soldierGood = new ArrayList<String>(
		Arrays.asList("Pharah","Winston","Echo","Roadhog","Mei","Junkrat","DVa","Sombra")
		);	
	ArrayList<String> soldierBad = new ArrayList<String>(
		Arrays.asList("Ashe","Bastion","Zarya","Wrecking Ball","Orisa")
		);
	ArrayList<String> soldierAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Reinhardt")
		);
	ArrayList<String> soldierSynergies = new ArrayList<String>(
		Arrays.asList("Ana")
		);
character soldier = new character("Soldier 76","Dps", soldierGood, soldierBad, soldierAwful, soldierSynergies,20);

	dps.add(soldier);
	characterList.add(soldier);	
	
	//ADD Sombra
	ArrayList<String> sombraGood = new ArrayList<String>(
		Arrays.asList("Wrecking Ball","DVa","Mei","Reinhardt","Zarya")
		);	
	ArrayList<String> sombraBad = new ArrayList<String>(
		Arrays.asList("Roadhog","Soldier 76","Hanzo")
		);
	ArrayList<String> sombraAwful = new ArrayList<String>(
		Arrays.asList("Winston","Torbjorn","Symmetra","Moira")
		);
	ArrayList<String> sombraSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character sombra = new character("Sombra","Dps", sombraGood, sombraBad, sombraAwful, sombraSynergies,21);

	dps.add(sombra);
	characterList.add(sombra);	
	
	//ADD Symmetra
	ArrayList<String> symmetraGood = new ArrayList<String>(
		Arrays.asList("Wrecking Ball","Reaper","Mei","Mercy","Lucio","DVa","Roadhog","Genji","Sigma")
		);	
	ArrayList<String> symmetraBad = new ArrayList<String>(
		Arrays.asList("Reinhardt","Pharah","McCree","Soldier 76","Torbjorn")
		);
	ArrayList<String> symmetraAwful = new ArrayList<String>(
		Arrays.asList("Winston","Orisa","Ashe","Widowmaker","Echo","Bastion")
		);
	ArrayList<String> symmetraSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character symmetra = new character("Symmetra","Dps", symmetraGood, symmetraBad, symmetraAwful, symmetraSynergies,22);

	dps.add(symmetra);
	characterList.add(symmetra);	
	
	//ADD Torbjorn
	ArrayList<String> torbGood = new ArrayList<String>(
		Arrays.asList("Doomfist","Wrecking Ball","DVa","Winston","Tracer","Lucio","Reaper","Symmetra")
		);	
	ArrayList<String> torbBad = new ArrayList<String>(
		Arrays.asList("Pharah","Reinhardt","Zenyatta")
		);
	ArrayList<String> torbAwful = new ArrayList<String>(
		Arrays.asList("Widowmaker","Junkrat","Echo","Hanzo","Ashe")
		);
	ArrayList<String> torbSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
	character torb = new character("Torbjorn","Dps", torbGood, torbBad, torbAwful, torbSynergies,23);
	
	dps.add(torb);
	characterList.add(torb);	
	
	//ADD Tracer
	
	ArrayList<String> tracerGood = new ArrayList<String>(
		Arrays.asList("Reinhardt","Widowmaker","Ana","Wrecking Ball","Roadhog","Zenyatta")
		);	
	ArrayList<String> tracerBad = new ArrayList<String>(
		Arrays.asList("Winston","Symmetra","Zarya","Hanzo","Mei")
		);
	ArrayList<String> tracerAwful = new ArrayList<String>(
		Arrays.asList("Brigitte","Sigma","Torbjorn","McCree")
		);
	ArrayList<String> tracerSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character tracer = new character("Tracer","Dps", tracerGood, tracerBad, tracerAwful, tracerSynergies,24);

	dps.add(tracer);
	characterList.add(tracer);	
	
	//ADD Widowmaker
	ArrayList<String> widowGood = new ArrayList<String>(
		Arrays.asList("Pharah","Echo","Ashe","McCree","Roadhog","Orisa","Zarya","Junkrat","Zenyatta")
		);	
	ArrayList<String> widowBad = new ArrayList<String>(
		Arrays.asList("Reinhardt","Sigma","Sombra","Mercy","Doomfist","DVa")
		);
	ArrayList<String> widowAwful = new ArrayList<String>(
		Arrays.asList("Winston","Wrecking Ball","Genji")
		);
	ArrayList<String> widowSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character widow = new character("Widowmaker","Dps", widowGood, widowBad, widowAwful, widowSynergies,25);

	dps.add(widow);
	characterList.add(widow);

	//ADD Ana
	ArrayList<String> anaGood = new ArrayList<String>(
		Arrays.asList("Roadhog","Wrecking Ball","Pharah","Echo","Moira","Brigitte","Junkrat","Reaper")
		);	
	ArrayList<String> anaBad = new ArrayList<String>(
		Arrays.asList("Genji","Tracer","Widowmaker","Reinhardt","Zarya","Orisa","Ashe","Mei")
		);
	ArrayList<String> anaAwful = new ArrayList<String>(
		Arrays.asList("Winston","DVa","Sigma")
			);
	ArrayList<String> anaSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character ana = new character("Ana","Support", anaGood, anaBad, anaAwful, anaSynergies,26);

	supports.add(ana);
	characterList.add(ana);
	
	//ADD Baptiste
	ArrayList<String> baptisteGood = new ArrayList<String>(
		Arrays.asList("Pharah","Echo","Junkrat","Reaper","Hanzo","Tracer","Genji","Soldier 76","Mei")
		);	
	ArrayList<String> baptisteBad = new ArrayList<String>(
		Arrays.asList("Winston","Torbjorn")
		);
	ArrayList<String> baptisteAwful = new ArrayList<String>(
		Arrays.asList("Roadhog","Wrecking Ball","Doomfist")
		);
	ArrayList<String> baptisteSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character baptiste = new character("Baptiste","Support", baptisteGood, baptisteBad, baptisteAwful, baptisteSynergies,27);

	supports.add(baptiste);
	characterList.add(baptiste);
	
	//ADD Brigitte
	ArrayList<String> brigitteGood = new ArrayList<String>(
		Arrays.asList("Genji","Tracer","Roadhog","Wrecking Ball","DVa","Winston")
		);	
	ArrayList<String> brigitteBad = new ArrayList<String>(
		Arrays.asList("Ana","Reinhardt","Orisa","Ashe","Lucio")
		);
	ArrayList<String> brigitteAwful = new ArrayList<String>(
		Arrays.asList("Pharah","Echo","Widowmaker","Junkrat")
		);
	ArrayList<String> brigitteSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character brigitte = new character("Brigitte","Support", brigitteGood, brigitteBad, brigitteAwful, brigitteSynergies,28);

	supports.add(brigitte);
	characterList.add(brigitte);

//ADD Lucio
	ArrayList<String> lucioGood = new ArrayList<String>(
		Arrays.asList("Winston","Reaper","Zarya","Genji","Brigitte","Torbjorn","Symmetra")
		);	
	ArrayList<String> lucioBad = new ArrayList<String>(
		Arrays.asList("Pharah","Echo","Roadhog","Bastion","Junkrat")
		);
	ArrayList<String> lucioAwful = new ArrayList<String>(
		Arrays.asList("Mei","Orisa")
		);
	ArrayList<String> lucioSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character lucio = new character("Lucio","Support", lucioGood, lucioBad, lucioAwful, lucioSynergies,29);

	supports.add(lucio);
	characterList.add(lucio);

//ADD Mercy
	ArrayList<String> mercyGood = new ArrayList<String>(
		Arrays.asList("Moira","Widowmaker","Ashe","Doomfist","Junkrat")
		);	
	ArrayList<String> mercyBad = new ArrayList<String>(
		Arrays.asList("Reinhardt","DVa","Wrecking Ball","Roadhog")
		);
	ArrayList<String> mercyAwful = new ArrayList<String>(
		Arrays.asList("Tracer","Symmetra","Echo","McCree")
		);
	ArrayList<String> mercySynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character mercy = new character("Mercy","Support", mercyGood, mercyBad, mercyAwful, mercySynergies,30);

	supports.add(mercy);
	characterList.add(mercy);
	
	//ADD Moira
	ArrayList<String> moiraGood = new ArrayList<String>(
		Arrays.asList("Winston","Wrecking Ball","Genji")
		);	
	ArrayList<String> moiraBad = new ArrayList<String>(
		Arrays.asList("Orisa","Roadhog","Reaper","Torbjorn")
		);
	ArrayList<String> moiraAwful = new ArrayList<String>(
		Arrays.asList("DVa","Widowmaker","Ana")
		);
	ArrayList<String> moiraSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
character moira = new character("Moira","Support", moiraGood, moiraBad, moiraAwful, moiraSynergies,31);

	supports.add(moira);
	characterList.add(moira);
	
	//ADD Zenyatta
	ArrayList<String> zenGood = new ArrayList<String>(
		Arrays.asList("Reinhardt","Pharah","Zarya","Roadhog","Orisa","Mercy","Torbjorn","Reaper")
		);	
	ArrayList<String> zenBad = new ArrayList<String>(
		Arrays.asList("Wrecking Ball","Ashe","Widowmaker","Doomfist","McCree")
		);
	ArrayList<String> zenAwful = new ArrayList<String>(
		Arrays.asList("Genji","DVa","Winston")
		);
	ArrayList<String> zenSynergies = new ArrayList<String>(
		Arrays.asList("")
		);
	character zen = new character("Zenyatta","Support", zenGood, zenBad, zenAwful, zenSynergies,32);
	
	supports.add(zen);
	characterList.add(zen);
	

	}

	public void setCharacterList(ArrayList<character> list) {
		this.tanks = tanks;
		this.dps = dps;
		this.supports = supports;
	}
	
	public character tanksSearch(int n) {
		return tanks.get(n-1);	
		}
	
	public character dpsSearch(int n) {
		return dps.get(n+7);	
		}
	
	public character supportsSearch(int n) {
		return supports.get(n+24);	
		}
	public character search(int n) {
		return characterList.get(n-1);	
		}
	
	public ArrayList<character> chooseCharacterList(String s) {
		if(s == "tanks") { 
			System.out.println("considering tank options");
			return tanks;
			}
		if(s == "dps") { 
			System.out.println("considering dps options"); 
			return dps;
			}
		if(s == "supports") { 
			System.out.println("considering support options");
			return supports;
	}
		else return tanks;
	}
	
	
}
