package builder.task;

import java.util.Date;

// Bug, Feature, Story, ...
public class Task {

    private int id;
    private String summary;
    private String description;
    private boolean done;
    private Date dueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", dueDate=" + dueDate +
                '}';
    }

    public static TaskBuilder builder() {
        return new TaskBuilder();
    }

    public static class TaskBuilder {

        private int id;
        private String summary;
        private String description;
        private boolean done;
        private Date dueDate;

        public TaskBuilder id(int id) {
            this.id = id;
            return this;
        }

        public TaskBuilder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public TaskBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder done(boolean done) {
            this.done = done;
            return this;
        }

        public TaskBuilder dueDate(Date dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Task build() {
            Task task = new Task();
            task.setId(id);
            task.setSummary(summary);
            task.setDescription(description);
            task.setDone(done);
            task.setDueDate(dueDate);

            return task;
        }
    }
}
