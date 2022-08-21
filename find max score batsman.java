// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
         int max=0;
        String s="";
        for(int i=0;i<=x;i++)
        {
            String[] a = sc.nextLine().split(",");
            for(int m=1;m<a.length;m+=2)
            {
                int k = Integer.parseInt(a[m]);
                if(max<k)
                {
                    max=k;
                    s=a[m-1];
                }
            }
        }
       System.out.print(s);
    }
}
