/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipCompressor {

    public static void compressFile(File inputFile, File outputZip) throws Exception {

        FileInputStream fis = new FileInputStream(inputFile);

        FileOutputStream fos = new FileOutputStream(outputZip);

        ZipOutputStream zos = new ZipOutputStream(fos);

        ZipEntry entry = new ZipEntry(inputFile.getName());

        zos.putNextEntry(entry);

        byte[] buffer = new byte[1024];

        int length;

        while ((length = fis.read(buffer)) > 0) {
            zos.write(buffer, 0, length);
        }

        zos.closeEntry();

        zos.close();

        fis.close();
    }
}
