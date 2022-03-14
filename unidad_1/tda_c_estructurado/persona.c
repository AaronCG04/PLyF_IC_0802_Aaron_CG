#include "persona.h"
void comer(persona *p){
    printf("La persona %s %s ha comenzado a comer ....\n",p->nombre,p->apellidos);
}
void caminar(persona *p){
    printf("La persona %s %s esta caminado ....\n",p->nombre,p->apellidos);
}
void hablar(persona *p){
    printf("Hola mi nombre es %s %s y tengo %i\n",p->nombre,p->apellidos,p->edad);
}
void dormir(persona *p){
    printf("zzz... zzz...\n");
}