package builder.task;

import java.util.Date;

public class TaskProgram {

    public static void main(String[] args) {
        Task task = new Task();
        task.setId(1);
        task.setSummary("Summary 1");

        // ...

        Task task2 = Task.builder()
                .id(1)
                .description("Desc")
                .summary("SUmmary")
                .done(false)
                .dueDate(new Date())
                .build();

        System.out.println(task2);

        Task taskForTestDueDate = Task.builder()
                .dueDate(new Date())
                .build();

        // TODO: perform test
    }
}
