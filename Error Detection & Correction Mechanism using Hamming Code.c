#include <stdio.h>
#include <math.h>
int input[32];
int code[32];
int ham_calc(int position, int c_l);
void main()
{
    int n, i, p_n = 0, c_l, j, k;
    printf("Enter the length of the Data Word: ");
    scanf("%d", &n);
    printf("\nEnter the Data Word (bits separated by spaces): ");

    for (i = 0; i < n; i++)
    {
        scanf("%d", &input[i]);
    }
    i = 0;
    while (n > (int)pow(2, i) - (i + 1))
    {
        p_n++;
        i++;
    }
    c_l = p_n + n;
    j = k = 0;
    for (i = 0; i < c_l; i++)
    {
        if (i == ((int)pow(2, k) - 1))
        {
            code[i] = 0;
            k++;
        }
        else
        {
            code[i] = input[j];
            j++;
        }
    }
    for (i = 0; i < p_n; i++)
    {
        int position = (int)pow(2, i);
        int value = ham_calc(position, c_l);
        code[position - 1] = value;
    }
    printf("\nThe calculated Code Word is: ");
    for (i = 0; i < c_l; i++)
        printf("%d ", code[i]);
    printf("\n\nEnter the received Code Word (bits separated by spaces): ");
    for (i = 0; i < c_l; i++)
        scanf("%d", &code[i]);
    int error_pos = 0;
    for (i = 0; i < p_n; i++)
    {
        int position = (int)pow(2, i);
        int value = ham_calc(position, c_l);
        if (value != 0)
        {
            error_pos += position;
        }
    }
    if (error_pos == 0)
    {
        printf("\nThe received Code Word is correct.");
        printf("\n");
    }
    else
    {
        printf("\nError detected and bit position: %d", error_pos);
        code[error_pos - 1] = !code[error_pos - 1];
        printf("\n\nThe corrected Code Word is: ");
        for (i = 0; i < c_l; i++)
            printf("%d ", code[i]);
        printf("\n");
    }
}
int ham_calc(int position, int c_l)
{
    int count = 0;
    int i, j;
    i = position - 1;
    while (i < c_l)
    {

        for (j = i; j < i + position; j++)
        {
            if (code[j] == 1)
                count++;
        }
        i = i + 2 * position;
    }
    if (count % 2 == 0)
        return 0;
    else
        return 1;
}
