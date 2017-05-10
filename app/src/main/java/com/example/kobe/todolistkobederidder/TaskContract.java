package com.example.kobe.todolistkobederidder;

/**
 * Created by kobe on 10/05/2017.
 */

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "ToDoLijst";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "items";

        public static final String COL_TASK_TITLE = "title";
    }
}