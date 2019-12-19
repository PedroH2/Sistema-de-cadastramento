/*ALUNOS
RA(chave primaria)  Nome E-mail

 */
package BD.dbos;
import java.sql.*;
import BD.*;
import BD.Core.*;
import BD.daos.*;

public class Aluno implements Cloneable
{
    private int  ra;
    private String nome;
    private String email;
    
    public Aluno (int ra, String nome, String email) throws Exception
    {
        this.setRa (ra);
        this.setNome   (nome);
        this.setEmail  (email);
    }
      public Aluno (int ra,  String email) throws Exception
    {
        this.setRa (ra);
       
        this.setEmail  (email);
    }
      
         public Aluno ( String nome, int ra) throws Exception
    {
        
       
        this.setNome(nome);
        this.setRa (ra);
    }
    public void setRa(int ra) throws Exception
    {
        if(ra <= 0)
            throw new Exception ("Codigo inválido");
        
        if(ra > 99999)
            throw new Exception ("Ra inválido");

        this.ra = ra;
    }
    public void setNome(String nome) throws Exception
    {
        if(nome == null || nome.equals(""))
            throw new Exception ("Nome não fornecido");

        this.nome = nome;
    }
    public void setEmail (String email) throws Exception
    {
        if(email == null || email.equals(""))
            throw new Exception ("email não fornecido");
        
        this.email = email;
    }
    public int getRa(){ return this.ra; }
    public String getNome() { return this.nome; }
    public String getEmail(){ return this.email;}

    public Aluno(Aluno modelo) throws Exception
    {
        if(modelo == null)
            throw new Exception("Modelo inválido");
        
        this.ra = modelo.ra;
        this.nome = modelo.nome;
        this.email = modelo.email;
    }

	public String toString()
    {
        String ret = "";
        
        ret += "Ra do aluno:  " + this.ra + "\n"; 
        ret += "Nome do aluno:  " + this.nome + "\n";
        ret += "Email do aluno:  " + this.email + "\n";

        return ret;
    }
    public int hashCode()
    {
        int ret = 7;

        ret = ret * 7 + new Integer(this.ra).hashCode();
        ret = ret * 7 + this.nome.hashCode();
        ret = ret * 7 + this.email.hashCode();
        
        if(ret < 0)
            ret = -ret;

        return ret;
    }
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        
        if(obj == null)
            return false;
        
        if(!(obj instanceof Aluno))
            return false;

        Aluno alu = (Aluno)obj;

        if(this.ra != alu.ra)
            return false;

        if(this.nome != alu.nome)
            return false;

        return true;
    }   
    public Object clone()
    {
        Aluno ret = null;

        try
        {
            ret = new Aluno(this);
        }
        catch (Exception erro)
        {}
        return ret;
    } 
}
