package com.gff.zy;

import java.io.File;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要创建的目录的名字:");
        String dirName = scanner.nextLine();
        File dir = new File(dirName);
        if(!dir.exists()){
            dir.mkdir();
        }else{
            int index = 1;
            while(true){
                //修改目录名，添加"副本<编号>"内容
                String name = dirName+"_副本"+index;
                //打桩查看生成的新目录名
                System.out.println(name);
                //创建File表示该目录
                dir = new File(name);
                //若不存在就创建，并停止循环，否则继续判断
                if(!dir.exists()){
                    dir.mkdir();
                    break;
                }
                index++;
            }
        }
        System.out.println("目录创建完毕!");
    }
}

