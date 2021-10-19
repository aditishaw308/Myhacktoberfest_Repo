#include<stdio.h>
int main(){
    int n;
    printf("Enter a number:-\n");
    scanf("%d",&n);
        if(n==1){
            printf("non prime\n");
        }
        int i;
        for( i=2;i<n;i++){
            if(n%i==0){
                printf(" Non Prime ");
                break;
            }
        }
        if(i==n){
            printf(" Prime ");
        }

    return 0;
}