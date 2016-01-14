// Complete Program to create a blang MS-Powerpoint presentation
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class CreatePresentation
{
	public static void main(String[] args) throws IOException
	{
		/// Creating a new Empty SlideShow
			XMLSlideShow ppt = new XMLSlideShow();
		/// Creating a FileInputStream object
			File file = new File("example1.pptx");
			FileOutputStream out = new FileOutputStream(file);
		/// saving the changes to a file
			ppt.write(out);
			System.out.println("Presentation Created Successfully");
			out.close();
	}
}