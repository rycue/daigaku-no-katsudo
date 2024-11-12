#include <stdio.h>

int main() {
    printf("\tNYK Shipping Co.");
    printf("\n\t  Manifesto\n");

    char name[50];
    printf("Passenger's Name: ");
    fgets(name, sizeof(name), stdin);

    char classID[30];
    printf("Class ID: ");
    scanf("%s", &classID);

    

    char shipClass;
    printf("Ship Class: %s", shipClass);

    printf("\n\nProgrammer's Name: CUENZA, RICKY S.");
    return 0;
}