//correcto
public class Principal {
    public static void main(String[] args) {
        ///Principal.engine((int x, int y)->(long x1,long y2)->x1+y2);
        System.out.println("CalcularInt --> resultado = "+ engine(3,7).calculate(5,2));
        System.out.println("CalcularLong --> resultado = "+ engine((long)5,(long)5).calculate(6,2));
    }
    private static CalculadoraInt engine(int a, int b){
        return (x,y) -> a * b;
    }
    private static CalculadoraLong engine(long a, long b){
        return (x,y) -> a + b;
    }
}