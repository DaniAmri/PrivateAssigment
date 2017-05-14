package id.sch.smktelkom_mlg.privateassignment.xirpl608.movie1;

/**
 * Created by dani on 5/14/2017.
 */

public class Movie_list {
    private String image;
    private String judul;
    private String popular;

    public Movie_list(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }

}
