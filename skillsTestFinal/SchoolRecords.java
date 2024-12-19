public class SchoolRecords {
    private Arraylist<Student> listOfStudents;

    SchoolRecords(ArrayList<Student> students) {
    }

    // make a method that removes every student from the listOfStudents with an id number that is greater than 1000

 public void removeStudents()
 {
    for(int index = 0; index < listOfStudents.size(); index++)
    {
        Student student = listOfStudents.get(index);

        if(student.getStudentID > 1000)
        {
            listOfStudents.remove(Student);
        }
    }
 }
    
    // make a method that replaces an old id number with a new id number, takes in a new int id, and old int id number

    public void replaceIDNumber(int newID, int oldID)
    {
        for(int index = 0; index < listOfStudents.size();index++)
        {
            Student currentStudent = listOfStudents.get(index);

            if(currentStudent.getStudentID == oldID)
            {
                listOfStudents.remove(currentStudent);
                Student newStudent = new Student(newID, currentStudent.getStudentName());
                listOfStudents.add(newStudent);
            }
        }
    }

}