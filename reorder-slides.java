// Reorder slide in a presentation with apache-poi

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// apache-poi classes import

import org.apache-poi.xslf.usermodel.XMLSlideShow;
import org.apache-poi.xslf.usermodel.XSLFSlide;

public class ReorderSlide
{
	public static void main(string[] args)throws IOException
	{
		/// opening an existing presentation
			File file = new File("example1.pptx");
			XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(file));
			
		/// get the slides
			XSLFSlide[] slides = ppt.getSlides();
			
		/// selecting the fifth slide
			XSLFSlide selectedSlide = slides[4];
			
		/// bringing it to the top
			ppt.setSlideOrder(selectedSlide, 0);
			
		/// creating an file object
			FileOutputStream out = new FileOutputStream(file);
			
		/// saving the changes to a file
		ppt.write(out);
		out.close();
	}
}

