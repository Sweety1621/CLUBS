package com.example.my_dash.models;

import java.util.ArrayList;

public class DepClubs {
    public static String[][] data = new String[][] {

            {".EXE",
                    "Overview",
                    "https://scontent.fpat3-1.fna.fbcdn.net/v/t1.0-9/48376249_2181062101914579_6963114676649459712_n.jpg?_nc_cat=110&_nc_sid=dd9801&_nc_ohc=KCkSUvuuPaQAX-lthce&_nc_ht=scontent.fpat3-1.fna&oh=b9e2593d93c6c1d9803ac6b7e1f1e5e7&oe=5EAA2604",
                    "Team .EXE,the departmental team representing the Computer Science and Engineering Department at the Annual Technical Extravaganza of NIT Hamirpur, Nimbus.",
                    },
            {
                "C-HELIX",
                     "Overview",
                    "",
                    ""
            },
            {
                "CSEC",
                    "  ",
                    "",
                    ""
            },


    };

    public static ArrayList<DClubs> getListData() {
        DClubs dClubs;
        ArrayList<DClubs> list = new ArrayList<>();

        for (String[] mData : data) {
            dClubs = new DClubs();
            dClubs.setName(mData[0]);
            dClubs.setOverview(mData[1]);
            dClubs.setPhoto(mData[2]);
            dClubs.setDescription(mData[3]);


            list.add(dClubs);
        }

        return list;
    }

}
