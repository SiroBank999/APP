/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.UserModel;
import UI.JFMain;
import UI.JFSignIn;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SignInController {
    private JFSignIn signin;
    private UserModel user;

    public SignInController() {
    }

    public SignInController(JFSignIn signin) {
        this.signin = signin;
        user = new UserModel();
    }

  
    public void checkAccount(String username,String password){
        user.setUsername(username);
        user.setPassword(password);
        Database db = new Database();
        Connection conn = db.ketNoi();
        if(user.checkAccount(conn)){
            new JFMain().setVisible(true);
            signin.dispose();
        }
        else {
            JOptionPane.showMessageDialog(this.signin, "Username hoặc Password sai", "Thông báo kết quả", JOptionPane.ERROR_MESSAGE);
        }
    }
}
