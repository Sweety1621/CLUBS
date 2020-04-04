package com.example.my_dash.models;

import java.util.ArrayList;

public class CulClubs {
    public static String[][] data = new String[][] {
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
            {
                    "E-CELL",
                    "Overview",
                    "",
                    "",
                    "",
            },
    };

    public static ArrayList<CClubs> getListData() {
        CClubs cClubs;
        ArrayList<CClubs> list = new ArrayList<>();

        for (String[] mData : data) {
            cClubs = new CClubs();
            cClubs.setName(mData[0]);
            cClubs.setOverview(mData[1]);
            cClubs.setPhoto(mData[2]);
            cClubs.setDescription(mData[3]);


            list.add(cClubs);
        }

        return list;
    }


}
