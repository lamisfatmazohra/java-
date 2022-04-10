import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        final Connection connection;
        DBHundler hundler = new DBHundler();
        PreparedStatement pst;
        String insert = "INSERT INTO etudiant(nom,prenom,matricule,moyenne)" + "VALUES (?,?,?,?)";
        connection = (Connection) hundler.getConnection();
        try {
            pst = (PreparedStatement) connection.prepareStatement(insert);
            pst.setString(1, "cristiano"); // Si le type de la colonne est string
            pst.setString(2, "ronaldo"); // Si le type de la colonne est int
            pst.setString(3, "202589633");
            pst.setDouble(4, 19.99);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
