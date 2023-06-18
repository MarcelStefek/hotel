public class Main {
    public static void main(String[] args) {

        // Rezervace
        Pokoj pokoj1 = new Pokoj("s balkonem a morem", 1000, 1, 1);
        Pokoj pokoj2 = new Pokoj("s balkonem a morem", 1000, 2, 1);
        Pokoj pokoj3 = new Pokoj("bez balkonu a s morem", 1400, 3, 1);

        Host host1 = new Host("Marcel", "Stefek", "17.9.1975");
        Host host2 = new Host("Maxik", "Stefek", "3.9.2019");
        Host host3 = new Host("Vaclav", "Stefek", "9.4.1951");

        Strava stravaPlna = new Strava(250, "Plna Penze");
        Rezervace rez1 = new Rezervace(pokoj1, host1,stravaPlna, "1.1.2001", "14.1.2001", 10, 14, pokoj1.cena);
        rez1.VypisRezervaci();

        Rezervace rez2 = new Rezervace(pokoj2, host2, stravaPlna,"1.1.2001", "14.1.2001", 10, 14, pokoj2.cena);
        rez2.VypisRezervaci();

        Strava stravaPolo = new Strava(150, "Polo Penze");
        Rezervace rez3 = new Rezervace(pokoj3, host3,stravaPolo, "1.1.2001", "14.1.2001", 10, 14, pokoj3.cena);
        rez3.VypisRezervaci();



    }
}