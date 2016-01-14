/// Reading Image

/// Reading all the pictures in the presentation

for(XSLFPictureData data : ppt.getAllPictures())
{
	byte[] bytes = data.getData();
	String fileName = data.getFileName();
	int pictureFormat = data.getPictureType();
	System.out.println("picture name: " + fileName);
	System.out.println("picture format: "+ pictureFormat);
}