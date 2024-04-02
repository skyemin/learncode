package com.wei.learncode;

import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

public class TestPdf {

    public static void main(String[] args) throws Exception {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta name=\"viewport\" content=\"initial-scale=1, width=device-width\" />\n" +
                "\n" +
                "    <style>\n" +
                "        body {\n" +
                "            margin: 0px;\n" +
                "            line-height: normal;\n" +
                "            padding:0px;\n" +
                "            width:100%;\n" +
                "            font-family:'Euclid Circular A';\n" +
                "        }\n" +
                "        div{\n" +
                "            margin: 0px;\n" +
                "            padding: 0px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div\n" +
                "        style=\"\n" +
                "        position: relative;\n" +
                "        background-color: #fff;\n" +
                "        width: 595px;\n" +
                "        overflow: hidden;\n" +
                "        text-align: left;\n" +
                "        font-size: 13px;\n" +
                "        color: #2e3346;\n" +
                "      \"\n" +
                ">\n" +
                "    <div\n" +
                "            style=\"\n" +
                "          top: 0px;\n" +
                "          left: 0px;\n" +
                "          width:595px;\n" +
                "        \"\n" +
                "    >\n" +
                "        <div\n" +
                "                style=\"\n" +
                "            width: 569px;\n" +
                "            padding:13px 0px;\n" +
                "          \"\n" +
                "        >\n" +
                "            <div\n" +
                "                    style=\"\n" +
                "              text-align: center;\n" +
                "              font-size: 0px;\n" +
                "              width: 100%;\n" +
                "              height: 69px;\n" +
                "              overflow:hidden;\n" +
                "            \"\n" +
                "            >\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                width:569px;\n" +
                "                height: 42px;\n" +
                "                align-items: center;\n" +
                "                justify-content: center;\n" +
                "                overflow:hidden;\n" +
                "              \"\n" +
                "                >\n" +
                "                    <div\n" +
                "                            style=\"\n" +
                "                    float: left;\n" +
                "                    width: 122px;\n" +
                "                    height: 32px;\n" +
                "                    margin-top: 5.225px;\n" +
                "                \"\n" +
                "                    >\n" +
                "                        <img\n" +
                "                                style=\"\n" +
                "                    float: left;\n" +
                "                    width: 122px;\n" +
                "                    height: 32px;\n" +
                "                    overflow: hidden;\n" +
                "                  \"\n" +
                "                                alt=\"\"\n" +
                "                                src=\"https://gw.alicdn.com/imgextra/i2/O1CN01m78S1F1LfM75avlmZ_!!6000000001326-0-tps-1330-188.jpg\"\n" +
                "                        />\n" +
                "                    </div>\n" +
                "                    <div\n" +
                "                            style=\"\n" +
                "                  align-items: center;\n" +
                "                  justify-content: center;\n" +
                "                  float: right;\n" +
                "                  overflow:hidden;\n" +
                "                  height:72px;\n" +
                "                \"\n" +
                "                    >\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                    align-self: stretch;\n" +
                "                    position: relative;\n" +
                "                    line-height: 14px;\n" +
                "                    font-weight: 500;\n" +
                "                    font-size: 11px;\n" +
                "                  \"\n" +
                "                        >\n" +
                "                <span>\n" +
                "                  Booking Code\n" +
                "                </span>\n" +
                "                        </div>\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                    border-radius: 27px;\n" +
                "                    background-color: #1e71ff;\n" +
                "                    padding: 3px 10px;\n" +
                "                    font-size: 13px;\n" +
                "                    color: #fff;\n" +
                "                    margin-top: 5px;\n" +
                "                  \"\n" +
                "                        >\n" +
                "                                                                                                                            <div\n" +
                "                                            style=\"\n" +
                "                      position: relative;\n" +
                "                      line-height: 16.5px;\n" +
                "                      font-weight: 500;\n" +
                "                    \"\n" +
                "                                    >\n" +
                "                  <span>\n" +
                "                                                0CXRAA\n" +
                "                                        </span>\n" +
                "                                    </div>\n" +
                "                                                                                                                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <img\n" +
                "                        style=\"\n" +
                "                padding-top:6px;\n" +
                "                position: relative;\n" +
                "                width:569px;\n" +
                "                overflow: hidden;\n" +
                "                height: 1px;\n" +
                "              \"\n" +
                "                        alt=\"\"\n" +
                "                        src=\"https://gw.alicdn.com/imgextra/i4/O1CN01XrOmws1QnCuOYDXsg_!!6000000002020-2-tps-1032-1.png\"\n" +
                "                />\n" +
                "\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                background-color: #fff;\n" +
                "                text-align: left;\n" +
                "                font-size: 10px;\n" +
                "                color: #595f6d;\n" +
                "                height: 12.65px;\n" +
                "                margin-top: 6.6px;\n" +
                "                width:569px;\n" +
                "              \"\n" +
                "                >\n" +
                "                    <div style=\"position: relative; float:right;\">12806748886101</div>\n" +
                "                    <div\n" +
                "                            style=\"position: relative; float:right;margin-right:6px\"\n" +
                "                    >\n" +
                "                        <font>LAZADA Order Id</font>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div\n" +
                "                    style=\"\n" +
                "                width:569px;\n" +
                "                align-self: stretch;\n" +
                "                border-radius: 6px;\n" +
                "                padding: 6px 0px;\n" +
                "                font-size: 10px;\n" +
                "                height:38px;\n" +
                "              \"\n" +
                "            >\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                width=185px;\n" +
                "                float:left;\n" +
                "                \"\n" +
                "                >\n" +
                "                    <img\n" +
                "                            style=\"position: relative; width: 20px; height: 20px;float:left;\"\n" +
                "                            alt=\"\"\n" +
                "                            src=\"https://gw.alicdn.com/imgextra/i4/O1CN01zFUene1TzynqN35Na_!!6000000002454-2-tps-36-36.png\"\n" +
                "                    />\n" +
                "                    <div style=\"position: relative; line-height: 13px;width:158px;float:left;padding-left:7px;font-size:10px;\">\n" +
                "                        Please provide your e-ticket(s) and valid travel document(s) when checking in at the airport\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                  width=185px;\n" +
                "                  float:left;\n" +
                "                  padding-left:7px;\n" +
                "                \"\n" +
                "                >\n" +
                "                    <img\n" +
                "                            style=\"position: relative; width: 20px; height: 20px;float:left;\"\n" +
                "                            alt=\"\"\n" +
                "                            src=\"https://gw.alicdn.com/imgextra/i2/O1CN01S3Gk4d1QErCeuNPnL_!!6000000001945-2-tps-36-36.png\"\n" +
                "                    />\n" +
                "                    <div style=\"position: relative; line-height: 13px;width:158px;float:left;padding-left:7px;font-size:10px;\">\n" +
                "                        Please arrive at the airport 90 minutes before departure\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                  width=185px;\n" +
                "                  float:left;\n" +
                "                  padding-left:7px;\n" +
                "                \"\n" +
                "                >\n" +
                "                    <img\n" +
                "                            style=\"position: relative; width: 20px; height: 20px;float:left;\"\n" +
                "                            alt=\"\"\n" +
                "                            src=\"https://gw.alicdn.com/imgextra/i1/O1CN01aoLx9j1HzjC5yyQJW_!!6000000000829-2-tps-36-36.png\"\n" +
                "                    />\n" +
                "                    <div style=\"position: relative; line-height: 13px;width:165px;float:left;padding-left:0px;font-size:10px;\">\n" +
                "                        Travel time is in local time\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div\n" +
                "                    style=\"\n" +
                "              padding: 6px 0px;\n" +
                "              width:569px;\n" +
                "              overflow:hidden;\n" +
                "              \"\n" +
                "            >\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                position: relative;\n" +
                "                line-height: 16.5px;\n" +
                "                font-weight: 600;\n" +
                "                display: inline-block;\n" +
                "                height: 16.5px;\n" +
                "                \"\n" +
                "                >\n" +
                "                    Itinerary\n" +
                "                </div>\n" +
                "                                                                                                                                                        <div\n" +
                "                                        style=\"\n" +
                "                width:569px;\n" +
                "                overflow:hidden;\n" +
                "                margin-top:6px;\n" +
                "                border-radius: 8.8px;\n" +
                "                border: 1px solid #eee;\n" +
                "                font-size: 11px;\n" +
                "                \"\n" +
                "                                >\n" +
                "                                    <div\n" +
                "                                            style=\"\n" +
                "                  width:569px;\n" +
                "                  overflow:hidden;\n" +
                "                  border-radius: 8.8px;\n" +
                "                  \"\n" +
                "                                    >\n" +
                "                                        <div\n" +
                "                                                style=\"\n" +
                "                    height:30.8px;\n" +
                "                    align-self: stretch;\n" +
                "                    border-radius: 8.8px 8.8px 0px 0px;\n" +
                "                    background-color: #f5f8fd;\n" +
                "                    padding: 6.6px 13.2px;\n" +
                "                    align-items: center;\n" +
                "                    \"\n" +
                "                                        >\n" +
                "                                            <div\n" +
                "                                                    style=\"\n" +
                "                      float:left;\n" +
                "                      \"\n" +
                "                                            >\n" +
                "                                                <div style=\"position: relative; line-height: 14px\">\n" +
                "                                                    <span style=\"font-weight: 600\">AirAsia Berhad </span>\n" +
                "                                                    <span>• AK6112</span>\n" +
                "                                                </div>\n" +
                "                                                <div\n" +
                "                                                        style=\"\n" +
                "                        align-self: stretch;\n" +
                "                        position: relative;\n" +
                "                        font-size: 10px;\n" +
                "                        color: #595f6d;\n" +
                "                        \"\n" +
                "                                                >\n" +
                "                                                    Economy\n" +
                "                                                </div>\n" +
                "                                            </div>\n" +
                "                                            <img\n" +
                "                                                    style=\"\n" +
                "                        float:right;\n" +
                "                        margin-top:7.15px;\n" +
                "                        position: relative;\n" +
                "                        border-radius: 2.2px;\n" +
                "                        height: 29.7px;\n" +
                "                        object-fit: cover;\n" +
                "                        \"\n" +
                "                                                    alt=\"\"\n" +
                "                                                    src=\"\"\n" +
                "                                            />\n" +
                "                                        </div>\n" +
                "                                        <div\n" +
                "                                                style=\"\n" +
                "                      overflow:hidden;\n" +
                "                      align-self: stretch;\n" +
                "                      margin-left:13px;\n" +
                "                      margin-top:13px;\n" +
                "                      margin-right:13px;\n" +
                "                      margin-bottom:13px;\n" +
                "                      align-items: center;\n" +
                "                      justify-content: center;\n" +
                "                      color: #858b9c;\n" +
                "                      \"\n" +
                "                                        >\n" +
                "                                            <div\n" +
                "                                                    style=\"\n" +
                "                        align-self: stretch;\n" +
                "                        flex: 1;\n" +
                "                        border-radius: 6.6px;\n" +
                "                        flex-direction: row;\n" +
                "                        align-items: flex-start;\n" +
                "                        justify-content: flex-start;\n" +
                "                        \"\n" +
                "                                            >\n" +
                "                                                <div\n" +
                "                                                        style=\"\n" +
                "                          align-items: center;\n" +
                "                          justify-content: flex-start;\n" +
                "                          \"\n" +
                "                                                >\n" +
                "                                                    <div\n" +
                "                                                            style=\"\n" +
                "                            float:left;\n" +
                "                            align-self: stretch;\n" +
                "                            width:228px;\n" +
                "                            overflow:hidden;\n" +
                "                            \"\n" +
                "                                                    >\n" +
                "                                                        <div\n" +
                "                                                                style=\"\n" +
                "                                float:left;\n" +
                "                                overflow:hidden;\n" +
                "                                margin-right:40px;\n" +
                "                              \"\n" +
                "                                                        >\n" +
                "                                                            <div\n" +
                "                                                                    style=\"\n" +
                "                              position: relative;\n" +
                "                              line-height: 14px;\n" +
                "                              font-weight: 500;\n" +
                "                              \"\n" +
                "                                                            >\n" +
                "                                <span>\n" +
                "                                  Departure\n" +
                "                                </span>\n" +
                "                                                            </div>\n" +
                "                                                            <div\n" +
                "                                                                    style=\"\n" +
                "                                color: #1e71ff;\n" +
                "                                overflow:hidden;\n" +
                "                                \"\n" +
                "                                                            >\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  float:left;\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                      Sunday, 31 Mar 2024\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  float:left;\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  color: #2e3346;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                    •\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  float:left;\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  font-weight: 600;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                      07:50\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                            </div>\n" +
                "                                                            <div\n" +
                "                                                                    style=\"\n" +
                "                                position: relative;\n" +
                "                                gap: 6px;\n" +
                "                                color: #2e3346;\n" +
                "                                \"\n" +
                "                                                            >\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  font-weight: 600;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                      Kuala Lumpur\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  position: relative;\n" +
                "                                  font-size: 10px;\n" +
                "                                  line-height: 13px;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                                                    <p style=\"margin: 0\">\n" +
                "                                    <span>\n" +
                "                                        Kuala Lumpur\tInternational Airport\n" +
                "                                    </span>\n" +
                "                                                                    </p>\n" +
                "                                                                    <p style=\"margin: 0\">\n" +
                "                                    <span>\n" +
                "                                        T2\n" +
                "                                    </span>\n" +
                "                                                                    </p>\n" +
                "                                                                </div>\n" +
                "                                                            </div>\n" +
                "                                                        </div>\n" +
                "                                                    </div>\n" +
                "                                                    <div\n" +
                "                                                            style=\"\n" +
                "                            float:left;\n" +
                "                            padding-left:12px;\n" +
                "                            padding-right:12px;\n" +
                "                            margin-top:22px;\n" +
                "                            align-self: stretch;\n" +
                "                            position: relative;\n" +
                "                            width: 63px;\"\n" +
                "                                                    >\n" +
                "                                                        <img\n" +
                "                                                                style=\"width: 50px;\"\n" +
                "                                                                alt=\"\"\n" +
                "                                                                src=\"https://gw.alicdn.com/imgextra/i4/O1CN015GRoFT1R1ra5HlMPu_!!6000000002052-2-tps-92-11.png\"\n" +
                "                                                        />\n" +
                "                                                    </div>\n" +
                "                                                    <div\n" +
                "                                                            style=\"\n" +
                "                            overflow:hidden;\n" +
                "                            float:right;\n" +
                "                            width:228px;\n" +
                "                            overflow:hidden;\n" +
                "                            \"\n" +
                "                                                    >\n" +
                "                                                        <div\n" +
                "                                                                style=\"\n" +
                "                              float:left;\n" +
                "                              overflow:hidden;\n" +
                "                              margin-left:40px;                          \"\n" +
                "                                                        >\n" +
                "                                                            <div\n" +
                "                                                                    style=\"\n" +
                "                                position: relative;\n" +
                "                                line-height: 14px;\n" +
                "                                font-weight: 500;\n" +
                "                                \"\n" +
                "                                                            >\n" +
                "                                                                Arrival\n" +
                "                                                            </div>\n" +
                "                                                            <div\n" +
                "                                                                    style=\"\n" +
                "                                color: #1e71ff;\n" +
                "                                overflow:hidden;\n" +
                "                                \"\n" +
                "                                                            >\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  float:left;\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                      Sunday, 31 Mar 2024\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  float:left;\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  color: #2e3346;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                    •\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  float:left;\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  font-weight: 600;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                      08:50\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                            </div>\n" +
                "                                                            <div\n" +
                "                                                                    style=\"\n" +
                "                                position: relative;\n" +
                "                                gap: 6px;\n" +
                "                                color: #2e3346;\n" +
                "                                \"\n" +
                "                                                            >\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  position: relative;\n" +
                "                                  line-height: 14px;\n" +
                "                                  font-weight: 600;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                  <span>\n" +
                "                                      Penang\n" +
                "                                  </span>\n" +
                "                                                                </div>\n" +
                "                                                                <div\n" +
                "                                                                        style=\"\n" +
                "                                  position: relative;\n" +
                "                                  font-size: 10px;\n" +
                "                                  line-height: 13px;\n" +
                "                                  overflow:hidden;\n" +
                "                                  \"\n" +
                "                                                                >\n" +
                "                                                                    <p style=\"margin: 0\">\n" +
                "                                    <span>\n" +
                "                                        Penang International Airport\n" +
                "                                    </span>\n" +
                "                                                                    </p>\n" +
                "                                                                    <p style=\"margin: 0\">\n" +
                "                                    <span>\n" +
                "                                        \n" +
                "                                    </span>\n" +
                "                                                                    </p>\n" +
                "                                                                </div>\n" +
                "                                                            </div>\n" +
                "                                                        </div>\n" +
                "                                                    </div>\n" +
                "                                                </div>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </div>\n" +
                "                                                                                                                                                                                                    </div>\n" +
                "                        <div\n" +
                "                    style=\"\n" +
                "                margin:6px 0px;\n" +
                "                width:569px;\n" +
                "                overflow:hidden;\n" +
                "                \"\n" +
                "            >\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                  position: relative;\n" +
                "                  line-height: 16.5px;\n" +
                "                  font-weight: 600;\n" +
                "                  display: inline-block;\n" +
                "                  width: 569px;\n" +
                "                  margin-bottom:6px;\n" +
                "                  \"\n" +
                "                >\n" +
                "                    Passenger Details\n" +
                "                </div>\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                  border-radius: 9px 9px 0px 0px;\n" +
                "                  border: 1px solid #eee;\n" +
                "                  box-sizing: border-box;\n" +
                "                  width: 569px;\n" +
                "                  flex-direction: row;\n" +
                "                  align-items: flex-start;\n" +
                "                  justify-content: flex-start;\n" +
                "                  font-size: 11px;\n" +
                "                  overflow:hidden;\n" +
                "                  \"\n" +
                "                >\n" +
                "                    <div\n" +
                "                            style=\"\n" +
                "                    border-radius:9px 9px 0px 0px;\n" +
                "                    justify-content: center;\n" +
                "                    width:569px;\n" +
                "                    height:35px;\n" +
                "                    overflow:hidden;\n" +
                "                    \"\n" +
                "                    >\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:9px 0px 0px 0px;\n" +
                "                      width:27px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:6.6px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          No\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:0px 0px 0px 0px;\n" +
                "                      width:270px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:107px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          Passengers\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:0px 9px 0px 0px;\n" +
                "                      width:270px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:80px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          Airline Ticket Number\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                                                                <div\n" +
                "                                style=\"\n" +
                "                    width:569px;\n" +
                "                    border: 1px solid #eee;\n" +
                "                    overflow:hidden;\n" +
                "                    min-height:35px;\n" +
                "                    \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:27px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                            1\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:270px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                            LI/SIL\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:270px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                            0CXRAA\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                                                            </div>\n" +
                "            </div>\n" +
                "                        <div\n" +
                "                    style=\"\n" +
                "                margin:6px 0px;\n" +
                "                width:569px;\n" +
                "                overflow:hidden;\n" +
                "                \"\n" +
                "            >\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                  position: relative;\n" +
                "                  line-height: 16.5px;\n" +
                "                  font-weight: 600;\n" +
                "                  display: inline-block;\n" +
                "                  width: 569px;\n" +
                "                  margin-bottom:6px;\n" +
                "                  \"\n" +
                "                >\n" +
                "                  <span>\n" +
                "                    Payment Details\n" +
                "                  </span>\n" +
                "                </div>\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "                  border-radius: 9px 9px 0px 0px;\n" +
                "                  border: 1px solid #eee;\n" +
                "                  box-sizing: border-box;\n" +
                "                  width: 569px;\n" +
                "                  flex-direction: row;\n" +
                "                  align-items: flex-start;\n" +
                "                  justify-content: flex-start;\n" +
                "                  font-size: 11px;\n" +
                "                  overflow:hidden;\n" +
                "                  \"\n" +
                "                >\n" +
                "                    <div\n" +
                "                            style=\"\n" +
                "                    border-radius:9px 9px 0px 0px;\n" +
                "                    justify-content: center;\n" +
                "                    width:569px;\n" +
                "                    height:35px;\n" +
                "                    overflow:hidden;\n" +
                "                    \"\n" +
                "                    >\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:9px 0px 0px 0px;\n" +
                "                      width:27px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:6.6px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          No\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:0px 0px 0px 0px;\n" +
                "                      width:180px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:74px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          Total\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:0px 0px 0px 0px;\n" +
                "                      width:180px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:74px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          Tax\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div\n" +
                "                                style=\"\n" +
                "                      border-radius:0px 9px 0px 0px;\n" +
                "                      width:180px;\n" +
                "                      height:35px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      background-color: #f5f8fd;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                        margin-top:11px;\n" +
                "                        margin-left:74px;\n" +
                "                        position: relative;\n" +
                "                        line-height: 14px;\n" +
                "                        font-weight: 600;\n" +
                "                        \"\n" +
                "                            >\n" +
                "                        <span>\n" +
                "                          Fee\n" +
                "                        </span>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                                                                <div\n" +
                "                                style=\"\n" +
                "                    width:569px;\n" +
                "                    border: 1px solid #eee;\n" +
                "                    overflow:hidden;\n" +
                "                    min-height:35px;\n" +
                "                    \"\n" +
                "                        >\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:27px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                            1\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:180px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                          PHP 2305\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:180px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                          PHP 450\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <div\n" +
                "                                    style=\"\n" +
                "                      min-height:35px;\n" +
                "                      width:180px;\n" +
                "                      float:left;\n" +
                "                      overflow:hidden;\n" +
                "                      border-right: 1px solid #eee;\n" +
                "                      background-color: #fff;\n" +
                "                      \"\n" +
                "                            >\n" +
                "                                <div\n" +
                "                                        style=\"\n" +
                "                        padding: 11px 7px;\n" +
                "                        \"\n" +
                "                                >\n" +
                "                        <span>\n" +
                "                          PHP 1855\n" +
                "                        </span>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                                                            </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div\n" +
                "                style=\"\n" +
                "            padding:6px 0px;\n" +
                "            width: 569px;\n" +
                "            height:77px;\n" +
                "            overflow: hidden;\n" +
                "            \"\n" +
                "        >\n" +
                "            <img\n" +
                "                    style=\"\n" +
                "              float: left;\n" +
                "              width: 569px;\n" +
                "              height: 77px;\n" +
                "              overflow: hidden;\n" +
                "              z-index:0;\n" +
                "              \"\n" +
                "                    alt=\"\"\n" +
                "                    src=\"https://gw.alicdn.com/imgextra/i4/O1CN01hHmdZ71MpGEAJ5uC9_!!6000000001483-0-tps-1550-192.jpg\"\n" +
                "            />\n" +
                "            <div\n" +
                "                    style=\"\n" +
                "              height:43px;\n" +
                "              width:569px;\n" +
                "              position:absolute;\n" +
                "              overflow:hidden;\n" +
                "              margin-top:12px;\n" +
                "              \"\n" +
                "            >\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "              position: relative;\n" +
                "              line-height: 16px;\n" +
                "              font-weight: 600;\n" +
                "              z-index: 2;\n" +
                "              margin-left:240px;\n" +
                "              \"\n" +
                "                >\n" +
                "              <span>\n" +
                "                Connect with Us\n" +
                "              </span>\n" +
                "                </div>\n" +
                "                <div\n" +
                "                        style=\"\n" +
                "              position:relative\n" +
                "              z-index: 3;\n" +
                "              font-size: 11px;\n" +
                "              color: #1e71ff;\n" +
                "              padding-top:13px;\n" +
                "              padding-left:200px;\n" +
                "              \"\n" +
                "                >\n" +
                "                    <div\n" +
                "                            style=\"\n" +
                "                float:left;\n" +
                "                align-items: center;\n" +
                "                position:relative;\n" +
                "                width:192px;\n" +
                "                gap:13px;\n" +
                "                overflow:hidden;\n" +
                "                \"\n" +
                "                    >\n" +
                "                        <img\n" +
                "                                style=\"\n" +
                "                  width: 13px;\n" +
                "                  height: 13px;\n" +
                "                  overflow: hidden;\n" +
                "                  float:left;\n" +
                "                  margin-right:13px;\n" +
                "                  \"\n" +
                "                                alt=\"\"\n" +
                "                                src=\"https://gw.alicdn.com/imgextra/i4/O1CN01RjfU6F25UnEM6Rrtz_!!6000000007530-2-tps-25-25.png\"\n" +
                "                        />\n" +
                "                        <div style=\"position: relative; line-height: 14px;float:left;\">\n" +
                "                  <span>\n" +
                "                    Lazada_flights@care.lazada.com\n" +
                "                  </span>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
        File file = new File("/Users/skye/Downloads/test.pdf");
        try (OutputStream out = new FileOutputStream(file)) {
            long start = System.currentTimeMillis();
            ITextRenderer render = new ITextRenderer();
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
