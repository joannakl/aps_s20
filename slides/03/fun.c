
#include <stdio.h>


void fun3(int x ) {
  if (x == 0) return;
  fun3(x-1);
  fun3(x-1);
  printf ("%d ", x);
}

int main() {

	fun3( 4 ) ;
	return 0;
}

 

