#include<stdio.h>
int chdecimal(int num){
    int x=1;
    int deci=0;
    while(num>0){
        int last=num%10;
        deci+= last*x;
        x*=2;
        num=num/10;
    }
    return deci;
}
int main(){
    int n;
    printf("Enter input:-\n");
    scanf("%d",&n);
    int res=chdecimal(n);
    printf("Decimal number is:-\n%d",res);
return 0;
}
