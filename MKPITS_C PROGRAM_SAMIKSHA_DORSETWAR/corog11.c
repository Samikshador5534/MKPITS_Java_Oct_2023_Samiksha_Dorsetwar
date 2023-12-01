/*#include<stdio.h>
int main()
{
	int return_test,interview;
	printf("enter a return test marks:");
	scanf("%d",&return_test);
	//printf("enter a interview marks:");
	//scanf("%d",&interview);
	if(return_test >=50)
	{
		printf("return_test");
	}
//	else
//	{
//		printf(" \nrejected");
//	}
}*/
#include <stdio.h>

int main() {
    int returnTest, interview;


    printf("Enter the marks of the return test: ");
    scanf("%d", &returnTest);

    if (returnTest >= 50) 
	{
        printf("Enter the marks of the interview: ");
        scanf("%d", &interview);

        if (interview >=50)
		 {
            printf("Selected\n");
        } 
		else 
		{
            printf("Rejected\n");
        }
    } 
	else
	   {
        printf("Rejected\n");
       }

    return 0;
}
