package com.gff.zy;

import java.io.File;
import java.io.FileFilter;

public class Test6 {
    public static void main(String[] args) {
        //获取路径
        File dir = new File("D:\\");
        File []subs = dir.listFiles(new FileFilter(){
            public boolean accept(File file) {
                return file.isFile();
            }

        });
        for(File sub : subs){
            System.out.println("文件:"+sub.getName());
        }
    }
}

