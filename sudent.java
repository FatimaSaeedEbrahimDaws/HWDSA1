public class sudent {

        public    int id;
        public    String name;
        public sudent(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public sudent() {
            this.id = 0;
            this.name = "";
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return
                    "(" + id +
                            "," + name  +
                            ")";
        }
    }

