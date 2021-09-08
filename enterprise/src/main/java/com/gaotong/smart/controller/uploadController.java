package com.gaotong.smart.controller;

import com.gaotong.smart.config.Result;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/upload")
public class uploadController {
    @Value("${localFileUrl}")
    private String path;

    @Value("${hostFileUrl}")
    private String hostPath;
    @PostMapping("file")
    public Result upload(MultipartFile file){
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String dateFormat = simpleDateFormat.format(date);
        String originalFilename = file.getOriginalFilename();
//        String suffixName = originalFilename.substring(0, originalFilename.lastIndexOf("."));
        String filePath = path+ "/";
        String fileName =originalFilename;

        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
          uuid = uuid.substring(0, 8);
        fileName = uuid+fileName;
        File dest = new File(filePath+fileName);

        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        try{
            file.transferTo(dest);
            return Result.ok().data("url",hostPath+fileName);
        }catch (Exception e){
            System.out.println(e);
        }
        return Result.error().message("上传失败");

    }


}
