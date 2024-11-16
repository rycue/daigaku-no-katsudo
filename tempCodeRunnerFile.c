#include <stdio.h>
#define p printf
#define s scanf
int main() {
    int smn,
    section,
    itemNo,
    ppi,
    sls,
    cmsn;
    char salesmanName[100],
    secCode;
    p("\n\tABC Department Store");
    p("\n\tMakati City");
    p("\n\nSalesman No: ");
    s("%d", &smn);
    p("SALESMAN NAME: ");
    s("%s", salesmanName);
    p("SECTION CODE: ");
    s(" %c", &secCode);
    switch (secCode) {
        case 'A':
        case 'a':
            {
                p("Section: Ladies Section");
                break;
            }
        case 'B':
        case 'b':
            {
                p("Section: Men's Section");
                break;
            }
        case 'C':
        case 'c':
            {
                p("Section: Infant's Section");
                break;
            }
        case 'D':
        case 'd':
            {
                p("Section: Children's Section");
                break;
            }
        case 'E':
        case 'e':
            {
                p("Section: Shoe's Section");
                break;
            }
        case 'F':
        case 'f':
            {
                p("Section: KitchenWare Section");
                break;
            }
        case 'G':
        case 'g':
            {
                p("Section: Appliance's Section");
                break;
            }
        default:
            {
                p("Undefined Section");
                break;
            }
    }
    p("\nNo. of items: ");
    s("%d", &itemNo);
    p("Price per item: ");
    s("%d", &ppi);
    sls = itemNo * ppi;
    p("sls: %d\n", sls);
    if (sls > 25000) {
        cmsn = sls * 0.05;
    } 
    else if (sls >= 20001 && sls <= 25000) {
        cmsn = sls * 0.04;
    } 
    else if (sls >= 15001 && sls <= 20000) {
        cmsn = sls * 0.03;
    } 
    else if (sls >= 10001 && sls <= 15000) {
        cmsn = sls * 0.02;
    } 
    else {
        cmsn = sls * 0.01;
    }
    p("cmsn: %d\n", cmsn);
    return 0;
}
