#include <iostream>
using namespace std;

int main() {
    int a=8;
    int b=8;

    if(a>5 && b>8 && a++ && b--){
        cout<<"True";
    }else{
        cout<<"False";
    }
    return 0;
}