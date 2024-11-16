#include <stdio.h>
int no, noi, sales, pri, css;
char name[100], code;
int main() {
    printf("\n\tABC Department Store");
    printf("\n\tMakati, City");
    printf("\n\nSalesman No.: ");
    scanf("%d", &no);
    getchar();
    printf("Salesman Name: ");
    fgets(name, sizeof(name), stdin);
    printf("Section Code: ");
    scanf("%c", &code);
    switch (code) {
        case 'A':
        case 'a':
            printf("Section: Ladies Section\n");
            break;
        case 'B':
        case 'b':
            printf("Section: Men's Section\n");
            break;
        case 'C':
        case 'c':
            printf("Section: Infant's Section\n");
            break;
        case 'D':
        case 'd':
            printf("Section: Children's Section\n");
            break;
        case 'E':
        case 'e':
            printf("Section: Shoe's Section\n");
            break;
        case 'F':
        case 'f':
            printf("Section: Kitchenware Section\n");
            break;
        case 'G':
        case 'g':
            printf("Section: Appliance's Section\n");
            break;
        default:
            printf("Section: Unidentified Section\n");
            break;
    }
    printf("No. of items: ");
    scanf("%d", &noi);
    printf("Price per item: ");
    scanf("%d", &pri);
    sales = noi * pri;
    printf("Sales: %d\n", sales);
    if (sales > 25000) {
        css = sales * 0.05;
    } else if (sales >= 20001 && sales <= 25000) {
        css = sales * 0.04;
    } else if (sales >= 15001 && sales <= 20000) {
        css = sales * 0.03;
    } else if (sales >= 10001 && sales <= 15000) {
        css = sales * 0.02;
    } else {
        css = sales * 0.01;
    }
    printf("Commission: %d\n", css);
    printf("\nProgrammer's Name: Christian Paul M. Justiniano\n");
    return 0;
}
