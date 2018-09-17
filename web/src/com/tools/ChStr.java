package com.tools;

public class ChStr {
    public String chStr(String str){
        if (str==null){
            str = "";
        }else{
            try {
                str=(new String(str.getBytes("iso-8859-1"),"GBK")).trim();//将字符串转换为GBK编码
            }catch (Exception e){
                e.printStackTrace(System.err);			//输出异常信息
            }
        }

        return str;
    }

    public String convertStr(String str1){
        if (str1==null){
            str1="";
        }else{
            try {
                str1=str1.replaceAll("<","&lt;");//替换字符串中的"<"和">"字符，保证HTML标记的正常输出
                str1=str1.replaceAll(">","&gt;");
                str1=str1.replaceAll(" ","&nbsp;");
                str1=str1.replaceAll("\r\n","<br>");
            }catch (Exception e){
                e.printStackTrace(System.err);
            }
        }
        return str1;
    }

}
