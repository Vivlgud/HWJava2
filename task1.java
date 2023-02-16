package Java.HWork2;
/* Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.*/
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;


public class task1 {
    public static void main(String[] args) {
        
        int[] arr=new int[10];
        

        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*10);
        }
        try (FileWriter writer = new FileWriter("log_task1.txt")) {
            System.out.println(Arrays.toString(arr));
            writer.write("Исходный массив: \n");
            writer.write(String.valueOf(Arrays.toString(arr)));
            writer.write(String.valueOf("\n"));

            boolean isSort=false;
            int temp;

            while(!isSort){
                isSort=true;
                for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i]>arr[i+1]) {
                        isSort=false;
                        temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
        writer.write(String.valueOf("\n")); 
        writer.write(String.valueOf(Arrays.toString(arr)));
           
            }
        writer.write(String.valueOf("\n")); 
        System.out.println(Arrays.toString(arr));
        writer.write(String.valueOf("Результат:\n"));
        writer.write(String.valueOf(Arrays.toString(arr)));
        writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}




