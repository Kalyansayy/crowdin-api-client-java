package com.crowdin.client.screenshots.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AutoTagReplaceTagsRequest extends ReplaceTagsRequest {

    private Boolean autoTag;
    private Long fileId;
    private Long branchId;
    private Long directoryId;
}
