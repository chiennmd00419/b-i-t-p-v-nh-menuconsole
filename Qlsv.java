/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;


import java.util.Scanner;
/**
 *
 * @author chien
 */
public class Qlsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
          System.out.println("Menu quản lý sinh viên");
          System.out.println("1.Hiển Thị Danh Sách Sinh Viên ");
          System.out.println("2.Thêm Mới Sinh Viên");
          System.out.println("3.Sửa Sinh Viên");
          System.out.println("4.Xóa Sinh Viên");
          System.out.println("5.Thoát");
          System.out.println(" Bạn Chọn Số :");
          
         int x = scan.nextInt();
         switch(x){
            case 1 : 
                 System.out.println("bạn đã chọn hiển thị sinh viên");
                  break;
            case 2 : 
                 System.out.println("bạn đã chọn thêm mới một sinh viên");
                  break;
            case 3 : 
                 System.out.println("bạn đã chọn sửa  sinh viên");
                  break;
            case 4 : 
                 System.out.println("bạn đã chọn xóa sinh viên");
                  break;
            default:
                      System.out.println(" bạn đã chon sai");
                  
             
         }
         
          
                  
          
      };
    }
    

