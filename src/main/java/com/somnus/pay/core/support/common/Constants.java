package com.somnus.pay.core.support.common;

import com.somnus.pay.core.support.util.BundleUtil;

public class Constants {
    // APP扫码支付
    public static final String PAY_FROM_SCAN_QRCODE = "PAY_FROM_SCAN_QRCODE";
    // 使用APP 支付
    public static final String PAY_FROM_APP = "PAY_FROM_APP";

    /**
     *支付回调地址（根据环境）
     */
    public final static String PAY_BACK_DOMAIN = BundleUtil.getString("backDomain");
    /**
     *支付回调地址（online配置）
     */
    public final static String PAY_ONLINE_BACK_DOMAIN = BundleUtil.getString("onlineBackDomain");
    /**
     *B5Mserver地址
     */
    public final static String B5M_DOMAIN = BundleUtil.getString("www.server");
    /**
     *B5Cserver地址
     */
    public final static String B5C_WAP_DOMAIN = BundleUtil.getString("b5cwap.server");
    /**
     *B5M手机端server地址
     */
    public final static String B5M_MOBILE_DOMAIN = BundleUtil.getString("m.server");
    /**
     *用户中心server地址
     */
    public final static String UCENTER_DOMAIN = BundleUtil.getString("ucenter.server");
    /**
     *AppServer地址为请求获取短链接
     */
    public final static String APP_DOMAIN = BundleUtil.getString("app.server");
    /**
     *配置新成功页面地址
     */
    public final static String NEW_RESULT_PATH = BundleUtil.getString("NEW_RESULT_PATH");
    
    /**
     * 区分是否合并付款的前缀
     */
    public static final String COMBINED_ORDER_PREFIX="MO_";

    /**
     * 未支付状态值字符串
     */
    public static final String NOPAY_STATUS_STR = "status=0";

    /**
     * 支付成功状态值字符串
     */
    public static final String PAID_STATUS_STR = "status=1";

    /**
     * 获取配置文件环境名-》stage，prod，online为空
     */
    public final static String PAY_ENVIRONMENT  = BundleUtil.getString("environment");

    //是否需要区分境外支付KEY
    public static final String IS_NEED_CROSSPAY = "IS_NEED_CROSSPAY";
    /**
     *查询接口中支付号key
     */
    public static final String PAY_ID_KEY = "orderId";

}
