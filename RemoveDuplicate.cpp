#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter size of array: ";
    cin>>n;

    int arr[n];
    int i=0;
    for(i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    int temp[n];
    int k=0;
    for(int j=0; j<n-1;j++)
    {
        if(arr[j]!=arr[j+1])
        {
            temp[k]= arr[j];
            k++;
        }
    }
    temp[k]=arr[n-1];

    for(int i=0; i<=k; i++){cout<<temp[i]<<" ";}
}