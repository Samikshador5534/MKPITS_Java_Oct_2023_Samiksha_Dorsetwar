#include <stdio.h>
int main() 
{
int marks;
	printf("Enter marks : ");
	scanf("%d",&marks);
	if(marks >= 50)
		printf("\nResult is pass");
	else
		printf("\nResult is fail");
	return 0;
}
