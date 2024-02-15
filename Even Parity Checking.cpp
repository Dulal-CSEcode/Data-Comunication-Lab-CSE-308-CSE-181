#include <iostream>

using namespace std;

// Function for measuring array length with data
int a_length(char array[])
{
    int count = 0;
    for (int i = 0; array[i] != '\0'; i++)
    {
        count++;
    }
    return count;
}

int main()
{
    char data[100];
    cout << "This is a program for even parity checking." << endl;
    cout << "Enter the data: " << endl;

    // taking user data here
    cin >> data;

    // finding the user data length
    int length = a_length(data);
    int count = 0;

    // checking even parity
    for (int i = 0; i < length; i++)
    {
        if (data[i] == '1')
        {
            count++;
        }
    }

    // increasing the array for adding the parity bit
    int newLength = length + 1;

    // new array
    if (count % 2 == 0)
    {
        for (int i = newLength, j = length; i > 0; i--, j--)
        {
            // copying the data to the new array
            data[i] = data[j];
        }
        // initializing the parity
        data[0] = '1';
        // displaying the new array
        cout << "After adding '1' at the front of the data: " << endl;
        cout << data << endl;
    }
    else
    {
        for (int i = newLength, j = length; i > 0; i--, j--)
        {
            // copying the data to the new array
            data[i] = data[j];
        }
        // initializing the parity
        data[0] = '0';
        // displaying the new array
        cout << "After adding '0' at the front of the data: " << endl;
        cout << data << endl;
    }

    return 0;
}
