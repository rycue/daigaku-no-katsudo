#include <stdio.h>

int main() {
    int grade; // VARIABLE

    printf("Enter your grade: ");
    scanf("%d", &grade);
    if (grade >= 90)
        printf("You grade is: A");
    else if ( (grade >= 80) && (grade <= 89) )
        printf("You grade is: B");
    else if ( (grade >= 70) && (grade <= 79) )
            printf("You grade is: C");
    else if ( (grade >= 60) && (grade <= 69) )
            printf("You grade is: D");
    else {
        printf("You grade is: F");
    }
}