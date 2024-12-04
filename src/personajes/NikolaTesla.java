package personajes;

/**
 * Luca Soler
 */
public class NikolaTesla {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        NikolaTesla.nombre = "Nikola Tesla";
        NikolaTesla.descripcionFisica = "Delgado, de cabello oscuro peinado hacia atrás, vestido con traje formal.";
        NikolaTesla.historia = "Inventor y científico serbio, pionero de la corriente alterna y obsesionado con la energía y el magnetismo.";
        NikolaTesla.fraseTipica = "La electricidad es el alma del universo.";
    }

    public static void main(String[] args) {
        System.out.println(NikolaTesla.nombre + "\n");
        System.out.println(NikolaTesla.descripcionFisica + "\n");
        System.out.println(NikolaTesla.historia + "\n");
        System.out.println(NikolaTesla.fraseTipica + "\n");
    }
}