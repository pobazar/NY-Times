package com.example.androidacademy2.data_news;

import java.util.Date;

public class NewsItem {

    private final String title;
    private final String imageUrl;
    private final String category;
    private final String publishDate;
    private final String previewText;
    private final String fullText;
    private final String url;

    public NewsItem(String title, String imageUrl, String category, String publishDate, String previewText, String fullText, String url) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.category = category;
        this.publishDate = publishDate;
        this.previewText = previewText;
        this.fullText = fullText;
        this.url=url;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getPreviewText() {
        return previewText;
    }

    public String getFullText() {
        return fullText;
    }

    public String getUrl(){
        return url;
    }
}