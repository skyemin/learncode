package com.wei.learncode.ddd;

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
 * @date Created in 2022年03月26日 15:48
 * @since 1.0
 */
// 聚合根的Marker接口
public interface Aggregate<ID extends Identifier> extends Entity<ID> {

}
