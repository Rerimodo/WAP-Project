package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "награды")
public class Award implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String awardName;
    }

    {//Конструкторы сущности
        protected Award() {}

        public Award(String awardName) {
            this.awardName = awardName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getAwardName() {
            return this.awardName;
        }

        public void setAwardName(String awardName){
            this.awardName = awardName;
        }
    }
}