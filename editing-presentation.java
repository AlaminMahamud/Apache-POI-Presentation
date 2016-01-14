/// Complete Program to open and add Slides

// File Classes Import

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// APACHE POI Class Import
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class EditPresentation
{
	public static void main(string args[]) throws IOException
	{
		// opening an existing slide show
			File file = new File("file name.pptx");
			FileInputStream inputStream = new FileInputStream(file);
			XMLSlideShow ppt = new XMLSlideShow(inputStream);
			
		// adding slides to the slideshow
			XSLFSlide slide1 = ppt.createSlide();
			XSLFSlide slide2 = ppt.createSlide();
			
		// saving the changes
			FileOutPutStream out = new FileOutputStream(file);
			ppt.write(out);
			out.close();
	}
}