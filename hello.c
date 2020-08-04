/// fuction prototype 
#include <stdio.h>
#include <stdlib.h>
void f1(int);
void f2(int*);
int main() {

    int a = 200;
    f1(a);
    printf("a = %d\n", a);

    f2(&a);
    printf("a = %d\n", a);

    return 0;
}

void f1(int a) {
    a = 100;
}

void f2(int* p) {
    *p = 100;
}
//------powershell--------./hello 로 실행하라.
