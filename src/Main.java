public class Main {
    public static void main(String[] args) {
/*        System.out.println(sumatoria(4,23,2 ));
        System.out.println(dameText());*/

        Coche auto1 = new Coche();
        Coche auto2 = new Coche();

        auto1.modificarCoche("Renault", 4 );



        System.out.println(auto1.name);
        System.out.println(auto1.puertas);

        System.out.println(auto2.name);
        System.out.println(auto2.puertas);

    Cat cat1 = new Cat();
    cat1.giveName("malita");
    cat1.setYears(3);
    cat1.setFemale(true);

    cat1.showProps();



    Cat cat2 = new Cat();
    cat2.giveName("scotish");
    cat2.setYears(4);
    cat2.setFemale(true);

    cat2.showProps();
    }
}

class Coche {
    String name = "nuevo";
    int puertas = 0;


    public void giveName(String newName){
        this.name = newName;
    }

    public void incrementarPuertas () {
        this.puertas++;
    }
    public void aumentarPuertas (int a){
        this.puertas = this.puertas + a;
    }
    public void modificarCoche (String newName, int puertas){
        this.name = newName;
        this.puertas = puertas;
    }
}
class Cat {
    String name = "michi";
    int years = 0;
    boolean isFemale = true;

   public void giveName (String newName) {
       this.name = newName;
   }

   public void setYears (int years) {

       this.years = years;
   }

    public void setFemale(boolean female) {
        this.isFemale = female;
    }

    public void showProps(){
        System.out.println(this.name);
        System.out.println(this.isFemale);
        System.out.println(this.years);
    }
}
