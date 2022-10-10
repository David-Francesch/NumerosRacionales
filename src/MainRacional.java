public class MainRacional {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Racional r1 = new Racional();
        Racional r3 = new Racional(5);
        Racional r4 = new Racional(5, 6);
        Racional r5 = new Racional(18, 15);
        Racional r2 = new Racional(r4);

        System.out.println("Racional 1: "+r1);
        System.out.println("Racional 3: "+r3);
        System.out.println("Racional 4: "+r4);
        System.out.println("Racional 2: "+r2);
        System.out.println("Racional Negado: "+r4.negacion());
        System.out.println("Es negativo: "+r4.esNegativo());
        System.out.println("Es cero: "+r4.esCero());
        System.out.println("Es positivo: "+r4.esPositivo());
        System.out.println("Racional reciproco: "+r4.reciproco());
        System.out.println(r4.suma(r3));
        System.out.println(r4.resta(r3));
        r5.reducir();
        //asdfasd
        System.out.println(r5);
    }
    
}
