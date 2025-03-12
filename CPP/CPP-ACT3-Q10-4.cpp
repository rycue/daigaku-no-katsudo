#include <iostream>

using namespace std;

int main() {
    // VARIABLE DECLARATION AND INITIALIZATION
    double numOne = 0.0, numTwo = 0.0;
    double sum = 0.0;

    // USER INPUT - Get the two numbers
    cout << "Enter a number: ";
    cin >> numOne;
    cout << "Enter another number: ";
    cin >> numTwo;

    // PROCESS - Adding two numbers to get the sum
    sum = numOne + numTwo;

    // DISPLAY ON CONSOLE - result of calculation
    cout << "Sum: " << sum << " = " << numOne << " + " << numTwo << endl;
    cout << "Therefore, the sum is " << sum << endl;

    return 0;
}
