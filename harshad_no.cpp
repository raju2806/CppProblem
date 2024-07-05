#include<iostream>
using namespace std;

int main()
{
    int n,rem,sum=0;
    cout<<"Enter no to check: ";
    cin>>n;
    int temp=n;
    while (n>0)
    {
        rem=n%10;
        sum+=rem;
        n=n/10;
    }
    if(temp%sum==0) {cout<<"Yes"<<endl;}
    else {cout<<"No"<<endl;}

    return 0;
}