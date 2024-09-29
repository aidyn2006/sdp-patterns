package org.example.prototypeSdp;

public class TemplateDocument implements Document {
    private String title;
    private String pages;
    private String text;
    public TemplateDocument(String title, String pages, String text) {
        this.title = title;
        this.pages = pages;
        this.text = text;
    }
    public TemplateDocument(){}
    @Override
    public TemplateDocument cloneDocument() {
        return new TemplateDocument(this.title,this.pages,this.text);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TemplateDocument{" + "title='" + title + '\'' + ", pages='" + pages + '\'' + ", text='" + text + '\'' + '}';
    }
}
