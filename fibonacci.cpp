#include<iostream>
using namespace std;

int main()

{
    int n,rem=0,sum=1;
    cout<<"Enter no to check palindrome: ";
    cin>>n;
    int temp=n;
    while(n>0)
    {
        rem =n%10;
        sum=rem*10+sum;
        n=n/10;
    }

    return 0;
}