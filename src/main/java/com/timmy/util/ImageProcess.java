package com.timmy.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.timmy.entity.EnrollInfo;
import com.timmy.mapper.EnrollInfoMapper;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import org.apache.commons.codec.binary.Base64;

public class  ImageProcess {

	@Autowired
	EnrollInfoMapper enrollInfoMapper;
	 public static boolean base64toImage(String base64String, String picName) {
	     //   String savePath = InitializationCfg.getCfg("attachment.path");
	        Date now = new Date();
		/*
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); String
		 * subPath = dateFormat.format(now);
		 */
	        // String imagePath = "C:/dynamicface/picture/";
	        String imagePath = "C:/LexusTech/student_picture/";
	        String file = picName + ".jpg";
	        System.out.println("图片路径" + imagePath + file);
	        File file2 = new File(imagePath + file);
	        if (base64String == null) {
	            return false;
	        } else {
	            // BASE64Decoder decoder = new BASE64Decoder();

	            try {
	                if (!file2.exists()) {
	                    file2.getParentFile().mkdir();
	                    file2.createNewFile();
	                }

	                /*byte[] b = decoder.decodeBuffer(base64String);

	                for(int i = 0; i < b.length; ++i) {
	                    if (b[i] < 0) {
	                        b[i] = (byte)(b[i] + 256);
	                    }
	                }*/
	                
	                FileOutputStream fos = new FileOutputStream(imagePath + file); //change path of image according to you
	                byte[] byteArray = Base64.decodeBase64(base64String);
	                System.out.println("\nImg:" + byteArray);
	                fos.write(byteArray);
	                fos.close();

	                /* OutputStream out = new FileOutputStream(file2);
	                out.write(b);
	                out.flush();
	                out.close();*/
	                return true;
	            } catch (Exception e) {
	                e.printStackTrace();
	                return false;
	            }
	        }
	    }
	 
	  public static String multipartFileToBASE64(MultipartFile mFile) throws Exception{
	        BASE64Encoder bEncoder=new BASE64Encoder();
	        String[] suffixArra=mFile.getOriginalFilename().split("\\.");
	        String preffix="data:image/jpg;base64,".replace("jpg", suffixArra[suffixArra.length - 1]);
	        String base64EncoderImg=preffix + bEncoder.encode(mFile.getBytes()).replaceAll("[\\s*\t\n\r]", "");
	        return base64EncoderImg;
	    }
	  
	  /**
	   * 图片转base64字符串
	   * @param imgFile 图片路径
	   * @return
	   */
	  public static String imageToBase64Str(String imgFile) {
	   InputStream inputStream = null;
	   byte[] data = null;
	   try {
	    inputStream = new FileInputStream(imgFile);
	    data = new byte[inputStream.available()];
	    inputStream.read(data);
	    inputStream.close();
	   } catch (IOException e) {
	    e.printStackTrace();
	   }
	   // 加密
	//   BASE64Encoder encoder = new BASE64Encoder();
		/*
		 * String s=encoder.encode(data); String s2=s.replaceAll("[+]", "%2B");
		 */
	   return org.apache.commons.codec.binary.Base64.encodeBase64String(data);
	  }
	  
	  
	  public static void main(String[] args) {
	//	EnrollInfo enrollInfo=
	}
}
