package com.yzit.gen;

import com.yzit.gen.entity.CodeGenerateFactory;

public class Gen1905 {

    public static String KEY_TYPE_01 = "01";
    public static String KEY_TYPE_02 = "02";
    public static void main(String[] args) {
        /** 此处修改成你的 表名 和 中文注释** */
        String tableName = ""; // 表名称
        String codeName = "";// 中文注释 当然你用英文也是可以的
        String className = "";// 类名称


        try {
            /***************【平台数据库】********************/

            /***************【平台数据库】********************/
            //codeGenerate("数据库表名称", "实体类备注", "生成实体类的名称");//代码生成

            codeGenerate("t_brand", "品牌", "Brand");//代码生成

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void codeGenerate(String tableName, String codeName,String className) throws Exception{
        String entityPackage ="";//实体包

        String keyType = KEY_TYPE_02;//主键生成方式 01:UUID  02:自增
        CodeGenerateFactory.codeGenerate(tableName, codeName,className,entityPackage,keyType,true);
    }
}

