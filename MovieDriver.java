import java.util.Scanner; 

public class MovieDriver {
	
	public static void main(String[] args) {
		boolean repeat = true;
		while(repeat == true) {
			Movie movieOne = new Movie(); 
			String movieTitle = ""; 
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter title of movie: ");
			movieTitle = keyboard.nextLine(); 
			movieOne.setTitle(movieTitle); 
	
			String rating = "";
			System.out.println("Please enter your rating of the movie: ");
			rating = keyboard.nextLine(); 
			movieOne.setRating(rating);
	
			int numOfTickets = 0;
			System.out.println("Please enter the number of tickets sold at Maryland Theater: ");
			numOfTickets = keyboard.nextInt();
			movieOne.setSoldTickets(numOfTickets);
	
			System.out.println(movieOne.toString());
			
			String answer = "";
			System.out.println("Do you want to continue? (yes or no)");
			keyboard.nextLine();
			answer = keyboard.nextLine();
			if(answer.equals("no")) {
				keyboard.close();
				System.out.println("Goodbye");
			}
				
		}
	}
}
