#include<stdio.h>
int main()
{
	int a,b;
	printf("enter a value of a: ");
	scanf("%d",&a);
	printf("enter a value of b: ");
	scanf("%d",&b);
	if(a>b)
	{
		printf("%d the greater no \n",a);
	}
	 //  printf("the greater no is",a);
    else if(b>a)
    {
	    printf("%d the greater no \n",b);
	}
	else
	{
		printf("%d both no are equals\n");
	}
} 
