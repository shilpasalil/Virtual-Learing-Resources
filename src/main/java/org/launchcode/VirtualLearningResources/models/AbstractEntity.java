package org.launchcode.VirtualLearningResources.models;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.size;
import java.util.Objects;

@MappedSuperclass

public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(max = 50, message ="Max 50 chars for name")
    private String name;


    protected AbstractEntity() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractEntity)) return false;
        AbstractEntity that = (AbstractEntity) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

