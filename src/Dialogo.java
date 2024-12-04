
public class Dialogo {
    public static String Escenario;
    public static String Conversacion;
    public static String Desenlace;

    static {
        Dialogo.Escenario = "Los personajes han sido transportados a una habitación misteriosa llena de objetos extraños.\nEntre ellos, una tarjeta antigua, un ábaco, un imán, y una máscara con expresión triste.\nTesla intenta explicar cómo sus experimentos los reunieron.\n";

        Dialogo.Desenlace = "Al activar el sistema, una explosión de luz devuelve a cada personaje a su tiempo,\ncon la lección de que incluso los objetos más simples tienen un propósito en las manos adecuadas.\n";
    }

    public static void main(String[] args) {
        System.out.println(Dialogo.Escenario);

        //conversación
        System.out.println("Hola, soy el personaje1");

        System.out.println(Dialogo.Desenlace);
    }
}