package com.study.effectivejava.item08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

public class ClosableFile {

    public static void main(String[] args) throws IOException {
        FileInputStream is = null;
        BufferedInputStream bis = null;

        var sampleResource = new SampleResource();
//        Connection connection = Connection.TRANSACTION_NONE
//
//        try (var fileInputStream = new FileInputStream()) {
//
//            var hello = sampleResource.hello();
//            try {
//                is = new FileInputStream("file.txt");
//                bis = new BufferedInputStream(is);
//                int data = -1;
//                while((data = bis.read()) != -1){
//                    System.out.print((char) data);
//                }
//            } finally {
//                // close resources
//                if (is != null) is.close();
//                if (bis != null) bis.close();
//            }
//        }
    }
}
