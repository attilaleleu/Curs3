package sample;

//------- varianta 1 -------

class Floare{
    int petale;
    String nume;

}

//-------- varianta 2 --------

class Floare2 {
    int petale;
    String nume;

    Floare2(int p, String n) {
        petale = p;
        nume = n;

    }
}

//------ varianta 3 -------

    class Floare3 {
        int petale;
        String nume;

        Floare3(int p, String n) {
            petale = p;
            nume = n;
        }

        void afiseaza() {
            System.out.println("Floarea: " + nume + " are " + petale + "petale.");
        }

    }




public class ExempluOOPFloare {
    public static void main(String[] args){

        // ----- varianta 1 ------

        Floare f1 = new Floare();
        Floare f2 = new Floare();
        Floare f3 = new Floare();


        f1.nume = "lalea";
        f1.petale = 3;

        f2.nume = "trandafir";
        f2.petale = 20;

        f3.nume = new String("crin");
        f3.petale = 7;


        System.out.println(f1.nume + " "+ f1.petale);
        System.out.println(f2.nume + " "+ f2.petale);
        System.out.println(f3.nume + " "+ f3.petale);

        //------- varianta 2 -------

        Floare2 f4 = new Floare2(3, "vioara");
        Floare2 f5 = new Floare2(4, "crizantema");
        Floare2 f6 = new Floare2(8, "gherbera");

        System.out.println(f4.nume + " "+ f4.petale);
        System.out.println(f5.nume + " "+ f5.petale);
        System.out.println(f6.nume + " "+ f6.petale);

        //------- varianta 3 -------

        Floare3 f7 = new Floare3(3, "trifoi");
        Floare3 f8 = new Floare3(6, "busuioc");
        Floare3 f9 = new Floare3(13, "galbenele");

        System.out.println(f4.nume + " "+ f4.petale);
        System.out.println(f5.nume + " "+ f5.petale);
        System.out.println(f6.nume + " "+ f6.petale);

    }
}
