package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotNull
    @Size(
            min = 3,
            max = 250
    )
    private String description;
    @ManyToMany(
            mappedBy = "skills"
    )
    private List<Job> jobs = new ArrayList<Job>();
//    private List<Job> jobs = new ArrayList<Job>();

    public Skill() {
    }

    public List<Job> getJobs() {
        return this.jobs;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
