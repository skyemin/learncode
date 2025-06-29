package com.wei.learncode.qrcode;

import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class QRCodeGenerator {

    public static void main(String[] args) {
//        String url = "https://www.baidu.com";
//        String base64String = generateBase64QRCode(url, 250, "png");
//        System.out.println("Base64 string: " + base64String);
        String test  ="https://market.wapa.taobao.com/app/trip/rx-vehicle-ecosystem/pages/signing?tpOrderId=%s&fromSource=3&raw_webview=true&fpt=source(asmart)uniqueId(19483209109)channel(sms)&_projVer=1.15.15";
        System.out.println(String.format(test, "AFJJVvVRv6na"));
    }

    private static String generateBase64QRCode(String url, int size, String fileType) {
        // 设置二维码生成参数
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        hints.put(EncodeHintType.MARGIN, 1);

        // 创建二维码写入器实例
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix;
        try {
            // 使用写入器将URL转换成位矩阵
            bitMatrix = qrCodeWriter.encode(url, com.google.zxing.BarcodeFormat.QR_CODE, size, size, hints);
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }

        // 创建位图图像
        int matrixWidth = bitMatrix.getWidth();
        BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
        image.createGraphics();

        // 绘制图像
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, matrixWidth, matrixWidth);
        graphics.setColor(Color.BLACK);
        for (int x = 0; x < matrixWidth; x++) {
            for (int y = 0; y < matrixWidth; y++) {
                if (bitMatrix.get(x, y)) {
                    graphics.fillRect(x, y, 1, 1);
                }
            }
        }

        // 将图像转换为Base64编码
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, fileType, baos);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        byte[] imageBytes = baos.toByteArray();
        return Base64.getEncoder().encodeToString(imageBytes);
    }
}

