/*We will check if it is equal to M,C,D,I,L,X,V etc and add those respective values to variable sum except
for I ,X and C
for eg :-
if we have IV that is when 'I' is placed before V or X we need to subtract 1
Hence we will check that if the element after I is V or X add -1 to sum else add +1
similary for X and C conditions are verified
*/
class Solution {
public:
    int romanToInt(string s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
            
        {
            char c=s[i];
            char d=s[i+1];
            if((c=='I') && ((d=='V')||(d=='X')))
            {
             sum-=1;   
            }
            else if(c=='I' && ((d!='V')||(d!='X')))
            {
                sum+=1;
            }
            else if(c=='V')
            {
                sum+=5;
            }
        
        else if(c=='X' && (d=='L' || d=='C'))
            {
                sum-=10;
            }
            else if(c=='X' &&( d!='L' || d!='C'))
            {
                sum+=10;
            }
            else if(c=='L')
            {
                sum+=50;
            }
             else if(c=='C' &&( d=='D'|| d=='M'))
            {
                sum-=100;
            }
             else if(c=='C' && (d!='D'|| d!='M'))
            {
                sum+=100;
            }
            else if(c=='D')
            {
                sum+=500;
            }
            else if(c=='M')
            {
                sum+=1000;
            }
            
}
        return abs(sum);
    }
};
