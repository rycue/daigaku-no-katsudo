#include <stdio.h> 

int main() 
{
    float grade;
    printf("Enter your Number: ");
    scanf("%.2lf\n", &grade);
    if (grade <= 3.0)
    {
        printf("You're honor!");
    }
    else if (grade <= 4.0)
    {
        printf("You passed!");
    }
    else
    {
        printf("You failed");
    }
    return 0;
}