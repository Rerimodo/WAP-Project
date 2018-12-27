package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "конференции")
public class Conferention implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String confName;
    }

    {//Конструкторы сущности
        protected Conferention() {}

        public Conferention(String confName) {
            this.confName = confName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getConfName() {
            return this.confName;
        }

        public void setConfhName(String confName){
            this.confName = confName;
        }
    }
}