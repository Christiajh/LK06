/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk06.repository;

import lk06.model.TodoModel;

/**
 *
 * @author ASUS
 */
public class TodoRepo {
    
    
    
    
     public boolean saveTodo(TodoModel todo) {
        return todo.saveToDatabase();
    }
    
       public boolean validateCredentials(String username, String password) {
        // Call TodoModel to check credentials
        TodoModel todoModel = new TodoModel();
        return todoModel.checkCredentials(username, password);
    }
       
     public void addFilm(String filmID, String filmName, String genre, String endDate, String videoPath) {
    // Pass the data to TodoModel for database insertion
    TodoModel.insertFilm(filmID, filmName, genre, endDate, videoPath);
}
   public String getFilmByID(String filmID) {
        // Call TodoModel to fetch the film data
        return TodoModel.getFilmByID(filmID);
    }
     
   public String getMostRecentFilm() {
    return TodoModel.getMostRecentFilm();
}

}
