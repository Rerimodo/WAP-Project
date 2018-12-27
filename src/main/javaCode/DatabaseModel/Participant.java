package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "участники")
@IdClass(ParticipantPK.class)
public class Participant implements Serializable {

    {//Столбцы таблицы
        @Id
        @JoinColumn(name = "члвк_ид", nullable = false, referencedColumnName = "ид")
        private Person person;

        @Id
        @JoinColumn(name = "кмнд_ид", nullable = false, referencedColumnName = "ид")
        private Team team;

        @Id
        @JoinColumn(name = "роль_ид", nullable = false, referencedColumnName = "ид")
        private Role role;

        @JoinColumn(name = "поз_ид", referencedColumnName = "ид")
        private Position position;

        @Column(name = "номер")
        private int number;

        @Column(name = "начало", nullable = false)
        private sql.Date begin;

        @Column(name = "конец", nullable = false)
        private sql.Date end;
    }

    {//Конструкторы сущности
        protected Participant() {}

        public Participant(Person person, Team team, Role role, sql.Date begin, sql.Date end) {
            this.person = person;
            this.team = team;
            this.role = role;
            this.begin = begin;
            this.end = end;
        }
    }

    {//Методы для взаимодействия
        public Person getPerson(){
            return this.person;
        }
        public Team getTeam(){
            return this.team;
        }
        public Role getRole(){
            return this.role;
        }
        public Position getPosition(){
            return this.position;
        }
        public int getNumber(){
            return this.number;
        }
        public sql.Date getBeginDate(){
            return this.begin;
        }
        public sql.Date getEndDate(){
            return this.end;
        }

        public void setPerson(Person person){
            this.person = person;
        }
        public void setTeam(Team team){
            this.team = team;
        }
        public void setRole(Role role){
            this.role = role;
        }
        public void setPosition(Position position){
            this.position = position;
        }
        public void setNumber(int number){
            this.number = number;
        }
        public void setBeginDate(sql.Date begin){
            this.begin = begin;
        }
        public void setEndDate(sql.Date end){
            this.end = end;
        }
    }
}
