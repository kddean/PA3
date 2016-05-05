import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NYTimes {

	public ArrayList<Review> parse() throws FileNotFoundException{
		File txt = new File("NYTimes.txt");
		Scanner s = new Scanner(txt);
		
		String div = "|";
		ArrayList<Review> list = new ArrayList<Review>();
		String[] temp;
		Review review = new Review("", "", "", "", "", "");
		
		
		while (s.hasNextLine())
		{
			temp = s.nextLine().split(div);
			review.setName(temp[0]);
			review.setTitle(temp[1]);
			review.setDate(temp[2]);
			review.setGenre(temp[3]);
			review.setText(temp[4]);
			review.setSource("NYTimes");
			list.add(review);
			
		}
		
		return list;
		
	}
	
	public ArrayList<Review> reviewByGenre(ArrayList<Review> list, String genre){
		
		ArrayList<Review> results = new ArrayList<Review>();
		for(int i = 0; i < list.size(); i++)
		{
			Review r = list.get(i);
			String g = r.getGenre();
			if(g.equals(genre)){
				results.add(r);
			}
		}
		return results;
	}
	
public ArrayList<Review> reviewByDate(ArrayList<Review> list, String date){
		
		ArrayList<Review> results = new ArrayList<Review>();
		for(int i = 0; i < list.size(); i++)
		{
			Review r = list.get(i);
			String d = r.getDate();
			if(d.equals(date)){
				results.add(r);
			}
		}
		return results;
	}
}
