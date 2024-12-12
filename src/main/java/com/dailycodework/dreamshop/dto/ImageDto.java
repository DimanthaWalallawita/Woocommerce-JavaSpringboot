package com.dailycodework.dreamshop.dto;

import lombok.Data;

@Data
public class ImageDto {
    private Long imageId;
    private String imageName;
    private String downloadURL;

    public void add(ImageDto imageDto) {
    }
}
