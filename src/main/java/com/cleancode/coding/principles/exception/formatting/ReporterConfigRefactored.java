package com.cleancode.coding.principles.exception.formatting;

import com.cleancode.coding.principles.exception.model.Property;

import java.util.ArrayList;
import java.util.List;

public class ReporterConfigRefactored {

    private String reporterListenerClass;
    private List<Property> reporterListenerProperties = new ArrayList<Property>();

    public void addProperty(Property property) {
        reporterListenerProperties.add(property);
    }
}
