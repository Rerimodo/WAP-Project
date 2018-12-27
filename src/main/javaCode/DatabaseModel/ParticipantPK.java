package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

public class ParticipantPK implements Serializable {

    {//Столбцы составного ключа
        private int person;
        private int team;
        private int role;
    }

    {//Конструкторы
        public ParticipantPK() {}
    }

    {//Переопределенные методы
        @Override
        public boolean equals(Object o){
            if(!o.getClass().equals(this.getClass()))
                return false;
            ParticipantPK ppk = (ParticipantPK)o;
            return ppk.person == person && ppk.team == team && ppk.role == role;
        }
        @Override
        public int hashCode(){
            return super.hashCode();
        }
    }
}