// NUMBER SYSTEM CONVERTER
#include <iostream>

using namespace std;

int decimalNumber, binaryNumber, octalNumber;

int main() {
    int inputNumber;
    cout << "Enter a number: ";
    cin >> inputNumber;

    decimalNumber = inputNumber;

    cout << "\nDecimal: " << decimalNumber << endl;

    // DECIMAL TO BINARY
    if (decimalNumber == 0) {
        binaryNumber = 0;
    } else {
        while (decimalNumber > 0) {
            binaryNumber = binaryNumber * 10 + decimalNumber % 2;
            decimalNumber /= 2;
        }
    }

    cout << "Binary: " << binaryNumber << endl;

    // DECIMAL TO OCTAL
}