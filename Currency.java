package converters;
import java.util.Scanner;
public class Currency {
public static double EUROtoINR(double Euro) {
return Euro * 80;
}
public static double DOLLARtoINR(double Dollar) {
return Dollar * 66.89;
}
public static double YENtoINR(double Yen) {
return Yen * 0.61;
}
public static double INRtoEURO(double Ind) {
return Ind * 0.013;
}
public static double INRtoDOLLAR(double Dollar) {
return Dollar * 0.015;
}
public static double INRtoYEN(double Yen) {
return Yen * 1.63;
}
public static void userChoice(){
Scanner sc = new Scanner(System.in);
int choice = 0;
double money = 0;
while(choice != 7){
System.out.println("\nCurrency Converter");
System.out.println("1. Dollar to Ind\n2. Euro to Ind\n3. Yen to Ind\n"+ "4. Ind to Dollar\n5. Ind to Euro\n6. Ind to Yen\n" + "7.Exit\n\nEnter Your Choice");
choice = sc.nextInt();
switch(choice){
case 1:
System.out.println("Enter in DOLLAR"); money = sc.nextDouble();
System.out.println(money+" DOLLAR is equal to "+Currency.DOLLARtoINR(money)+" INR");
break;
case 2:
System.out.println("Enter in EURO");
money = sc.nextDouble();
System.out.println(money+" EURO is equal to "+Currency.EUROtoINR(money)+" INR");
break;
case 3:
System.out.println("Enter in YEN");
money = sc.nextDouble();
System.out.println(money+" YEN is equal to "+Currency.YENtoINR(money)+" INR");
break;
case 4:
System.out.println("Enter in INR");
money = sc.nextDouble();
System.out.println(money+" INR is equal to "+Currency.INRtoDOLLAR(money)+" DOLLARS");
break;
case 5:
System.out.println("Enter in INR");
money = sc.nextDouble();
System.out.println(money+" INR is equal to
"+Currency.INRtoEURO(money)+" EURO");
break;
case 6:
System.out.println("Enter in INR");
money = sc.nextDouble();
System.out.println(money+" INR is equal to
"+Currency.INRtoYEN(money)+" YEN");
break;
case 7:
break;
default:
System.out.println("Please choose valid option");
break;
}
}
}
}
