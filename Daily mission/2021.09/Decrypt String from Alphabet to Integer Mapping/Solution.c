#include <stdio.h>
#include <string.h>
void revstr(char *str1)  
{  
    // declare variable  
    int i, len, temp;  
    len = strlen(str1); // use strlen() to get the length of str string  
      
    // use for loop to iterate the string   
    for (i = 0; i < len/2; i++)  
    {  
        // temp variable use to temporary hold the string  
        temp = str1[i];  
        str1[i] = str1[len - i - 1];  
        str1[len - i - 1] = temp;  
    }  
}
char* freqAlphabets(char * s){
    printf("%s\n", s);
    char *temp;
    int *t;
    int count = 0;
    int res = 0;
    int len = strlen(s);
    char *ans = (char*)malloc(sizeof(char)*len+1);;

    // printf("%c\n", ans);
    for(int i = len-1;i>=0;i--){
        if(s[i] == '#'){
            t = (int*)malloc(sizeof(int) *2);
            i--;
            t[0] = (int)s[i] - 48;
            i--;
            t[1] = (int)s[i] - 48;
            res = t[0] + t[1] * 10 + 96;
        }
        else{
            temp = (char*)malloc(sizeof(char) *2);
            temp[0] = s[i];
            res = (int)temp[0] + 48;
        }
        ans[count] = (char)res;
        count++;
    }
    ans[count] = '\0';
    revstr(ans);
    return ans;
}