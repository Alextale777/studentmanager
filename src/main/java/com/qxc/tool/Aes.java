package com.qxc.tool;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.*;
import java.util.Base64;

public class Aes {
    public static String key="mT/GxYPydHfxp/iR";
    public static Cipher cipher;

    static {
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }
    public static String encrypt(String content) throws Exception {
        SecretKey myKey=new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE,myKey);
        byte[] res=cipher.doFinal(content.getBytes());
        return Base64.getEncoder().encodeToString(res);
    }

    public static String decrypt(String content) throws Exception {
        SecretKey myKey=new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE,myKey);
        byte[] res=Base64.getDecoder().decode(content);
        res=cipher.doFinal(res,0,res.length);
        return new String(res);
    }
    public static void main(String[] args) throws Exception {
        String str=encrypt("fuck");
        System.out.println(str);
        System.out.println(new String(decrypt(str)));
    }

}
