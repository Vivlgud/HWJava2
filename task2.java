package Java.HWork2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

/* К калькулятору из предыдущего дз добавить логирование.*/

public class task2 {
    public static void main(String[] args) throws Exception {
        String flag;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = sc.nextInt();
            System.out.print("Введите арифметическое действие (+,-,*,/): ");
            String action = sc.next();

            int res=0;
            String sp = " ";
            String prn=num1 + sp + action + sp + num2 + " = " ;

            switch (action) {
                case "+":
                    res = num1 + num2;
                    System.out.println(prn+res);
                    break;

                case "-":
                    res = num1 - num2;
                    System.out.println(prn+res);
                    break;

                case "*":
                    res = num1 * num2;
                    System.out.println(prn+res);
                    break;

                case "/":
                    if (num2 != 0) {
                        double res1 = (double)num1 / (double)num2;
                        System.out.println(prn+res1);
                        break;
                    } else {
                        System.out.println("Делить на ноль нельзя.");
                        break;
                    }
                }

        Logger logger = Logger.getLogger(task2.class.getName());
        logger.log(Level.INFO, "Вычисление прошло успешно");
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        System.out.print("Нажмите (q) для выхода или любой символ для продолжения: ");
        flag = sc.next();
        if (flag.equals("q")) break;  
        }
        sc.close();

        
    }

}
