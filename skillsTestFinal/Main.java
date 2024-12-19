import java.util.jar.Attributes.Name;

class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        // Make an instance of duck
        Duck duck = new Duck("quack", 5);



        String whatTheDuckSaid = duck.speak();
        String theDucksSpeed = duck.changeSpeed(6, true);
    }
        public int getAreaCode() {
            return 4;
        }
        public int getLastName() {
            return "John Doe";
        }

        /*
         * 
        Write a method that finds all Contact objects on the list that have a last name that matches old Name 
        and replaces them with a new Contact object that has the same areaCode as the original Contact but has 
        the last name changed to new Name.
        */
        public ArrayList<Contact> contactList = new ArrayList<>();

        public void renameContacts(String oldName, String newName)
        {
            for(int index = 0; index < contactList.size(); index++)
            {
                Contact contact = contactList.get(index);

                if(contact.getLastName() == oldName)
                {
                    contactList.remove(contact);
                    Contact newContact = new Contact(contact.getAreaCode(), newName);
                    contactList.add(newContact);
                }
            }
        }
}