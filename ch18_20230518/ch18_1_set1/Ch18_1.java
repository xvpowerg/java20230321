/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230518.ch18_1_set1;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_1 {
    public  static class MyComparator implements Comparator<Student>{
        private int sortOffset = 1;
        public int compare(Student st1,Student st2){
            int cmp = 0;
            if (st1.getScore1() > st2.getScore1()){
                cmp = 1;
            }else if(st1.getScore1() < st2.getScore1()){
                cmp = -1;
            }else if (st1.getScore2() > st2.getScore2()){
                cmp = 1;
            }else if(st1.getScore2() < st2.getScore2()){
                cmp = -1;
            }else{
                cmp = st1.getName().compareTo(st2.getName());
            }
            return cmp * sortOffset;
        }
        
        public void desc(){
            sortOffset = -1;
        }
        
        public void asc(){
             sortOffset = 1; 
        }
    }
    
    
    public static void main(String[] args) {
        Student st1 = new Student("Ken",95,81);
        Student st2 = new Student("Iris",76,93);
        Student st3 = new Student("Vivin",76,85);
        Student st4 = new Student("Doris",95,81);
        Student st5 = new Student("Tom",95,92);
       MyComparator cmp = new MyComparator();
       //預設小到大
       //cmp.desc()//大到小
       //cmp.asc()//小到大
       cmp.desc();
       TreeSet<Student> set = new  TreeSet(cmp);
       set.add(st1);
       set.add(st2);
       set.add(st3);
       set.add(st4);
       set.add(st5);
       System.out.println(set);
    }
    
}

