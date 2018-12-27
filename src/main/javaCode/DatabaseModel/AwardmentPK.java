package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

public class AwardentPK implements Serializable {

    {//Столбцы составного ключа
        private int season;
        private int award;
    }

    {//Конструкторы
        public AwardentPK() {}
    }

    {//Переопределенные методы
        @Override
        public boolean equals(Object o){
            if(!o.getClass().equals(this.getClass()))
                return false;
            AwardentPK apk = (AwardentPK)o;
            return apk.season == season && apk.award == award;
        }
        @Override
        public int hashCode(){
            return super.hashCode();
        }
    }
}