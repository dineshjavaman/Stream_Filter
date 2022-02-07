import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentEligibilityController {
    public static void main(String[] args) {

        StudentEligibilityService eservice=new StudentEligibilityService();

        ArrayList<StudentEligibilityDto> eliout =eservice.getPerson();
        //eliout.stream().collect(Collectors
        // .groupingBy(e -> e.getAge(), TreeMap::new, Collectors.toList())).lastEntry();
        ArrayList<StudentEligibilityDto> elifilter = (ArrayList<StudentEligibilityDto>) eliout.stream()
                .filter(it -> it.getAge()>18).collect(Collectors.toList());
        System.out.println(eliout.size());
        System.out.println(elifilter.size());
}}
