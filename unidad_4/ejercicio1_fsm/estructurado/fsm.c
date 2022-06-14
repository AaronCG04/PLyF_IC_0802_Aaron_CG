#include <stdio.h>
#include <stdlib.h>
#define goNorte 0
#define waitNorte 1
#define goEste 2
#define waitEste 3

#define _00 0
#define _01 1
#define _10 2
#define _11 3

int estado=goNorte;
int eventos[10]={_00,_01,_01,_10,_11,_00,_00,_01,_11,_10};
int main(int argc, char const *argv[])
{
    int i=0;
    while (i<10)
    {
        switch (eventos[i]){
            case _00:
                if(estado==goNorte){
                    estado=goNorte;
                    printf("goNorte 3s\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if(estado==goEste){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte 3s\n");
                }
                break;
            case _01:
                if(estado==goNorte){
                    estado=waitNorte;
                    printf("waitNorte 2s\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if(estado==goEste){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte 3s\n");
                }
                break;
            case _10:
                if(estado==goNorte){
                    estado=goNorte;
                    printf("goNorte 3s\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if(estado==goEste){
                    estado=waitEste;
                    printf("waitEste 2s\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte 3s\n");
                }
                break;
            case _11:
                if(estado==goNorte){
                    estado=waitNorte;
                    printf("waitNorte 2s\n");
                }else if (estado==waitNorte){
                    estado=goEste;
                    printf("goEste 3s\n");
                }else if(estado==goEste){
                    estado=waitEste;
                    printf("waitEste 2s\n");
                }else if (estado==waitEste){
                    estado=goNorte;
                    printf("goNorte 3s\n");
                }
                break;
            default:
                break;
        }
        i++;
    }    
    return 0;
}