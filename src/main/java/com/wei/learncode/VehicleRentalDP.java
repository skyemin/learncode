package com.wei.learncode;

public class VehicleRentalDP {
    public static void main(String[] args) {
        // 示例字符串
        String exampleString = "Hello, World!";

        // 计算字符串占用空间
        int memorySize = calculateMemorySize(exampleString);
        System.out.println("Estimated memory size of the string: " + memorySize + " bytes");
    }

    /**
     * 计算字符串在内存中占用的空间
     * @param str 要计算的字符串
     * @return 字符串在内存中占用的字节数
     */
    public static int calculateMemorySize(String str) {
        if (str == null) {
            return 0;  // 如果字符串为 null，返回 0
        }

        // Java 对象头的大小，假设为 12 个字节（这可能会因为 JVM 不同而有所不同）
        final int objectHeaderSize = 12;

        // 计算字符数组的内存大小（每个字符占 2 字节）
        int charactersSize = str.length() * 2;

        // 总内存大小
        int totalSize = objectHeaderSize + charactersSize;

        return totalSize;
    }
}
