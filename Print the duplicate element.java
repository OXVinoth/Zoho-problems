import java.util.*;
import java.io.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        int n[] = {3,3,3,3,3,3,3,3,1};
          Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            if(map.containsKey(n[i]))
            {
                map.put(n[i],map.get(n[i])+1);
            }
            else{
                map.put(n[i],1);
            }
        }
        for(Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            System.out.println(entry.getKey() );
        }
        
    }
}

//input 
//3,3,3,3,3,3,3,3,1

//output
/3
