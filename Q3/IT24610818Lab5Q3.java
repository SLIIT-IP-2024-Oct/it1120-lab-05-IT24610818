import java.util.Scanner;

public class IT24610818Lab5Q3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	final float  price = 48000;
	int numberDate;
	float disPrice, noDisPrice, finalPrice;

	System.out.println("Enter Start Date(1-31): ");
	int startDate = input.nextInt();
	System.out.println("Enter End Date(1-31): ");
	int endDate = input.nextInt();

	if(startDate >= endDate){
		System.out.println("Error: Start Date must be less than End Date");
		return;
          }

        else if((startDate<1)||(startDate>31)||(endDate<1)||(endDate>31)){
		System.out.println("Error: Days must be between 1 and 31");
		return;
}
	System.out.println("Room charge Per Day: Rs. "+price+"/=");
		
	numberDate = endDate - startDate;
	noDisPrice = numberDate * price;

	System.out.println("Number of Days Reserved: "+numberDate);
	if(numberDate<3){
		System.out.println("Total ammount to be Paid: "+noDisPrice+"/=");
	}else if(numberDate<5){
	  disPrice = noDisPrice * 10 / 100;
	  finalPrice = noDisPrice - disPrice;
		 System.out.println("Total ammount to be Paid: "+finalPrice+"/=");
		 }else{
		 disPrice = noDisPrice * 20 / 100;
		 finalPrice = noDisPrice - disPrice;
		  System.out.println("Total ammount to be Paid: "+finalPrice+"/=");
}
}
}
