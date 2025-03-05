// ques 1 : 2591. Distribute money to maximum children
// Link : https://leetcode.com/problems/distribute-money-to-maximum-children/description/?envType=problem-list-v2&envId=math

class Solution {
    public int distMoney(int money, int children) {
        int n=children;
        int m=money;
        int x=m/8;
        if(m<n)
        return -1;
        else if(m-7<n)
        return 0;
        if(n<x){
        if(n-1<=0)
        return 0;
        else
        return n-1;}
        else if(n==x){
            if(m%8==0){
                 if(x<=0)
                    return 0;
                    else
                return x;
            }
            else{
                 if(x-1<=0)
                    return 0;
                 else
                    return x-1;
            }
        }
        else if(n>x){
            if(m%8==4 && n==x+1)
            {
                 if(x-1<=0)
        return 0;
        else
        return x-1;
            }
            else if(n-x<=m%8)
            if(x<=0)
        return 0;
        else
        return x;
            for(int i=0;i<=x;i++){
               if( n-x-m%8 <= i*7)
               if(x-i<=0)
        return 0;
        else
        return x-i;
            }
        }
        return 0;
    }
}


