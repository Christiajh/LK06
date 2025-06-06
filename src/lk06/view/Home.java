/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lk06.view;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lk06.repository.TodoRepo;
import lk06.util.DBUtil;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import java.io.File;

import javax.swing.Timer; // Import the Timer class
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {
     
      private boolean notificationActive = false;
    
    public Home() {
        initComponents();
         setLocationRelativeTo(null);
         loadData(); 
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panelCover1 = new lk06.component.PanelCover();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Film");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete Film");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sort Film");

        jButton5.setText("Edit Film");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Recycle Bin");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Notification");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCover1Layout = new javax.swing.GroupLayout(panelCover1);
        panelCover1.setLayout(panelCover1Layout);
        panelCover1Layout.setHorizontalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCover1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(panelCover1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCover1Layout.setVerticalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCover1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCover1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCover1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String filmID = jTextField1.getText().trim();

    // Check if the input is empty
    if (filmID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Isi Kolom Pencarian", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create an instance of TodoRepo to handle the database operation
    TodoRepo todoRepo = new TodoRepo();

    // Search for the film by ID
    String filmDetails = todoRepo.getFilmByID(filmID);

    // Display the result in jTextArea1
    if (filmDetails != null) {
        jTextArea1.setText(filmDetails);
    } else {
        jTextArea1.setText("Film not found with ID: " + filmID);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String filmID = JOptionPane.showInputDialog(this, "Enter the Film ID:");
    if (filmID == null || filmID.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Film ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get Film Name from user
    String filmName = JOptionPane.showInputDialog(this, "Enter the Film Name:");
    if (filmName == null || filmName.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Film Name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the genre from the user with choices: Horror, Drama
    String[] genres = {"Horror", "Drama"};
    String genre = (String) JOptionPane.showInputDialog(this, "Select Genre:", "Genre",
            JOptionPane.QUESTION_MESSAGE, null, genres, genres[0]);
    if (genre == null) {
        JOptionPane.showMessageDialog(this, "Genre must be selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create a JDateChooser for the end date
    JDateChooser dateChooser = new JDateChooser();
    int option = JOptionPane.showConfirmDialog(this, dateChooser, "Select End Date", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    if (option != JOptionPane.OK_OPTION || dateChooser.getDate() == null) {
        JOptionPane.showMessageDialog(this, "End Date selection is required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the selected date from the JDateChooser
    Date selectedDate = dateChooser.getDate();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String endDate = dateFormat.format(selectedDate);

    // Let the user select a video file
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select Video File");
    int fileOption = fileChooser.showOpenDialog(this);

    if (fileOption != JFileChooser.APPROVE_OPTION) {
        JOptionPane.showMessageDialog(this, "No video file selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File videoFile = fileChooser.getSelectedFile();
    String videoPath = videoFile.getAbsolutePath();

    // Format the input into a readable list
    String formattedText = "ID Film: " + filmID + "\n" +
                           "Film Name: " + filmName + "\n" +
                           "Genre: " + genre + "\n" +
                           "End Date: " + endDate + "\n" +
                           "Video Path: " + videoPath + "\n\n";

    // Append the formatted text to the existing text in JTextArea
    jTextArea1.append(formattedText);

    // Automatically scroll to the bottom after appending
    jTextArea1.setCaretPosition(jTextArea1.getDocument().getLength());

    // Add the data to the database using TodoRepo
    TodoRepo todoRepo = new TodoRepo();
    todoRepo.addFilm(filmID, filmName, genre, endDate, videoPath);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
 jTextArea1.setEditable(false);
   loadData();  // Membuat JTextArea tidak dapat diedit
    }//GEN-LAST:event_jTextArea1AncestorAdded

     private void loadData() {
    Connection connection = null;
    java.sql.Statement statement = null;
    java.sql.ResultSet resultSet = null;

    try {
        // Get connection from DBUtil
        connection = (Connection) lk06.util.DBUtil.getConnection(); 
        statement = connection.createStatement();
        
        // Updated SQL query to fetch the necessary columns
        String query = "SELECT film_id, film_name, genre, end_date, video_path FROM films";
        resultSet = statement.executeQuery(query);

        // StringBuilder to build the data string
        StringBuilder data = new StringBuilder();
        
        // Process the result set
        while (resultSet.next()) {
            String filmID = resultSet.getString("film_id");  // Added film_id
            String filmName = resultSet.getString("film_name");
            String genre = resultSet.getString("genre");
            java.sql.Date endDate = resultSet.getDate("end_date");
            String videoPath = resultSet.getString("video_path");  // Added video_path

            // Append data to StringBuilder
            data.append("Film ID: ").append(filmID).append("\n")  // Show film ID
                .append("Film Name: ").append(filmName).append("\n")
                .append("Genre: ").append(genre).append("\n")
                .append("End Date: ").append(endDate).append("\n")
                .append("Video Path: ").append(videoPath).append("\n\n");  // Show video path
        }

        // Display the data in JTextArea
        jTextArea1.setText(data.toString());

    } catch (SQLException e) {
        e.printStackTrace();  // Log the error
        jTextArea1.setText("Error fetching data from the database.");
    } finally {
        // Close resources
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            lk06.util.DBUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       this.dispose();  // Close the current window
    Login loginScreen = new Login();  // Create a new instance of the Login screen
    loginScreen.setVisible(true); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    
 

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

  private void triggerButtonNotificationEffect() {
        // Store the original button text
        String originalText = jButton8.getText();

        // Change the button color to indicate a notification
        jButton8.setBackground(new java.awt.Color(0, 255, 0)); // Green color for success (or any color you prefer)
        jButton8.setText("NEW"); // Temporarily change button text to "NEW"

        // Timer to reset the button back to normal after a short delay (e.g., 2 seconds)
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset button color and text after delay
                jButton8.setBackground(new java.awt.Color(240, 240, 240)); // Default background color
                jButton8.setText(originalText); // Reset button text back to original
            }
        });
        timer.setRepeats(false); // The timer should not repeat
        timer.start(); // Start the timer
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       String filmData = new TodoRepo().getMostRecentFilm();

        if (filmData != null) {
            // Show an info message with the film data, indicating it was just added
            JOptionPane.showMessageDialog(null, "Newly added film data:\n" + filmData, "Info", JOptionPane.INFORMATION_MESSAGE);

            // Trigger the button notification effect
            triggerButtonNotificationEffect();
        } else {
            // If no data found, inform the user
            JOptionPane.showMessageDialog(null, "No films found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private lk06.component.PanelCover panelCover1;
    // End of variables declaration//GEN-END:variables
}
