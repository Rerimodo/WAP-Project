package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

public class VotingPK implements Serializable {

    {//Столбцы составного ключа
        private int season;
        private int voter;
        private int award;
    }

    {//Конструкторы
        public VotingPK() {}
    }

    {//Переопределенные методы
        @Override
        public boolean equals(Object o){
            if(!o.getClass().equals(this.getClass()))
                return false;
            VotingPK vpk = (VotingPK)o;
            return vpk.season == season && vpk.voter == voter && vpk.award == award;
        }
        @Override
        public int hashCode(){
            return super.hashCode();
        }
    }
}