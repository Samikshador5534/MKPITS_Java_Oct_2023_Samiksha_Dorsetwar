#include<stdio.h>
int main()
{
	int angle1,angle2,angle3,sum;
	printf("enter a value of triangle ");
	scanf("%d\n%d\n %d\n",&angle1,&angle2,&angle3);
	sum = angle1 + angle2 + angle3;
	printf("%d",sum);
	if(sum==180)
	{
		printf("traingle is formed");
	}
	else

		printf("traingle is not formed");

}
