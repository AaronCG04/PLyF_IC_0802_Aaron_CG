public class Principal { // paso 1
    public static void main(String[] args) { // paso 2
        PruebaExamen pe; //paos 3
        pe = (a1,a2,a3)->System.out.println((a1+a2+a3)); //paso 4
        pe.operacionprueba(5, 5, 5);
        System.out.println(PruebaExamen.operacionprueba(10,10)); // paso 5
        pe.mensajehola(); /// paso 6
        pe.mensajehola("Aaron Cruz"); /// paso 7
        
        pe = (a1,a2,a3)->System.out.println((a1+(a2*a3)));//  paso 8
        pe.operacionprueba(5,PruebaExamen.operacionprueba(1, 1),PruebaExamen.operacionprueba(2, 2)); //paso 9

        mimetodo(pe);//paso 12
        mimetodo((a1,a2,a3)->System.out.println((a1+(a2/a3))));//paso 13

        pe = (a1,a2, a3) -> System.out.println(((float)a1+((float)a2/(float)a3))); // paso 16

        mimetodo(pe,5,1,2); // 17
    }

    private static void mimetodo(PruebaExamen pe){ // paso 10
        pe.operacionprueba(5, PruebaExamen.operacionprueba(2, 2),PruebaExamen.operacionprueba(3, 3));//11
    }
    private static void mimetodo(PruebaExamen pe,int a1,int a2,int a3){ //paso 14
        pe.operacionprueba(a1, PruebaExamen.operacionprueba(a2, a2),PruebaExamen.operacionprueba(a3, a3));// 15
    }
}
