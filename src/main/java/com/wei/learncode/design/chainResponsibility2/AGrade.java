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
 * @date Created in 2021年11月02日 16:38
 * @since 1.0
 */
public class AGrade extends GradeHandler{


    @Override
    public String getGrade(int price, int type) {
        if(price >50 && type == 2){
            return "A";
        }else{
            if(this.getGradeHandler() != null){
                return this.getGradeHandler().getGrade(price,type);
            }
        }
        return "";
    }
}
