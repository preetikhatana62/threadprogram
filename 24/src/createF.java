import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class createF {
	public static void main(String[] args) {
		String ls=System.lineSeparator();
		try {
		BufferedWriter bf=new BufferedWriter(new FileWriter("C:\\Users\\91740\\preeti.txt"));
		for(int i=0;i<5;i++) {
		bf.write("this is my firt file using java language"+ls);
		bf.write("this is the second line of my program" );
	     
		}
		bf.close();
	
		
				 }
   catch(IOException e)
		{ 
	   e.printStackTrace();
	   }
		System.out.println("completed");
	}

}
