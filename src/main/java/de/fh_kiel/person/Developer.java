package de.fh_kiel.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moham on 10/8/2016.
 *
 * Create a class called Developer; include members that represent years of experience,
 * minimum salary and all programming languages, that the developer has experience with.
 * A Developer is a Person. Explain, which way of extension (composition or inheritance) you used.
 */
public class Developer extends Person {
    private int yearOfExperience;
    private double minSalary;
    private List<String> proLanguages = new ArrayList<String>(); //use Set instead of List<>

    public Developer(Developer dev){
        this.setFirstName(dev.getFirstName());
        this.setLastName(dev.getLastName());
        this.setAge(dev.getAge());
        this.setMinSalary(dev.getMinSalary());
        this.setYearOfExperience(dev.getYearOfExperience());
        this.setProLanguages(dev.getProLanguages());

    }
    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public List<String> getProLanguages() {
        return proLanguages;
    }

    public void setProLanguages(List<String> proLanguages) {
        this.proLanguages = proLanguages;
    }



    public String toString() {
        return new ToStringBuilder(this).
                append(super.toString()).
                append("years of Experience ", this.yearOfExperience).
                append("minimum salary", this.minSalary).
                append("Programing Language Experience", proLanguages.toString()).
                toString();
    }
}
