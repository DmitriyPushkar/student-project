import java.sql.SQLOutput;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so=new StudentOrder();
        so.hFirstName="Alex";
        so.hLastName="Petrov";
        so.wFirstName="Galina";
        so.wLastName="Petrova";
        StudentOrder so1=new StudentOrder();
        so1.hFirstName="Alex";
        so1.hLastName="Petrov";
        so1.wFirstName="Galina";
        so1.wLastName="Petrova";
        long ans=saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer;
        answer =199;
        System.out.println("saveStudentOrder:"+studentOrder.hLastName);

        return answer;
    }

}
