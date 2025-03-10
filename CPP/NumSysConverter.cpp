// NUMBER SYSTEM CONVERTER
#include <iostream>

using namespace std;

int main() {
    // DECLARATION
    int decimalNumber, tempNumber;
    string binaryNumber;

    // USER INPUT INITIALIZATION
    cout << "Enter a decimal number: ";
    cin >> decimalNumber;

    // DISPLAY USER
    cout << "\nDecimal Number: " << decimalNumber << "\n" << endl;

    // DECIMAL TO BINARY
    if (decimalNumber == 0) {
        binaryNumber = "0";
    }
    while (decimalNumber > 0) {
        cout << "(before) binary in-process: " << binaryNumber << endl;
        cout << decimalNumber << " % 2 = " << decimalNumber % 2 << endl;
        binaryNumber = to_string(decimalNumber % 2) + binaryNumber;
        cout << "(after) binary in-process: " << binaryNumber << endl;
        cout << decimalNumber << " / 2 = " << decimalNumber / 2;
        if (decimalNumber / 2 == 0)
            cout << " (end of loop)\n" << endl;
        else {
            cout << endl << "\n--- --- another loop --- ---" << endl;
        }
        decimalNumber /= 2;
    }

    while (binaryNumber.length() < 4) {
        binaryNumber = "0" + binaryNumber;
    }

    cout << "Binary: " << binaryNumber << endl;
}