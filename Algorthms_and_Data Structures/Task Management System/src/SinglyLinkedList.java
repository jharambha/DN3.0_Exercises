public class SinglyLinkedList {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId().equals(taskId)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Adding tasks
        taskList.addTask(new Task("T001", "Design the module", "In Progress"));
        taskList.addTask(new Task("T002", "Implement the module", "Not Started"));
        taskList.addTask(new Task("T003", "Test the module", "Not Started"));

        // Traverse tasks
        System.out.println("All tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("Searching for task T002:");
        Task task = taskList.searchTask("T002");
        System.out.println(task != null ? task : "Task not found");

        // Delete a task
        System.out.println("Deleting task T002:");
        taskList.deleteTask("T002");

        // Traverse tasks after deletion
        System.out.println("All tasks after deletion:");
        taskList.traverseTasks();
    }
}
