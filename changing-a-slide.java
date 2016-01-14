
// Create a presentation
XMLSlideShow ppt = new XMLSlideShow();

//Changing a Slide
java.awt.Dimension pgSize = ppt.getPageSize();

ppt.setPageSize(new java.awt.Dimension(1024,768));