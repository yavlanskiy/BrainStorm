package comparepdf;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

import java.io.IOException;

public class ComparePDF {
    public static void main(String[] args) {
        final PDFUtil pdfUtil = new PDFUtil();
        String file1="C:/PDFtest/1.pdf";
        String file2="C:/PDFtest/false2.pdf";

        try {
            pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
            pdfUtil.highlightPdfDifference(true);
            final boolean result = pdfUtil.compare(file1, file2);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Не нашли файл");
        }
    }
}
