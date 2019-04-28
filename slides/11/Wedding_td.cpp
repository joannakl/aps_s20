/* Wedding Shopping - Top Down approach*/

// this code is based on the recursive backtracking approach

// code based on the textbook code

#include <cstdio>
#include <cstring>
#include <chrono>
#include <thread>
using namespace std;

int M = 20,
    C = 3,
    price[25][25] =              // price[g (<= 20)][model (<= 20)]
        {   { 3, 4, 6, 8},
            { 2, 5, 10 },
            { 4, 1, 3, 5, 5 }
        };

int memo[210][25];        // dp table memo[money (<= 200)][g (<= 20)]

void show(int money, int g , int flag) {
    printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
    printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
    
    if (g >= 0) {
        printf("shop(%d,%d)\n\n", money,g); 
    }
    if (flag) {
        printf("shop(%d,%d)  - calculated previously\n\n", money,g); 
    }
    for (int m = 0; m < M+1; m++ ) {
        printf("\n| ");
        for (int c = 0; c < C; c++) { 
            if (memo[m][c] == -1 ) 
                printf("%5s |", "-----" ); 
            else
                printf("%4d  |", memo[m][c] ); 
        }
        if (memo[m][C] > 0 ) { 
            printf("    returned %d", memo[m][C] ); 
        }
    }
    printf("\n");
    
    //uncomment, to do a "animation" automatically
    //chrono::seconds dura(1);
    //this_thread::sleep_for( dura );
    getchar();
}


int shop(int money, int g) {
    
    if (money < 0)   {   // fail, return a large negative number
        return -1000000000;
    }
    
    if (g == C) {       // bought last garment, done
        memo[money][g] = M-money; 
        show(money, g, 0); 
        return M - money;
    }

    //if this if statement is skipped, we have a backtracking solution
    if (memo[money][g] != -1){ // value calculated before
        
        show(money, g, 1); 
        return memo[money][g];
    }
    int ans = -1;   // start with a -1 as all prices are non negative

    for (int model = 1; model <= price[g][0]; model++)  {    // try all models
        memo[money][g] = -2;
        show(money, g, 0); 
        int tmp = shop(money - price[g][model], g + 1);
        ans = tmp > ans ? tmp : ans;
        memo[money][g] = -2;
    }

    return memo[money][g] = ans; // assign ans to table + return it
}


int main() {
    int i, j, score;

    memset(memo, -1, sizeof memo);                 // initialize DP memo table

    score = shop(M, 0);                            // start the top-down DP
    show (M, -2,0); 
    
    if (score < 0) printf("\n\nno solution\n");
    else           printf("\n\n%d\n", score);


    return 0;
}
