/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogwalker;


public class person extends CreateAccount
{
    private String username;
    private String password;
    
    public String getUsername(){
        return username;
    }
    public String getPassword(){
    return password;
    }
   public void setPassword(String password){
       this.password = password;
   }
   public void setUsername(String username){
        this.username = username;
    }
}
