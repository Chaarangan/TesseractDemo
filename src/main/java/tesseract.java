//tess4j
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

//files
import java.io.File;


public class tesseract {
    private static Tesseract getTesseract() {
        Tesseract instance = new Tesseract();
        instance.setDatapath("/home/charangan/Desktop/");
        instance.setLanguage("eng");
        return instance;
    }

    public static void main(String[] args) throws TesseractException {
        Tesseract tesseract = getTesseract();
        File file = new File("/home/charangan/Desktop/tesseractSample.jpg");
        String result = tesseract.doOCR(file);
        System.out.println(result);
    }
}


