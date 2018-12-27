package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "позиции")
public class Position implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "короткое_название", unique = true)
        private String shortName;

        @Column(name = "название", nullable = false,  unique = true)
        private String posName;
    }

    {//Конструкторы сущности
        protected Position() {}

        public Position(String posName) {
            this.posName = posName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getPosName() {
            return this.posName;
        }

        public String getShortName() {
            return this.shortName;
        }

        public void setPosName(String posName){
            this.posName = posName;
        }

        public void setShortName(String shortName){
            this.shortName = shortName;
        }
    }
}