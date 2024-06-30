#include<iostream>
using namespace std;

int main()
{
    int n,a=0,b=1,sum=0;
    int c;
    cout<<"Enter the value print how much fiboo: ";
    cin>>n;

    for(int i=0; i<n; i++)
    {
        cout<<a<<" ";
        sum+=a;
        c=a+b;
        a=b;
        b=c;
    }
    cout<<endl;
    cout<<sum<<endl;
    return 0;
}