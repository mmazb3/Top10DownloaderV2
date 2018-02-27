package me.abetayev.top10downloaderv2;

/**
 * Created by mmazb3 on 27.02.2018.
 *
 * This class holds data from downloaded XML file
 */

public class FeedEntry {

    private String name;                 // name of the app
    private String artist;               // app author
    private String releaseDate;
    private String summary;              // app description
    private String imageURL;             // image

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return  "name = " + name + '\n' +
                "artist = " + artist + '\n' +
                "releaseDate = " + releaseDate + '\n' +
                "imageURL = " + imageURL + '\n';
    }
}
