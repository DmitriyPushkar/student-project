public class ChildrenAnswerValidator {
    String hostName;
    String login;
    String password;
     AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Дети проверяются "+hostName+","+login+","+password);
        AnswerChildren ans=new AnswerChildren();
        ans.success=false;
        return ans;
    }
}
