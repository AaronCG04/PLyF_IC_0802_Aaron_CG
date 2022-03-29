#include <stdio.h>
#include <stdint.h>
#include <math.h>
int main(int argc, char const *argv[])
{
    int i=0;
    //char b[2];
    uint8_t b[2];// declara un dato con 8 bits
    printf("%u\n",sizeof(char));
    //scanf("%c",&b[0]);
    //scanf("%c",&b[1]);
    b[0]=0b00011001;//25
    b[1]=0b10110100;//176
    //b[0]=25;
    //b[1]=176;
	float r=0;
    //binario1= 176;
    for(i=0;i<4;i++){
        r+=((b[1]>>(4+i))&1)*(1./(pow(2,4-i)));
        //printf("%f->",r);
    }
    printf("%.4f",r+b[0]);
    return 0;
}
