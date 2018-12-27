package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "города")
public class City implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String cityName;

        @JoinColumn(name = "стрн_ид", nullable = false, referencedColumnName = "ид")
        private Country country;
    }

    {//Конструкторы сущности
        protected City() {}

        public City(String cityName, Country country) {
            this.cityName = cityName;
            this.country = country;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getCityName() {
            return this.cityName;
        }

        public String getCountry() {
            return this.country;
        }

        public void setCityName(String cityName){
            this.cityName = cityName;
        }

        public void setCountry(Country country){
            this.country = country;
        }
    }
}