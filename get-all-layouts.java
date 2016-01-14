// Given below the program to get the list of all available layouts in the PPT

// file classes to handle file ops

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


// apache poi classes to handle ppt from java

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;


public class SlideLayouts
{
	public static void main(String[] args) throws IOException
	{
		/// Create an empty presentation
			XMLSlideShow ppt = new XMLSlideShow();
			System.out.println("Available Slide Layouts");
			
		/// getting the list of all slide masters
		for(XSLFSlideMaster master : ppt.getSlideMasters())
		{
		/// getting the list of the layouts in each slide masters
			for(XSLFSlideLayout layout : master.getSlideLayouts())
			{
				/// getting the list of available slides
				System.out.println(layout.getType());		
			}
		}
	}
}
