package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "сезоны")
public class Season implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "начало", nullable = false,  unique = true)
        private sql.Date start;

        @Column(name = "конец", unique = true)
        private sql.Date end;
    }

    {//Конструкторы сущности
        protected Season() {}

        public Season(sql.Date begin) {
            this.begin = begin;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public sql.Date getBeginDate() {
            return this.begin;
        }

        public sql.Date getEndDate() {
            return this.end;
        }

        public void setBeginDate(sql.Date begin){
            this.begin = begin;
        }

        public void setEndDate(sql.Date end){
            this.end = end;
        }
    }
}