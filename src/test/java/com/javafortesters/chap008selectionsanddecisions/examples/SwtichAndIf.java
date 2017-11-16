package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SwtichAndIf {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    @Test
    public void verifyCats(){
        assertEquals("2 == cats", "cats", catOrCats(1));
    }

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void altIf(){
        boolean truthy = false;
        if (truthy)
            assertTrue(truthy);
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
        // do nothing the url is fine
        }else{
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if(url.startsWith("http")){
// do nothing the url is fine
        }else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    @Test
    public void switchCountry(){
        assertEquals("United Kingdom", countryIs("uk"));
        assertEquals("Rest Of World", countryIs("ro"));
    }

    @Test
    public void switchInt(){
        assertEquals("one", numberIs(1));
        assertEquals("too small", numberIs(-4));
        assertEquals("too big", numberIs(44));
    }

    public String likelyGenderIs(String title){
        String likelyGender;
        switch(title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }

    public String countryIs(String title){
        String country;
        switch(title.toLowerCase()){
            case "uk":
                country = "United Kingdom";
                break;
            case "US”":
                country = "United States";
                break;
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            default:
                country = "Rest Of World";
                break;
        }
        return country;
    }


    public String numberIs(int number){
        String textNumber = "";
        if (number > 4)
            number = 5;
        if (number < 0)
            number = 0;

        switch(number){
            case 1:
                textNumber = "one";
                System.out.println(textNumber);
                break;
            case 4:
                textNumber = "four";
                System.out.println(textNumber);
                break;
            case 0:
                textNumber = "too small";
                System.out.println(textNumber);
                break;
            case 5:
                textNumber = "too big";
                System.out.println(textNumber);
                break;
            default:
                break;
        }
        return textNumber;
    }


    private String catOrCats(int x) {
        return  x != 1 ? "cats" : "cat";
    }

    private String addHttp(String url) {
        return "http://" + url;
    }
}
