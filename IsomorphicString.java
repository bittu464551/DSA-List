package String;
import java.util.HashMap;
import java.util.*;
public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> hashMap1=new HashMap();
        Map<Character,Boolean> hashMap2=new HashMap();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(hashMap1.containsKey(ch1)==true){
                if(hashMap1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(hashMap2.containsKey(ch2)==true){
                    return false;
                }
                else{
                    hashMap1.put(ch1, ch2);
                    hashMap2.put(ch2, true);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsomorphicString obj=new IsomorphicString();
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(obj.isIsomorphic(str1, str2));
    }
}
