import java.util.ArrayList;

public class StudentEligibilityService {

    public ArrayList<StudentEligibilityDto> getPerson() {
        StudentEligibilityDto person = new StudentEligibilityDto();
        person.setName("dinesh");
        person.setAge(21);
        person.setPlace("devahanapatti");

        StudentEligibilityDto person1 = new StudentEligibilityDto();
        person1.setName("selva");
        person1.setAge(26);
        person1.setPlace("peryakulam");

        StudentEligibilityDto person2 = new StudentEligibilityDto();
        person2.setName("muthu");
        person2.setAge(17);
        person2.setPlace("theni");

        StudentEligibilityDto person3 = new StudentEligibilityDto();
        person3.setName("kumaresh");
        person3.setAge(16);
        person3.setPlace("periyakulam");

        ArrayList<StudentEligibilityDto> eout = new ArrayList<StudentEligibilityDto>();
        eout.add(person);
        eout.add(person1);
        eout.add(person2);
        eout.add(person3);
        return eout;

    }}
