package patterns.creational.factoryMethod;

interface ImageReader {
    DecodedImage getDecodeImage();
}

class DecodedImage {
    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}

class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}

class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ImageReader readerGif = new GifReader("image.gif");
        ImageReader readerJpeg = new JpegReader("image.jpg");

        DecodedImage decodedImageGif = readerGif.getDecodeImage();
        DecodedImage decodedImageJpeg = readerJpeg.getDecodeImage();
        System.out.println(decodedImageGif);
        System.out.println(decodedImageJpeg);
    }
}
