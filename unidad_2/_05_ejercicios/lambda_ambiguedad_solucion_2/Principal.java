public class Principal {
    public static void main(String[] args) {
        //Casting a nivel de Interfaz
        Principal.engine((CalculadoraInt)(x,y)-> x+y);
        Principal.engine((CalculadoraInt)(x,y)-> x*y);
        Principal.engine((CalculadoraInt)(x,y)-> x/y);
        Principal.engine((CalculadoraLong)(x,y)-> x-y);
        Principal.engine((CalculadoraLong)(x,y)-> x%y);
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
