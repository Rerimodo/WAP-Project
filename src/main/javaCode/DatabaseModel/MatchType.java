package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "типы_матчей")
public class MatchType implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String matchName;
    }

    {//Конструкторы сущности
        protected MatchType() {}

        public MatchType(String matchName) {
            this.matchName = matchName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getMatchName() {
            return this.matchName;
        }

        public void setMatchName(String matchName){
            this.matchName = matchName;
        }
    }
}