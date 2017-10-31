package com.cleancode.coding.principles.exception.formatting;

import java.util.regex.*;

public class VerticalFormatting {

    public static final String REGEXP = "'''.+?'''";
    private static final Pattern pattern = Pattern.compile("'''(.+?)'''",
            Pattern.MULTILINE + Pattern.DOTALL
    );

    VerticalFormatting(String text) {
        Matcher match = pattern.matcher(text);
        match.find();
    }

    public String render() throws Exception {
        StringBuffer html = new StringBuffer("<b>");
        html.append(childHtml()).append("</b>");
        return html.toString();
    }

    public String childHtml(){
        return "TEST";
    }
}
