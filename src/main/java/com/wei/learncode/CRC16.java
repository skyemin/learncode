package com.wei.learncode;

public class CRC16 {
    /**
     * @param bytes 字节
     * @return {@link String}
     */
    public static String getCrc(byte[] bytes) {
        int crc = 0xFFFF;
        int polynomial = 0xA001;

        for (byte aByte : bytes) {
            crc ^= aByte;
            for (int j = 0; j < Byte.SIZE; j++) {
                if ((crc & 0x01) == 1) {
                    crc >>= 1;
                    crc ^= polynomial;
                } else {
                    crc >>= 1;
                }
            }
        }
        // 高低位转换，看情况使用
        crc = ((crc & 0xFF00) >> 8) | ((crc & 0xFF) << 8);
        return Integer.toHexString(crc);
    }

    public static void main(String[] args) {
        String test = "984518935@qq.com";
        byte[] hexBytes = test.getBytes();
        System.out.println(getCrc(hexBytes));
    }
}
