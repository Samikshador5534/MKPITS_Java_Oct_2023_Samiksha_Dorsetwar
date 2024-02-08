#include<stdio.h>
int main()
{
	int phy,che,maths,avg;
	printf("enter a value of phy");
	scanf("%d",&phy);
	printf("enter a value of che");
	scanf("%d",&che);
	printf("enter a value of maths");
	scanf("%d",&maths);
	avg= phy+che+maths /3;
	if (phy >= 50 && che >= 50 && maths >= 50 && avg >= 60) 
	{
        printf("Pass\n");
    } 
	else 
	{
        printf("Fail\n");
    }
    
    return 0;
}

