//input n=54321;
//output =45230
public class Main {
    public static void main(String[] args) {
        int n =543210,count=0;
        int t=n;
        while(n>0)
        {
            count++;
            n/=10;
        }
        int i=0;
        int k[] = new int[count];
        while(t>0)
        {
            k[i++]=t%10;
            t/=10;
        }
        for(int j=0;j<count;j++)
        {
            if(k[j]%2==0) k[j]++;
            else --k[j];
        }
        for(int j=count-1;j>=0;System.out.print(k[j--]+""));
    }         
}
