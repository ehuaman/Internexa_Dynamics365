package com.internexa.dynamics;

public class FileToUploadCouldNotBeFoundException extends RuntimeException {
    public FileToUploadCouldNotBeFoundException(String filePath) {
        super("File not found: " + filePath);
    }
}