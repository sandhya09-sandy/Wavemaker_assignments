package org.example;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws SQLException
    {
        Connection conn=null;
        Statement stmt=null;
        PreparedStatement pstmt=null;
        String usage="use sandy";
        Scanner sc=new Scanner(System.in);
        String query = "insert into book " +
                "(id, name, author,price) " +
                "values (?,?,?,?)";
        String query1="delete from book where id=?";
        String query2="select name,author from book where id=?";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandy", "root", "Sandy@*09");
            stmt = conn.createStatement();
            stmt.execute(usage);
            ResultSet res = stmt.executeQuery("select * from book");
            while (res.next()) {
                System.out.println("BOOKID:  " + res.getInt(1) + "  " + " NAME:  " + res.getString(2) + " " + "  AUTHOR: " + res.getString(3) + " " + " PRICE: " + res.getInt(4));
            }
            System.out.println("1.Insertion of the book");
            System.out.println("2.Deletion of the book");
            System.out.println("3.Search for a  book");
            System.out.println("4.List of all books");
            System.out.println("----------------------------------");
            System.out.println("Enter the action you need to perform");
            int n = sc.nextInt();
            int bookid=0;
            String bookname="";
            String bookauthor="";
            int bookprice=0;
            switch(n)
            {
                    case 1:
                        pstmt = conn.prepareStatement(query);
                        System.out.println("Enter the id of the book to insert");
                        bookid=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the name of the book to insert");
                        bookname=sc.nextLine();
                        System.out.println("Enter the author of the book to insert");
                        bookauthor=sc.nextLine();
                        System.out.println("Enter the price of the book to insert");
                        bookprice=sc.nextInt();
                        pstmt.setInt(1, bookid);
                        pstmt.setString(2, bookname);
                        pstmt.setString(3, bookauthor);
                        pstmt.setInt(4, bookprice);
                        pstmt.executeUpdate();
                        System.out.println("record inserted succesfully");
                       /*ResultSet res1=pstmt.executeQuery("select * from book");
                        while (res1.next())
                           {
                             System.out.println("BOOKID:  "+res.getInt(1)+"  "+" NAME:  "+res.getString(2)+"-----> "+"  AUTHOR: "+res.getString(3)+"-----> "+" PRICE: "+res.getInt(4));
                            }*/
                        break;
                    case 2:
                        pstmt=conn.prepareStatement(query1);
                        System.out.println("enter the bookid you want to delete");
                        bookid=sc.nextInt();
                        pstmt.setInt(1,bookid);
                        pstmt.executeUpdate();
                        System.out.println("record deleted successfully");
                        break;
                    case 3:
                        PreparedStatement pstmt1=conn.prepareStatement(query2);
                        System.out.println("enter the bookid you want to search");
                        bookid=sc.nextInt();
                        pstmt1.setInt(1,bookid);
                        ResultSet rs = pstmt1.executeQuery();
                        while (rs.next()) {

                            String name = rs.getString("name");
                            String author = rs.getString("author");
                            System.out.println("NAME : " + name);
                            System.out.println("AUTHOR: " + author);

                        }
                        System.out.println("record searched successfully");
                        break;
                case 4:
                    Statement stmt1=conn.createStatement();
                    stmt1.execute(usage);
                    ResultSet res1=stmt1.executeQuery("select * from book");
                    System.out.println("Listing all the books");
                    while (res1.next())
                    {
                        System.out.println("BOOKID:  "+res1.getInt("id")+"  "+" NAME:  "+res1.getString("name")+"-----> "+"  AUTHOR: "+res1.getString("author")+"-----> "+" PRICE: "+res1.getInt("price"));
                    }

                    res1.close();
            }
            res.close();
            stmt.close();
            pstmt.close();
            conn.close();

            }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
