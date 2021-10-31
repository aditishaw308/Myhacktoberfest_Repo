#include <stdio.h>
int fact(int);
int main()
{
    int n,f;
    printf("Enter the number : ");
    scanf("%d",&n);
    f=fact(n);
    printf("Factorial is %d",f);
    return 0;
}
int fact(int n)
{
    int f=1;
    while(n!=0)
    {
        f=f*n;
        --n;
    }
    return f;
}
