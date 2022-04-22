public class Principal {
    public static void main(String[] args) {
        Principal.engine((int x,int y)-> x+y);
        Principal.engine((int x,int y)-> x*y);
        Principal.engine((int x,int y)-> x/y);
        Principal.engine((long x,long y)-> x-y);
        Principal.engine((long x,long y)-> x%y);
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
