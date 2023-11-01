#include <stdio.h>

int main()
 {
    float bill,unit;

    printf("Enter the unit consumption of electricity: ");
    scanf("%f", &unit);

    if (unit < 100) 
    { 
    bill= unit *1;
    printf("Your electricity bill is: %.2d\n", bill);
	}
	else if (unit >=100 && < 200)
	{
		bill= unit *1.25;
        printf("Your electricity bill is: %.2d\n", bill);
	}
	else if (unit >200 && < 300)
	{
		bill= unit *1.50;
        printf("Your electricity bill is: %.2d\n", bill);
	}
	else if (unit >300 && < 400)
	{
		bill= unit *1.25;
        printf("Your electricity bill is: %.2d\n", bill);
	}
	else
	{
		bill= unit *2;
        printf("Your electricity bill is: %.2f\n", bill);
	}
    return 0;
}
