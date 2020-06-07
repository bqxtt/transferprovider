package com.tcg.transferprovider.service;

/**
 * @author 14861
 * @date 2020/5/29
 */
public interface TransferService {
    String test(byte[] upoladImage, String fileName);

    /**
     * candy风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] candy(byte[] uploadImage, String fileName);

    /**
     * composition风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] composition(byte[] uploadImage, String fileName);

    /**
     * feathers风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] feathers(byte[] uploadImage, String fileName);

    /**
     * la_Muse风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] laMuse(byte[] uploadImage, String fileName);

    /**
     * mosaic风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] mosaic(byte[] uploadImage, String fileName);

    /**
     * starryNight风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] starryNight(byte[] uploadImage, String fileName);

    /**
     * the_scream风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] theScream(byte[] uploadImage, String fileName);

    /**
     * the_wave风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] theWave(byte[] uploadImage, String fileName);

    /**
     * udnie风格转换
     * 
     * @param uploadImage
     *            原始图片
     * @param fileName
     *            文件名
     * @return 转换图片
     */
    byte[] udnie(byte[] uploadImage, String fileName);
}
