package me.abetayev.top10downloaderv2;

import java.util.ArrayList;

/**
 * Created by mmazb3 on 27.02.2018.
 */

public class ParseApplications {
    private static final String TAG = "ParseApplications";
    private ArrayList<FeedEntry> applications;

    public ParseApplications() {
        this.applications = new ArrayList<>(); // initialize Array List
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }

    public boolean parse(String xmlData) {
        boolean status = true;
        FeedEntry currentRecord;
        boolean inEntry = false;
        String textValue = "";

        try {


        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }
}
