public class Main {
    public static void main(String[] args) {

        int resultado = suma(1, 2, 4);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas(1);
        System.out.println(miCoche.puertas);
    }
    public static int suma (int a, int b, int c) {
            return a+b+c;
    }

}
class Coche {
        int puertas = 0;

        public void aumentarPuertas(int numPuertas) {
            this.puertas = this.puertas + numPuertas;
        }
    }

