package dao.entities.deprec;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
@Table(name="servises")
public class Servise implements Serializable {
    @Id
    private long idServise;
    private  String nameServise;

    public Servise(long idServise, String nameServise) {
        this.idServise = idServise;
        this.nameServise = nameServise;
    }
    @Override
    public String toString(){
        return String.format("(%d, %d)", this.idServise, this.nameServise);
    }

}
