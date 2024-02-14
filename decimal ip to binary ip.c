#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int convert_binary(int a,int b,int c,int d);
int *  convert_binary1(int a);
main()

{
    int i,j;	//loop index
    int ip[4];	// array to store ip seperated by "."
    int binary[32]; //store ip in binary
    int *bin;
    char *piece;
    char input[20];

    printf("\nEnter ip address:");
    scanf("%s",input);             //read ip as string

    piece = strtok(input,".");
    i=0;
    do
    {
        ip[i++]=atoi(piece);		// atoi(string) converts string to integer, store pieced string into integer array
        piece=strtok(NULL,".");		// this is subsequent call
    }
    while(piece && i<4);

    for(j=0; j<4; j++) // loop through ips e.g 192.168.0.1  first loop will process ip[0] which has 192 stored
    {
        bin = convert_binary1( ip[j] );	//convert integer to binary , stored in integer array
        for(i=0; i<8; i++)
        {
            binary[j*8+i]=bin[i];   // store converted binary into correct position in 32 binary array
        }
    }

    for(i=0; i<32; i++)
    {
        if(i>0 && (i)%8==0) printf(".");   //print a "." after printing 8 digits
        printf("%d",binary[i]);		//print binary values of given ip saved in this int array
    }
    printf("\n");
}

//takes an integer as input
//returns binary stored in integer array
int * convert_binary1(int a)
{
    int i,j,k,l;
    int *num=(int *)malloc(sizeof(int)*8);  //allocating memory of 8 integers
    for(i=0; i<=7; i++)
    {
        num[7-i]=a%2;
        a=a/2;
    }
    return num;
}

int convert_binary(int a,int b, int c, int d)
{
    int i,j,k,l;
    int num[10];
    for(i=0; i<=7; i++)
    {
        num[i]=a%2;
        a=a/2;
    }
//return(num);
    for(i=7; i>=0; i--)
    {
        printf("%d", num[i]);
    }
    printf(".");

    for(j=0; j<=7; j++)
    {
        num[j]=b%2;
        b=b/2;
    }
    for(j=7; j>=0; j--)
    {
        printf("%d", num[j]);
    }
    printf(".");

    for(k=0; k<=7; k++)
    {
        num[k]=c%2;
        c=c/2;
    }
    for(k=7; k>=0; k--)
    {
        printf("%d", num[k]);
    }
    printf(".");

    for(l=0; l<=7; l++)
    {
        num[l]=d%2;
        d=d/2;
    }
    for(l=7; l>=0; l--)
    {
        printf("%d", num[l]);
    }
}
