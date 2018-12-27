package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "типы_стадий")
public class StageType implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String typeName;
    }

    {//Конструкторы сущности
        protected StageType() {}

        public StageType(String typeName) {
            this.typeName = typeName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getTypeName() {
            return this.typeName;
        }

        public void setTypeName(String typeName){
            this.typeName = typeName;
        }
    }
}