package com.trantien.example.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.trantien.example.data.Theme;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThemeListener extends AnalysisEventListener<Theme> {
    private List<Theme> themes;

    @Override
    public void invoke(Theme adaptiveTheme, AnalysisContext analysisContext) {
        themes.add(adaptiveTheme);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
