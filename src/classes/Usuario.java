/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alunoces
 */
public class Usuario {
    private String nome;
    private String userlogin;
    private String senha;

  
    public Usuario() {        
        this.nome = "Admin";
        this.userlogin = "AC2018";
        this.senha = "s1234";
    }
    
    public boolean validarSenha(String senha){
        if(senha.length() == 5 && !senha.isEmpty())
            return true;
        else
            return false;
    }
    
    public boolean validarUsuario(String usuario){
        if(userlogin.length() == 6)
            return true;
        else
            return false;
    }
    
    public boolean efetuarLogin(String usuario, String senha){
        if(this.userlogin.equals(usuario) && this.senha.equals(senha))
            return true;
        else
            return false;
    }
   
}
