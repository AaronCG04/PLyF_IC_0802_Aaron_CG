public class NReinas {
    public static void rellenar_tabla(int tablero[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tablero[i][j]=0;
            }
        }
    }

    public static void asignar_reinas(int tablero[][],int n){
        boolean chocah=false,chocav=false,chocadd=false,chocadi=false,agregar=false;
        int pocion_inicio_i=0,pocion_inicio_j=0,aux, ini=0,total_r=0;
        while(total_r!=n && ini<n){
            
            rellenar_tabla(tablero, n);
            System.out.println("-----"+ini+"-----"+total_r);
            total_r=0;
            //--recorrido
            for(int i=0;i<n;i++){
                //---------------------
                for(int j=0;j<n;j++){
                    if(i==0){
                        tablero[i][ini]=1;
                        //System.out.println("agregado en pocion : "+i+" ,"+0);
                        total_r++;
                        break;
                    }
                    
                        //--comprobar si choca h,v,dsd,dsi,did,dii
                    chocah=false;
                    chocav=false;
                    chocadd=false;
                    chocadi=false;
                    for(int c=0;c<4;c++){
                        pocion_inicio_j=j+1;
                        pocion_inicio_i=i+1;
                        switch (c) {
                            case 0: 
                                while(pocion_inicio_j!=j){
                                    
                                    //System.out.println("Horizontal de "+i+","+j+": "+pocion_inicio_j);
                                    if(pocion_inicio_j==n){
                                        pocion_inicio_j=0;
                                    }
                                    if(chocah==true){
                                        break;
                                    }
                                    
                                    if(tablero[i][pocion_inicio_j]==1){
                                        chocah=true;
                                    }
                                    pocion_inicio_j++;
                                    if(pocion_inicio_j==n){
                                        pocion_inicio_j=0;
                                    }
                                    
                                }
                                break;
                            case 1:   
                                while(pocion_inicio_i!=i){
                                    if(pocion_inicio_i==n){
                                        pocion_inicio_i=0;
                                    }
                                    //System.out.println("vertical de "+i+","+j+": "+pocion_inicio_i);
                                    
                                    if(tablero[pocion_inicio_i][j]==1){
                                        //System.out.println("choco con algo vertical");
                                        chocav=true;
                                        break;
                                    }
                                    pocion_inicio_i++;
                                    
                                }
                                //System.out.println();
                                break;
                            case 2:
                                //System.out.println("sfsdf");
                                while(pocion_inicio_i!=i && pocion_inicio_j !=j){
                                    //System.out.println("Diagonal I de "+i+","+j+": "+pocion_inicio_i+","+pocion_inicio_j);
                                    if(pocion_inicio_i==n || pocion_inicio_j==n){
                                        aux=pocion_inicio_i;
                                        pocion_inicio_i=(n-1)-(pocion_inicio_j-1);
                                        pocion_inicio_j=(n-1)-(aux-1);
                                    }
                                    
                                    if(tablero[pocion_inicio_i][pocion_inicio_j]==1){
                                        //System.out.println("choco con algo diagonal I");
                                        chocadi=true;
                                        break;
                                    }
                                    pocion_inicio_i++;
                                    pocion_inicio_j++;
                                    if(pocion_inicio_i==n || pocion_inicio_j==n){
                                        aux=pocion_inicio_i;
                                        pocion_inicio_i=(n-1)-(pocion_inicio_j-1);
                                        pocion_inicio_j=(n-1)-(aux-1);
                                    }
                                    //System.out.println("--Diagonal I de "+i+","+j+": "+pocion_inicio_i+","+pocion_inicio_j);
                                }
                                break;
                            case 3:
                                pocion_inicio_i=i+1;
                                if(j==0){
                                    pocion_inicio_j=j;
                                }else{
                                    pocion_inicio_j=j-1;
                                }
                                while(pocion_inicio_i!=i && pocion_inicio_j !=j){
                                    //System.out.println("Diagonal d de "+i+","+j+": "+pocion_inicio_i+","+pocion_inicio_j);
                                    if(pocion_inicio_i==n || pocion_inicio_j==n ){
                                        aux=pocion_inicio_i-1;
                                        pocion_inicio_i=(n-1)-((n-1)-pocion_inicio_j);
                                        pocion_inicio_j=(n-1)-((n-1)-aux);
                                    }
                                    
                                    //System.out.println("-Diagonal d de "+i+","+j+": "+pocion_inicio_i+","+pocion_inicio_j);
                                    if(tablero[pocion_inicio_i][pocion_inicio_j]==1){
                                        //System.out.println("choco con algo diagonal derecha");
                                        chocadd=true;
                                        break;
                                    }
                                    pocion_inicio_i++;
                                    pocion_inicio_j--;
                                    if(pocion_inicio_i==n || pocion_inicio_j==n || pocion_inicio_i==-1|| pocion_inicio_j==-1){
                                        aux=pocion_inicio_i-1;
                                        if (pocion_inicio_j==-1) pocion_inicio_j=0;
                                        pocion_inicio_i=(n-1)-((n-1)-pocion_inicio_j);
                                        pocion_inicio_j=(n-1)-((n-1)-aux);
                                    }
                                    //System.out.println("--Diagonal D de "+i+","+j+": "+pocion_inicio_i+","+pocion_inicio_j);
                                }    
                                break;
                            default:
                                break;
                        }
                            
                    }
                    if (chocah==false && chocav==false && chocadd==false && chocadi==false) {
                        tablero[i][j]=1;
                        System.out.println("agregado en pocion : "+i+" ,"+j);
                        total_r++;
                        break;
                        
                    }
                }
            }
            ini++;
        }
    }
    public static void main(String[] args) {
        int n=20,tablero [] []= new int[n][n];
        rellenar_tabla(tablero, n);
        asignar_reinas(tablero, n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(tablero[i][j]+" ");
            System.out.println();
        }

        

    }
    
}
