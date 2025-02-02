#include <stdio.h>
#include <string.h>

void bitStuffing(int N, int arr[]) {
    int brr[30];
    int i, j;
    i = 0;
    j = 0;
    int count;

    while (i < N) {
        count = 0;

        while (i < N && arr[i] == 1) {
            brr[j++] = arr[i];
            count++;

            if (count == 5) {
                brr[j++] = 0;
                count = 0;
            }
            i++;
        }

        if (i < N) {
            brr[j++] = arr[i++];
        }
    }

    printf("Stuffed bits: ");
    for (i = 0; i < j; i++) {
        printf("%d", brr[i]);
    }
    printf("\n");
}

int main() {
    int N;
    printf("Enter the number of bits: ");
    scanf("%d", &N);

    int arr[N];
    printf("Enter the bit sequence (0 and 1): ");
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    bitStuffing(N, arr);
    return 0;
}
