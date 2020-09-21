package com.deroahe.playgroundbackend.playground_back_end.data;

import org.springframework.data.annotation.Id;

public class ToDo {

    @Id
    private String id;
    private String title;
    private Boolean completed;

    public ToDo(String id, String title, Boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
