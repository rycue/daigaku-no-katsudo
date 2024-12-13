#include <stdio.h>

/**
 * @brief
 * This program demonstrates the use of pointers in C. It prints the value of an
 * integer variable using a pointer to the variable.
 *
 * @details
 * The program first declares a variable 'number' of type int and assigns the
 * value 123 to it. It then declares a pointer to int called 'numPtr' and assigns
 * the address of 'number' to it. Finally, it prints the value of 'number' using
 * the pointer 'numPtr'.
 */
int main() {
    printf("\n");

    int number = 12345;
    printf("NUMBER: %d\n", number);
    printf("NUMBER ADDRESS: %d\n", &number);

    printf("\n");

    int* numPtr = &number;
    printf("NUMBER POINTER: %d\n", *numPtr);
    printf("NUMBER POINTER ADDRESS: %d\n", numPtr);

    printf("\n");
    return 0;

    // Pointer is a Variable too, but unlike normal variables, it stores a MEMORY ADDRESS.
}