/// esta mal
public class Principal {
    public static void main(String[] args) {
        ///Principal.engine((int x, int y)->(long x1,long y2)->x1+y2);
        System.out.println("CalcularInt --> resultado = "+ engine().calculate(5,2));
        System.out.println("CalcularLong --> resultado = "+ (long) engine(5).calculate(6,2));
    }
    private static CalculadoraInt engine(){
        return (x,y) -> x * y;
    }
    private static CalculadoraInt engine(int x1){
        return (x,y) -> x - y;
    }
}
