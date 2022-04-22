public class LambdaTest{
    public static void main(String[] args) {
        Operaciones op = (num1,num2)-> System.out.println("La suma es: "+(num1+num2));

        op.imprimeSuma(5, 10);
    }
}