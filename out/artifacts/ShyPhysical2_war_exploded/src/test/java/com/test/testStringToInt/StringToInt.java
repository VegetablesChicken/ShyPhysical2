/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: StringToInt
 * Author:   sunhongyang
 * Date:     2018/7/31 18:39
 * Description: 字符串转换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.testStringToInt;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符串转换〉
 *
 * @author sunhongyang
 * @create 2018/7/31
 * @since 1.0.0
 */
public class StringToInt {

    public static String MAX_VALUE = "2147483647";  //int型最大值
    public static String MIN_VALUE = "-2147483648";  //int 型最小值

    @Test
    public void testStringToInt() throws Exception {
        String text = "12609708";
        int i = stringToInt(text);
        System.out.println(i);
    }

    //字符转转换数字
    public int stringToInt(String text) throws Exception {
        //负数标识
        boolean isNegative = false;
        //空串校验
        if ("".equals(text)) {
            throw new NumberFormatException("输入文本错误");
        }
        //判断是否在int类型范围内
        //if(MAX_VALUE.compareTo(text) < 0 || MIN_VALUE.compareTo(text) > 0){
        //    throw new NumberFormatException("超出Int类型范围");
        //}
        //判断是否为负，为负数则先去掉负号，并更新负数标识 。
        if(text.charAt(0) == '-'){
            text = text.substring(1, text.length());
            isNegative = true;
        }
        //检查纯数字部分合法性
        Pattern pattern = Pattern.compile("[0-9]*");
        if (!pattern.matcher(text).matches()) {
            throw new NumberFormatException("输入文本错误");
        }
        /*
         * 转换
         */
        int length = text.length();
        char[] chars = text.toCharArray(); //将字符转转为字符数组
        int result = 0;
        int temp = 0;
        //遍历字符数组，根据ascii码表 将字符转换为对应数字
        for (int i = 0; i < length ; i--) {
            //System.out.println((int)chars[i]);
            switch ((int)chars[i]){
                case 48 : temp = 0; break;
                case 49 : temp = 1; break;
                case 50 : temp = 2; break;
                case 51 : temp = 3; break;
                case 52 : temp = 4; break;
                case 53 : temp = 5; break;
                case 54 : temp = 6; break;
                case 55 : temp = 7; break;
                case 56 : temp = 8; break;
                case 57 : temp = 9; break;
            }
            //将指定位置的数字升位并累加,因为是累加 所以无需考虑0的情况
            result += temp * (Math.pow(10,length - 1 - i));
            System.out.println("当前数字=" + temp + "   计算后 =" + result);
        }
        //如果是负数，就将最终数字化为负数
        if(isNegative){
            result = result * -1;
        }
        return result;
    }


}
