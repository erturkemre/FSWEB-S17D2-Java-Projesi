package com.workintech.s17d2.model;

import com.workintech.s17d2.tax.Taxable;

public class DeveloperFactory {
    public static Developer createDeveloper(Developer developer, Taxable taxable){
        Developer createdDeveloper = null;
        if(developer.getExperience().name().equalsIgnoreCase("junior")){
            createdDeveloper = new JuniorDeveloper(developer.getId(), developer.getName(), developer.getSalary()-(developer.getSalary()*taxable.getSimpleTaxRate())/100);
        }else if(developer.getExperience().name().equalsIgnoreCase("mid")){
            createdDeveloper = new JuniorDeveloper(developer.getId(), developer.getName(), developer.getSalary()-(developer.getSalary()*taxable.getMiddleTaxRate())/100);
        } else if (developer.getExperience().name().equalsIgnoreCase("senior")) {
            createdDeveloper = new JuniorDeveloper(developer.getId(), developer.getName(), developer.getSalary()-(developer.getSalary()*taxable.getUpperTaxRate())/100);
        }
        return createdDeveloper;

    }
}
