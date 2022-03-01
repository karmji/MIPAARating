package package1;

import java.util.Scanner;


public class TestMovieRating {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Enter your movie name: ");
			String MovieName = reader.nextLine();
			System.out.println("Enter your movie rating: ");
			String MovieRating = reader.nextLine();
			//GET ALL VALUES NEEDED
			Movie object = new Movie(MovieName, MovieRating);
			//SET THE NAME OF THE MOVIE
			//SET THE MIPAA RATING
			//WHILE LOOP FOR ADDING RATINGS
			int NoMoreRatings = 0;
			
			while(NoMoreRatings != -1) {
				System.out.println("Enter the rating of the movie (1 to 5, -1 to exit): ");
				//User takes in value, if 1-5 will addRating, if not will break if wrong type or ask for new integer if too high or too low
				int rating = reader.nextInt();
				if(rating != -1) {
					object.addRating(rating);
				}
				else {
					//Set ratings to -1 and break
					NoMoreRatings = -1;
				}
				
			}
			//Find average
			double average = object.getAverage();
			
				
			//Print out
			System.out.println("Name of the movie: " + object.MovieName);
			System.out.println("MIPAA rating: " + object.mipaa);
			System.out.println("Average rating: " + average);
		}
	}
}
