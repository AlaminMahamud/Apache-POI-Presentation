/// APACHE POI PPT - Creating HyperLinks

/// Create a text run object and set text to it as shown below:

XSLFTextRun  textRun = body.addNewTextParagraph().addNewTextRun();
textRun.setText("TutorialsPoint");

XSLFHyperLink link = textRun.createHyperLink();
link.setAddress("www..jjas.com");