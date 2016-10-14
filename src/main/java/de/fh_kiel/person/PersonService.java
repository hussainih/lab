package de.fh_kiel.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moham on 10/8/2016.
 *
 * Create a class called PersonService. The service shall create some developers and project managers for internal use.
 * The PersonService shall have a public method to list all known developers or project managers sorted by name in an ascending order.
 * Furthermore,
 * the PersonService shall have a public method to search for a developer or a project manager using a programming language as query criterium.
 */
public class PersonService {

    Developer john, johny, jenny;
    ProjectManager boss, gross;

    List<EmployAble> employees = new ArrayList<EmployAble>();


    public void listEmployees(List<EmployAble> employees){

    }


    public static void main(String[] args){


    }
}
