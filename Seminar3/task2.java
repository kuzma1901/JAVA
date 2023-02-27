package Seminar3;

import java.util.ArrayList;
import java.util.Collections;

    public class task2 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();

            list.add(2);
            list.add(1);
            list.add(3);
            list.add(6);

            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));
            
            //для среднего арифметического создаю новый массив, 
            //через arraylist не получилось, так как не находить list.length
            int num [] = {2, 1, 3, 6};
            double sum = 0;
            for (int x: num) {
            sum += x;
            }
                System.out.print("среднее арифметическое чисел равно: " + sum/num.length);
        }
 
    }
    


