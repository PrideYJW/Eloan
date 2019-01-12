package com.eloan.util;

import java.math.BigDecimal;
/*
  添加ZERO常量和系统中小数位数常量
 */
public interface BidConst {
    public static final int DISP_SCALE = 2;// 显示精度
    public static final int SCALE = 4;// 数据保存精度
    public static final int CAL_SCALE = 8;// 数据计算过程中的精度

    public static final BigDecimal ZERO = new BigDecimal("0.0000");

}
