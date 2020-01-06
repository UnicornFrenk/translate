package dao.entities;

import lombok.Data;


@Data
public class Translator {

    private long idTranslator;
    private String nameTranslator;
    private long experienceYear;
    private String email;
    private String connectionNumber;


    public Translator() {
    }

    public Translator(long idTranslator, String nameTranslator, long experienceYear, String email, String connectionNumber) {
        this.idTranslator = idTranslator;
        this.nameTranslator = nameTranslator;
        this.experienceYear = experienceYear;
        this.email = email;
        this.connectionNumber = connectionNumber;

    }

    public long getIdTranslator() {
        return idTranslator;
    }

    public void setIdTranslator(long idTranslator) {
        this.idTranslator = idTranslator;
    }

    public String getNameTranslator() {
        return nameTranslator;
    }

    public void setNameTranslator(String nameTranslator) {
        this.nameTranslator = nameTranslator;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConnectionNumber() {
        return connectionNumber;
    }

    public void setConnectionNumber(String connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public long getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(long experienceYear) {
        this.experienceYear = experienceYear;
    }


}


