package minkyu1219;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
       private int seq;
       private int number;
       private String name;
       private String accountNumber;
       private int money;
       private int totalmoney;
       private int i;
       private String aN=null;
       private boolean run = true;
      Scanner scan = new Scanner(System.in);
      
      ArrayList <Bank> list = new ArrayList<Bank>();
      Bank(){
         
      }
      Bank(int number,String name,String accountNumber  ){
         this.name = name;
         this.accountNumber = accountNumber;
         this.number = number;
      }
      @Override
      public String toString() {
         return "Bank [ number=" + number + ", name=" + name + ", accountNumber=" + accountNumber
               + "]";
      }
      //0.�����ڸ� �̿��� ����� ����
      void registration() {      
      }      
      //1.getter , setter�� �̿��� ����� ����
      void registration1() {         
      }
      //2. �����ϋ��� ����
      void balance() {
         System.out.println("���¹�ȣ���Է��ϼ���");
         aN = scan.next();
         for(i=0 ; i< list.size() ; i++) {
            if(aN.equals(list.get(i).accountNumber)){
               System.out.println("������ �ݾ��� �Է��ϼ���.");
               money = scan.nextInt();
               list.get(i).number += money;
               System.out.println("�ܾ� >" + list.get(i).number + "��");
            }   
           }
         }
      //3.����϶��� ����
      void withdraw() {
         System.out.println("���¹�ȣ���Է��ϼ���");
         aN = scan.next();
         for(i=0 ; i< list.size() ; i++) {
            if(aN.equals(list.get(i).accountNumber)){
               System.out.println("����� �ݾ��� �Է��ϼ���.");
               money = scan.nextInt();
               if(list.get(i).number > money) {
               list.get(i).number -= money;
               }
               else {
                  System.out.println("�ܰ������մϴ�.");   
               }
               System.out.println("�ܾ� >" + list.get(i).number + "��");
            }   
           }
         }
      
      //4. �ܾ� Ȯ�� ����
      void balance1() {
         System.out.println("���¹�ȣ���Է��ϼ���");
         aN = scan.next();
         for(i=0 ; i< list.size() ; i++) {
            if(aN.equals(list.get(i).accountNumber)){
              System.out.println("�ܾ� >" + list.get(i).number + "��");
            }   
           }
      }      
      //5.������ Ȯ�� ����   
      void check() {
         System.out.println(name+ number+ accountNumber);
         }   
      //7.���α׷� ���� ����
      boolean end() {
         System.out.println("���α׷��� �����մϴ�.");
         return false;
      }
      //setter, getter �޼ҵ�
      public int getNumber() {
         return number;
      }

      public void setNumber(int number) {
         this.number = number;
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public String getAccountNumber() {
         return accountNumber;
      }

      public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
      }
      
      
      
}