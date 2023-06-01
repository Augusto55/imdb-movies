package com.api.crud_imdb;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie_basics")
public class Movie {
    @Id
    @Column(name="tconst")
    @GenericGenerator(name="custom_id", strategy = "com.api.crud_imdb.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id")
    private String tconst;
    @Column(name="titletype")
    private String titleType;
    @Column(name="primarytitle")
    private String primaryTitle;
    @Column(name="originaltitle")
    private String originalTitle;
    @Column(name="isadult")
    private Integer isAdult;
    @Column(name="startyear")
    private Integer startYear;
    @Column(name="endyear")
    private Integer endYear;
    @Column(name="runtimeminutes")
    private Integer runtimeMinutes;
    @Column(name="genres")
    private String genres;


    public Movie() {
    }

    public Movie(String tconst, String titleType, String primaryTitle, String originalTitle, Integer isAdult, Integer startYear, Integer endYear, Integer runtimeMinutes, String genres) {
        this.tconst = tconst;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.endYear = endYear;
        this.runtimeMinutes = runtimeMinutes;
        this.genres = genres;
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryType) {
        this.primaryTitle = primaryType;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalType) {
        this.originalTitle = originalType;
    }

    public Integer getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(Integer isAdult) {
        this.isAdult = isAdult;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }


}

