package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "статистика")
@IdClass(StatisticsPK.class)
public class Statistics implements Serializable {

    {//Столбцы таблицы
        @Id
        @JoinColumn(name = "стад_ид", nullable = false, referencedColumnName = "ид")
        private Stage stage;

        @Id
        @JoinColumn(name = "кмнд_ид", nullable = false, referencedColumnName = "ид")
        private Team team;

        @Column(name = "побед")
        private int wins;

        @Column(name = "поражений")
        private int losses;
    }

    {//Конструкторы сущности
        protected Statistics() {}

        public Statistics(Stage stage, Team team) {
            this.stage = stage;
            this.team = team;
        }
    }

    {//Методы для взаимодействия
        public Stage getStage(){
            return this.stage;
        }
        public Team getTeam(){
            return this.team;
        }
        public int getWins(){
            return this.wins;
        }
        public int getLosses(){
            return this.losses;
        }

        public void setStage(Stage stage){
            this.stage = stage;
        }
        public void setTeam(Team team){
            this.team = team;
        }
        public void setWins(int wins){
            this.wins = wins;
        }
        public void setLosses(int losses){
            this.losses = losses;
        }
    }
}
