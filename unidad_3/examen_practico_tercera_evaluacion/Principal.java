public class Principal {
    public static void main() {
        PruebaExamen pe = PruebaExamen();
        pe = (a1,a2,a3)->System.out.println((a1+a2+a3));

        System.out.println(PruebaExamen.operacionprueba(3,5));
        PruebaExamen.mensajehola();
        PruebaExamen.mensajehola("Aaron Cruz");
        
        pe = (a1,a2,a3)->System.out.println((a1+(a2*a3)));
        pe.operacionprueba(7,PruebaExamen.operacionprueba(8, 3),PruebaExamen.operacionprueba(21, 5));;

        mimetodo(pe);
        mimetodo((a1,a2,a3)->System.out.println((a1+(a2/3))));

        pe = (a1,a2, a3) -> System.out.println((float)(a1+(a2/a3)));

        mimetodo(pe,13,14,16);
    }

    private static void mimetodo(PruebaExamen pe){
        pe.operacionprueba(11, PruebaExamen.operacionprueba(30, 50),PruebaExamen.operacionprueba(10, 15));
    }
    private static void mimetodo(PruebaExamen pe,int a1,int a2,int a3){
        pe.operacionprueba(a1, PruebaExamen.operacionprueba(a2, a2),PruebaExamen.operacionprueba(a3, a3));
    }
}
