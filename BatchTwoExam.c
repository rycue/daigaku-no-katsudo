#include <stdio.h>
#include <string.h>

int main() {
    char passengerName[50], destinationCode, classCode[2];
    float ticketFare, miscFee, netFare;
    printf("\tPHIL. AIRLINES\n\tNAIA\n\tPASAY CITY\n");

    printf("\nPASSENGER'S NAME: ");
    scanf("%s", &passengerName);
    printf("DESTINATION CODE: ");
    scanf(" %c", &destinationCode);
    switch (destinationCode) {
        case 'F': case 'f': printf("DESTINATION: FAR EAST"); break;
        case 'E': case 'e': printf("DESTINATION: EUROPE"); break;
        case 'A': case 'a': printf("DESTINATION: AFRICA"); break;
        default: printf("DESTINATION: No assigned destination");
    }
    printf("\nCLASS CODE: ");
    getchar();
    scanf("%s", &classCode);
    if (strcmp("EC", classCode) == 0 || strcmp("ec", classCode) == 0) printf("CLASSIFICATION: Economy");
    else if (strcmp(classCode, "BC") == 0 || strcmp("bc", classCode) == 0) printf("CLASSIFICATION: Business Class");
    else if (strcmp(classCode, "FC") == 0 || strcmp(classCode, "fc") == 0) printf("CLASSIFICATION: First Class");
    else printf("CLASS CODE: No assigned classification");

    printf("\nTICKET FARE: ");
    scanf("%f", &ticketFare);

    printf("MISCELANEOUS FEE: ");
    scanf("%f", &miscFee);

    netFare = ticketFare + miscFee;
    printf("NET FARE: %.2f", netFare);

    printf("\n\nPROGRAMMER'S NAME: CUENZA, RICKY S.");
    return 0;
}