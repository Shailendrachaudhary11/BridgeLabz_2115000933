class Task{
     int taskID;
     String taskName;
     int taskPriority;
     String duedate;
    Task next;
    public Task(int taskID, String taskName, int taskPriority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskPriority = taskPriority;
        this.duedate = duedate;
        this.next = null;
    }

}
class TaskSchedulerList {
    private Task head;
    private Task tail;

    public void addAtStarting(int taskID, String taskName, int taskPriority, String dueDate) {
        Task t1 = new Task(taskID, taskName, taskPriority, dueDate);
        if (head == null) {
            head = t1;
            tail = t1;
            t1.next = head;
        } else {
            t1.next = head;
            head = t1;
            tail.next = head;
        }
    }

    public void addAtEnding(int taskID, String taskName, int taskPriority, String dueDate) {
        Task t1 = new Task(taskID, taskName, taskPriority, dueDate);
        if (head == null) {
            head = t1;
            tail = t1;
            t1.next = head;
        } else {
            tail.next = t1;
            tail = t1;
            tail.next = head;
        }
    }

    public void addAtPosition(int taskID, String taskName, int taskPriority, String dueDate, int position) {
        Task t1 = new Task(taskID, taskName, taskPriority, dueDate);
        if (position == 1) {
            addAtStarting(taskID, taskName, taskPriority, dueDate);
        }
        Task temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == head) {
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }
        t1.next = temp.next;
        temp.next = t1;
    }
    public void removeTaskById(int id){
        Task temp=head;
        Task prev=null;
        do {
            if (temp.taskID == id) {
                if (prev == null) {
                    if (head == tail) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }

                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    public void displayDetails() {
        Task temp = head;
        do{
            System.out.println("taskId: " + temp.taskID + " ,TaskName: " + temp.taskName + " ,priority: " + temp.taskPriority);
            temp = temp.next;
        }while (temp != head);
    }
    public boolean serachByPriority(int pri){
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.taskPriority == pri) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);

        return false;
    }
}
public class CircularLinkedTaskScheduler {
    public static void main(String[] args) {
        TaskSchedulerList taskList=new TaskSchedulerList();
        taskList.addAtStarting(1,"Task A",2,"12-02-2023");
        taskList.addAtStarting(2,"Task B",1,"3-2-2023");
        taskList.addAtStarting(3,"Task C",7,"22-02-2023");
        taskList.addAtStarting(4,"Task D",7,"22-02-2023");
        taskList.displayDetails();
        System.out.println();
        taskList.removeTaskById(2);
        taskList.displayDetails();
        System.out.println();
        boolean flag=taskList.serachByPriority(2);
        if(!flag) System.out.println("No Found");
        else System.out.println("Found");
    }
}

