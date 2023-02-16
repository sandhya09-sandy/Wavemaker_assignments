import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> nominee=new HashMap<Integer,String>();
        HashMap<Integer,String> user=new HashMap<Integer,String>();
        nominee.put(101,"ram");
        nominee.put(102,"sam");
        nominee.put(103,"rahul");
        nominee.put(104,"rishi");

        System.out.println("enter the no.of users");
        int n=sc.nextInt();
        int nominee1=0;
        int nominee2=0;
        int nominee3=0;
        int nominee4=0;
        int maxvote=0;

        HashMap<Integer,Integer> vote=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();
        Vector<Integer> count=new <Integer>Vector();
        String username="";
        int userid=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the user id");
            userid=sc.nextInt();
            System.out.println("Enter the user name");
            username=sc.next();
            if(vote.containsKey(userid))
            {
                System.out.println("user has already voted");
            }
            else {
                user.put(userid,username);
                System.out.println("Enter the vote");
                int j=sc.nextInt();
                if(nominee.containsKey(j)) {
                    vote.put(userid,j);
                }
                if(j==101)
                {
                    nominee1++;
                }
                if(j==102)
                {
                    nominee2++;
                }
                if(j==103)
                {
                    nominee3++;
                }
                if(j==104)
                {
                    nominee4++;
                }
            }


        }
       int c=0;
       int winnerid=0;System.out.println("--------------------");
       System.out.println("Voted details of users for nominees");

        for(Map.Entry m : vote.entrySet()) {
           // if(m.getKey().equals(1)) {
                System.out.println("user id " + m.getKey() + " " + user.get(m.getKey()) + " voted for nominee id " + m.getValue());
            }



        System.out.println("-----------------------");
        System.out.println("Total votes of each nomineee");
        System.out.println(nominee.get(101)+"-->"+nominee1);
        System.out.println(nominee.get(102)+"-->"+nominee2);
        System.out.println(nominee.get(103)+"-->"+nominee3);
        System.out.println(nominee.get(104)+"-->"+nominee4);
        if(nominee1>maxvote)
        {
            winnerid=101;
            maxvote=nominee1;
        }
        if(nominee2>maxvote)
        {
            winnerid=102;
            maxvote=nominee2;
        }
        if(nominee3>maxvote)
        {
            winnerid=103;
            maxvote=nominee3;
        }
        if(nominee4>maxvote)
        {
            winnerid=104;
            maxvote=nominee4;
        }
        if(nominee1==maxvote)
            c++;
        if(nominee2==maxvote)
            c++;
        if(nominee3==maxvote)
            c++;
        if(nominee4==maxvote)
            c++;
        if(c>1)
        {
            System.out.println("It is draw");
        }
        else {
            System.out.print("winner is " + winnerid + " " + nominee.get(winnerid));
        }
        /*for(Map.Entry m : result.entrySet()) {
            System.out.println("nominee id " +m.getKey() + " has votes " + m.getValue());
        }*/

    }
}