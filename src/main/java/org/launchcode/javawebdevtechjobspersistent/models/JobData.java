package org.launchcode.javawebdevtechjobspersistent.models;

import java.util.ArrayList;
import java.util.Iterator;

public class JobData {
    public JobData() {
    }

    public static ArrayList<Job> findByColumnAndValue(String column, String value, Iterable<Job> allJobs) {
        ArrayList<Job> results = new ArrayList();
        if (value.toLowerCase().equals("all")) {
            return (ArrayList)allJobs;
        } else if (column.equals("all")) {
            results = findByValue(value, allJobs);
            return results;
        } else {
            Iterator var4 = allJobs.iterator();

            while(var4.hasNext()) {
                Job job = (Job)var4.next();
                String aValue = getFieldValue(job, column);
                if (aValue != null && aValue.toLowerCase().contains(value.toLowerCase())) {
                    results.add(job);
                }
            }

            return results;
        }
    }

    public static String getFieldValue(Job job, String fieldName) {
        String theValue;
        if (fieldName.equals("name")) {
            theValue = job.getName();
        } else if (fieldName.equals("employer")) {
            theValue = job.getEmployer().toString();
        } else {
            theValue = job.getSkills().toString();
        }

        return theValue;
    }

    public static ArrayList<Job> findByValue(String value, Iterable<Job> allJobs) {
        ArrayList<Job> results = new ArrayList();
        Iterator var3 = allJobs.iterator();

        while(var3.hasNext()) {
            Job job = (Job)var3.next();
            if (job.getName().toLowerCase().contains(value.toLowerCase())) {
                results.add(job);
            } else if (job.getEmployer().toString().toLowerCase().contains(value.toLowerCase())) {
                results.add(job);
            } else if (job.getSkills().toString().toLowerCase().contains(value.toLowerCase())) {
                results.add(job);
            }
        }

        return results;
    }
}
