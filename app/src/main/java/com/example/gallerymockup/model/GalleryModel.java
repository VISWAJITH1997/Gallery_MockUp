package com.example.gallerymockup.model;

public class GalleryModel {

    String galleryTitle;
    int imageURL;

    public GalleryModel(String galleryTitle, int imageURL) {
        this.galleryTitle = galleryTitle;
        this.imageURL = imageURL;
    }

    public String getGalleryTitle() {
        return galleryTitle;
    }

    public void setGalleryTitle(String galleryTitle) {
        this.galleryTitle = galleryTitle;
    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }
}
