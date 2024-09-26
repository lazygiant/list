import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

interface APIEnd
{
  String base = "https://www.example.com";
  String DELETE = base+"";
  
}
public class Notepad_Pgm {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\bikas\\OneDrive\\Desktop\\Manual_Interview_Questions.txt";
		
		List<String> everything = Files.readAllLines(Paths.get(filePath));
		
		for(String line:everything)
		{
			System.out.println(line);
		}
	}
}
