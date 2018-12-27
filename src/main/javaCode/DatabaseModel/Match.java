package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "матчи")
public class Match implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @JoinColumn(name = "типм_ид", nullable = false, referencedColumnName = "ид")
        private MatchType matchType;

        @JoinColumn(name = "арена_ид", nullable = false, referencedColumnName = "ид")
        private Arena arena;

        @JoinColumn(name = "поб_ид", nullable = false, referencedColumnName = "ид")
        private Team winner;

        @JoinColumn(name = "про_ид", nullable = false, referencedColumnName = "ид")
        private Team loser;

        @Column(name = "дата", nullable = false)
        private sql.Date date;
    }

    {//Конструкторы сущности
        protected Match() {}

        public Match(MatchType matchType, Arena arena, Team winner, Team loser, sql.Date date) {
            this.matchType = matchType;
            this.arena = arena;
            this.winner = winner;
            this.loser = loser;
            this.date = date;
        }
    }

    {//Методы для взаимодействия
        public int getId(){
            return this.id;
        }
        public MatchType getMatchType(){
            return this.matchType;
        }
        public Arena getArena(){
            return this.arena;
        }
        public Team getWinner(){
            return this.winner;
        }
        public Team getLoser(){
            return this.loser;
        }
        public sql.Date getDate(){
            return this.date;
        }

        public void setMatchType(MatchType matchType){
            this.matchType = matchType;
        }
        public void setArena(Arena arena){
            this.arena = arena;
        }
        public void setWinner(Team winner){
            this.winner = winner;
        }
        public void setLoser(Team loser){
            this.loser = loser;
        }
        public void setDate(sql.Date date){
            this.date = date;
        }
    }
}
