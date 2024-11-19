#include <stdio.h>

int main() {

    int patientNo, classCode;
    char patientName[30];
    float hospitalFee, doctorsFee, totalBill;

    printf("\tMakati Medical Center\n\t    Makati City\n\t    Hospital\n");
    
    printf("\nPatient No: ");
    scanf("%d", &patientNo);

    printf("Patient Name: ");
    scanf("%s", &patientName);

    printf("Class Code: ");
    scanf(" %d", &classCode);

    switch (classCode) {
        case 1: printf("Classification: WARD"); break;
        case 2: printf("Classification: SEMI PRIVATE"); break;
        case 3: printf("Classification: PRIVATE"); break;
        default: printf("Invalid Class Code!"); break;
    }

    printf("\nHospital Fee: ");
    scanf("%f", &hospitalFee);
    if (hospitalFee > 25000) doctorsFee =  hospitalFee * 0.5;
    else if (hospitalFee >= 15001 && hospitalFee <= 25000) doctorsFee = hospitalFee * 0.4;
    else doctorsFee = hospitalFee * 0.3;
    printf("Doctor's Fee: %.2f", doctorsFee);

    totalBill = hospitalFee + doctorsFee;
    printf("\nTotal Bill: %.2f", totalBill);
    printf("\n\nPROGRAMMER'S NAME: WOW");

    return 0;
}