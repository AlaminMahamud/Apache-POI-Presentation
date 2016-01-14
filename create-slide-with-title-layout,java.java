// Create a Slide with Title Layout in a Presentation

// file classes

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// APACHE POI Classes to manipulate presentation files

import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTextShape;

public class TitleLayout
{
	public static void main(String[] args)throws IOException
	{
		// Creating presentation
			XMLSideShow ppt = new XMLSlideShow();
			
		// Getting the SlideMaster Object
			XSLFSlideMaster slideMaster = ppt.getSlideMaster()[0];
			
		// get the desired slide layout
			XSLFSlideLayout titleLayout = slideMaster.getLayout(SlideLayout.TITLE);
			
		// creating a slide with the title layout
			XSLFSlide slide1 = ppt.createSlide(titleLayout);
			
		// selecting the place holder in it
			XSLFTextShape title1 = slide1.getPlaceholde(0);
			
		// setting the title init
			title1.setText("I Learnt APACHE POI from Tutorials Point");
		
		// create a file object
			File file = new File("C://POIPPT//Examples//TitleLayout.ppyx");
			FileOutputStream out = new FileOutputStream(file);
			
		// save the changes in a PPT document
			ppt.write(out);
			System.out.println("Slide created Successfully");
			out.close();
	}
}