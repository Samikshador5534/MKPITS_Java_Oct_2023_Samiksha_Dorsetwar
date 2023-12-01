#include<stdio.h>
int main()
{
	int return_test,interview;
	printf("enter a return test marks:");
	scanf("%d",&return_test);
	printf("enter a interview marks:");
	scanf("%d",&interview);
	if(return_test >=50 && interview >=50)
	{
		printf("\n selected");
	}
	else
	{
		printf(" \nrejected");
	}
}
