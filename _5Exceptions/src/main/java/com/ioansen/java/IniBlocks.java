package com.ioansen.java;

/**
 *
 * @author Nan Mihai
 */
class Animal {
    private String nume;
    private String culoare;

    {
        System.out.println("Bloc 1 - Animal");
        nume = "Animal";
        culoare = "negru";
    }

    static{
        System.out.println("Bloc 2 - Animal");
    }

    public String getCuloare() {
        return culoare;
    }
}

class Caine extends Animal {
    private String tipRasa;

    {
        tipRasa = "medie";
        System.out.println("Bloc 1 - Caine " + getCuloare());
    }

    static {
        System.out.println("Bloc 2 - Caine");
    }

    {
        System.out.println("Bloc 4 - Caine");
        tipRasa = "mica";
    }

    {
        System.out.println("Bloc 3 - Caine");
        tipRasa = "mare";
    }


}

class SharPei extends Caine {
    private static int varsta;
    private static String taraProvenienta;

    static {
        System.out.println("Bloc 1 - SharPei");
        taraProvenienta = "China";
    }

    static{
        System.out.println("Bloc 2 - SharPei " + taraProvenienta);
    }

    {
        varsta = 5;
        System.out.println("Bloc 3 - SharPei " + varsta);
    }
}

class IniBlocks {
    public static void main(String args[]) {
        SharPei cutu = new SharPei();
    }
}
