package homework.task_46;

import java.io.File;

public class Task_46_Beautiful_Output {


    public static void filesSort(File files, int level) {
        for (File file : files.listFiles()) {
            for (int i = 0; i < level; i++)
                System.out.print(" ");
            System.out.println(file.getName());
            if (file.isDirectory())
                filesSort(file, level + 1);
        }
    }
}
