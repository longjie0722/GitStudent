package com.java1824.service;

import com.google.gson.Gson;
import com.java1824.ov.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserService {
    private  String savePath = "E:\\User";

    public String regUser(User user){
          // 将注册信息以[用户名.json]形式写入到E盘下面的User文件夹中
          //File.pathSeparator 路径分离器(将路径分离)
          File f = new File(savePath +File.pathSeparator+ user.getUsername()+"json");
          //先判断用户是否存在
          if(!f.exists()){
              return "用户已注册";
          }
          //将用户注册的数据转换成json(用户数据不能直接存储到文件夹中,需要转换成json)
          Gson gson = new Gson();
          String json = gson.toJson(user);

          //将json里面的信息写入到E:\\User\\用户名.json中
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(json);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            //存储失败  返回Faild
            return "Faild";
        }
        return "Success";

    }
}
