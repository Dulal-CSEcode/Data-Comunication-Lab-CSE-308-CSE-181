#include <iostream>
#include <vector>
#include <string>
#include <cmath>
using namespace std;
int calculate_parity_bits(const string& hamming_code) {

    int parity_bits = 0;
    while (pow(2, parity_bits) <= hamming_code.length()) {
        parity_bits++;
    }
    return parity_bits;
}
pair<string, int> detect_and_correct_error(const string& hamming_code) {
    int n = hamming_code.length();
    int parity_bits = calculate_parity_bits(hamming_code);
    int error_position = 0;
    for (int i = 0; i < parity_bits; i++) {
        int parity_pos = pow(2, i) - 1;  
        if (parity_pos >= n) {
            break;
        }
        int count = 0;
        for (int j = parity_pos; j < n; j += pow(2, i + 1)) {
            for (int k = j; k < min(j + (int)pow(2, i), n); k++) {
                if (hamming_code[k] == '1') {
                    count++;
                }
            }
        }
        if (count % 2 != 0) {
            error_position += pow(2, i);
        }
    }
    string corrected_code = hamming_code;
    if (error_position != 0) {
        
        int error_index = error_position - 1;
        if (error_index < n) {
            corrected_code[error_index] = (corrected_code[error_index] == '0') ? '1' : '0';
        }
    }
    return make_pair(corrected_code, error_position);
}
bool validate_input(const string& input) {
    for (char c : input) {
        if (c != '0' && c != '1') {
            return false;
        }
    }
    return true;
}
int main() {
    cout << "Enter the received Hamming code (binary string):" << endl;
    string hamming_code;
    cin >> hamming_code;
    if (!validate_input(hamming_code)) {
        cout << "Error: Input must be a binary string (only 0s and 1s allowed)" << endl;
        return 1;
    }
    auto result = detect_and_correct_error(hamming_code);
    string corrected_code = result.first;
    int error_position = result.second;
    if (error_position == 0) {
        cout << "\nNo errors detected in the Hamming code." << endl;
        cout << "Original Hamming code: " << hamming_code << endl;
    } else {
        cout << "\nError detected at position: " << error_position << endl;
        cout << "Original Hamming code: " << hamming_code << endl;
        cout << "Corrected Hamming code: " << corrected_code << endl;
    }
    return 0;
}
