public class NReinas_2 {
    //  -------------------------
    //  |   |   |   |   |   |   | -> almacena columnas
    //  -------------------------
    // i 0   1   2   3   4   5    ->i (idices) represnta las filas
    public static boolean posicion_validad(int colum,int fila,int reinas_a[]){
        //validando si se encuntra en la misma columna, recorriendo todo el arreglo que contine las posiciones de las reinas
        for(int i=0;i<fila;i++){
            if(colum==reinas_a[i]){
                return false;
            }//validar si se encuntra en las diagonales abs(RNx-RAx)=abs(RNy-RAy)
            else if(Math.abs(colum-reinas_a[i]) == Math.abs(fila-i)){
                return false;
            }
        }
        return true;
        
    }

    public static void agregar_reinas(int a[],int n,int fila){
        //boolean encontrado=false;
        int colum_a=0,pos=0;
        a[fila]=0;
        fila=1;
        //verficiando que las filas sean menor a el numero de reinas para seguir con las 
        //comprobaciones de posicion
        while(fila<n){
            //Recorre todas las columnas de la fila que se esta trabajando
            for(int colum=pos;colum<n;colum++){
                //verficar si la reina se puede colocar en la posicion actual
                if(posicion_validad(colum, fila, a)){
                    //si devuelbe TRUE -> asignamos al arreglo de las reinas la
                    //la poscion de la columna en la fila actual
                    a[fila]=colum;
                    //igualmos columnas a n para finzalizar el bucle
                    colum=n;
                    //incrementamos fila para proseguir a evaluar la siguiente fila del
                    //tablero
                    fila++;
                    //reiniciamos variables extra para inciializar el for en columna 0
                    //para la siguiente iteracion
                    colum_a=0;
                    pos=0;
                }else{
                    //si posicion_validad retorna false incrementamos a colum_a en una unidad
                    //colum_a permite validar si se llego a el final de las columnas de la fila
                    // actual y ademas no se pudo colocar la reina.
                    colum_a++;
                }
            }
            //si colum_a es igual a n se regresara una fila para cambiar de posicion la fila anterior y volver
            //a iniciar el proceso de validacion de las demas columnas
            if(colum_a==n){
                //fila -1
                fila--;
                //incremnetamos la fila anterior en 1 para evaluar la siguiente posicion
                a[fila]+=1;
                //pos sera igual a la nueva columna de la fila anterior
                pos=a[fila];
                colum_a=pos;
            }
        }
            //System.out.println("----"+pos);
            //encontrado=true;
        //}
    }
    public static void main(String[] args) {
        int n=8,reinas_a[]=new int[n];
        //rellenado el array de reinas con -1 para evitar problemas
        //de confucion en la validacion
        for(int i=0;i<n;i++){
            reinas_a[i]=-1;
        }
        //agregar_reinas(0, n, reinas_a);
        //llamda  a funcion agregar_reinas pasandole el array de reinas,
        //el total de reinas n
        //la fila en donde iniciara en este caso simpre en 0
        agregar_reinas(reinas_a, n, 0);
        //imprimendo matriz
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //;
                if(reinas_a[i]==j){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    /*public static void agregar_reinas(int fila,int n,int reinas_a[]){
        if(fila<n){
            for(int colum=0;colum<n;colum++){
                if(posicion_validad(colum, fila, reinas_a)){
                    reinas_a[fila]=colum;
                    agregar_reinas(fila+1, n, reinas_a);
                    
                }
            }
        }else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    //;
                    if(reinas_a[i]==j){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            //System.exit(0);
        }
        
    }*/
    
}
