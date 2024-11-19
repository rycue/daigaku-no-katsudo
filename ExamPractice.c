#include <stdio.h>

int main() {
    int modelNumber;
    float basePrice;
    char carBrand;
    
    printf("\nSelect Car Brand:\nT - Toyota\nH - Honda\nF - Ford\nEnter brand (letter): ");
    scanf("%c", &carBrand);
    switch(carBrand) {
        case 'T': case 't':
            printf("\nSelect Toyota model:\n1.Yaris (1500.00)\n2.Corolla(2000.00)\n3.Fortuner(2500.00)\nEnter model (number): ");
            scanf("%d", &modelNumber);
            switch (modelNumber) {
                case 1: basePrice = 1500.00; break;
                case 2: basePrice = 2000.00; break;
                case 3: basePrice = 2500.00; break;
                default: printf("Invalid Model Number!"); return 0;
            }
            break;
        case 'H': case 'h':
            printf("\nSelect Honda model:\n1.Civic(1299.00)\n2.Accord(1750.00)\n3.CRV(2300.00)\nEnter model (number): ");
            scanf("%d", &modelNumber);
            switch (modelNumber) {
                case 1: basePrice = 1299.00; break;
                case 2: basePrice = 1750.00; break;
                case 3: basePrice = 2300.00; break;
                default: printf("Invalid Model Number!"); return 0;
            }
            break;
        case 'F': case 'f':
            printf("\nSelect Ford model:\n1.Fiesta(2533.00)\n2.EcoSport(3225.00)\n3.Fusion(4750.00)\nEnter model (number): ");
            scanf("%d", &modelNumber);
            switch (modelNumber) {
                case 1: basePrice = 2533.00; break;
                case 2: basePrice = 3225.00; break;
                case 3: basePrice = 4750.00; break;
                default: printf("Invalid Model Number!"); return 0;
            }
            break;
        default:
            printf("Invalid Car Brand!\n");
            return 0;
    }

    printf("\nEnter number of rental days: ");
    int rentalDays;
    scanf("%d", &rentalDays);
    float totalRentalPrice = basePrice * rentalDays;
    printf("\nTotal Rental Price: %.2f", totalRentalPrice);

    float discount;
    if (rentalDays >= 3 && rentalDays <= 7) discount = 0.02;
    else if (rentalDays > 7) discount = 0.05;
    if (totalRentalPrice >= 15000) discount += 0.1;

    totalRentalPrice = totalRentalPrice - (totalRentalPrice * discount);
    printf("\nDiscount Applied: %.1f%%", discount * 100);
    
    printf("\nFinal Price to Pay: %.2f", totalRentalPrice);
    return 0;
}