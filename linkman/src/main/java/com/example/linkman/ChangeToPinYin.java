package com.example.linkman;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;

public class ChangeToPinYin {

    private static volatile ChangeToPinYin changeToPinYin;

    public static ChangeToPinYin getInstance(){
        if (changeToPinYin == null){
            synchronized (ChangeToPinYin.class){
                if (changeToPinYin == null){
                    changeToPinYin = new ChangeToPinYin();
                }
            }
        }
        return changeToPinYin;
    }

    private String[] pinyin;

    public String getCharPinyin(char pinyinStr){
        pinyin = PinyinHelper.toHanyuPinyinStringArray(pinyinStr);

        if (pinyin==null){
            return String.valueOf(pinyinStr);
        }
        return pinyin[0];
    }

}
