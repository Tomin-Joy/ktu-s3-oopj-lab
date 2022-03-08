/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/
import java.io.*;

public class Experiment11 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("CopySample.txt");
			FileReader fr = new FileReader("4Sample.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				char j=(char)i;
					fw.write(j);
			}
			fr.close();
			fw.close();
		}catch(FileNotFoundException e ) {
			System.out.println("Exception;File NOT Found Sorry");
		}
		catch(IOException e){
			System.out.println("Exception;IOException Found Sorry");
		}
	}
}