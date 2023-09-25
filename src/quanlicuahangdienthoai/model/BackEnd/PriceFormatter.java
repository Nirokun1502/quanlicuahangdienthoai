/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicuahangdienthoai.model.BackEnd;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author DELL
 */
public class PriceFormatter {

    public static String format(float num) {
        BigDecimal trieu = new BigDecimal(num * 1000000);
        Locale vietnam = new Locale("vi", "VN");
        NumberFormat fmoney = NumberFormat.getCurrencyInstance(vietnam);

        return fmoney.format(trieu);
    }
    
//     public static String redoformat(String str) {
//         
//         for(int i = str.length(); i>0; i--)
//         {
//             if(str.substring(i).equals("đ")  || str.substring(i) == "0" || str.substring(i) == ".")
//                {
//                    str = str.substring(0, i-1);
//                }
//         }
//        return str;
//    }
}
