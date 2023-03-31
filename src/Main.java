import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите семисимвольное двоичное число");
        Scanner myscan = new Scanner(System.in);
        String bin = myscan.nextLine();
         if (!bin.matches("^[0-1]+$")){
            System.out.println("Ошибка не двоичное число");
        }else {
             if (bin.length()>7 || bin.length()<7){
                 System.out.println("Не семизначное число");
             }else{
                 String[] result = bin.split("");
                 Arrays.toString(result);
                 int r1 = Integer.parseInt(result[0]);
                 int r2 = Integer.parseInt(result[1]);
                 int i1 = Integer.parseInt(result[2]);
                 int r3 = Integer.parseInt(result[3]);
                 int i2 = Integer.parseInt(result[4]);
                 int i3 = Integer.parseInt(result[5]);
                 int i4 = Integer.parseInt(result[6]);
                 int S1 = r1^i1^i2^i4;
                 int S2 = r2^i1^i3^i4;
                 int S3 = r3^i2^i3^i4;

                 String str1 = String.valueOf(S1);
                 String str2 = String.valueOf(S2);
                 String str3 = String.valueOf(S3);
                 String S = (str1+str2+str3);
                 switch(S){
                     case "001":
                         System.out.println("Ошибка в r3");
                         if (r3 == 1){
                             String y = String.valueOf(result[0]+result[1]+result[2]+"0"+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf(result[0]+result[1]+result[2]+"1"+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case"010":
                         System.out.println("Ошибка в r2");
                         if (r2 == 1){
                             String y = String.valueOf(result[0]+"0"+result[2]+result[3]+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf(result[0]+"1"+result[2]+result[3]+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case "011":
                         System.out.println("Ошибка в i3");
                         if (i3 == 1){
                             String y = String.valueOf(result[0]+result[1]+result[2]+result[3]+result[4]+"0"+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf(result[0]+result[1]+result[2]+result[3]+result[4]+"1"+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case "100":
                         System.out.println("Ошибка в r1");
                         if (r1 == 1){
                             String y = String.valueOf("0"+result[1]+result[2]+result[3]+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf("1"+result[1]+result[2]+result[3]+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case "101":
                         System.out.println("Ошибка в i2");
                         if (i2 == 1){
                             String y = String.valueOf(result[0]+result[1]+result[2]+result[3]+"0"+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf(result[0]+result[1]+result[2]+result[3]+"1"+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case "110":
                         System.out.println("Ошибка в i1");
                         if (i1 == 1){
                             String y = String.valueOf(result[0]+result[1]+"0"+result[3]+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf(result[0]+result[1]+"1"+result[3]+result[4]+result[5]+result[6]);
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case "111":
                         System.out.println("Ошибка в i4");
                         if (i4 == 1){
                             String y = String.valueOf(result[0]+result[1]+result[2]+result[3]+result[4]+result[5]+"0");
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }else{
                             String y = String.valueOf(result[0]+result[1]+result[2]+result[3]+result[4]+result[5]+"1");
                             System.out.println("Правильное сообщение - "+y);
                             break;
                         }
                     case "000":
                         System.out.println("Нет ошибок");
                 }
             }
         }
    }
}