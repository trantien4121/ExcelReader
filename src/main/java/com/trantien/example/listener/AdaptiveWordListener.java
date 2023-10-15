package com.trantien.example.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.trantien.example.data.AdaptiveWord;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdaptiveWordListener extends AnalysisEventListener<AdaptiveWord> {

    private List<AdaptiveWord> adaptiveWords;

    @Override
    public void invoke(AdaptiveWord adaptiveWord, AnalysisContext analysisContext) {
        adaptiveWords.add(adaptiveWord);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
