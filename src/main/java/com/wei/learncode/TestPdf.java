package com.wei.learncode;

import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

public class TestPdf {

    public static void main(String[] args) throws Exception {

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
                "            width: 24%;\n" +
                "            font-size: 8pt;\n" +
                "            font-weight: bold;\n" +
                "            line-height: 32px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #5C5F66;\n" +
                "            float: left;\n" +
                "            margin-right: 3px\n" +
                "        }\n" +
                "\n" +
                "        .footer_main_ATA {\n" +
                "            width: 18%;\n" +
                "            font-size: 8pt;\n" +
                "            font-weight: bold;\n" +
                "            line-height: 32px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #5C5F66;\n" +
                "            float: left;\n" +
                "            margin-right: 3px\n" +
                "        }\n" +
                "\n" +
                "        .footer_main_email {\n" +
                "            width: 57%;\n" +
                "            font-size: 8pt;\n" +
                "            font-weight: bold;\n" +
                "            line-height: 32px;\n" +
                "            letter-spacing: 0px;\n" +
                "            color: #5C5F66;\n" +
                "            float: left;\n" +
                "        }\n" +
                "        .footer_main_email_name{\n" +
                "            float: left;\n" +
                "            margin-right: 5px;\n" +
                "            width: 96pt;"+
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
                "            /* position: relative; */\n" +
                "            height: 25px;\n" +
                "        }\n" +
                "\n" +
                "        .header_prompt_detail {\n" +
                "            font-family: Poppins;\n" +
                "            font-size: 12pt;\n" +
                "            color: #5C5F66;\n" +
                "            overflow: hidden;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        /*.header_prompt_detail_Bold {*/\n" +
                "        /*    overflow: hidden;*/\n" +
                "        /*    width: 100%;*/\n" +
                "        /*}*/\n" +
                "\n" +
                "        .header_prompt_detail_Bold_title {\n" +
                "            font-family: Poppins;\n" +
                "            font-size: 12pt;\n" +
                "            font-weight: 600;\n" +
                "            margin-right: 5px;\n" +
                "            white-space: normal;\n" +
                "            word-break: break-all;\n" +
                "            overflow-wrap: break-word;\n" +
                "        }\n" +
                "\n" +
                "        .header_prompt_detail_Bold_time {\n" +
                "            color: #5C5F66;\n" +
                "            font-weight: 400;\n" +
                "            display: inline;\n" +
                "        }\n" +
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
                "                Order No : 331800100544\n" +
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
                "        <div class=\"main_box\">\n" +
                "\n" +
                "\n" +
                "        \n" +
                "            <div class=\"main_box_over_style\">\n" +
                "                <div class=\"main_box_title\">\n" +
                "                    Itinerary\n" +
                "                </div>\n" +
                "                <div class=\"main_box_title_PNR\">\n" +
                "                    <div class=\"main_box_title_PNR_detail\">\n" +
                "                        PNR: MY05RK\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"main_ltinerary\">\n" +
                "                <div class=\"main_ltinerary_header\">\n" +
                "                    <div class=\"main_ltinerary_header_left\">\n" +
                "                        <div class=\"main_ltinerary_header_left_word\">\n" +
                "                            China Eastern Airlines -  - Narrow Body Aircraft 32S\n" +
                "                        </div>\n" +
                "                        <div class=\"main_ltinerary_header_left-words\">\n" +
                "                            Economy\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_header_image\">\n" +
                "                        <img style=\"height: 50px;float:right\"\n" +
                "                             src=\"https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png\"\n" +
                "                             alt=\"\" />\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"main_ltinerary_details-cocent\">\n" +
                "                    <div class=\"main_ltinerary_details\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Departure</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">Arrival</div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_details-Two\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Wed, Jul 10 2024 · 05:00PM</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">Wed, Jul 10 2024 · 07:50PM</div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_details\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Shanghai (SHA)</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">Macau (MFM)</div>\n" +
                "                    </div>\n" +
                "                    <div class=\"main_ltinerary_details\">\n" +
                "                        <div class=\"main_ltinerary_details-table\">Shanghai Pudong International Airport T2</div>\n" +
                "                        <div class=\"main_ltinerary_details-table\">Macau International Airport\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "            \n" +
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
                "                                                                <tr>\n" +
                "                                    <td>1</td>\n" +
                "                                    <td>WANG QIQI</td>\n" +
                "                                    <td>Check with airline<br /> </td>\n" +
                "                                    <td class=\"main_box_table-mobile\">89750183</td>\n" +
                "                                </tr>\n" +
                "                                                            </tbody>\n" +
                "                        </table>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "        \n" +
                "                    <div class=\"main_box_table\">\n" +
                "                <div class=\"main_box_over_style\">\n" +
                "                    <div class=\"main_box_title\">\n" +
                "                        Payment Details\n" +
                "                    </div>\n" +
                "                    <div class=\"main_box_table-detail\">\n" +
                "                        <table class=\"main_box_table-details\">\n" +
                "                            <thead>\n" +
                "                            <tr>\n" +
                "                                <th>Payment Method</th>\n" +
                "                                <th>Fare</th>\n" +
                "                                <th>Ticket Numberss</th>\n" +
                "                                <th>Total</th>\n" +
                "                            </tr>\n" +
                "                            </thead>\n" +
                "                            <tbody>\n" +
                "                                                                <tr>\n" +
                "                                    <td>WP</td>\n" +
                "                                    <td>USD 259.2 x1</td>\n" +
                "                                    <td>USD 48.0 x1</td>\n" +
                "                                    <td class=\"main_box_table-mobile\">USD 460.8</td>\n" +
                "                                </tr>\n" +
                "                                                            </tbody>\n" +
                "                        </table>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "        \n" +
                "        <div class=\"main_notes\">\n" +
                "            <div class=\"main_box_over_style\">\n" +
                "                <div class=\"main_box_title\">\n" +
                "                    Notes\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"main_notes-word\">\n" +
                "                Please arrive at the indicated airport no later than 2 hours before your departure time>. Kindly\n" +
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
                "                <div class=\"footer_main_email_detail\">Fliggy-Global@service.alibaba.com</div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
        //System.out.println(html);
        File file = new File("/Users/skye/Downloads/aaa.pdf");
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
