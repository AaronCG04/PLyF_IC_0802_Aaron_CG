public class Principal {
    public static void main(String[] args) {
        ///Principal.engine((int x, int y)->(long x1,long y2)->x1+y2);
        System.out.println("CalcularInt --> resultado = "+ Principal.engine1().calculate(5,2));
        System.out.println("CalcularLong --> resultado = "+ Principal.engine2().calculate(6,2));
    }
    private static CalculadoraInt engine1(){
        return (x,y) -> x * y;
        // int x=2,y=4;
        // CalculadoraLong resultado = cal.calcular(x,y);
        // System.out.println(resultado.calcular((long)x, (long)y));
    }
    private static CalculadoraLong engine2(){
        return (x,y) -> x - y;
        // long x=2,y=4;
        // long resultado = cal.calcular(x,y);
        // System.out.println(resultado);
    }
}
