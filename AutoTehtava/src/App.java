import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    auto olio1=new auto("Kia", "Rio", 60, 0);

    olio1.jarruta();
    olio1.kiihdyta();
    olio1.kiihdyta();
    olio1.naytaTiedot();
    olio1.tankkaa();

    }
}
class auto{
    public String merkki;
    public String malli;
    public int bensaMaara;
    public int tankkaus;

        public auto(String me, String ma, int bM, int t){
            merkki = me;
            malli = ma;
            bensaMaara = bM;
            tankkaus = t;
        }
public void jarruta(){
    System.out.println("Auto jarruttaa.");
}

public void kiihdyta(){
    bensaMaara--;
    if(bensaMaara > 0){
        System.out.println("Auto kiihtyy.");
    }
}

public void naytaTiedot(){
    System.out.println("Merkki: " + merkki);
    System.out.println("Malli: " + malli);
    System.out.println("Bensiinia tankissa: " + bensaMaara);
}

public void tankkaa(){
    Scanner in = new Scanner(System.in);
    System.out.println("Paljonko haluat tankata?");
    int tankki = Integer.parseInt(in.nextLine());
    int yhteen = bensaMaara + tankki;
    System.out.println("Tankissa oli: " + bensaMaara + " " + "tankkasit : " + tankki + " " + "sinulla on siis bensaa: " + yhteen);
}
}

/*
1. Tee Auto-luokka.

2. Määrittele autoluokalle attribuutit: merkki, malli, bensanMaara. Aseta kaikkein attribuuttien näkyvyydeksi public.

3. Määrittele metodit:

a. Jarruta: Metodi tulostaa konsoliin”Auto jarruttaa”.

b. Kiihdyta: Metodi tulostaa konsoliin ”Auto kiihtyy” ja bensanMaara-attribuutin arvoa vähennetään yhdellä.

c. NaytaTiedot: Metodi tulostaa konsoliin merkin, mallin ja bensan määrän.

4. Luo auto1-olio ja anna sille arvot merkki, malli ja bensanMaara. Tulosta auton tiedot, kiihdytä autoa ja tulosta uudestaan.

5. Kokeile lisätä kiihdyta-metodiin ehto, että bensanMaara tulee olla enemmän kuin 0.

6. Lisää Auto-luokkaan tankkaa-metodi, jolla bensan määrä saadaan asetettua. Eli tankkaa-metodi saa attribuuttina määrän paljon tankattiin. Huomio tankissa olemassa oleva bensan määrä. Voit esim. metodissa tulostaa seuraavasti: Tankissa bensaa: 10 Tankkaus: 5 ß tämä on saadun parametrin arvo Tankissa bensaa tankkauksen jälkeen: 15

7. Tee konstruktori/muodostin, jolla on kolme parametria: merkki, malli ja bensan määrä. Kun teet parametrisen muodostimen, sinun täytynee tehdä myös parametriton muodostin...

8. Luo auto2-olio käyttäen edellä tekemääsi konstruktoria.
 */