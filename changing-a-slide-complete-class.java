/// Complete Program for changing a slide

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XMLSlideShow;

public class ChangeSlide
{
	public static void main(String[] args) throws IOException
	{
		// create file object
			File file = new File("TitleAndContentLayout.pptx");
			
		// create presentation
			XMLSlideShow ppt = new XMLSlideShow();
			
		// getting the current page size
			java.awt.Dimension pgsize = ppt.getPageSize();
			int pgw = pgsize.width; // slide width in points
			int pgh = pgsize.height; // slide height in points
			
			System.out.println("current page size of the ppt is:");
			System.out.println("width: " + pgw);
			System.out.println("height: " + pgh);
			
		// set the new page size
			ppt.setPageSize(new java.awt.Dimension(2048,1536));
			
		// creating a file object
			FileOutputStream out = new FileOutputStream(file);
			
		// saving the changes to a file
			ppt.write(out);
			System.out.println("slide size changed to given dimensions");
			out.close();
	}
}
