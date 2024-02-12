#include <stdio.h>
#include <string.h>

// Function for bit stuffing
void bitStuffing(int N, int arr[]) {
    int brr[30]; // Stores the stuffed array

    int i, j, k; // Variables to traverse arrays
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

                // If 5 consecutive set bits are found, insert a 0 bit
                if (count == 5) {
                    j++;
                    brr[j] = 0;
                }
                i = k;
            }
        }

        // Otherwise, insert arr[i] into the array brr[]
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
    int N = 6;
    int arr[] = {1, 1, 1, 1, 1, 1 };

    bitStuffing(N, arr);

    return 0;
}
