package com.wei.learncode.cpu;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author skye
 * @version 1.0
 * @date Created in 2021年10月25日 14:39
 * @since 1.0
 */
public class TestWait0 {


    public void waits(){
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end.....");
    }
    public static void main(String[] args) {
        TestWait0 wait0 = new TestWait0();
        wait0.waits();
    }
}
