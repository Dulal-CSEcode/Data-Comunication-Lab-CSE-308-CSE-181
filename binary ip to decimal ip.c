#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

// Function to convert a binary number to decimal
int binaryToDecimal(int n) {
    int decimal = 0, i = 0, remainder;

    while (n != 0) {
        remainder = n % 10;
        n /= 10;
        decimal += remainder * pow(2, i);
        ++i;
    }

    return decimal;
}

int main(int argc, char const *argv[]) {
    char n[35];
    char *num;

    printf("Enter Binary IP Address : \n");
    scanf("%s", n);

    num = strtok(n, ".");

    printf("The Decimal IP Address : \n");

    while (num != NULL) {
        printf("%d.", binaryToDecimal(atoi(num)));
        num = strtok(NULL, ".");
    }

    return 0;
}// 00001111.00001111.00001111.00001111
