import org.dilrajspdemo.demo.BeanConfig;
import org.dilrajspdemo.demo.Doctor;
import org.dilrajspdemo.demo.Nurse;
import org.dilrajspdemo.demo.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = (Doctor)context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);
//        Staff nurse = (Nurse)context.getBean(Nurse.class);
//        nurse.assist();
//        System.out.println(((Doctor) doctor).getQualification());
    }
}