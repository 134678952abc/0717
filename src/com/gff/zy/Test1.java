package com.gff.zy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Test1 {
    public static void main(String[] args) {
        //通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
        File file = new File("/myfile.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile =" + newFile);
        } catch (IOException e) {
            System.out.println("不能创建新文件");
            e.printStackTrace();
        }
        boolean exists = file.exists();//判断文件是否存在
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.lastModified());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(file.lastModified()));

    }
}

