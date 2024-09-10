import java.util.Random;

public class TestFraccion{
    static Random random = new Random();

    static int generarNumeroAleatorio(int extremoInferior, int extremoSuperior){

        return random.nextInt((extremoSuperior - extremoInferior)); 
    }
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(generarNumeroAleatorio(1, 10), generarNumeroAleatorio(1,10));
        Fraccion fraccion2 = new Fraccion(generarNumeroAleatorio(1, 10), generarNumeroAleatorio(1, 10));
        System.out.println();
        System.out.println();
        System.out.println("Pruebas a realizar para su respuesta");
        System.out.println();

        System.out.println("fraccion 1: " + fraccion1.toString());
        System.out.println("fraccion 2: " + fraccion2.toString());

        Fraccion fraccionSuma = fraccion1.suma(fraccion1, fraccion2);
        System.out.println("fraccion suma : " + fraccionSuma.toString());

        Fraccion fraccionResta = fraccion1.resta(fraccion1, fraccion2);
        System.out.println("fraccion resta : " + fraccionResta.toString());

        Fraccion fraccionMultiplicacion = fraccion1.multiplicacion(fraccion1, fraccion2);
        System.out.println("fraccion multiplicacion : " + fraccionMultiplicacion.toString());

        Fraccion fraccionDivision = fraccion1.division( fraccion1, fraccion2);
        System.out.println("fraccion division : " + fraccionDivision.toString());
}
 
}