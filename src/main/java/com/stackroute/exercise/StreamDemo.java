package com.stackroute.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Places {

    private String country;
    private String city;
    public Places(String country,String city)
    {
        this.country=country;
        this.city=city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return city ;
    }
}

public  class StreamDemo{

    public static void main(String[] args){

        List<Places> list= new ArrayList<>();
        Places p1=new Places("Nepal","Kathamandu");
        Places p2=new Places("Nepal","Pokhara");
        Places p3=new Places("India","Delhi");
        Places p4=new Places("USA","New York");
        Places p5=new Places("Africa","Nigeria");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println(list.stream().filter(s->s.getCountry().startsWith("Nepal")).collect(Collectors.toList()));
    }
}