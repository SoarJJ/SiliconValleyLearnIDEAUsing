package com.soar.learnidea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @FileName Hi
 * @Description TODO
 * @Author Soar
 * @Date 2020/2/10 21:18
 * @Version 1.0
 */
public class Hi {
    //模板6:prsf private static final
    private static final int INIT_SIZE=10;

        //psf:public static final int
        public static final int CACHE_MEMORY=1024;
        //psfi:public static final int
        public static final int INI_SIZE=10;
        //psfs:public static final String
        public static final String SERIVAL="好";

    /**
     * 模板1:psvm
     *
     */
    public static void main(String[] args) {
        
        //模板2:sout
        System.out.println();
        //模板2变型:
            //soutp 打印方法的形参
            System.out.println("args = " + Arrays.deepToString(args));
            //soutm 打印方法名
            System.out.println("Hi.main");
            //soutv 打印变量(就近打印)
            System.out.println("args = " + args);
            //xxx.sout(打印xxx)
            System.out.println(args);

        //模板3:fori 外壳for循环
        int[] intArray={1,1,2,3,5,8};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+"\t");
        }
            //iter  增强for循环
            for (int i : intArray) {

            }
            //itar 完整for循环
            for (int i = 0; i < intArray.length; i++) {
                int i1 = intArray[i];

            }

        //模板4:e.for 对e进行增强for循环
        List<String> stringList=new ArrayList<>();
        for (String s : stringList) {
            
        }

        Integer  i=0;
        //模板5: ifn 对最近的变量,进行if分支
        if (i == null) {
            
        }



    }
}
