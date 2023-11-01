#include <stdio.h>

int main()
{
	int marks;
	printf("Enter any marks: ");
    scanf("%d", &marks);
    
    if(marks >= 80)
    {
        printf("grade A");
    }
    else if (marks >= 70 && marks < 80)
    {
    	printf("grade B");
	}
	else if (marks >= 60  && marks < 70)
    {
    	printf("grade c");
	}
	else if (marks >= 50  && marks < 60)
    {
    	printf("grade d");
	}
	else if (marks < 50)
	{
		printf(" grade e");
	} 
	   
   
}
