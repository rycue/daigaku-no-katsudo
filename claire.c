#include <stdio.h>
#define p printf
#define s scanf

int main() {
    int classification, commission;
    int E, C, B, F;
    float  TF, MF, NF;
    char destinationcode, code[2],  name[30];

    printf("\n\tPHIL Airlines\n\t   NAIA\n\tPasay City");

    printf("\n\nPassenger's Name: ");
    scanf("%s", &name);
    
    
    printf("\nDestination Code: ");
    scanf(" %c", &destinationcode);

    switch (destinationcode) {
        case 'F':
        case 'f':
            printf("Destination: Far East");
            break;
        case 'E':
        case 'e':
            printf("Destination: Europe");
            break;
        case 'A':
        case 'a':
            printf("Destination: Africa");
            break;
        default:
            printf("No Assigned Destination");
    }
    
 
printf("\nClass Code: ");
scanf("%s", code);

if (strcmp("EC", code) == 0 || strcmp("ec", code) == 0) printf("CLASSIFICATION: Economy");
else if (strcmp(code, "BC") == 0 || strcmp("bc", code) == 0) printf("CLASSIFICATION: Business Class");
else if (strcmp(code, "FC") == 0 || strcmp(code, "fc") == 0) printf("CLASSIFICATION: First Class");
else printf("CLASS CODE: No assigned classification");

    
    
printf("\nTICKET FARE: ");
    scanf("%f", &TF);
    printf("\nMISCELANEOUS FEE: ");
    scanf("%f", &MF);
    NF = TF + MF;
    p("NET FARE: %.2f", NF);
    
    
    printf("\n\nProgrammer's Name: Cerio, Lady Claire\n\n");

    return 0;
}
