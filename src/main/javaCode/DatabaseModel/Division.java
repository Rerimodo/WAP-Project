package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "дивизионы")
public class Division implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String divName;

        @JoinColumn(name = "конф_ид", nullable = false, referencedColumnName = "ид")
        private Conferention conf;
    }

    {//Конструкторы сущности
        protected Division() {}

        public Division(String divName, Conferention conf) {
            this.divName = divName;
            this.conf = conf;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getCityName() {
            return this.divName;
        }

        public String getConferention() {
            return this.conf;
        }

        public void setDivName(String divName){
            this.divName = divName;
        }

        public void setConferention(Conferention conf){
            this.conf = conf;
        }
    }
}