package com.java1824.service;

import java.io.File;

public class UserService {

    public static boolean judgeUser(String name){
        File f = new File("E:\\User"+File.pathSeparator+name+".json");
        return f.exists();
    }
}
