# File Compression Tool

## Week 5 Progress Report

### Project Overview

File Compression Tool is a Java-based application designed to compress and decompress files using different compression techniques. The project is being developed using Java and Apache NetBeans.

---

## Week 5: Huffman Coding Compression

### Objectives

- Implement Huffman Coding compression.
- Create the Huffman Tree.
- Generate Huffman codes.
- Count the frequency of bytes in a file.
- Test Huffman compression separately before connecting it to the GUI.

---

## Work Completed

### 1. Huffman Package

A new `Huffman` package was created to organize the Huffman Coding related classes.

### 2. HuffmanNode Class

Created `HuffmanNode.java` to represent nodes of the Huffman Tree.

The class contains:

- Byte data
- Frequency
- Left child
- Right child
- Leaf node checking

### 3. HuffmanCompressor Class

Created `HuffmanCompressor.java` to implement the Huffman compression algorithm.

The compressor includes:

- Byte frequency counting
- Priority Queue
- Huffman Tree construction
- Huffman code generation
- Binary data encoding
- Compressed file creation

### 4. Huffman Testing

Created `HuffmanTest.java` to test the Huffman compression module separately before integrating it with the main GUI.

---

## Current Project Structure

```text
FileCompressionTool
│
├── Compression
│   └── ZipCompressor.java
│
├── Decompression
│   └── ZipDecompressor.java
│
├── GUI
│   └── MainFrame.java
│
├── Huffman
│   ├── HuffmanNode.java
│   ├── HuffmanCompressor.java
│   └── HuffmanTest.java
│
└── Utils
