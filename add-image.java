/// Adding an Image

///reading an Image 
File image = new File("C://POIPPT//girl.jpg");

///converting it into a byte array
byte[] pic = IOUtils.toByteArray(new FileInputStream(image));

/// adding the picture in the slide
int idx = ppt.addPicture(picture, XSLFPictureData.PICTURE_TYPE_PNG);
XSLFPictureShape pic = slide.createPictire(idx);