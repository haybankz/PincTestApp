package com.haybankz.pinctestapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Attributes {


    @SerializedName("text")
    private String text;

    @SerializedName("author_id")
    private int authorId;

    @SerializedName("category_id")
    private int categoryId;

    @SerializedName("anonymous")
    private boolean anonymous;

    @SerializedName("created_at")
    private Date createdAt;

    @SerializedName("updated_at")
    private Date updatedAt;

    @SerializedName("answer_count")
    private int answerCount;

    @SerializedName("locstion_display_name")
    private String locationDisplayName;

    @SerializedName("description")
    private String description;

    @SerializedName("address")
    private String address;

    @SerializedName("is_flagged")
    private boolean isFlagged;

    @SerializedName("votesup")
    private int votesUp;

    @SerializedName("votesdown")
    private int votesDown;

    @SerializedName("voted")
    private String voted;

    @SerializedName("author_info")
    private Author authorInfo;

    @SerializedName("sb_channel_url")
    private String sbChannelUrl;

    @SerializedName("picture_main")
    private String pictureMain;

    @SerializedName("sentiment_type")
    private String sentimentType;

    @SerializedName("aggregated_sentiment_count")
    private List<Sentiment> sentiments;

    @SerializedName("current_user_sentiment_id")
    private String currentUserSentimentId;

    @SerializedName("is_bookmarked_by_current")
    private boolean isBookmarkedByCurrent;

    @SerializedName("report_count")
    private int reportCount;

    @SerializedName("heat")
    private int heat;

    @SerializedName("sent_as_most_heated")
    private boolean sentAsMostHeated;


    public Attributes(String text, int authorId, int categoryId, boolean anonymous, Date createdAt,
                      Date updatedAt, int answerCount, String locationDisplayName, String description,
                      String address, boolean isFlagged, int votesUp, int votesDown, String voted,
                      Author authorInfo, String sbChannelUrl, String pictureMain, String sentimentType,
                      List<Sentiment> sentiments, String currentUserSentimentId, boolean isBookmarkedByCurrent,
                      int reportCount, int heat, boolean sentAsMostHeated) {
        this.text = text;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.anonymous = anonymous;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.answerCount = answerCount;
        this.locationDisplayName = locationDisplayName;
        this.description = description;
        this.address = address;
        this.isFlagged = isFlagged;
        this.votesUp = votesUp;
        this.votesDown = votesDown;
        this.voted = voted;
        this.authorInfo = authorInfo;
        this.sbChannelUrl = sbChannelUrl;
        this.pictureMain = pictureMain;
        this.sentimentType = sentimentType;
        this.sentiments = sentiments;
        this.currentUserSentimentId = currentUserSentimentId;
        this.isBookmarkedByCurrent = isBookmarkedByCurrent;
        this.reportCount = reportCount;
        this.heat = heat;
        this.sentAsMostHeated = sentAsMostHeated;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public String getLocationDisplayName() {
        return locationDisplayName;
    }

    public void setLocationDisplayName(String locationDisplayName) {
        this.locationDisplayName = locationDisplayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public int getVotesUp() {
        return votesUp;
    }

    public void setVotesUp(int votesUp) {
        this.votesUp = votesUp;
    }

    public int getVotesDown() {
        return votesDown;
    }

    public void setVotesDown(int votesDown) {
        this.votesDown = votesDown;
    }

    public String getVoted() {
        return voted;
    }

    public void setVoted(String voted) {
        this.voted = voted;
    }

    public Author getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(Author authorInfo) {
        this.authorInfo = authorInfo;
    }

    public String getSbChannelUrl() {
        return sbChannelUrl;
    }

    public void setSbChannelUrl(String sbChannelUrl) {
        this.sbChannelUrl = sbChannelUrl;
    }

    public String getPictureMain() {
        return pictureMain;
    }

    public void setPictureMain(String pictureMain) {
        this.pictureMain = pictureMain;
    }

    public String getSentimentType() {
        return sentimentType;
    }

    public void setSentimentType(String sentimentType) {
        this.sentimentType = sentimentType;
    }

    public String getCurrentUserSentimentId() {
        return currentUserSentimentId;
    }

    public void setCurrentUserSentimentId(String currentUserSentimentId) {
        this.currentUserSentimentId = currentUserSentimentId;
    }

    public boolean isBookmarkedByCurrent() {
        return isBookmarkedByCurrent;
    }

    public void setBookmarkedByCurrent(boolean bookmarkedByCurrent) {
        isBookmarkedByCurrent = bookmarkedByCurrent;
    }

    public int getReportCount() {
        return reportCount;
    }

    public void setReportCount(int reportCount) {
        this.reportCount = reportCount;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public boolean isSentAsMostHeated() {
        return sentAsMostHeated;
    }

    public void setSentAsMostHeated(boolean sentAsMostHeated) {
        this.sentAsMostHeated = sentAsMostHeated;
    }

    public List<Sentiment> getSentiments() {
        return sentiments;
    }

    public void setSentiments(List<Sentiment> sentiments) {
        this.sentiments = sentiments;
    }

}
