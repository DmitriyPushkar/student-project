public class StudentAnswerValidator {
    String hostName;
    String login;
    String password;
     AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются "+hostName+","+login+","+password);
        AnswerStudent ans=new AnswerStudent();
        ans.success=false;
        return ans;
    }
}
