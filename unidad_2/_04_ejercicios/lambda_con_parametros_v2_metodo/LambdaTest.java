public class LambdaTest {
    public static void main(String[] args){
        Operaciones op = (num1,num2) -> System.out.println("El resultado es: "+(num1+num2));

        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(op, 10, 10);
    }

    public void miMetodo(Operaciones op, int num1, int num2){
        op.imprimeSuma(num1, num2);
    }
}
