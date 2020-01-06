package dao.entities.deprec;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Data
@Table(name ="tools")
public class Tool implements Serializable
{
    @Id
    private long idTool;
    private String nameTool;

    public Tool(){}


    public Tool(long idTool, String nameTool) {
        this.idTool = idTool;
        this.nameTool = nameTool;
    }


    @Override
    public String toString(){
        return String.format("(%d, %d)", this.idTool, this.nameTool);
    }
}
