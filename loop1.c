#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#define p printf

int main() {

    char value[30];
    bool isOn = true;
    while (isOn) {
        p("Enter DOG to exit: ");
        scanf("%s", &value);
        if (strcmp(value, "DOG") == 0) {
            break;
        }
    }
    return 0;
}