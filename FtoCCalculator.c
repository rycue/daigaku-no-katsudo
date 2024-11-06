#include <stdio.h>

int main() {
    // VARIABLES
    float temperature;

    // INPUT
    printf("Enter an F Temperature: ");
    scanf("%f", &temperature);    

    // CALCULATION
    temperature = (temperature -32) * 5 / 9;

    // OUTPUT
    printf("The temperature in C is: %.2f\n", temperature);

}