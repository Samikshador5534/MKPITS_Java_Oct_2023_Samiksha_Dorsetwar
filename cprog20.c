#include<stdio.h>
int main()
{
	char c;
	printf("enter a single character :");
	scanf("%c",&c);
	if(c>=65 && c<=90)
	{
		printf(" it is capital letter");
	}
	else if (c>=97 && c<=122)
	{
		printf("it is small letter");
	}
	else if (c>=48 && c<=57)
	{
		printf("it is numeric digit");
	}
	else
	{
		printf("it is special symbol");
	}
}
