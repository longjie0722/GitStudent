package com.java1824.service;

import java.io.File;

public class UserService {
    // 判断用户名是否被注册过
    public static boolean judgeUserExists(String name) {
        File f = new File("E:\\User" +File.pathSeparator+ name + ".json");
        return f.exists();
    }
}
