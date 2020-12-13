package spring.di;

import spring.di.entity.ChoiExam;
import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

  public static void main(String[] args) {
    
    //
    Exam exam = new ChoiExam();
    ExamConsole console = new GridExamConsole(exam);
    console.setExam(exam);
    //
    // 이 객체들 생성을 스프링에게 맡기고 싶다.
    // ChoiExam, GridExamConsole 은 바뀔 수 있는거니까.
    // setting.xml 에게 이것좀 해줄래? 라고 알려주자
    console.print();
  }
}
