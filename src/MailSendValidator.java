public class MailSendValidator {
    String hostName;
    String login;
    String password;
     Mail sendMail(StudentOrder so){
        System.out.println("Почта отправлена "+ hostName+","+login+","+password);
        Mail mail=new Mail();
        mail.success=false;
        return mail;
    }



}
