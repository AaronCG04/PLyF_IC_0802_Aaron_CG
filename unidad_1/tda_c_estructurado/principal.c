#include "persona.h"
int main(int argc, char const *argv[])
{
    persona *p;
    p=(persona*)malloc(sizeof(struct persona));
    p->nombre=(char*)malloc(sizeof(char)*20);
    p->apellidos=(char*)malloc(sizeof(char)*50);
    p->nombre="Aaron";
    p->apellidos="Cruz Gonzalez";
    p->edad=19;
    p->genero='H';

    comer(p);
    caminar(p);
    hablar(p);
    dormir(p);
    return 0;
}
