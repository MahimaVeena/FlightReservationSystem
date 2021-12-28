public class Contact {
        public String name;
        public long phoneNumber;
        public String emailId;

        public Contact(String name, long phoneNumber, String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
        }


    }

