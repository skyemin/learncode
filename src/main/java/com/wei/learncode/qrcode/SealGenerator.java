package com.wei.learncode.qrcode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class SealGenerator {

    public static void main(String[] args) {
        // 签章的宽高
        int width = 400;
        int height = 200;

        // 创建一个新图像
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // 抗锯齿和平滑
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 设置背景色
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // 绘制圆形边框
        g2d.setColor(new Color(255, 0, 0)); // 红色
        g2d.drawOval(10, 10, width - 20, height - 20);

        // 添加签名文本
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("SimSun", Font.BOLD, 24)); // 确保你的服务器上有对应字体
        String text = "济南擎天汽车服务有限公司";
        FontMetrics metrics = g2d.getFontMetrics();
        int x = (width - metrics.stringWidth(text)) / 2;
        int y = (height - metrics.getHeight()) / 2 + metrics.getAscent() + 20; // 向下调整位置
        g2d.drawString(text, x, y);

        // 释放图形上下文
        g2d.dispose();

        // 将图像转换为 Base64
        String base64Image = encodeImageToBase64(bufferedImage);
        System.out.println("Base64 Image: " + base64Image);

        System.out.println("签章已生成并保存为 seal.png！");
    }

    private static String encodeImageToBase64(BufferedImage image) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(image, "png", baos);
            byte[] imageBytes = baos.toByteArray();
            return Base64.getEncoder().encodeToString(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    }
