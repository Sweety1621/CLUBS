package com.example.my_dash.models;

import java.util.ArrayList;

public class TechClubs {
    public static String[][] data = new String[][] {

            {
                "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                "FINANCE",
                    "Overview",
                    "",
                    "",
                    "",
            },

            {
                "ISTE",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                "ORGANISATION COMMITEE",
                    "Overview",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2FOrganizationnith%2F&psig=AOvVaw1TPgHCCf5nov5yRphPnXwL&ust=1586027946810000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMiu2tn8zOgCFQAAAAAdAAAAABAS",
                    "",
                    "",
            },
            {
                "OJAS",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                "OJAS",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                "OJAS",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                "OJAS",
                    "Overview",
                    "",
                    "",
                    "",
            },

    };

    public static ArrayList<TClubs> getListData() {
        TClubs tClubs;
        ArrayList<TClubs> list = new ArrayList<>();

        for (String[] mData : data) {
            tClubs = new TClubs();
            tClubs.setName(mData[0]);
            tClubs.setOverview(mData[1]);
            tClubs.setPhoto(mData[2]);
           tClubs.setDescription(mData[3]);


            list.add(tClubs);
        }

        return list;
    }


}
