import java.util.Scanner;
import java.io.*;

public class Day1
{
    public static void main (String [] args) throws IOException 
    {
        Scanner linescan = new Scanner (new File("day1\\calibration"));
        String word, line;
        int first, second;
        
        line = linescan.nextLine();

            while (linescan.hasNext())
            {
                Scanner wordscan = new Scanner(line);
                word = wordscan.next(line);

                while(wordscan.hasNext())
                {
                    first = first * 10;
                }
        }
    }   
}
