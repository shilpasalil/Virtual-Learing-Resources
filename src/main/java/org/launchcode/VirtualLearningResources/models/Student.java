package org.launchcode.VirtualLearningResources.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
public class Student extends AbstractEntity {
    @NotNull
    @NotBlank
    @Size(min = 8, max =20, message = "Invalid username. Must be between 8 to 20 characters")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 8, max =20, message = "Invalid password. Must be between 8 to 20 characters")
    private String password;

    private String verifyPassword;


    @NotNull
    private char grade;

    @ManyToMany
    private List<Teacher> teachers;

    @ManyToMany
    private List<Parent> parents;

    public Student() {}


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public char getGrade() {
        return grade;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }


    public List<Parent> getParents() {
        return parents;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}

