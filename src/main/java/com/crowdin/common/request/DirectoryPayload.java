package com.crowdin.common.request;

public class DirectoryPayload implements Request {
    private String branchId;
    private String parentId;
    private String name;
    private String title;
    private String exportPattern;
    private String priority;

    private DirectoryPayload() {
    }

    public DirectoryPayload(String branchId, String parentId, String name, String title, String exportPattern, String priority) {
        this.branchId = branchId;
        this.parentId = parentId;
        this.name = name;
        this.title = title;
        this.exportPattern = exportPattern;
        this.priority = priority;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExportPattern() {
        return exportPattern;
    }

    public void setExportPattern(String exportPattern) {
        this.exportPattern = exportPattern;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
