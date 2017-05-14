package id.sch.smktelkom_mlg.privateassignment.xirpl608.movie1;

import java.io.Serializable;

/**
 * Created by dani on 5/14/2017.
 */

public class OfflineListItem implements Serializable {
    public String imageUrl;
    public String head;
    // private String desc;

    public OfflineListItem(String imageUrl, String head) {
        this.imageUrl = imageUrl;
        this.head = head;

    }


//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public String getHead() {
//        return head;
//    }

    // public String getDesc() {
    // return desc;
    //}
}


