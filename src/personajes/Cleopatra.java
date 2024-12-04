package personajes;

/**
 * Victor Cebollada
 */
public class Cleopatra {
    public static String nombre;
    public static StrAing descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        Cleopatra.nombre = "Cleopatra";
        Cleopatra.descripcionFisica = "De porte majestuoso, cabello negro recogido, adornada con joyas doradas y una túnica blanca.";
        Cleopatra.historia = "Última reina de Egipto, conocida por su inteligencia política y su capacidad para negociar.";
        Cleopatra.fraseTipica = "El poder no se concede; se toma.";
    }

    public static void main(String[] args) {
        System.out.println(Cleopatra.nombre + "\n");
        System.out.println(Cleopatra.descripcionFisica + "\n");
        System.out.println(Cleopatra.historia + "\n");
        System.out.println(Cleopatra.fraseTipica + "\n");
    }
}   