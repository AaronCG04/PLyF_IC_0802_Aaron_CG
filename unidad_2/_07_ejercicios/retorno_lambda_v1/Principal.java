// corecto
public class Principal {
    public static void main(String[] args) {
        ///Principal.engine((int x, int y)->(long x1,long y2)->x1+y2);
        System.out.println("CalcularInt --> resultado = "+ Principal.engine1().calculate(5,2));
        System.out.println("CalcularLong --> resultado = "+ Principal.engine2().calculate(6,2));
    }
    private static CalculadoraInt engine1(){
        return (x,y) -> x * y;
    }
    private static CalculadoraLong engine2(){
        return (x,y) -> x - y;
    }
}
