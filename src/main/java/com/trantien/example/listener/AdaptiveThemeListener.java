package com.trantien.example.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.trantien.example.data.AdaptiveTheme;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdaptiveThemeListener extends AnalysisEventListener<AdaptiveTheme> {
    private List<AdaptiveTheme> adaptiveThemes;

    @Override
    public void invoke(AdaptiveTheme adaptiveTheme, AnalysisContext analysisContext) {
        adaptiveThemes.add(adaptiveTheme);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
