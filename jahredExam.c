#include <stdio.h>
#include <string.h>
#define p printf
#define s scanf

int main() {
    char passengerName[100];
    char destinationCode;
    char classCode;
    float TF, MF, NF;
    p("\tPHIL. AIRLINES");
    p("\n\tNAIA\n");
    p("\tPASAY CITY\n");
    p("\nPASSENGER'S NAME: ");
    s("%s", &passengerName);
    p("DESTINATION CODE: ");
    s(" %c", &destinationCode);
    switch (destinationCode) {
        case 'F':
        case 'f':
            p("DESTINATION: FAR EAST");
            break;
        case 'E':
        case 'e':
            p("DESTINATION: EUROPE");
            break;
        case 'A':
        case 'a':
            p("DESTINATION: AFRICA");
            break;
        default:
            p("DESTINATION: No assigned destination");
    }
    p("\nCLASS CODE: ");
    s(" %s", &classCode);
    if (strcmp("EC", classCode) == 0 || strcmp("ec", classCode) == 0)
        printf("CLASSIFICATION: Economy");
    else if (strcmp(classCode, "BC") == 0 || strcmp("bc", classCode) == 0)
        printf("CLASSIFICATION: Business Class");
    else if (strcmp(classCode, "FC") == 0 || strcmp(classCode, "fc") == 0)
        printf("CLASSIFICATION: First Class");
    else
        printf("CLASS CODE: No assigned classification");
    p("\nTICKET FARE: ");
    s("%f", &TF);
    p("MISCELANEOUS FEE: ");
    s("%f", &MF);
    NF = TF + MF;
    p("NET FARE: %.2f", NF);
    p("\nPROGRAMMER'S NAME: Tarucan, Jahred");
    return 0;
}