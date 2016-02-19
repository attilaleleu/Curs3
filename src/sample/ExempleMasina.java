package sample;

/**
 * Created by leleluattila on 12/12/15.
 */

class Masina{
    String marca;
    String model;
    int motor;

    Masina(String model, String marca, int motor){
        this.model = model;
        this.marca = marca;
        this.motor = motor;

    }

    void afiseaza(){
        System.out.println("Modelul "+ model+ " de marca " + marca+ " are motor de " +motor);
    }

}

public class ExempleMasina {
    public static void main(String[] args){

        Masina m1 = new Masina("seria 3", "BMW", 3500);
        Masina m2 = new Masina("clasa C", "Mercedes-Benz", 6800);
        Masina m3 = new Masina("Logan", "Dacia", 1600);

        m1.afiseaza();
        m2.afiseaza();
        m3.afiseaza();

    }
}
