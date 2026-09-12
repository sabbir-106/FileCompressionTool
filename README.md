## Development Timeline

### Week 7 – Security Features and File Verification

In Week 7, a file verification feature was added to improve the reliability and integrity of compressed files. The system can check whether a ZIP file is valid and can be opened properly.

### Work Completed

- Added a `FileVerifier` utility class.
- Implemented ZIP file verification using Java's `ZipFile` class.
- Added a **Verify File** button to the graphical user interface.
- Implemented valid ZIP file checking.
- Implemented corrupted or invalid ZIP file detection.
- Added user-friendly messages for verification results.
- Tested the verification feature with both valid and corrupted ZIP files.

### File Verification

The `FileVerifier` class checks whether a selected ZIP file can be opened successfully.

If the ZIP file is valid, the system displays:

> File is valid and can be opened.

If the ZIP file is corrupted or invalid, the system displays:

> File is corrupted or invalid.

### Technologies Used

- Java
- Apache NetBeans
- Java Swing
- `java.util.zip.ZipFile`

### Week 7 Testing

| Test Case | Input | Expected Result | Status |
|-----------|-------|-----------------|--------|
| Valid ZIP | Valid `.zip` file | File is valid and can be opened | Passed |
| Invalid ZIP | Corrupted `.zip` file | File is corrupted or invalid | Passed |

### Week 7 Outcome

The file verification feature was successfully implemented and tested. The application can now identify valid ZIP files and detect corrupted or invalid ZIP files, improving the reliability and integrity of the compression tool.

---

## Current Project Features

- Graphical User Interface
- ZIP Compression
- ZIP Decompression
- Huffman Coding Compression
- RLE Compression
- File Verification
- Corrupted ZIP Detection
