import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        String s = "zoho";
        String str="";
         Map<Character,Integer> m = new TreeMap<>();
       for(int i=0;i<s.length();i++)
        {
            if(m.containsKey(s.charAt(i)))
            {
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
           else{
               m.put(s.charAt(i),1);
           }
        }
        for(Entry<Character,Integer> entry : m.entrySet())
        {
            if(entry.getValue()>=1)
            {
                  str=entry.getKey()+str;
            }
        }
        System.out.print(str);
        
    }
}
// output:
//  zoh
