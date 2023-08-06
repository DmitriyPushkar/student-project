public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        while (true) {
                StudentOrder so = readStudentOrder();
                if(so==null){
                    break;
                }
                AnswerCityRegister cityAnswer = checkCityRegister(so);
                AnswerWedding wedAnswer = checkWedding(so) ;
                AnswerChildren childAnswer = checkChildren(so);
                AnswerStudent studentAnswer = checkStudent(so);
                Mail mail = sendMail(so);

            if(!cityAnswer.success){
                    //continue;
                    break;
                }
        }

    }
    static StudentOrder readStudentOrder(){
        StudentOrder so=new StudentOrder();
        return so;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1= new CityRegisterValidator();
        crv1.hostName="Host1";
        crv1.login="login1";
        crv1.password="password1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }
    static AnswerWedding checkWedding(StudentOrder so){
       WeddingAnswerValidator wav1=new WeddingAnswerValidator();
        wav1.hostName="Host1";
        wav1.login="login1";
        wav1.password="password1";
        AnswerWedding ans1=wav1.checkWedding(so);
        return ans1;
    }
    static AnswerChildren checkChildren(StudentOrder so){
       ChildrenAnswerValidator cav1=new ChildrenAnswerValidator();
        cav1.hostName="host1";
        cav1.login="host1";
        cav1.password="host1";
        AnswerChildren ans1= cav1.checkChildren(so);
        return ans1;

    }
    static AnswerStudent checkStudent(StudentOrder so){
       StudentAnswerValidator sav1=new StudentAnswerValidator();
        sav1.hostName="host1";
        sav1.login="host1";
        sav1.password="host1";
        AnswerStudent ans1= sav1.checkStudent(so);
        return ans1;

    }
    static Mail sendMail(StudentOrder so){
       MailSendValidator msv1=new MailSendValidator();
        msv1.hostName="host1";
        msv1.login="host1";
        msv1.password="host1";
        Mail mail1=msv1.sendMail(so);
        return mail1;
    }
}
