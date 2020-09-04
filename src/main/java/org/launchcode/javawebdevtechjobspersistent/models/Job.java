package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Job extends AbstractEntity {
    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List<Skill> skills;
    //    private List<Skill> skills = new ArrayList<Skills>();
    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Iterable<Skill> getSkills() {
        return this.skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
