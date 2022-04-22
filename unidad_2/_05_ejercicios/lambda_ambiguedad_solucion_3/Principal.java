public class Principal {
    public static void main(String[] args) {
        //Casting a nivel de Interfaz
        CalculadoraInt objInt=(x,y)-> x+y;
        Principal.engine(objInt);
        objInt=(x,y)-> x*y;
        Principal.engine(objInt);
        objInt=(x,y)-> x/y;
        Principal.engine(objInt);
        //-----
        CalculadoraLong objLong=(x,y)-> x-y;
        Principal.engine(objLong);
        objLong=(x,y)-> x%y;
        Principal.engine(objLong);
    }
    private static void engine(CalculadoraInt cal){
        int x=2,y=4;
        int resultado = cal.calcular(x,y);
        System.out.println(resultado);
    }
    private static void engine(CalculadoraLong cal){
        long x=2,y=4;
        long resultado = cal.calcular(x,y);
        System.out.println(resultado);
    }
}
