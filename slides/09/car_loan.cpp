#include <math.h>
#include <stdio.h>

// assume input of value, interest months

int main() {
    int m, x;
    double value, i;

    scanf ("%lf %lf %d", &value, &i, &m);

    double a = 0.01;
    double b = (1+1/100)*value;

    double d = (a+b)/2;

    double paid , owed ;
    
    do { 
        paid = 0.0, owed = value;
        for (int month = 1; month <= m; month++) {
            paid += d;
            owed -= d;
            owed *= (1+i/100);
            
        }
        printf("%f|%f|%f", a, b, d);

        if (fabs(0.0 - owed) < 0.001){
            printf("|done\n");
        }
        else if ( owed < 0) {
            b = d;
            printf ("|overpaid|decrease d\n");
        }
        else {// ( owed > 0) 
            a = d;
            printf ("|underpaid|increase d\n");
        }
        d = (a+b)/2;

    }
    while (fabs(0.0 - owed) >= 0.001 ) ;


    return 0;
}
