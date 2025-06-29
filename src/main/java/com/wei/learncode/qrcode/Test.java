package com.wei.learncode.qrcode;

import java.util.Base64;

public class Test {

    public static void myTestCompanySeal() throws Exception {

        String mainText = "北京某某科技有限公司";
        String titleText = "合同专用章";
        String viceText = "0192834567";

        String keZhang = "公章刻章字体";//它会根据字体名称 去 jre下的font里去找这个字体。没有的话，会用默认字体。可以灵活控制Font的字体。上方的 Seal类中，采用的是读取本地的字体文件。而不是去jre 下的font里去找。两种方式都可以。
        String songTi = "宋体";//同上

        // 使用工具生成印章图片
        try {
            Seal.SealBuilder builder = Seal.builder();
            builder.size(432);
            builder.borderCircle(SealCircle.builder().line(10).width(210).height(210).build());

            if (mainText != null) {
                // 根据主文字长度，设置字体大小及边距
                int length = mainText.length();
                int size = 70;
                double space = 50;

                if (length > 0 && length <= 8) {
                    space = 70;
                } else if (length == 9) {
                    space = 60;
                } else if (length == 10) {
                    space = 55;
                } else if (length == 11) {
                    space = 50;
                } else if (length == 12) {
                    space = 45;
                } else if (length == 13) {
                    space = 40;
                } else if (length == 14) {
                    space = 40;
                } else if (length == 15) {
                    space = 37;
                } else if (length == 16) {
                    size = 65;
                    space = 35;
                } else if (length == 17) {
                    size = 65;
                    space = 35;
                } else if (length == 18) {
                    size = 63;
                    space = 33;
                } else if (length == 19) {
                    size = 61;
                    space = 31;
                } else if (length == 20) {
                    size = 60;
                    space = 30;
                } else if (length == 21) {
                    size = 58;
                    space = 29;
                } else if (length == 22) {
                    size = 56;
                    space = 28;
                } else if (length == 23) {
                    size = 54;
                    space = 27;
                } else if (length == 24) {
                    size = 54;
                    space = 27;
                } else if (length == 25) {
                    size = 52;
                    space = 26;
                } else {
                    size = 60 - (length - 20) * 2;
                    space = 30 - (length - 20) * 0.5;
                }

                builder.mainFont(SealFont.builder().text(mainText).family(keZhang).size(size).space(space).margin(10).build());
            }
            //
            builder.centerFont(SealFont.builder().family(songTi).text("★").size(140).build());
            //
            if (titleText != null) {
                builder.titleFont(SealFont.builder().family(keZhang).text(titleText).size(50).space(0.0).margin(100).build());
            }

            // 副文字 数字编号
            if (viceText != null) {
                builder.viceFont(SealFont.builder().family(songTi).text(viceText).size(30).space(20.0).margin(-10).build());
            }
            //
            Seal build = builder.build();
            byte[] draw = build.draw("png");
            String base64 = Base64.getEncoder().encodeToString(draw);
            System.out.println(base64);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        myTestCompanySeal();
    }

}
