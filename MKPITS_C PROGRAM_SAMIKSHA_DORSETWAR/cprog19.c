#include<stdio.h>
int main()
{
	int  a ,b ;
	printf("enter a value of a:");
	scanf("%d",&a);
	printf("enter a value of b:");
	scanf("%d",&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf(" after a swaping of a %d\n ",a);
	printf(" after a swaping of b %d\n",b);
}
