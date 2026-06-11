/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tasktrackernew;
/**
 *
 * @author User
 */
public class Task {
    private int taskId;
    private String taskTitle;
    private String status;

   
    public Task(String taskTitle, String status) {
        this.taskTitle = taskTitle;
        this.status = status;
    }

    
    public Task(int taskId, String taskTitle, String status) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.status = status;
    }

   
    public int getTaskId() { return taskId; }
    public void setTaskId(int taskId) { this.taskId = taskId; }

    public String getTaskTitle() { return taskTitle; }
    public void setTaskTitle(String taskTitle) { this.taskTitle = taskTitle; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}