import java.util.Scanner;

public class Bookstore {
	
	static Scanner myscanner=new Scanner(System.in);
	
	static String[]books={"Java","C","Python"};
	
	static final double studentdiscount=0.4;
	static final double teacherdiscount=0.2;
	static final double aliendiscount=0.0;
	
	public static void main(String[] args) {
		
		prln("----WELCOME TO OUR BOOKSTORE---");
		
		prln("Which book do you want?\n Ans:");
		
		String userchoice=myscanner.nextLine();
		
		if(books[0].toLowerCase().equals(userchoice.toLowerCase())){
			prln("You have opted "+books[0]+" Book.");
			calculateprice(books[0]);
			
			}
		else if(books[0].toLowerCase().equals(userchoice.toLowerCase())){
			prln("You have opted"+books[1]+"Book.");
			calculateprice(books[1]);
			
			}
		else if(books[0].toLowerCase().equals(userchoice.toLowerCase())){
			prln("You have opted"+books[2]+"Book.");
			calculateprice(books[2]);
			
			}
		else {
			prln("We don't have that book.");
			
			}
		
		
	}
	
	static void calculateprice(String bookname){
		prln("Are you student,teacher or alien?\n Ans:");
		
		String answer=myscanner.nextLine();
		
		double price=200;
		
		if(answer.toLowerCase().equals("student")){
			
			price=price-(price*studentdiscount);
			showprice(price);
			
		}
		else if(answer.toLowerCase().equals("teacher")){
			
			price=price-(price*teacherdiscount);
			showprice(price);
			
		}
		else if(answer.toLowerCase().equals("alien")){
			
			price=price-(price*aliendiscount);
			showprice(price);
			
		}
		else{
			prln("Sorry,We can't serve you.");
		}
		
	}
	
	static void showprice(double price){
		prln("Your total payable amount is:"+price);
		prln("----------------THANK YOU FOR SHOPPING FROM OUR STORE.----------------");
		
	}
	
	static void prln(Object anyobject){
		System.out.println(anyobject);
		
	}
	
	static void pr(Object anyobject){
		System.out.print(anyobject);
		
	}


}
