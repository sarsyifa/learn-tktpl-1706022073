package id.ac.ui.cs.mobileprogramming.syifa.lab1.models;

public class Movie {
    private String title;
    private String directors;
    private String writers;
    private String casts;

    public Movie(String title, String directors, String writers, String casts) {
        this.title = title;
        this.directors = directors;
        this.writers = writers;
        this.casts = casts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String name) {
        this.directors = name;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String name) {
        this.writers = name;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String name) {
        this.casts = name;
    }
}
