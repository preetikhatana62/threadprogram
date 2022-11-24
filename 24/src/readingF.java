import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readingF {
	public static void main(String[] args) {
		try {
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\91740\\preeti.txt"));
		try {
		 String data=bf.readLine();
		 System.out.println(data);
		}
         
finally {
			
		bf.close();
}
	}
   catch(IOException e)
		
		{
	   e.printStackTrace();
	   }
		System.out.println("completed");
		}
}
