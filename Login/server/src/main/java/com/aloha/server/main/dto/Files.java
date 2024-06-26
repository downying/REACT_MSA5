// 파일
package com.aloha.server.main.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.*;

@Data
public class Files {
    private int fileNo;
    private String parentTable;
    private int parentNo;
    private String fileName;
    private String originFileName;
    private String filePath;
    private long fileSize;
    private Date fileRegDate;
    private Date fileUpdDate;
    private int fileCode;

    private MultipartFile file;
}