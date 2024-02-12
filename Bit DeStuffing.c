#include <stdio.h>
#include <string.h>

// Function for bit de-stuffing
void bitDestuffing(int N, int arr[]) {
    int brr[30]; // Stores the de-stuffed array

    int i, j, k; // Variables to traverse the arrays
    i = 0;
    j = 0;
    int count = 1; // Stores the count of consecutive ones

    // Loop to traverse in the range [0, N)
    while (i < N) {

        // If the current bit is a set bit
        if (arr[i] == 1) {

            brr[j] = arr[i]; // Insert into array brr[]

            // Loop to check for the next 5 bits
            for (k = i + 1; arr[k] == 1 && k < N && count < 5; k++) {
                j++;
                brr[j] = arr[k];
                count++;

                // If 5 consecutive set bits are found, skip the next bit in arr[]
                if (count == 5) {
                    k++;
                }
                i = k;
            }
        }

        // Otherwise, insert arr[i] into the array brr
        else {
            brr[j] = arr[i];
        }
        i++;
        j++;
    }

    // Print Answer
    for (i = 0; i < j; i++) {
        printf("%d", brr[i]);
    }
}

// Driver Code
int main() {
    int N = 7;
    int arr[] = {1, 1, 1, 1, 1, 0, 1};

    bitDestuffing(N, arr);

    return 0;
}
