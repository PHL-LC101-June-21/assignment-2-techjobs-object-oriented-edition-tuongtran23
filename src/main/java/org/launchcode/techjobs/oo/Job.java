package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public Location getLocation() {
        return location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public int getId() {
        return id;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setEmployer(Employer newEmployer) {
        this.employer = newEmployer;
    }
    public void setLocation(Location newLocation) {
        this.location = newLocation;
    }
    public void setPositionType(PositionType newPositionType) {
        this.positionType = newPositionType;
    }
    public void setCoreCompetency(CoreCompetency newCoreCompetency) {
        this.coreCompetency = newCoreCompetency;
    }

    @Override
    public String toString() {
        return
                "\nID: " + id +
                "\nName: " + ((this.getName() == null) ? "Data not available" : this.getName()) +
                "\nEmployer: " + ((this.getEmployer().getValue() == "") ? "Data not available" : this.getEmployer().getValue()) +
                "\nLocation: " + ((this.getLocation().getValue() == "") ? "Data not available" : this.getLocation().getValue()) +
                "\nPosition Type: " + ((this.getPositionType().getValue() == "") ? "Data not available" : this.getPositionType().getValue()) +
                "\nCore Competency: " + ((this.getCoreCompetency().getValue() == "") ? "Data not available" : this.getCoreCompetency().getValue()) + "\n";
    }
}
