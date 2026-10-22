#include<iostream>
using namespace std;
int main(){
    string s;
    int alp=0, dig=0, i=0;
    cout<<"Enter any thing = ";
    cin>>s;
    while(s[i]!='\0'){
        if(s[i]>=65){
            alp++;
        }else{
            dig++;
        }
        i++;
    }
    cout<<"alphabet = "<<alp<<" digit = "<<dig;
    return 0;
}