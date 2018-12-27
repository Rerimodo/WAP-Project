package databasemodel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "стадии")
public class Stage implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

//        @ManyToOne
        @JoinColumn(name = "сезон_ид", nullable = false, referencedColumnName = "ид")
        private Season season;

        @JoinColumn(name = "типс_ид", nullable = false, referencedColumnName = "ид")
        private StageType stageType;

        @Column(name = "начало", unique = true)
        private sql.Date start;

        @Column(name = "конец", unique = true)
        private sql.Date end;
    }

    {//Конструкторы сущности
        protected Stage() {}

        public Stage(Season season, StageType stageType) {
            this.season = season;
            this.stageType = stageType;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public Season getSeason(){
            return this.season;
        }

        public StageType getStageType(){
            return this.stageType;
        }

        public sql.Date getBeginDate() {
            return this.begin;
        }

        public sql.Date getEndDate() {
            return this.end;
        }

        public void setSeason(Season season){
            this.season = season;
        }

        public void setStageType(StageType stageType){
            this.stageType = stageType;
        }

        public void setBeginDate(sql.Date begin){
            this.begin = begin;
        }

        public void setEndDate(sql.Date end){
            this.end = end;
        }
    }
}