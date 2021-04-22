import java.util.*;
import java.util.Scanner;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    HashMap<String, String> map = new HashMap<String, String>();

    int num;
    int i = 0;
    int end;
    String[] save_id = new String[8];
    String[] save_pw = new String[8];
    String[] save_name = new String[8];
    String id;
    String pw;
    String name;

    while(true)
 {
    System.out.print("1.회원 가입 2.회원 조회 3.회원 탈퇴 4.회원 수정 5.종료: "); 
    num = scan.nextInt();

    switch(num)
    {
      case 1 : 
      System.out.print("\n이름 입력:");
      name = scan.next();
      map.put(save_name[i],name);
      System.out.print("\n아이디 입력: ");
      id = scan.next();
      map.put(save_id[i],id);
      

      System.out.print("\n비밀번호 :");
      pw = scan.next(); 
      map.put(save_pw[i],pw);
      
      i++;
      break;
      
      case 2 : System.out.print("회원이름 입력:");
      name = scan.next();
      break;

      case 3 : System.out.print("아이디");
      break;
      
      case 4 : System.out.print("아이디 입력:");
      break;
      
      case 5 : System.out.print("프로그램 종료");
      System.exit(0);
      break;

    }

  }
 } 
}