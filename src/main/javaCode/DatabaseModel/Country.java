package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "страны")
public class Country implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String countryName;
    }

    {//Конструкторы сущности
        protected Country() {}

        public Country(String countryName) {
            this.countryName = countryName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getCountryName() {
            return this.countryName;
        }

        public void setCountryName(String countryName){
            this.countryName = countryName;
        }
    }
}