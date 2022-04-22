public class LambdaTest {
    public static void main(String[] args) {
        // Esprexion Lambda => represnetando un objeto de una Interfaz funcional (FunctionTest)
        FunctionTest ft = () -> System.out.println("Hola Mundo");
        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(ft);
    }

    public void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
}
