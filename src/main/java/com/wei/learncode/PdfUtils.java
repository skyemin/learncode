package com.wei.learncode;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PdfUtils {

    public static ITextRenderer getRender() throws IOException, DocumentException {

        ITextRenderer render = new ITextRenderer();
        String path = PdfUtils.class.getResource("/").toString();
        render.getFontResolver().addFont(path + "simsun.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        return render;
    }

    /**
     *
     * @throws Exception
     */
    public static void generateToFile(String html,String outputFile) throws Exception {
        OutputStream out = null;
        ITextRenderer render = null;
        try {
            out = new FileOutputStream(outputFile);
            render = getRender();
            render.setDocumentFromString(html);
            render.layout();
            render.createPDF(out);
            render.finishPDF();
        }finally {
            if(render!=null) {
                render = null;
            }
            if(out!=null) {
                out.close();
            }
        }

    }


    public static byte[] generateToByte(String html) throws Exception {
        ByteArrayOutputStream out = null;
        ITextRenderer render = null;
        try {
            out = new ByteArrayOutputStream();
            render = getRender();
            render.setDocumentFromString(html);
            render.layout();
            render.createPDF(out);
            render.finishPDF();
            return out.toByteArray();
        }catch (Exception e){
            throw e;
        }finally {
            if(render!=null) {
                render = null;
            }
            if(out!=null) {
                out.close();
            }
        }

    }
}
