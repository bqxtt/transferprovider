package com.tcg.transferprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.tcg.transferprovider.service.TransferService;

/**
 * @author 14861
 * @date 2020/5/29
 */
@Controller
public class MainController {
    @Autowired
    TransferService transferService;

    @ResponseBody
    @PostMapping("/test")
    public String test(@RequestParam("uploadImage") MultipartFile uploadImage) {
        return "String.valueOf(transferService.candy(uploadImage));";
    }
}
