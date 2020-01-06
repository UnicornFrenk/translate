package dao.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language{
    public long idLanguage;
    public String nameLanguage;

    public Language (){}

    public Language(long idLanguage, String nameLanguage) {
        this.idLanguage = idLanguage;
        this.nameLanguage = nameLanguage;
    }

    public long getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(long idLanguage) {
        this.idLanguage = idLanguage;
    }

    public String getNameLanguage() {
        return nameLanguage;
    }

    public void setNameLanguage(String nameLanguage) {
        this.nameLanguage = nameLanguage;
    }
}
