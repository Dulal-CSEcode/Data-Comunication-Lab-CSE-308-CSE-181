#include <stdio.h>
#include <string.h>

#define MAX_SIZE 100

void stuff(char input[], char st[]) {
    int i, j = 0;
    st[j++] = 'F';

    int input_length = strlen(input);

    for (i = 0; i < input_length; i++) {
        if (input[i] == 'F' || input[i] == 'E') {
            st[j++] = 'E';
        }
        st[j++] = input[i];
    }

    st[j++] = 'F';
    st[j] = '\0';
}

void destuff(char st[], char dest[]) {
    int i, j = 0;
    int st_length = strlen(st);

    for (i = 1; i < st_length - 1; i++) {
        if (st[i] == 'E') {
            i++;
        }
        dest[j++] = st[i];
    }

    dest[j] = '\0';
}

int main() {
    char input[MAX_SIZE], st[MAX_SIZE], dest[MAX_SIZE];

    printf("Enter Input Bit Stream: ");
    fgets(input, sizeof(input), stdin);

    // Remove trailing newline character from fgets
    input[strcspn(input, "\n")] = '\0';

    stuff(input, st);
    printf("Stuffed Bit Stream: %s\n", st);

    destuff(st, dest);
    printf("Destuffed Bit Stream: %s\n", dest);

    return 0;
}
