package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

public class StatisticsPK implements Serializable {

    {//Столбцы составного ключа
        private int stage;
        private int team;
    }

    {//Конструкторы
        public StatisticsPK() {}
    }

    {//Переопределенные методы
        @Override
        public boolean equals(Object o){
            if(!o.getClass().equals(this.getClass()))
                return false;
            StatisticsPK spk = (StatisticsPK)o;
            return spk.stage == stage && spk.team == team;
        }
        @Override
        public int hashCode(){
            return super.hashCode();
        }
    }
}