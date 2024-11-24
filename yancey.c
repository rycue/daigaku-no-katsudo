#include <stdio.h>

int main() {
    char ena[30];
    char letter;
    int eno;

    printf("\n\t\t ABC Department Store\n");
    printf("\n\t\t\t Makati, City\n");

    printf("\n Salesman No.:");
    scanf("%d", &eno);
    printf("\n Salesman Name:");
    scanf("%s", &ena);

    char name;
    scanf("%c", &name);

    printf("\n Section Code:");
    scanf("%c", &letter);
    

    printf("\n Section:");
    scanf(" %c", &ena);

    switch (letter) {
        case 'A':
        case 'a':
            printf("\n Ladies Section");
            break;
        case 'B':
        case 'b':
            printf("\n Men's Section");
            break;
        case 'C':
        case 'c':
            printf("\n Infant's Section");
            break;
        case 'D':
        case 'd':
            printf("\n Childrens Section");
            break;
        case 'E':
        case 'e':
            printf("\n Shoe's Section");
            break;
        case 'F':
        case 'f':
            printf("\n KitchenWare Section");
            break;
        case 'G':
        case 'g':
            printf("\n Appliance's Section");
            break;
        default:
            printf("\n Un identified Section");
    }

    int noitem, sales;
    int price;

    printf("\n No. of Items:");
    scanf("%d", &noitem);

    printf("\n Price per Items:");
    scanf("%d", &price);

    sales = noitem * price;
    printf("\n Sales: %d", sales);

    float commissionpercent, commission;

    if (sales < 10000) {
        commissionpercent = 0.01;

    } else if ((sales >= 10001) && (sales <= 10005)) {
        commissionpercent = 0.02;

    } else if ((sales >= 15001) && (sales <= 20000)) {
        commissionpercent = 0.03;

    } else if ((sales >= 20001) && (sales <= 25000)) {
        commissionpercent = 0.04;

    } else {
        commissionpercent = 0.02;
    }

    commission = sales * commissionpercent;
    printf("\n Commission: %f", commission);

    printf("\n Programmer's Name: Yancey Handang");

    return 0;
}