package com.wei.learncode.lambda;

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
 * @date Created in 2022年02月22日 14:32
 * @since 1.0
 */
@FunctionalInterface
public interface NewSupplier {

    void get() throws Exception;
}
