package whatsnew.sealedclasses;

import java.util.Date;

//non sealed es par aindicar que es una clase normal, puede omitirse
public non-sealed class Employee extends Person {
    public Date getHiredDate() {
        return new Date();
    }
}
