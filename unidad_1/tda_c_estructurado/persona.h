#ifndef __PERSONA_H
#define __PERSONA_H

#include <stdlib.h>
#include <stdio.h>
typedef struct persona
{
    char *nombre;
    char *apellidos;
    int edad;
    char genero;
}persona;
void comer(persona *p);
void caminar(persona *p);
void hablar(persona *p);
void dormir(persona *p);
#endif