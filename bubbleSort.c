#include<stdio.h>
void bubble_sort(int [],int);
int main(){
	int a[100],n,i;
	printf("enter no. of element:");
	scanf("%d",&n);
	printf("enter %d elements:\n",n);
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	bubble_sort(a,n);
	printf("sorted elements;\n");
	for(i=0;i<n;i++)
	printf("%d\n",a[i]);
	
	
}
void bubble_sort(int a[],int n){
	int temp,i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
		   if(a[j]>a[j+1]){
		   	temp=a[j];
		   	a[j]=a[j+1];
		   	a[j+1]=temp;
		   }
		}
	}
}
