package com.example.brother_barbershop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Mens = new ArrayList<String>();
        Mens.add("MEN’s Haircut Basic");
        Mens.add("Specialty Cut");
        Mens.add("Beard & Mustache Trim");
        Mens.add("Beard Trim with Line Up");
        Mens.add("Buzz Cut");

        List<String> Womens = new ArrayList<String>();
        Womens.add("Haircut");
        Womens.add("Hair Colour");
        Womens.add("Hair Oil");

        List<String> Kids = new ArrayList<String>();
        Kids.add("Simple Cut");
        Kids.add("Semi Hair Color");
        Kids.add("Permanent Hair Color");


        expandableListDetail.put("Men Services", Mens);
        expandableListDetail.put("Women Services", Womens);
        expandableListDetail.put("Kids Services", Kids);
        return expandableListDetail;
    }


}
