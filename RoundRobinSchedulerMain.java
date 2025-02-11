import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Process {
    int processID;
    int burstTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add a process at the end of the circular linked list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head; // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // Maintain circular link
        }
    }

    // Remove a process after execution
    private void removeProcess(int processID) {
        if (head == null) return;

        Process current = head, prev = null;

        do {
            if (current.processID == processID) {
                if (current == head && current == tail) { // Only one process
                    head = tail = null;
                } else if (current == head) { // Remove head process
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) { // Remove tail process
                    prev.next = head;
                    tail = prev;
                } else { // Remove in between
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display process queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        Process temp = head;
        System.out.println("\nCurrent Process Queue:");
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void executeScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalTime = 0;
        Queue<Process> queue = new LinkedList<>();
        Process current = head;
        do {
            queue.add(current);
            current = current.next;
        } while (current != head);

        System.out.println("\n=== Round Robin Scheduling Execution ===");
        while (!queue.isEmpty()) {
            Process process = queue.poll();

            int executionTime = Math.min(process.burstTime, timeQuantum);
            System.out.println("Executing Process " + process.processID + " for " + executionTime + " units");

            totalTime += executionTime;
            process.burstTime -= executionTime;

            if (process.burstTime == 0) {
                process.turnAroundTime = totalTime;
                process.waitingTime = process.turnAroundTime - executionTime;
                removeProcess(process.processID);
            } else {
                queue.add(process); // Re-add if not finished
            }

            displayProcesses();
        }

        calculateAverageTimes();
    }

    // Calculate and Display Average Waiting Time & Turnaround Time
    private void calculateAverageTimes() {
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int count = 0;

        Process temp = head;
        if (temp == null) return;

        do {
            totalWaitingTime += temp.waitingTime;
            totalTurnaroundTime += temp.turnAroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        double avgWaitingTime = (double) totalWaitingTime / count;
        double avgTurnaroundTime = (double) totalTurnaroundTime / count;

        System.out.println("\n=== Scheduling Summary ===");
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
}

public class RoundRobinSchedulerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int timeQuantum = scanner.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        // Add some processes for simulation
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.addProcess(4, 6, 2);

        scheduler.displayProcesses();
        scheduler.executeScheduling();

        scanner.close();
    }
}
