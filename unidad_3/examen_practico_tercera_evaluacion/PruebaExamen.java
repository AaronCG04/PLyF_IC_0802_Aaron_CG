public interface PruebaExamen{
	public default void mensajehola(){
		System.out.println("Hola mi nombre es: Aaron");
	}
	public default void mensajehola(String cadena){
		System.out.println("La cadena es: "+cadena);
	}
    public static int operacionprueba(int a1,int a2){
        return a1+a2;
    }
    public void operacionprueba(int a1,int a2,int a3);
}