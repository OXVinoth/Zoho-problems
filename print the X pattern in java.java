//print the pattern
public class Main {
    public static void main(String[] args) {
         String s = "PROGRAM";
        int m=s.length()-1;
        int k=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++)
            {
                if(i==j){
                    System.out.print(s.charAt(k++));
                }
                else if((s.length()-i-1)==j)
                {
                    System.out.print(s.charAt(m--))
;                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// P     M
//  R   A 
//   O R  
//    G   
//   G R  
//  O   A 
// R     M
