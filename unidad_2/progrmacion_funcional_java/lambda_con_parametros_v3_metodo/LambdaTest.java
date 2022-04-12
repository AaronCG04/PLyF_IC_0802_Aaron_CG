public class LambdaTest {
    public static void main(String[] args){
        Operaciones op = (num1,num2)->System.out.println("El resultado es: "+(num1+num2));
        op.imprimeOperacion(5, 10);

        LambdaTest objeto=new LambdaTest();
        objeto.miMetodo((num1,num2)->System.out.println("La resta es: "+(num1-num2)),20,10);
        objeto.miMetodo((num1,num2)->System.out.println("La multiplicacion es : "+(num1*num2)),20,10);
    }
    public void miMetodo(Operaciones op,int num1,int num2){
        op.imprimeOperacion(num1, num2);
    }
}
