package com.tcg.transferprovider.utils;

import java.io.*;

import org.apache.commons.io.FileUtils;

/**
 * @author 14861
 * @date 2020/5/29
 */
public class FileTransfer {
    private static final String PATH = "images/";
    private static final String PYTHON_PATH = "";

    public static String transferToTemporaryFile(byte[] file, String suffix) throws IOException {

        String fileName = "0_ori" + suffix;

        File filePath = new File(PATH);
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        File targetFile = new File(PATH + fileName);
        if (!targetFile.exists()) {
            targetFile.createNewFile();
        }
        FileUtils.copyInputStreamToFile(new ByteArrayInputStream(file), targetFile);
        System.out.println("tmp_path:" + targetFile.getAbsolutePath());
        return PATH + fileName;
    }

    public static byte[] transfer(byte[] fileBytes, String fileName, String model)
        throws IOException, InterruptedException {
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = "output" + suffix;
        String filePath = transferToTemporaryFile(fileBytes, suffix);
        String command = "python3 1.py --input " + filePath + " --model " + model + " --output " + PATH + newFileName;
        Process process = Runtime.getRuntime().exec(command);
        System.out.println(command);
        int result = process.waitFor();
        System.out.println("result:" + result);

        byte[] transferFileBytes = null;
        if (result == 0) {
            File transferFile = new File(PATH + newFileName);
            System.out.println("transfer_path:" + transferFile.getAbsolutePath());
            InputStream inputStream = new FileInputStream(transferFile);
            transferFileBytes = new byte[inputStream.available()];
            inputStream.read(transferFileBytes, 0, inputStream.available());
        }
        return transferFileBytes;
    }
}
