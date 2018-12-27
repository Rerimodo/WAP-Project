package databasemodel;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "роли")
public class Role implements Serializable {

    {//Столбцы таблицы
        @Id
        @GeneratedValue
        @Column(name = "ид")
        private int id;

        @Column(name = "название", nullable = false,  unique = true)
        private String roleName;
    }

    {//Конструкторы сущности
        protected Role() {}

        public Role(String roleName) {
            this.roleName = roleName;
        }
    }

    {//Методы для взаимодействия
        public int getID () {
            return this.id;
        }

        public String getRoleName() {
            return this.roleName;
        }

        public void setRoleName(String roleName){
            this.roleName = roleName;
        }
    }
}