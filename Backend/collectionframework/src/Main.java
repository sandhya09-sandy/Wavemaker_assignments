import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nominees");
        int n=sc.nextInt();j
        //Arraylist
        List<Integer> nomineeid=new ArrayList();
        List<String> nominee=new ArrayList();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the nominee name of "+i+ " person");
            String ele=sc.next();
            nominee.add(ele);
            nomineeid.add(i);
        }
       System.out.println("Enter the number of users");
       int  m=sc.nextInt();
       List<String> vote=new Vector<String>();
       for(int j=1;j<=m;j++)
       {
           System.out.println("Enter the vote of "+j+"person");
           String s=sc.next();
           vote.add(s);
       }
       winner(vote);
    }
    public static void winner(List<String> vote)
    {
        int votesize= vote.size();
        int p=0;
        int c=0;
        String res="";
        for(int i=0;i<votesize;i++)
        {

            for(int j=0;j<votesize;j++)
            {
                if(vote.get(i).equals(vote.get(j)))
                {
                    c++;
                }
                if(c>p)
                {
                    p=c;
                    res=vote.get(i);
                }
                else if(c==p)
                {
                    if(vote.get(i).compareTo(res)<0)
                    {
                        res=vote.get(i);
                    }
                }
            }
        }
        System.out.println("Winner is "+res);
    }
}