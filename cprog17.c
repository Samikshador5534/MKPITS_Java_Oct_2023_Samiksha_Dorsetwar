#include<stdio.h>
int main()
{
	int  a ,b ,c;
	printf("enter a value of a:");
	scanf("%d",&a);
	printf("enter a value of b:");
	scanf("%d",&b);
	c=a;
	a=b;
	b=c;
	printf(" after a swaping of a %d\n ",a);
	printf(" after a swaping of b %d\n",b);
}
