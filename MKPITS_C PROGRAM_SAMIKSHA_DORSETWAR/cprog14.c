#include <stdio.h>

int main() {
    int units;
    float bill = 0;

    printf("Enter the unit consumption of electricity: ");
    scanf("%d", &units);

    if (units < 100) {
        bill = units * 1.0;
    } else if (units < 200) {
        bill = 100 * 1.0 + (units - 100) * 1.25;
    } else if (units < 300) {
        bill = 100 * 1.0 + 100 * 1.25 + (units - 200) * 1.50;
    } else if (units < 400) {
        bill = 100 * 1.0 + 100 * 1.25 + 100 * 1.50 + (units - 300) * 1.25;
    } else {
        bill = units * 2.0;
    }
    printf("Your electricity bill is: %.2f\n", bill);

    return 0;
}

