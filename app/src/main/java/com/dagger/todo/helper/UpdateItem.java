package com.dagger.todo.helper;

import android.support.annotation.Nullable;

import com.dagger.todo.data.ToDo;

import java.util.ArrayList;

/**
 * Created by Asif Ali on 1/31/2017
 */


public interface UpdateItem {

    void updateItem(ToDo toDo, @Nullable Integer index);

    void displayItem(ToDo toDo, int index);

    void itemDeleted(ArrayList<ToDo> toDos);

    void displayUndoSnackbar(int position, ToDo removed);
}
