package com.trantien.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AdaptiveWordDTO { private String wordId;
    private String word;
    private int priority;
    private String pathway;
    private String wordBk;

}
