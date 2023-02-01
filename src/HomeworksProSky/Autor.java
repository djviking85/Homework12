package HomeworksProSky;

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
}
