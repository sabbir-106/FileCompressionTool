## Week 4 Progress Report

## Project Overview

File Compression Tool is a Java-based application that aims to compress and decompress files using different compression techniques. The project is developed as a learning project to understand file handling, compression algorithms, and GUI application development.

---

# Week 4 Completed Tasks

## 1. ZIP Decompression Module

A ZIP decompression module was implemented using Java's built-in ZIP libraries.

Implemented features:

* ZIP file reading
* File extraction
* Folder extraction
* Output folder selection
* File handling during extraction

---

## 2. ZipDecompressor Class

A new `ZipDecompressor.java` class was created inside the `Decompression` package.

The class is responsible for:

* Opening ZIP files
* Reading ZIP entries
* Creating folders when required
* Extracting files
* Saving extracted files to the selected output folder

---

## 3. Decompression GUI Integration

The existing **Decompress** button in the GUI was connected with the new decompression module.

The application now allows users to:

1. Click the **Decompress** button.
2. Select a `.zip` file.
3. Select an output folder.
4. Extract the files from the ZIP archive.

---

## 4. File Selection

`JFileChooser` was implemented for easier file and folder selection.

Users can now select:

* ZIP files for decompression
* Output folders for extracted files

---

## 5. Error Handling

Basic error handling was added using `try-catch` and `IOException`.

The application displays an error message if a problem occurs during the decompression process.

---

**Build Status: BUILD SUCCESS ✅**

---

# Week 4 Status

**Completed ✅**
