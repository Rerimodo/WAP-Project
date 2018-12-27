package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "статистика")
@IdClass(VotingPK.class)
public class Voting implements Serializable {

    {//Столбцы таблицы
        @Id
        @JoinColumn(name = "сезон_ид", nullable = false, referencedColumnName = "ид")
        private Season season;

        @Id
        @JoinColumn(name = "члвк_ид", nullable = false, referencedColumnName = "ид")
        private Person voter;

        @Id
        @JoinColumn(name = "нагр_ид", nullable = false, referencedColumnName = "ид")
        private Award award;

        @JoinColumn(name = "игрок_ид", nullable = false, referencedColumnName = "ид")
        private Person player;
    }

    {//Конструкторы сущности
        protected Statistics() {}

        public Statistics(Season season, Person voter, Award award, Person player) {
            this.season = season;
            this.voter = voter;
            this.award = award;
            this.player = player;
        }
    }

    {//Методы для взаимодействия
        public Season getSeason(){
            return this.season;
        }
        public Person getVoter(){
            return this.voter;
        }
        public Award getAward(){
            return this.award;
        }
        public Person getPlayer(){
            return this.player;
        }

        public void setSeason(Season season){
            this.season = season;
        }
        public void setVoter(Person voter){
            this.voter = voter;
        }
        public void setAward(Award award){
            this.award = award;
        }
        public void setPlayer(Person player){
            this.player = player;
        }
    }
}
