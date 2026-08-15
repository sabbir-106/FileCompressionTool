/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decompression;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/**
 *
 * @author HP
 */
public class ZipDecompressor {
    public static void decompressFile(File zipFile, File outputFolder) throws IOException {

    byte[] buffer = new byte[1024];

    try (ZipInputStream zipInputStream =
            new ZipInputStream(new FileInputStream(zipFile))) {

        ZipEntry entry;

        while ((entry = zipInputStream.getNextEntry()) != null) {

            File outputFile = new File(outputFolder, entry.getName());

            if (entry.isDirectory()) {
                outputFile.mkdirs();
            } else {

                File parent = outputFile.getParentFile();

                if (parent != null) {
                    parent.mkdirs();
                }

                try (FileOutputStream fileOutputStream =
                        new FileOutputStream(outputFile)) {

                    int length;

                    while ((length = zipInputStream.read(buffer)) > 0) {
                        fileOutputStream.write(buffer, 0, length);
                    }
                }
            }

            zipInputStream.closeEntry();
        }
    }
}
}
