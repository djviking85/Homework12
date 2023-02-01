package HomeworksProSky;

import java.util.Objects;

public class Autor {
        private String firstName;
         private String secondName;
        private int birhday;

        public Autor(String firstName, String secondName, int birhday) {
                this.firstName = firstName;
                this.secondName = secondName;
                this.birhday = birhday;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getSecondName() {
                return secondName;
        }

        public int getBirhday() {
                return birhday;
        }

        public String toString() {
                return " (toString) Имя Автора - " + this.firstName + " , Фамилия - " + this.secondName + " , дата выпуска автора - " + this.birhday;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Autor autor = (Autor) o;
                return birhday == autor.birhday && firstName.equals(autor.firstName) && secondName.equals(autor.secondName);
        }

        @Override
        public int hashCode() {
                return Objects.hash(firstName, secondName, birhday);
        }
}
