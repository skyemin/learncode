package com.wei.learncode.qrcode;

import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
public class SealCircle {
    private Integer line;
    private Integer width;
    private Integer height;

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}

