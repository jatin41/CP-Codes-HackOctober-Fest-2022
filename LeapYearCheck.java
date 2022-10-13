import java.util.Scanner;
class LeapYearCheck{
public static void Check(int a){


}
public static void main(String args[]){
System.out.println("enter year: ");
Scanner reader = new Scanner(System.in);
int year = reader.nextInt();
if (year%400==0){
System.out.println("it is a leap year");
}

else if (year%100==0){
System.out.println("it is not a leap year");
}
else if (year%4==0){
System.out.println("it is a leap year");
}
else if (year>0){
System.out.println("it is not a leap year");
}

else{
System.out.println("Invalid");
}
}
}
