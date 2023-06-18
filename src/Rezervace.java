
public class Rezervace {

    public Rezervace(Pokoj pokoj, Host host, Strava strava, String zacatek, String konec, int idRezervace, int pocetDni, int cena) {
        this.pokoj = pokoj;
        this.host = host;
        this.strava = strava;
        this.zacatek = zacatek;
        this.konec = konec;
        this.idRezervace = idRezervace;
        this.pocetDni = pocetDni;
        this.cena = cena;

    }

    public Rezervace(int cena) {
        this.cena = cena;
    }

    public void VypisRezervaci() {
        System.out.println("Jmeno hosta: " + this.host.jmeno + " " + this.host.prijmeni);
        System.out.println("Cislo pokoje: " + this.pokoj.cisloPokoje);
        System.out.println("Jidlo: " + this.strava.jidlo);
        System.out.println("Cena Jidla: " + this.strava.cena * this.pocetDni);
        System.out.println("Zacatek: " + this.zacatek);
        System.out.println("Konec: " + this.konec);
        System.out.println("Pocet dni: " + this.pocetDni);
        System.out.println("Cena: " + this.cena * pocetDni);
        System.out.println("Cena celkem: " + pocetDni * (this.strava.cena + cena));



    }

    Pokoj pokoj;
    Host host;
    Strava strava;

    String zacatek;
    String konec;

    int pocetDni;

    int idRezervace;
    int cena;
}
