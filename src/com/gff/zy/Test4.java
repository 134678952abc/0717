package com.gff.zy;

import java.io.File;

public class Test4 {

    public static void main(String[] args) {
        //获取路径
        File list = new File("D:\\");
        //
        File[] files = list.listFiles();
        //判断
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("file = " + file);
            }
        }
    }
}

