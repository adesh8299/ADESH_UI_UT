import java.util.Scanner;

public class Email_Validation {
    void email()
    {
        String[] Array={"alex@knoldus.com","jhon@knoldus.com","rio@knoldus.com","helsinki@knoldus.com","tokiyo@knoldus.com","artuiro@knoldus.com"};
        //i am using array at the place of databse

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mail to search:");
        String mail=sc.next();
        boolean flag=false;
        for(int i=0;i<5;i++)
        {
            if (Array[i].equals(mail)) {

                flag=true;
                break;
            }

        }
        if (flag)
        {
            System.out.println("Email Exist in DB");
        }
        else System.out.println("Email Does Not Exist in DB");
    }
}
