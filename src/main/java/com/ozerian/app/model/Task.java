package com.ozerian.app.model;

/**
 * This class is for representation of task model.
 */
public class Task {

    private String name;

    private String category;

    private boolean status;

    /**
     * Empty default constructor.
     */
    public Task() {

    }

    /**
     * Constructor for the task model.
     *
     * @param name String task name.
     * @param category String task category.
     * @param status boolean status of the task "done" or "not done".
     */
    public Task(String name, String category, boolean status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    /**
     * Get task name.
     *
     * @return String task name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set task name.
     *
     * @param name String task name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get task category.
     *
     * @return String task category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Set task category.
     *
     * @param category String task category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Get task status.
     *
     * @return boolean task status.
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Set task status.
     *
      * @param status boolean task status.
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
}
