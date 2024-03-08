public class Pattern_searching_naive 
{
    public static void main(String[] args)
    {
        String txt = "ABCDABCD";
        String tg = "CBABCDABCD";
        String pat = "ABCD";
        searchPatternRemaster_1(tg, pat);

    }
    public static void searchPattern(String txt,String pat)
    {
        int m,n;
        n=txt.length();
        m=pat.length();
        for(int i=0;i<=n-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(pat.charAt(j)!=txt.charAt(j+i))
                {
                    break;
                }
                
            }
            if(j==m)
                {
                    System.out.println(i+",");
                }
            

        }
    }
    public static void searchPatternRemaster_1(String txt,String pat)
    {
        int n,m;
        n=txt.length();
        m=pat.length();
        for(int i=0;i<=n-m;)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(txt.charAt(j+i)!=pat.charAt(j))
                {
                    break;
                }
            }
                if(j==m)
                {
                    System.out.print(i+",");
                }
                if(j==0)
                {
                    i++;
                }
                else
                {
                    i=i+j;

                }
            
        }

    }
    
}
