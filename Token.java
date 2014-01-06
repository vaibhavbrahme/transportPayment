/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kd
 */
public class Token {
int tokenId;
public Token(){}
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPassword() {
        return password;
    }

    public int getTokenId() {
        return tokenId;
    }

    public Token(int tokenId, String password, double amount) {
        this.tokenId = tokenId;
        this.password = password;
        this.amount = amount;
    }
String password;
double amount;
}
