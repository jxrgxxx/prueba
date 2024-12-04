package personajes;

/**
 * Oscar Sanchez
 */
public class JuanaDeArco {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        JuanaDeArco.nombre = "Juana de Arco";
        JuanaDeArco.descripcionFisica = "Joven de cabello corto, vestida con una armadura ligera.";
        JuanaDeArco.historia = "Heroína francesa y santa, lideró ejércitos inspirada por sus visiones divinas.";
        JuanaDeArco.fraseTipica = "Dios guía mi espada.";
    }

    public static void main(String[] args) {
        System.out.println(JuanaDeArco.nombre + "\n");
        System.out.println(JuanaDeArco.descripcionFisica + "\n");
        System.out.println(JuanaDeArco.historia + "\n");
        System.out.println(JuanaDeArco.fraseTipica + "\n");
    }
}