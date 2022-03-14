class persona{
    public String nombre;
    public String apellidos;
    public int edad;
    public char sexo;

    public persona(){
        this.nombre="Anonimo";
        this.nombre="Anonimo";
        this.edad=0;
        this.sexo='I';
    }

    public persona(String nombre,String apellidos,int edad,char sexo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.sexo=sexo;
    }
    
    public void comer(){
        System.out.println("La persona "+this.nombre+" "+this.apellidos+" ha comenzado a comer ....");
    }
    public void caminar(){
        System.out.println("La persona "+this.nombre+" "+this.apellidos+" esta caminado ....");
    }
    public void hablar(){
        System.out.println("Hola mi nombre es "+this.nombre+" "+this.apellidos+" y tengo "+this.edad);
    }
    public void dormir(){
        System.out.println("zzz... zzz...");
    }
}