package lk06.model;

import lk06.util.DBUtil;
import org.mariadb.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TodoModel {
    private String username;
    private String password;
    private String accountType;

    public TodoModel(String username, String password, String accountType) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
       
    }

    public TodoModel() {
      
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountType() {
        return accountType;
    }

    /**
     * Saves this model's data to the database.
     *
     * @return True if the data was successfully inserted; otherwise, false.
     */
    public boolean saveToDatabase() {
        String sql = "INSERT INTO users (username, password, account_type) VALUES (?, ?, ?)";

        try (Connection conn = (Connection) DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set the parameters for the SQL query
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, accountType);

            // Execute the update and return true if at least one row was affected
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean checkCredentials(String username, String password) {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";

        try (Connection conn = (Connection) DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Set parameters
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Execute query
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // Return true if a matching record is found
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Return false if no match is found or an exception occurs
    }

    
    
    
       public static String getFilmByID(String filmID) {
        String query = "SELECT film_name, genre, end_date, video_path FROM films WHERE film_id = ?";
        StringBuilder result = new StringBuilder();

        try (Connection conn = (Connection) DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, filmID);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String filmName = rs.getString("film_name");
                    String genre = rs.getString("genre");
                    java.sql.Date endDate = rs.getDate("end_date");
                    String videoPath = rs.getString("video_path");

                    // Build the result string to return
                    result.append("Film ID: ").append(filmID).append("\n")
                          .append("Film Name: ").append(filmName).append("\n")
                          .append("Genre: ").append(genre).append("\n")
                          .append("End Date: ").append(endDate).append("\n")
                          .append("Video Path: ").append(videoPath).append("\n");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;  // Return null in case of any error
        }

        return result.length() > 0 ? result.toString() : null;
    }
    
    
public static String getMostRecentFilm() {
    // Query to fetch the most recent film added to the database
    // Assuming 'film_id' is auto-incremented or there's a 'created_at' timestamp for the addition
    String query = "SELECT film_id, film_name, genre, end_date, video_path FROM films ORDER BY film_id DESC LIMIT 1";
    StringBuilder result = new StringBuilder();

    try (Connection conn = (Connection) DBUtil.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            String filmID = rs.getString("film_id");
            String filmName = rs.getString("film_name");
            String genre = rs.getString("genre");
            java.sql.Date endDate = rs.getDate("end_date");
            String videoPath = rs.getString("video_path");

            // Build the result string to return
            result.append("Film ID: ").append(filmID).append("\n")
                  .append("Film Name: ").append(filmName).append("\n")
                  .append("Genre: ").append(genre).append("\n")
                  .append("End Date: ").append(endDate).append("\n")
                  .append("Video Path: ").append(videoPath).append("\n");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        return null;  // Return null in case of any error
    }

    return result.length() > 0 ? result.toString() : null;
}

     
  public static void insertFilm(String filmID, String filmName, String genre, String endDate, String videoPath) {
    String insertSQL = "INSERT INTO films (film_id, film_name, genre, end_date, video_path) VALUES (?, ?, ?, ?, ?)";

    try (Connection connection = (Connection) DBUtil.getConnection();
         PreparedStatement ps = connection.prepareStatement(insertSQL)) {

        // Validate input data before inserting
        if (filmID == null || filmID.trim().isEmpty() || 
            filmName == null || filmName.trim().isEmpty() || 
            genre == null || genre.trim().isEmpty() || 
            endDate == null || endDate.trim().isEmpty() || 
            videoPath == null || videoPath.trim().isEmpty()) {
            System.out.println("Invalid data. Please check the input values.");
            return;
        }

        // Convert endDate String to java.sql.Date if necessary
        java.sql.Date sqlDate = java.sql.Date.valueOf(endDate);
        ps.setString(1, filmID);
        ps.setString(2, filmName);
        ps.setString(3, genre);
        ps.setDate(4, sqlDate);
        ps.setString(5, videoPath);

        // Execute the insert
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Film data has been added to the database successfully.");
        } else {
            System.out.println("No rows were inserted.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Failed to insert film data into the database.");
        System.out.println("Error message: " + e.getMessage());
        

    }}}


