package com.company;
import java.lang.Comparable;
import java.util.*;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
    int id;
    String name;
    String address;
    public EmployeeDetails(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }

    public int compareTo(EmployeeDetails e){
        if(this.id>e.id){
            return 1;
        }
        else return -1;
    }
}

