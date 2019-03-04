/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entity.pethospital.Event;
import entity.pethospital.Pet;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author caspe
 */
public class PetsDTO {

    private int id;
    private String name;
    private Date birth;
    private String species;
    private String owner;
    private List<String> eventList;

    public PetsDTO(Pet p) {
        this.id = p.getId();
        this.name = p.getName();
        this.birth = p.getBirth();
        this.species = p.getSpecies();
        this.owner = p.getOwner().toString();
        this.eventList = p.toStringList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getEventList() {
        return eventList;
    }

    public void setEventList(List<String> eventList) {
        this.eventList = eventList;
    }



}
