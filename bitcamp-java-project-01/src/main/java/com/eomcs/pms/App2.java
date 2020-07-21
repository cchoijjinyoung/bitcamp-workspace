package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        class Member {
            int no;
            String name;
            String email;
            String password;
            String photo;
            String tel;
            Date registeredDate;

        }

        System.out.println("[회원]");

        Scanner keyboardScan = new Scanner(System.in);

        final int LENGTH = 100;
        Member[] members = new Member[LENGTH];

        int size = 0;
        for (int i = 0; i < 100; i++) {
            Member member = new Member();

            System.out.print("번호? ");
            member.no = Integer.parseInt(keyboardScan.nextLine());

            System.out.print("이름? ");
            member.name = keyboardScan.nextLine();

            System.out.print("이메일? ");
            member.email = keyboardScan.nextLine();

            System.out.print("암호? ");
            member.password = keyboardScan.nextLine();

            System.out.print("사진? ");
            member.photo = keyboardScan.nextLine();

            System.out.print("전화? ");
            member.tel = keyboardScan.nextLine();

            member.registeredDate = new java.sql.Date(System.currentTimeMillis());

            members[i] = member;

            size++;
            System.out.println();

            System.out.print("계속 입력하시겠습니까?(y/N) ");
            String str = keyboardScan.nextLine();
            if (!str.equalsIgnoreCase("y")) {
                break;
            }
            System.out.println();
        }
    
        keyboardScan.close();

        System.out.println("---------------------------");

        for (int i = 0; i < size; i++) {
            System.out.printf("%d, %s, %s, %s, %s\n",
            members[i].no,
            members[i].name,
            members[i].email,
            members[i].tel,
            members[i].registeredDate
            );
        }   
                    
                    
    }


}