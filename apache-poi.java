// Creating empty presentation

XMLSlideShow ppt = new XMLSlideShow();


// Save the changes to a PPT Document using the FileOutputStream class:

File file = new File("C://POIPPT/examples/example1.pptx");
FileOutputStream out = new FileOutputStream(file);
ppt.write(out);

