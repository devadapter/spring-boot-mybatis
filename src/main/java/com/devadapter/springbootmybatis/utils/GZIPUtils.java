package com.devadapter.springbootmybatis.utils;


import org.apache.tomcat.util.codec.binary.Base64;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by carloszhang
 * on 2018/5/30.
 */
public class GZIPUtils {

    /**
     * 压缩
     *
     * @param str 压缩的字符串
     * @return
     * @throws IOException
     */
    public static String compress(String str) throws IOException {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return new String(Base64.encodeBase64(out.toByteArray()));
    }

    /**
     * 解压
     *
     * @param str
     * @return
     * @throws IOException
     */
    public static String unCompress(String str) throws IOException {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(Base64.decodeBase64(str)));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(gis, out);
        return new String(out.toByteArray());
    }
}

