#include<stdio.h>
int main()
{
	int a,b,c;
	printf("enter a value of a: ");
	scanf("%d",&a);
	printf("enter a value of b: ");
	scanf("%d",&b);
	printf("enter a value of c: ");
	scanf("%d",&c);
	if(a>= b && c>= b)
	{
		printf("%d the greater no \n",a);
	}
	 //  printf("the greater no is",a);
    else if(b>= a && b>= c)
    {
	    printf("%d the greater no \n",b);
	}
	else
	{
		printf("%d the greater no \n",c);
	}
} 
