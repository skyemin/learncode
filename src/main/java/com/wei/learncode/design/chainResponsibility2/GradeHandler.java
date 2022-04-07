package com.wei.learncode.design.chainResponsibility2;

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
 * @date Created in 2021年11月02日 16:36
 * @since 1.0
 */
public abstract class GradeHandler {

    private GradeHandler gradeHandler;


    public abstract String getGrade(int price,int type);


    public void setGradeHandler(GradeHandler gradeHandler) {
        this.gradeHandler = gradeHandler;
    }

    public GradeHandler getGradeHandler() {
        return gradeHandler;
    }
}
