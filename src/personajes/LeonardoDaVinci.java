package personajes;

/**
 * Jorge Lei
 */
public class LeonardoDaVinci {
    public static String nombre;
    public static String descripcionFisica;
    public static String historia;
    public static String fraseTipica;

    static {
        LeonardoDaVinci.nombre = "Leonardo da Vinci";
        LeonardoDaVinci.descripcionFisica = "De mediana estatura, cabello y barba castaños largos, siempre vestido con ropajes de la época renacentista.";
        LeonardoDaVinci.historia = "Genio renacentista, inventor, pintor y científico. Fascinado por la mecánica y el arte.";
        LeonardoDaVinci.fraseTipica = "Todo está conectado.";
    }

    public static void main(String[] args) {
        System.out.println(LeonardoDaVinci.nombre + "\n");
        System.out.println(LeonardoDaVinci.descripcionFisica + "\n");
        System.out.println(LeonardoDaVinci.historia + "\n");
        System.out.println(LeonardoDaVinci.fraseTipica + "\n");
    }
}