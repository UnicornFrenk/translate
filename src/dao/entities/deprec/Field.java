package dao.entities.deprec;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name="fields")
public class Field{
    @Id
    private long idField;
    private String nameField;


    public Field(){

    }


    public Field(long idField, String nameField) {
        this.idField = idField;
        this.nameField = nameField;
    }


    @Override
    public String toString(){
        return String.format("(%d, %d)", this.idField, this.nameField);
    }
}
