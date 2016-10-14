package de.fh_kiel.person;

/**
 * Created by moham on 10/8/2016.
 * Create a class called ProjectManager;
 * include members that represent years of experience in project management.
 * Since a ProjectManager is also a Developer, make sure, that the years of experience are not greater than the years of experience as a developer. Please explain again, which way of extension you used.
 */
public class ProjectManager implements EmployAble {

    private Developer developer;
    private int yearsOfExpInProj;

    public int getYearsOfExpInProj() {
        return yearsOfExpInProj;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = new Developer(developer);
    }

    public void setYearsOfExpInProj (int _yearsOfExpInProj) throws YearsOfExperienceException{
        if(_yearsOfExpInProj > developer.getYearOfExperience()){
            throw new YearsOfExperienceException("Years of experience in project Managment can not be more than development experience");

        }
        else{
            yearsOfExpInProj = _yearsOfExpInProj;
        }

    }
}


class YearsOfExperienceException extends Exception
{
    public YearsOfExperienceException(String message)
    {
        super(message);
    }
}
