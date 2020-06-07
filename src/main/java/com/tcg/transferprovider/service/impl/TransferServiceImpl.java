package com.tcg.transferprovider.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcg.transferprovider.service.TransferService;
import com.tcg.transferprovider.utils.FileTransfer;
import com.tcg.transferprovider.utils.TransferStyle;

/**
 * @author 14861
 * @date 2020/5/29
 */
@Component
@Service(version = "1.0.0", timeout = 60000, interfaceClass = TransferService.class)
public class TransferServiceImpl implements TransferService {

    @Override
    public String test(byte[] uploadImage, String fileName) {

        String suffix = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = System.currentTimeMillis() + "_original" + suffix;

        File filePath = new File("images/");
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        File targetFile = new File("images/" + newFileName);
        if (!targetFile.exists()) {
            try {
                targetFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileUtils.copyInputStreamToFile(new ByteArrayInputStream(uploadImage), targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("tmp_path:" + targetFile.getAbsolutePath());
        return "test";
    }

    @Override
    public byte[] candy(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.CANDY);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] composition(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.COMPOSITION);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] feathers(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.FEATHERS);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] laMuse(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.LA_MUSE);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] mosaic(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.MOSAIC);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] starryNight(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.STARRY_NIGHT);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] theScream(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.THE_SCREAM);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] theWave(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.THE_WAVE);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] udnie(byte[] uploadImage, String fileName) {
        try {
            return FileTransfer.transfer(uploadImage, fileName, TransferStyle.UDNIE);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
