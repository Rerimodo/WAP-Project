package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "люди")
public class Person implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "имя", nullable = false)
        private String name;

//        @ManyToOne
        @JoinColumn(name = "стрн_ид", referencedColumnName = "ид")
        private Country country;

        @Column(name = "дата_рожд")
        private sql.Date birthDate;

        @Column(name = "рост")
        private int height;

        @Column(name = "вес")
        private int weight;
    }

    {//Конструкторы сущности
        protected Person() {}

        public Person(String name) {
            this.name = name;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getName(){
            return this.name;
        }

        public Country getCountry(){
            return this.country;
        }

        public sql.Date getBirthDate() {
            return this.birthDate;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWeight() {
            return this.weight;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setCountry(Country country){
            this.country = country;
        }

        public void setBirthDate(sql.Date birthDate){
            this.birthDate = birthDate;
        }

        public void setWeight(int weight){
            this.weight = weight;
        }

        public void setHeight(int height){
            this.height = height;
        }
    }
}