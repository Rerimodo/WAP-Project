package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "арены")
public class Arena implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false, unique = true)
        private String name;

        @JoinColumn(name = "гор_ид", nullable = false, referencedColumnName = "ид")
        private City city;

        @Column(name = "постройка")
        private sql.Date buildDate;

        @Column(name = "вместимость")
        private int capacity;
    }

    {//Конструкторы сущности
        protected Arena() {}

        public Arena(String name, City city) {
            this.name = name;
            this.city = city;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getName(){
            return this.name;
        }

        public Country getCity(){
            return this.city;
        }

        public sql.Date getBuildDate() {
            return this.buildDate;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setCity(City city){
            this.city = city;
        }

        public void setBuildDate(sql.Date buildDate){
            this.buildDate = buildDate;
        }

        public void setCapacity(int capacity){
            this.capacity = capacity;
        }
    }
}