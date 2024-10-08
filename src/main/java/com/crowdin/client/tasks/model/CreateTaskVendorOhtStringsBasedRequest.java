package com.crowdin.client.tasks.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateTaskVendorOhtStringsBasedRequest extends AddTaskStringsBasedRequest {

    private TypeVendor type;
    private String vendor;
    private String expertise;
    @Deprecated
    private Boolean skipUntranslatedStrings;
    private Boolean editService;
    private Boolean includePreTranslatedStringsOnly;
    @Deprecated
    private Boolean includeUntranslatedStringsOnly;
}
