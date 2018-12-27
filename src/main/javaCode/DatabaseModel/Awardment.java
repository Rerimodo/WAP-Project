package databasemodel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "награждения")
@IdClass(AwardmentPK.class)
public class Awardment implements Serializable {

    {//Столбцы таблицы
        @Id
        @JoinColumn(name = "сезон_ид", nullable = false, referencedColumnName = "ид")
        private Season season;

        @Id
        @JoinColumn(name = "нагр_ид", nullable = false, referencedColumnName = "ид")
        private Award award;

        @JoinColumn(name = "члвк_ид", referencedColumnName = "ид")
        private Person person;
    }

    {//Конструкторы сущности
        protected Awardment() {}

        public Awardment(Season season, Award award) {
            this.season = season;
            this.award = award;
        }
    }

    {//Методы для взаимодействия
        public Season getSeason () {
            return this.season;
        }

        public Award getAward(){
            return this.award;
        }

        public Person getPerson(){
            return this.person;
        }

        public void setSeason(Season season){
            this.season = season;
        }

        public void setAward(Award award){
            this.award = award;
        }

        public void setPerson(Person person){
            this.person = person;
        }
    }
}
