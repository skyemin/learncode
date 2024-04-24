package com.wei.learncode;

import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

public class TestPdf {

    public static void main(String[] args) throws Exception {
//        String html = "<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "<head>\n" +
//                "    <meta charset=\"utf-8\" />\n" +
//                "    <meta name=\"viewport\" content=\"initial-scale=1, width=device-width\" />\n" +
//                "\n" +
//                "    <style type=\"text/css\">\n" +
//                "@page {       \n" +
//                "              margin: 1.1in;      \n" +
//                "              }  \n" +
//                "           \n"+
//                "        body {\n" +
//                "            margin: 0px;\n" +
//                "            line-height: normal;\n" +
//                "            padding:0px;\n" +
//                "            width:100%;\n" +
//                "            font-family:'Euclid Circular A';\n" +
//                "        }\n" +
//                "        div{\n" +
//                "            margin: 0px;\n" +
//                "            padding: 0px;\n" +
//                "        }\n" +
//                "　　} "+
//                "    </style>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "<div\n" +
//                "        style=\"\n" +
//                "        position: relative;\n" +
//                "        background-color: #fff;\n" +
//                "        width: 595px;\n" +
//                "        overflow: hidden;\n" +
//                "        text-align: left;\n" +
//                "        font-size: 13px;\n" +
//                "        color: #2e3346;\n" +
//                "      \"\n" +
//                ">\n" +
//                "    <div\n" +
//                "            style=\"\n" +
//                "          top: 0px;\n" +
//                "          left: 0px;\n" +
//                "          width:595px;\n" +
//                "        \"\n" +
//                "    >\n" +
//                "        <div\n" +
//                "                style=\"\n" +
//                "            width: 569px;\n" +
//                "            padding:13px 0px;\n" +
//                "          \"\n" +
//                "        >\n" +
//                "            <div\n" +
//                "                    style=\"\n" +
//                "              text-align: center;\n" +
//                "              font-size: 0px;\n" +
//                "              width: 100%;\n" +
//                "              height: 69px;\n" +
//                "              overflow:hidden;\n" +
//                "            \"\n" +
//                "            >\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                width:569px;\n" +
//                "                height: 42px;\n" +
//                "                align-items: center;\n" +
//                "                justify-content: center;\n" +
//                "                overflow:hidden;\n" +
//                "              \"\n" +
//                "                >\n" +
//                "                    <div\n" +
//                "                            style=\"\n" +
//                "                    float: left;\n" +
//                "                    width: 122px;\n" +
//                "                    height: 32px;\n" +
//                "                    margin-top: 5.225px;\n" +
//                "                \"\n" +
//                "                    >\n" +
//                "                        <img\n" +
//                "                                style=\"\n" +
//                "                    float: left;\n" +
//                "                    width: 122px;\n" +
//                "                    height: 32px;\n" +
//                "                    overflow: hidden;\n" +
//                "                  \"\n" +
//                "                                alt=\"\"\n" +
//                "                                src=\"https://gw.alicdn.com/imgextra/i2/O1CN01m78S1F1LfM75avlmZ_!!6000000001326-0-tps-1330-188.jpg\"\n" +
//                "                        />\n" +
//                "                    </div>\n" +
//                "                    <div\n" +
//                "                            style=\"\n" +
//                "                  align-items: center;\n" +
//                "                  justify-content: center;\n" +
//                "                  float: right;\n" +
//                "                  overflow:hidden;\n" +
//                "                  height:72px;\n" +
//                "                \"\n" +
//                "                    >\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                    align-self: stretch;\n" +
//                "                    position: relative;\n" +
//                "                    line-height: 14px;\n" +
//                "                    font-weight: 500;\n" +
//                "                    font-size: 11px;\n" +
//                "                  \"\n" +
//                "                        >\n" +
//                "                <span>\n" +
//                "                  Booking Code\n" +
//                "                </span>\n" +
//                "                        </div>\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                    border-radius: 27px;\n" +
//                "                    background-color: #1e71ff;\n" +
//                "                    padding: 3px 10px;\n" +
//                "                    font-size: 13px;\n" +
//                "                    color: #fff;\n" +
//                "                    margin-top: 5px;\n" +
//                "                  \"\n" +
//                "                        >\n" +
//                "                                                                                                                            <div\n" +
//                "                                            style=\"\n" +
//                "                      position: relative;\n" +
//                "                      line-height: 16.5px;\n" +
//                "                      font-weight: 500;\n" +
//                "                    \"\n" +
//                "                                    >\n" +
//                "                  <span>\n" +
//                "                                                0CXRAA\n" +
//                "                                        </span>\n" +
//                "                                    </div>\n" +
//                "                                                                                                                        </div>\n" +
//                "                    </div>\n" +
//                "                </div>\n" +
//                "                <img\n" +
//                "                        style=\"\n" +
//                "                padding-top:6px;\n" +
//                "                position: relative;\n" +
//                "                width:569px;\n" +
//                "                overflow: hidden;\n" +
//                "                height: 1px;\n" +
//                "              \"\n" +
//                "                        alt=\"\"\n" +
//                "                        src=\"https://gw.alicdn.com/imgextra/i4/O1CN01XrOmws1QnCuOYDXsg_!!6000000002020-2-tps-1032-1.png\"\n" +
//                "                />\n" +
//                "\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                background-color: #fff;\n" +
//                "                text-align: left;\n" +
//                "                font-size: 10px;\n" +
//                "                color: #595f6d;\n" +
//                "                height: 12.65px;\n" +
//                "                margin-top: 6.6px;\n" +
//                "                width:569px;\n" +
//                "              \"\n" +
//                "                >\n" +
//                "                    <div style=\"position: relative; float:right;\">12806748886101</div>\n" +
//                "                    <div\n" +
//                "                            style=\"position: relative; float:right;margin-right:6px\"\n" +
//                "                    >\n" +
//                "                        <font>LAZADA Order Id</font>\n" +
//                "                    </div>\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "            <div\n" +
//                "                    style=\"\n" +
//                "                width:569px;\n" +
//                "                align-self: stretch;\n" +
//                "                border-radius: 6px;\n" +
//                "                padding: 6px 0px;\n" +
//                "                font-size: 10px;\n" +
//                "                height:38px;\n" +
//                "              \"\n" +
//                "            >\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                width=185px;\n" +
//                "                float:left;\n" +
//                "                \"\n" +
//                "                >\n" +
//                "                    <img\n" +
//                "                            style=\"position: relative; width: 20px; height: 20px;float:left;\"\n" +
//                "                            alt=\"\"\n" +
//                "                            src=\"https://gw.alicdn.com/imgextra/i4/O1CN01zFUene1TzynqN35Na_!!6000000002454-2-tps-36-36.png\"\n" +
//                "                    />\n" +
//                "                    <div style=\"position: relative; line-height: 13px;width:158px;float:left;padding-left:7px;font-size:10px;\">\n" +
//                "                        Please provide your e-ticket(s) and valid travel document(s) when checking in at the airport\n" +
//                "                    </div>\n" +
//                "                </div>\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                  width=185px;\n" +
//                "                  float:left;\n" +
//                "                  padding-left:7px;\n" +
//                "                \"\n" +
//                "                >\n" +
//                "                    <img\n" +
//                "                            style=\"position: relative; width: 20px; height: 20px;float:left;\"\n" +
//                "                            alt=\"\"\n" +
//                "                            src=\"https://gw.alicdn.com/imgextra/i2/O1CN01S3Gk4d1QErCeuNPnL_!!6000000001945-2-tps-36-36.png\"\n" +
//                "                    />\n" +
//                "                    <div style=\"position: relative; line-height: 13px;width:158px;float:left;padding-left:7px;font-size:10px;\">\n" +
//                "                        Please arrive at the airport 90 minutes before departure\n" +
//                "                    </div>\n" +
//                "                </div>\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                  width=185px;\n" +
//                "                  float:left;\n" +
//                "                  padding-left:7px;\n" +
//                "                \"\n" +
//                "                >\n" +
//                "                    <img\n" +
//                "                            style=\"position: relative; width: 20px; height: 20px;float:left;\"\n" +
//                "                            alt=\"\"\n" +
//                "                            src=\"https://gw.alicdn.com/imgextra/i1/O1CN01aoLx9j1HzjC5yyQJW_!!6000000000829-2-tps-36-36.png\"\n" +
//                "                    />\n" +
//                "                    <div style=\"position: relative; line-height: 13px;width:165px;float:left;padding-left:0px;font-size:10px;\">\n" +
//                "                        Travel time is in local time\n" +
//                "                    </div>\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "            <div\n" +
//                "                    style=\"\n" +
//                "              padding: 6px 0px;\n" +
//                "              width:569px;\n" +
//                "              overflow:hidden;\n" +
//                "              \"\n" +
//                "            >\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                position: relative;\n" +
//                "                line-height: 16.5px;\n" +
//                "                font-weight: 600;\n" +
//                "                display: inline-block;\n" +
//                "                height: 16.5px;\n" +
//                "                \"\n" +
//                "                >\n" +
//                "                    Itinerary\n" +
//                "                </div>\n" +
//                "                                                                                                                                                        <div\n" +
//                "                                        style=\"\n" +
//                "                width:569px;\n" +
//                "                overflow:hidden;\n" +
//                "                margin-top:6px;\n" +
//                "                border-radius: 8.8px;\n" +
//                "                border: 1px solid #eee;\n" +
//                "                font-size: 11px;\n" +
//                "                \"\n" +
//                "                                >\n" +
//                "                                    <div\n" +
//                "                                            style=\"\n" +
//                "                  width:569px;\n" +
//                "                  overflow:hidden;\n" +
//                "                  border-radius: 8.8px;\n" +
//                "                  \"\n" +
//                "                                    >\n" +
//                "                                        <div\n" +
//                "                                                style=\"\n" +
//                "                    height:30.8px;\n" +
//                "                    align-self: stretch;\n" +
//                "                    border-radius: 8.8px 8.8px 0px 0px;\n" +
//                "                    background-color: #f5f8fd;\n" +
//                "                    padding: 6.6px 13.2px;\n" +
//                "                    align-items: center;\n" +
//                "                    \"\n" +
//                "                                        >\n" +
//                "                                            <div\n" +
//                "                                                    style=\"\n" +
//                "                      float:left;\n" +
//                "                      \"\n" +
//                "                                            >\n" +
//                "                                                <div style=\"position: relative; line-height: 14px\">\n" +
//                "                                                    <span style=\"font-weight: 600\">AirAsia Berhad </span>\n" +
//                "                                                    <span>• AK6112</span>\n" +
//                "                                                </div>\n" +
//                "                                                <div\n" +
//                "                                                        style=\"\n" +
//                "                        align-self: stretch;\n" +
//                "                        position: relative;\n" +
//                "                        font-size: 10px;\n" +
//                "                        color: #595f6d;\n" +
//                "                        \"\n" +
//                "                                                >\n" +
//                "                                                    Economy\n" +
//                "                                                </div>\n" +
//                "                                            </div>\n" +
//                "                                            <img\n" +
//                "                                                    style=\"\n" +
//                "                        float:right;\n" +
//                "                        margin-top:7.15px;\n" +
//                "                        position: relative;\n" +
//                "                        border-radius: 2.2px;\n" +
//                "                        height: 29.7px;\n" +
//                "                        object-fit: cover;\n" +
//                "                        \"\n" +
//                "                                                    alt=\"\"\n" +
//                "                                                    src=\"\"\n" +
//                "                                            />\n" +
//                "                                        </div>\n" +
//                "                                        <div\n" +
//                "                                                style=\"\n" +
//                "                      overflow:hidden;\n" +
//                "                      align-self: stretch;\n" +
//                "                      margin-left:13px;\n" +
//                "                      margin-top:13px;\n" +
//                "                      margin-right:13px;\n" +
//                "                      margin-bottom:13px;\n" +
//                "                      align-items: center;\n" +
//                "                      justify-content: center;\n" +
//                "                      color: #858b9c;\n" +
//                "                      \"\n" +
//                "                                        >\n" +
//                "                                            <div\n" +
//                "                                                    style=\"\n" +
//                "                        align-self: stretch;\n" +
//                "                        flex: 1;\n" +
//                "                        border-radius: 6.6px;\n" +
//                "                        flex-direction: row;\n" +
//                "                        align-items: flex-start;\n" +
//                "                        justify-content: flex-start;\n" +
//                "                        \"\n" +
//                "                                            >\n" +
//                "                                                <div\n" +
//                "                                                        style=\"\n" +
//                "                          align-items: center;\n" +
//                "                          justify-content: flex-start;\n" +
//                "                          \"\n" +
//                "                                                >\n" +
//                "                                                    <div\n" +
//                "                                                            style=\"\n" +
//                "                            float:left;\n" +
//                "                            align-self: stretch;\n" +
//                "                            width:228px;\n" +
//                "                            overflow:hidden;\n" +
//                "                            \"\n" +
//                "                                                    >\n" +
//                "                                                        <div\n" +
//                "                                                                style=\"\n" +
//                "                                float:left;\n" +
//                "                                overflow:hidden;\n" +
//                "                                margin-right:40px;\n" +
//                "                              \"\n" +
//                "                                                        >\n" +
//                "                                                            <div\n" +
//                "                                                                    style=\"\n" +
//                "                              position: relative;\n" +
//                "                              line-height: 14px;\n" +
//                "                              font-weight: 500;\n" +
//                "                              \"\n" +
//                "                                                            >\n" +
//                "                                <span>\n" +
//                "                                  Departure\n" +
//                "                                </span>\n" +
//                "                                                            </div>\n" +
//                "                                                            <div\n" +
//                "                                                                    style=\"\n" +
//                "                                color: #1e71ff;\n" +
//                "                                overflow:hidden;\n" +
//                "                                \"\n" +
//                "                                                            >\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  float:left;\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                      Sunday, 31 Mar 2024\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  float:left;\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  color: #2e3346;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                    •\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  float:left;\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  font-weight: 600;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                      07:50\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                            </div>\n" +
//                "                                                            <div\n" +
//                "                                                                    style=\"\n" +
//                "                                position: relative;\n" +
//                "                                gap: 6px;\n" +
//                "                                color: #2e3346;\n" +
//                "                                \"\n" +
//                "                                                            >\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  font-weight: 600;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                      Kuala Lumpur\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  position: relative;\n" +
//                "                                  font-size: 10px;\n" +
//                "                                  line-height: 13px;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                                                    <p style=\"margin: 0\">\n" +
//                "                                    <span>\n" +
//                "                                        Kuala Lumpur\tInternational Airport\n" +
//                "                                    </span>\n" +
//                "                                                                    </p>\n" +
//                "                                                                    <p style=\"margin: 0\">\n" +
//                "                                    <span>\n" +
//                "                                        T2\n" +
//                "                                    </span>\n" +
//                "                                                                    </p>\n" +
//                "                                                                </div>\n" +
//                "                                                            </div>\n" +
//                "                                                        </div>\n" +
//                "                                                    </div>\n" +
//                "                                                    <div\n" +
//                "                                                            style=\"\n" +
//                "                            float:left;\n" +
//                "                            padding-left:12px;\n" +
//                "                            padding-right:12px;\n" +
//                "                            margin-top:22px;\n" +
//                "                            align-self: stretch;\n" +
//                "                            position: relative;\n" +
//                "                            width: 63px;\"\n" +
//                "                                                    >\n" +
//                "                                                        <img\n" +
//                "                                                                style=\"width: 50px;\"\n" +
//                "                                                                alt=\"\"\n" +
//                "                                                                src=\"https://gw.alicdn.com/imgextra/i4/O1CN015GRoFT1R1ra5HlMPu_!!6000000002052-2-tps-92-11.png\"\n" +
//                "                                                        />\n" +
//                "                                                    </div>\n" +
//                "                                                    <div\n" +
//                "                                                            style=\"\n" +
//                "                            overflow:hidden;\n" +
//                "                            float:right;\n" +
//                "                            width:228px;\n" +
//                "                            overflow:hidden;\n" +
//                "                            \"\n" +
//                "                                                    >\n" +
//                "                                                        <div\n" +
//                "                                                                style=\"\n" +
//                "                              float:left;\n" +
//                "                              overflow:hidden;\n" +
//                "                              margin-left:40px;                          \"\n" +
//                "                                                        >\n" +
//                "                                                            <div\n" +
//                "                                                                    style=\"\n" +
//                "                                position: relative;\n" +
//                "                                line-height: 14px;\n" +
//                "                                font-weight: 500;\n" +
//                "                                \"\n" +
//                "                                                            >\n" +
//                "                                                                Arrival\n" +
//                "                                                            </div>\n" +
//                "                                                            <div\n" +
//                "                                                                    style=\"\n" +
//                "                                color: #1e71ff;\n" +
//                "                                overflow:hidden;\n" +
//                "                                \"\n" +
//                "                                                            >\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  float:left;\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                      Sunday, 31 Mar 2024\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  float:left;\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  color: #2e3346;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                    •\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  float:left;\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  font-weight: 600;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                      08:50\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                            </div>\n" +
//                "                                                            <div\n" +
//                "                                                                    style=\"\n" +
//                "                                position: relative;\n" +
//                "                                gap: 6px;\n" +
//                "                                color: #2e3346;\n" +
//                "                                \"\n" +
//                "                                                            >\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  position: relative;\n" +
//                "                                  line-height: 14px;\n" +
//                "                                  font-weight: 600;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                  <span>\n" +
//                "                                      Penang\n" +
//                "                                  </span>\n" +
//                "                                                                </div>\n" +
//                "                                                                <div\n" +
//                "                                                                        style=\"\n" +
//                "                                  position: relative;\n" +
//                "                                  font-size: 10px;\n" +
//                "                                  line-height: 13px;\n" +
//                "                                  overflow:hidden;\n" +
//                "                                  \"\n" +
//                "                                                                >\n" +
//                "                                                                    <p style=\"margin: 0\">\n" +
//                "                                    <span>\n" +
//                "                                        Penang International Airport\n" +
//                "                                    </span>\n" +
//                "                                                                    </p>\n" +
//                "                                                                    <p style=\"margin: 0\">\n" +
//                "                                    <span>\n" +
//                "                                        \n" +
//                "                                    </span>\n" +
//                "                                                                    </p>\n" +
//                "                                                                </div>\n" +
//                "                                                            </div>\n" +
//                "                                                        </div>\n" +
//                "                                                    </div>\n" +
//                "                                                </div>\n" +
//                "                                            </div>\n" +
//                "                                        </div>\n" +
//                "                                    </div>\n" +
//                "                                </div>\n" +
//                "                                                                                                                                                                                                    </div>\n" +
//                "                        <div\n" +
//                "                    style=\"\n" +
//                "                margin:6px 0px;\n" +
//                "                width:569px;\n" +
//                "                overflow:hidden;\n" +
//                "                \"\n" +
//                "            >\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                  position: relative;\n" +
//                "                  line-height: 16.5px;\n" +
//                "                  font-weight: 600;\n" +
//                "                  display: inline-block;\n" +
//                "                  width: 569px;\n" +
//                "                  margin-bottom:6px;\n" +
//                "                  \"\n" +
//                "                >\n" +
//                "                    Passenger Details\n" +
//                "                </div>\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                  border-radius: 9px 9px 0px 0px;\n" +
//                "                  border: 1px solid #eee;\n" +
//                "                  box-sizing: border-box;\n" +
//                "                  width: 569px;\n" +
//                "                  flex-direction: row;\n" +
//                "                  align-items: flex-start;\n" +
//                "                  justify-content: flex-start;\n" +
//                "                  font-size: 11px;\n" +
//                "                  overflow:hidden;\n" +
//                "                  \"\n" +
//                "                >\n" +
//                "                    <div\n" +
//                "                            style=\"\n" +
//                "                    border-radius:9px 9px 0px 0px;\n" +
//                "                    justify-content: center;\n" +
//                "                    width:569px;\n" +
//                "                    height:35px;\n" +
//                "                    overflow:hidden;\n" +
//                "                    \"\n" +
//                "                    >\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:9px 0px 0px 0px;\n" +
//                "                      width:27px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:6.6px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          No\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:0px 0px 0px 0px;\n" +
//                "                      width:270px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:107px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          Passengers\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:0px 9px 0px 0px;\n" +
//                "                      width:270px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:80px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          Airline Ticket Number\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                    </div>\n" +
//                "                                                                <div\n" +
//                "                                style=\"\n" +
//                "                    width:569px;\n" +
//                "                    border: 1px solid #eee;\n" +
//                "                    overflow:hidden;\n" +
//                "                    min-height:35px;\n" +
//                "                    \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:27px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                            1\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:270px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                            LI/SIL\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:270px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                            0CXRAA\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                                                            </div>\n" +
//                "            </div>\n" +
//                "                        <div\n" +
//                "                    style=\"\n" +
//                "                margin:6px 0px;\n" +
//                "                width:569px;\n" +
//                "                overflow:hidden;\n" +
//                "                \"\n" +
//                "            >\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                  position: relative;\n" +
//                "                  line-height: 16.5px;\n" +
//                "                  font-weight: 600;\n" +
//                "                  display: inline-block;\n" +
//                "                  width: 569px;\n" +
//                "                  margin-bottom:6px;\n" +
//                "                  \"\n" +
//                "                >\n" +
//                "                  <span>\n" +
//                "                    Payment Details\n" +
//                "                  </span>\n" +
//                "                </div>\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "                  border-radius: 9px 9px 0px 0px;\n" +
//                "                  border: 1px solid #eee;\n" +
//                "                  box-sizing: border-box;\n" +
//                "                  width: 569px;\n" +
//                "                  flex-direction: row;\n" +
//                "                  align-items: flex-start;\n" +
//                "                  justify-content: flex-start;\n" +
//                "                  font-size: 11px;\n" +
//                "                  overflow:hidden;\n" +
//                "                  \"\n" +
//                "                >\n" +
//                "                    <div\n" +
//                "                            style=\"\n" +
//                "                    border-radius:9px 9px 0px 0px;\n" +
//                "                    justify-content: center;\n" +
//                "                    width:569px;\n" +
//                "                    height:35px;\n" +
//                "                    overflow:hidden;\n" +
//                "                    \"\n" +
//                "                    >\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:9px 0px 0px 0px;\n" +
//                "                      width:27px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:6.6px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          No\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:0px 0px 0px 0px;\n" +
//                "                      width:180px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:74px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          Total\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:0px 0px 0px 0px;\n" +
//                "                      width:180px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:74px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          Tax\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                        <div\n" +
//                "                                style=\"\n" +
//                "                      border-radius:0px 9px 0px 0px;\n" +
//                "                      width:180px;\n" +
//                "                      height:35px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      background-color: #f5f8fd;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                        margin-top:11px;\n" +
//                "                        margin-left:74px;\n" +
//                "                        position: relative;\n" +
//                "                        line-height: 14px;\n" +
//                "                        font-weight: 600;\n" +
//                "                        \"\n" +
//                "                            >\n" +
//                "                        <span>\n" +
//                "                          Fee\n" +
//                "                        </span>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                    </div>\n" +
//                "                                                                <div\n" +
//                "                                style=\"\n" +
//                "                    width:569px;\n" +
//                "                    border: 1px solid #eee;\n" +
//                "                    overflow:hidden;\n" +
//                "                    min-height:35px;\n" +
//                "                    \"\n" +
//                "                        >\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:27px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                            1\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:180px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                          PHP 2305\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:180px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                          PHP 450\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                            <div\n" +
//                "                                    style=\"\n" +
//                "                      min-height:35px;\n" +
//                "                      width:180px;\n" +
//                "                      float:left;\n" +
//                "                      overflow:hidden;\n" +
//                "                      border-right: 1px solid #eee;\n" +
//                "                      background-color: #fff;\n" +
//                "                      \"\n" +
//                "                            >\n" +
//                "                                <div\n" +
//                "                                        style=\"\n" +
//                "                        padding: 11px 7px;\n" +
//                "                        \"\n" +
//                "                                >\n" +
//                "                        <span>\n" +
//                "                          PHP 1855\n" +
//                "                        </span>\n" +
//                "                                </div>\n" +
//                "                            </div>\n" +
//                "                        </div>\n" +
//                "                                                            </div>\n" +
//                "            </div>\n" +
//                "        </div>\n" +
//                "        <div\n" +
//                "                style=\"\n" +
//                "            padding:6px 0px;\n" +
//                "            width: 569px;\n" +
//                "            height:77px;\n" +
//                "            overflow: hidden;\n" +
//                "            \"\n" +
//                "        >\n" +
//                "            <img\n" +
//                "                    style=\"\n" +
//                "              float: left;\n" +
//                "              width: 569px;\n" +
//                "              height: 77px;\n" +
//                "              overflow: hidden;\n" +
//                "              z-index:0;\n" +
//                "              \"\n" +
//                "                    alt=\"\"\n" +
//                "                    src=\"https://gw.alicdn.com/imgextra/i4/O1CN01hHmdZ71MpGEAJ5uC9_!!6000000001483-0-tps-1550-192.jpg\"\n" +
//                "            />\n" +
//                "            <div\n" +
//                "                    style=\"\n" +
//                "              height:43px;\n" +
//                "              width:569px;\n" +
//                "              position:absolute;\n" +
//                "              overflow:hidden;\n" +
//                "              margin-top:12px;\n" +
//                "              \"\n" +
//                "            >\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "              position: relative;\n" +
//                "              line-height: 16px;\n" +
//                "              font-weight: 600;\n" +
//                "              z-index: 2;\n" +
//                "              margin-left:240px;\n" +
//                "              \"\n" +
//                "                >\n" +
//                "              <span>\n" +
//                "                Connect with Us\n" +
//                "              </span>\n" +
//                "                </div>\n" +
//                "                <div\n" +
//                "                        style=\"\n" +
//                "              position:relative\n" +
//                "              z-index: 3;\n" +
//                "              font-size: 11px;\n" +
//                "              color: #1e71ff;\n" +
//                "              padding-top:13px;\n" +
//                "              padding-left:200px;\n" +
//                "              \"\n" +
//                "                >\n" +
//                "                    <div\n" +
//                "                            style=\"\n" +
//                "                float:left;\n" +
//                "                align-items: center;\n" +
//                "                position:relative;\n" +
//                "                width:192px;\n" +
//                "                gap:13px;\n" +
//                "                overflow:hidden;\n" +
//                "                \"\n" +
//                "                    >\n" +
//                "                        <img\n" +
//                "                                style=\"\n" +
//                "                  width: 13px;\n" +
//                "                  height: 13px;\n" +
//                "                  overflow: hidden;\n" +
//                "                  float:left;\n" +
//                "                  margin-right:13px;\n" +
//                "                  \"\n" +
//                "                                alt=\"\"\n" +
//                "                                src=\"https://gw.alicdn.com/imgextra/i4/O1CN01RjfU6F25UnEM6Rrtz_!!6000000007530-2-tps-25-25.png\"\n" +
//                "                        />\n" +
//                "                        <div style=\"position: relative; line-height: 14px;float:left;\">\n" +
//                "                  <span>\n" +
//                "                    Lazada_flights@care.lazada.com\n" +
//                "                  </span>\n" +
//                "                        </div>\n" +
//                "                    </div>\n" +
//                "                </div>\n" +
//                "            </div>\n" +
//                "        </div>\n" +
//                "    </div>\n" +
//                "</div>\n" +
//                "</body>\n" +
//                "</html>";
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\" />\n" +
                "    <title></title>\n" +
                "    <style>\n" +
                "        @page {\n" +
                "            size: A4 portrait;\n" +
                "            /* A4纸及方向或 landscape */\n" +
                "            margin: 2cm;\n" +
                "            /* 打印产物边距 */\n" +
                "            width: 21cm;\n" +
                "            /* 打印产物宽 */\n" +
                "            height: 29.7cm;\n" +
                "            /* 打印产物高 */\n" +
                "        }\n" +
                "\n" +
                "        body {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            font-family: Poppins;\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .Bigbox {\n" +
                "            margin: 0 auto;\n" +
                "            background: #FFF;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        .header {\n" +
                "            width: 100%;\n" +
                "            overflow: hidden;\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .header_logo {\n" +
                "            width: 50%;\n" +
                "            height: 80px;\n" +
                "            float: left;\n" +
                "            box-sizing: border-box;\n" +
                "            line-height: 100px;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .header_logo_detail {\n" +
                "            height: 40%\n" +
                "        }\n" +
                "\n" +
                "        .header_order {\n" +
                "            float: right;\n" +
                "            width: 50%\n" +
                "        }\n" +
                "\n" +
                "        .header_order_details {\n" +
                "            font-size: 12pt;\n" +
                "            width: 229px;\n" +
                "            font-weight: bold;\n" +
                "            line-height: normal;\n" +
                "            color: #333333;\n" +
                "            box-sizing: border-box;\n" +
                "            line-height: 80px;\n" +
                "            float: right;\n" +
                "        }\n" +
                "\n" +
                "        .header_explain {\n" +
                "            width: 100%;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .header_explain_details {\n" +
                "            width: 33%;\n" +
                "            height: 52px;\n" +
                "            line-height: 75px;\n" +
                "            float: left;\n" +
                "        }\n" +
                "\n" +
                "        .header_explain_details_image {\n" +
                "            width: 15%;\n" +
                "            height: 15%;\n" +
                "            margin-right: 10px;\n" +
                "            float: left;\n" +
                "        }\n" +
                "\n" +
                "        .header_explain_details_words {\n" +
                "            line-height: 19px;\n" +
                "            vertical-align: middle;\n" +
                "            font-size: 10pt;\n" +
                "        }\n" +
                "\n" +
                "        .header_explain_box {\n" +
                "            width: 100%;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .main_box {\n" +
                "            border: 1px solid #5C5F66;\n" +
                "            margin-top: 20px;\n" +
                "            padding: 30px 15px;\n" +
                "            width: 100%;\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_over_style {\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_title {\n" +
                "            font-size: 16pt;\n" +
                "            font-weight: bold;\n" +
                "            color: #0F131A;\n" +
                "            float: left;\n" +
                "            width: 50%;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_title_PNR {\n" +
                "            width: 50%;\n" +
                "            float: right;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_title_PNR_detail {\n" +
                "            line-height: 20pt;\n" +
                "            width: 100pt;\n" +
                "            font-size: 10pt;\n" +
                "            font-weight: bold;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #FFFFFF;\n" +
                "            background: #1972F9;\n" +
                "            border-radius: 40px;\n" +
                "            padding: 4px 10px;\n" +
                "            gap: 10px;\n" +
                "            float: right;\n" +
                "            box-sizing: border-box;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary {\n" +
                "            margin-top: 10px;\n" +
                "            border: 1px solid #D2D4D9;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_header {\n" +
                "            overflow: hidden;\n" +
                "            background-color: #F7F8FA;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_header_left_word {\n" +
                "            font-size: 12pt;\n" +
                "            font-weight: 500;\n" +
                "            color: #0F131A;\n" +
                "            padding: 10px 10px 0px 20px;\n" +
                "            width: 100%;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_header_left-words {\n" +
                "            font-size: 11pt;\n" +
                "            font-weight: normal;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #919499;\n" +
                "            padding-left: 20px;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_header_left {\n" +
                "            float: left;\n" +
                "            width: 50%;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_header_image {\n" +
                "            width: 200px;\n" +
                "            height: 56px;\n" +
                "            float: inline-end;\n" +
                "            padding: 4px 10px 0px 0px;\n" +
                "            float: right;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_details {\n" +
                "            width: 100%;\n" +
                "            margin: 5px 0px;\n" +
                "            font-size: 11pt;\n" +
                "            font-weight: normal;\n" +
                "            line-height: 120%;\n" +
                "            letter-spacing: 0em;\n" +
                "            color: #0F131A;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_details-Two {\n" +
                "            width: 100%;\n" +
                "            margin: 5px 0px;\n" +
                "            font-size: 11pt;\n" +
                "            font-weight: normal;\n" +
                "            line-height: 120%;\n" +
                "            letter-spacing: 0em;\n" +
                "            color: #4DA6FF;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_details-table {\n" +
                "            width: 50%;\n" +
                "            float: left;\n" +
                "        }\n" +
                "\n" +
                "        .main_ltinerary_details-cocent {\n" +
                "            padding: 10pt;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_yellow_prompt {\n" +
                "            font-size: 11pt;\n" +
                "            font-weight: normal;\n" +
                "            color: #FF8C1A;\n" +
                "            background: #FFF5EB;\n" +
                "            line-height: 40px;\n" +
                "            margin-top: 30px;\n" +
                "            margin-bottom: 30px;\n" +
                "            padding: 0px 0px 0px 12pt;\n" +
                "        }\n" +
                "\n" +
                "        .main_notes-word {\n" +
                "            font-size: 11pt;\n" +
                "            color: #5C5F66;\n" +
                "        }\n" +
                "\n" +
                "        .footer_title {\n" +
                "            font-size: 16pt;\n" +
                "            color: #0F131A;\n" +
                "            margin-top: 30px;\n" +
                "        }\n" +
                "\n" +
                "        .footer {\n" +
                "            margin-top: 50px;\n" +
                "            border-top: 1px solid #5C5F66\n" +
                "        }\n" +
                "\n" +
                "        .footer_main {\n" +
                "            overflow: hidden;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        .footer_main_Airmasters {\n" +
                "            width: 26%;\n" +
                "            font-size: 10pt;\n" +
                "            font-weight: bold;\n" +
                "            line-height: 32px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #5C5F66;\n" +
                "            float: left;\n" +
                "            margin-right: 3px\n" +
                "        }\n" +
                "\n" +
                "        .footer_main_ATA {\n" +
                "            width: 20%;\n" +
                "            font-size: 10pt;\n" +
                "            font-weight: bold;\n" +
                "            line-height: 32px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #5C5F66;\n" +
                "            float: left;\n" +
                "            margin-right: 3px\n" +
                "        }\n" +
                "\n" +
                "        .footer_main_email {\n" +
                "            width: 50%;\n" +
                "            font-size: 10pt;\n" +
                "            font-weight: bold;\n" +
                "            line-height: 32px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #5C5F66;\n" +
                "            float: left;\n" +
                "        }\n" +
                "        .footer_main_email_name{\n" +
                "            float: left;\n" +
                "            width: 120pt;\n" +
                "        }\n" +
                "        .footer_main_email_detail {\n" +
                "            color: #4DA6FF;\n" +
                "            float: left;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_table {\n" +
                "            margin-bottom: 30px;\n" +
                "        }\n" +
                "\n" +
                "        table {\n" +
                "            width: 100%;\n" +
                "            margin-top: 40px;\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "\n" +
                "        th,\n" +
                "        td {\n" +
                "            border: 1px solid #D2D4D9;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        td {\n" +
                "            padding: 13px;\n" +
                "        }\n" +
                "\n" +
                "        th {\n" +
                "            background-color: #F7F8FA;\n" +
                "            font-weight: bold;\n" +
                "            font-size: 12pt;\n" +
                "            font-weight: normal;\n" +
                "            line-height: 36px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #0F131A;\n" +
                "        }\n" +
                "\n" +
                "        tr {\n" +
                "            font-size: 12pt;\n" +
                "            font-weight: normal;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #0F131A;\n" +
                "        }\n" +
                "\n" +
                "        .main_box_table-mobile {\n" +
                "            font-size: 13pt;\n" +
                "            font-weight: 500;\n" +
                "            color: #0F131A;\n" +
                "        }\n" +
                "\n" +
                "        .header_prompt {\n" +
                "            background-color: #FFF5EB;\n" +
                "            border: 1px solid #FF8C1A;\n" +
                "            padding: 15px\n" +
                "        }\n" +
                "\n" +
                "        .header_prompt_title {\n" +
                "            font-size: 16pt;\n" +
                "            font-weight: 500;\n" +
                "            color: #FF8C1A;\n" +
                "            margin-bottom: 10px;\n" +
                "            height: 25px;\n" +
                "        }\n" +
                "\n" +
                "        .header_prompt_detail {\n" +
                "            font-family: Poppins;\n" +
                "            font-size: 12pt;\n" +
                "            color: #5C5F66;\n" +
                "            overflow: hidden;\n" +
                "            width: 100%;\n" +
                "white-space: normal;\n" +
                "    word-break: break-all;\n" +
                "    overflow-wrap: break-word;        }\n" +
                "\n" +
                "        .header_prompt_detail_Bold_title {\n" +
                "font-family: Poppins;\n" +
                "    font-size: 12pt;\n" +
                "    font-weight: 600;\n" +
                "    margin-right: 5px;white-space: normal;\n" +
                "    word-break: break-all;\n" +
                "    overflow-wrap: break-word;        }\n" +
                "\n" +
                "        .header_prompt_detail_Bold_time {\n" +
                "color: #5C5F66;\n" +
                "    font-weight: 400;\n" +
                "    display: inline;        }\n" +
                "\n" +
                "        .header_prompt_detail_icon {\n" +
                "            float: left;\n" +
                "            margin-right: 7px;\n" +
                "            /*  position: absolute;\n" +
                "             top: 3px;\n" +
                "             left: 0;\n" +
                "             right: 0;\n" +
                "             bottom: 0; */\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .header_prompt_detail_text {\n" +
                "            /* position: absolute; */\n" +
                "            left: 30px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<div class=\"Bigbox\">\n" +
                "    <div class=\"header\">\n" +
                "        <div class=\"header_logo\">\n" +
                "            <img class=\"header_logo_detail\"\n" +
                "                 src=\"https://img.alicdn.com/imgextra/i2/O1CN01Dqsocm297fmw5uq3Q_!!6000000008021-2-tps-604-210.png\"\n" +
                "                 alt=\"\" />\n" +
                "        </div>\n" +
                "        <div class=\"header_order\">\n" +
                "            <div class=\"header_order_details\">\n" +
                "                Order No : \n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"header_explain\">\n" +
                "        <div class=\"header_explain_details\">\n" +
                "            <div class=\"header_explain_box\">\n" +
                "                <img class=\"header_explain_details_image\"\n" +
                "                     src=\"https://gw.alicdn.com/imgextra/i3/O1CN018bEXeM1ueRtbOzkiA_!!6000000006062-2-tps-156-156.png\"\n" +
                "                     alt=\"\" />\n" +
                "                <div class=\"header_explain_details_words\">\n" +
                "                    Present e-ticket and valid identification at check-in\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"header_explain_details\">\n" +
                "            <div class=\"header_explain_box\">\n" +
                "                <img class=\"header_explain_details_image\"\n" +
                "                     src=\"https://gw.alicdn.com/imgextra/i3/O1CN018bEXeM1ueRtbOzkiA_!!6000000006062-2-tps-156-156.png\"\n" +
                "                     alt=\"\" />\n" +
                "                <div class=\"header_explain_details_words\">\n" +
                "                    Present e-ticket and valid identification at check-in\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "        </div>\n" +
                "        <div class=\"header_explain_details\">\n" +
                "            <div class=\"header_explain_box\">\n" +
                "                <img class=\"header_explain_details_image\"\n" +
                "                     src=\"https://gw.alicdn.com/imgextra/i3/O1CN018bEXeM1ueRtbOzkiA_!!6000000006062-2-tps-156-156.png\"\n" +
                "                     alt=\"\" />\n" +
                "                <div class=\"header_explain_details_words\">\n" +
                "                    Present e-ticket and valid identification at check-in\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"header_prompt\">\n" +
                "        <div class=\"header_prompt_title\">\n" +
                "            <div class=\"header_prompt_detail_icon\">\n" +
                "                <div style=\"width:20pt\">\n" +
                "                    <img style=\"width: 100%\"\n" +
                "                         src=\"https://gw.alicdn.com/imgextra/i1/O1CN01AfSlPn1f6oZiApOEB_!!6000000003958-2-tps-64-64.png\"\n" +
                "                         alt=\"\" />\n" +
                "                </div></div>\n" +
                "            <div class=\"header_prompt_detail_text\">Flight Changed Alert</div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"header_prompt_detail\">\n" +
                "            Flight PR2845 has been changed.\n" +
                "        </div>\n" +
                "        <div class=\"header_prompt_detail\">\n" +
                "            <div class=\"header_prompt_detail_Bold_title\">\n" +
                "                Estimated times are for reference only.Please confirm the scheduled times below with the airline.\n\n" +
                "                <div class=\"header_prompt_detail_Bold_time\">\n" +
                "                2024-02-13 12:40\n" +
                "                </div>\n" +
                "                \"                2024-02-13 12:40\\n\" +\n" +
                "                \"                </div>\n" +
                "\" +            </div>\n" +
                "        </div>\n" +
                "        <div class=\"header_prompt_detail\">\n" +
                "            Estimated times are for reference only.Please confirm the scheduled times below with the airline.\n" +
                "        </div>\n" +
                "\n" +
                "\n" +
                "    </div>\n" +
                "    <div class=\"main_box\">\n" +
                "\n" +
                "\n" +
                "        \n" +
                "            <div class=\"main_box_over_style\">\n" +
                "                <div class=\"main_box_title\">\n" +
                "                    Itinerary\n" +
                "                </div>\n" +
                "                <div class=\"main_box_title_PNR\">\n" +
                "                    <div class=\"main_box_title_PNR_detail\">\n" +
                "                        PNR: QSUN9A\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"main_ltinerary\">\n" +
                "                <div class=\"main_ltinerary_header\">\n" +
                "                    <div class=\"main_ltinerary_header_left\">\n" +
                "                        <div class=\"main_ltinerary_header_left_word\">\n" +
                "                            American Airlines - PR2845\n" +
                "                        </div>\n" +
                "                        <div class=\"main_ltinerary_header_left-words\">\n" +
                "                            Economy\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_header_image\">\n" +
                "                        <img style=\"width: 60%;float:right\"\n" +
                "                             src=\"https://gw.alicdn.com/imgextra/i2/O1CN01hOKP5J1sVAdqenOXA_!!6000000005771-2-tps-600-252.png\"\n" +
                "                             alt=\"\" />\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"main_ltinerary_details-cocent\">\n" +
                "                    <div class=\"main_ltinerary_details\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Departure</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">Arrival</div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_details-Two\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Wednesday, Jun 14 2024</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">Wednesday, Jun 14 2024</div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_details\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Los Angeles (LA)</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">New York (NY)</div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_details\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Los Angeles International Airport</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">New York NY JFK International\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "\n" +
                "            <div class=\"main_box_yellow_prompt\">\n" +
                "                1 stop in  · \n" +
                "            </div>\n" +
                "\n" +
                "\n" +
                "            <div class=\"main_box_table\">\n" +
                "                <div class=\"main_box_over_style\">\n" +
                "                    <div class=\"main_box_title\">\n" +
                "                        Passengers Information\n" +
                "                    </div>\n" +
                "                    <div class=\"main_box_table-detail\">\n" +
                "                        <table class=\"main_box_table-details\">\n" +
                "                            <thead>\n" +
                "                            <tr>\n" +
                "                                <th>No.</th>\n" +
                "                                <th>Passengers</th>\n" +
                "                                <th>Baggage Allowance</th>\n" +
                "                                <th>Ticket Numbers</th>\n" +
                "                            </tr>\n" +
                "                            </thead>\n" +
                "                            <tbody>\n" +
                "                                                        <tr>\n" +
                "                                <td>1</td>\n" +
                "                                <td>Valen Eliza</td>\n" +
                "                                <td>Cabin baggage 1x7kg<br /> No free checked baggage</td>\n" +
                "                                <td class=\"main_box_table-mobile\">999-3452678654</td>\n" +
                "                            </tr>\n" +
                "                                                        </tbody>\n" +
                "                        </table>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "        \n" +
                "                <div class=\"main_box_table\">\n" +
                "            <div class=\"main_box_over_style\">\n" +
                "                <div class=\"main_box_title\">\n" +
                "                    Payment Details\n" +
                "                </div>\n" +
                "                <div class=\"main_box_table-detail\">\n" +
                "                    <table class=\"main_box_table-details\">\n" +
                "                        <thead>\n" +
                "                        <tr>\n" +
                "                            <th>Payment Method</th>\n" +
                "                            <th>Fare</th>\n" +
                "                            <th>Ticket Numberss</th>\n" +
                "                            <th>Total</th>\n" +
                "                        </tr>\n" +
                "                        </thead>\n" +
                "                        <tbody>\n" +
                "                                                <tr>\n" +
                "                            <td>WP</td>\n" +
                "                            <td>PHP 3,290.00 x2</td>\n" +
                "                            <td>PHP 1,290.00 x2</td>\n" +
                "                            <td class=\"main_box_table-mobile\">PHP 9,160.00</td>\n" +
                "                        </tr>\n" +
                "                                                </tbody>\n" +
                "                    </table>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "         \n" +
                "        <div class=\"main_notes\">\n" +
                "            <div class=\"main_box_over_style\">\n" +
                "                <div class=\"main_box_title\">\n" +
                "                    Notes\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"main_notes-word\">\n" +
                "                Please arrive at the indicated airport no later than 2 hours before your departure time. Kindly\n" +
                "                present the same valid ID used for booking upon check-in at the airport counter.\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "    <div class=\"footer\">\n" +
                "        <div class=\"footer_title\">\n" +
                "            ISSUED BY\n" +
                "        </div>\n" +
                "        <div class=\"footer_main\">\n" +
                "            <div class=\"footer_main_Airmasters\">Airmasters Travel limited</div>\n" +
                "            <div class=\"footer_main_ATA\">ATA No. 13306101</div>\n" +
                "            <div class=\"footer_main_email\">\n" +
                "                <div class=\"footer_main_email_name\">\n" +
                "                    Customer Service Email:\n" +
                "                </div>\n" +
                "                <div class=\"footer_main_email_detail\">Service@fliggytravel.com</div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
        //System.out.println(html);
        File file = new File("/Users/skye/Downloads/test.pdf");
        try (OutputStream out = new FileOutputStream(file)) {
            long start = System.currentTimeMillis();
            ITextRenderer render = new ITextRenderer();
            render.getFontResolver().addFont("/Poppins.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            render.getFontResolver().addFont("/simsun.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            render.setDocumentFromString(html);
            render.layout();
            render.createPDF(out);
            render.finishPDF();
            System.out.println("耗时：" + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
