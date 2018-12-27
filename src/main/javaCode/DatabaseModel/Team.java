package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "команды")
public class Team implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false, unique = true)
        private String name;

        @JoinColumn(name = "див_ид", nullable = false, referencedColumnName = "ид")
        private Division division;

        @JoinColumn(name = "гор_ид", nullable = false, referencedColumnName = "ид")
        private City city;

        @JoinColumn(name = "арена_ид", nullable = false, referencedColumnName = "ид")
        private Arena arena;

        @Column(name = "основание")
        private sql.Date foundationDate;

        @Column(name = "вступление_в_нба")
        private sql.Date entryDate;
    }

    {//Конструкторы сущности
        protected Team() {}

        public Team(String name, Division division, City city, Arena arena) {
        //стоит ли оставлять конструктор с полями которые могут быть Null(begin и end)?
            this.name = name;
            this.division = division;
            this.city = city;
            this.arena = arena;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getName(){
            return this.name;
        }

        public Division getDivision(){
            return this.division;
        }

        public City getCity(){
            return this.city;
        }

        public Arena getArena(){
            return this.arena;
        }

        public sql.Date getFoundationDate() {
            return this.foundationDate;
        }

        public sql.Date getEntryDate() {
            return this.entryDate;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setDivision(Division division){
            this.division = division;
        }

        public void setCity(City city){
            this.city = city;
        }

        public void setArena(Arena arena){
            this.arena = arena;
        }

        public void setFoundationDate(sql.Date foundationDate) {
            this.foundationDate = foundationDate;
        }

        public void setEntryDate(sql.Date entryDate) {
            this.entryDate = entryDate;
        }
    }
}