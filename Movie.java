package package1;

public class Movie {
	
	
	String MovieName;
	String mipaa;
	private double averageRating= 0;
	private int terrible = 0;
	private int bad = 0;
	private int ok = 0;
	private int good = 0;
	private int great = 0;
	
	//Constructors
	public Movie(String MovieName1, String mipaa1)
	{
		//Add movie and Mipaa
		MovieName = MovieName1;
		mipaa = mipaa1;
	}
	
	//add a rating
	public void addRating(int rating) {
		
		switch (rating) {
		//use switch to go through each possible input
		case 1:
			terrible++;
			break;
		case 2:
			bad++;
			break;
		case 3:
			ok++;
			break;
		case 4:
			good++;
			break;
		case 5:
			great++;
			break;
		//If user has not entered in one of the cases
		default:
			System.out.println("Please enter 1-5");
			break;
		}
		
	}
	
	public double getAverage()
	{
		//Math to get average
		averageRating = Math.round(((terrible * 1) + (bad * 2) + (ok * 3) + (good * 4) + (great * 5))/5.00);
		return averageRating;
	}

}
