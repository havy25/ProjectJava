package service;

import connection.DatabaseConnection;
import model.Model_Send_Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceMessage {

    private final String INSERT_MESSAGE = "INSERT INTO messages (from_user_id, to_user_id, message) VALUES (?, ?, ?)";
    private final String SELECT_MESSAGES = "SELECT * FROM messages WHERE from_user_id = ? OR to_user_id = ? ORDER BY id ASC";

    private final Connection con;

    public ServiceMessage() {
        this.con = DatabaseConnection.getInstance().getConnection();
    }

    public void saveMessage(Model_Send_Message message) throws SQLException {
        try (PreparedStatement p = con.prepareStatement(INSERT_MESSAGE)) {
            p.setInt(1, message.getFromUserID());
            p.setInt(2, message.getToUserID());
            p.setString(3, message.getText());
            p.executeUpdate(); // Use executeUpdate for INSERT statements
        }
    }

    public List<Model_Send_Message> getMessageHistory(int userID) throws SQLException {
        List<Model_Send_Message> messages = new ArrayList<>();
        try (PreparedStatement p = con.prepareStatement(SELECT_MESSAGES)) {
            p.setInt(1, userID);
            p.setInt(2, userID);
            try (ResultSet rs = p.executeQuery()) {
                while (rs.next()) {
                    int fromUserID = rs.getInt("from_user_id");
                    int toUserID = rs.getInt("to_user_id");
                    String text = rs.getString("message");
                    // Assuming there's a messageType column in your messages table
                    int messageType = rs.getInt("message_type");
                    Model_Send_Message message = new Model_Send_Message(fromUserID, toUserID, text, messageType);
                    messages.add(message);
                }
            }
        }
        return messages;
    }
}
