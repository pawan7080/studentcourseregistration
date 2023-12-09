package studentregistration;
import java.util.Scanner;
public class studentregistrationsystem {
	
	public static void main(String[] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
    System.out.println("***Welcome To Student Registration System***");
    do{
    	studentregistrationsystem b=new studentregistrationsystem();
        System.out.println("1.Add Records :");
        System.out.println("2.Guardian Record :");
        System.out.println("3.Course Detail:");
        System.out.println("4.Exit");
        System.out.println("Enter Your Choice :");
         ch=sc.nextInt();
      
            switch(ch)
            {
                case 1:b.add();
                         break;
               // case 2:b.parent();
                       //  break;
                case 3:b.course();
                        break;
                case 4:b.exit();
                        break;
                default:System.out.println("You Have Entered Invalid Number ");
                break;
            }
            System.out.println("Do YOu Want To Contine Press 1 ");
    }
while(ch==1);

}
Scanner sc=new Scanner(System.in);
void add(){
    
    System.out.println("**Student's Details***");
System.out.println("Enter Student's Name: ");
String a= sc.nextLine();

System.out.println("Enter Student Id: ");
String f= sc.nextLine();

System.out.println("Enter Student's Address: ");
String b= sc.nextLine();

System.out.println("Enter Student's Dob: ");
String c= sc.nextLine();

System.out.println("Enter Students's Contact Number: ");
String d= sc.nextLine();
}
void course()
{
System.out.println("Enter The Course From Following: ");

System.out.println("Computer Technology Engineering ");
System.out.println("Information Technology Engineering ");
System.out.println("Electrical Engineering ");
System.out.println("Mechanical Engeneering ");

String f= sc.nextLine();
System.out.println("You Have Selected "+f );
}

void exit()
{
 System.out.println("***Thanks For Visiting***");
}
}
