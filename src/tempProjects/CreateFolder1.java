package tempProjects;

import java.io.File;

public class CreateFolder1 {

	public static void main(String[] args) {
		
		File f = new File ("C:\\Test.txt");
		
		if (f.mkdir())
		{
			System.out.println("Folder created");
		} else {
			System.out.println("Folder not created");
		}

	}

}
