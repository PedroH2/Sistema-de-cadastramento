package BD.dbos;
import java.sql.*;
import BD.*;
import BD.Core.*;
import BD.daos.*;

public class Materia implements Cloneable
{
    private int  codigo;
    private String nome;
    
    public Materia (int codigo, String nome) throws Exception
    {
        this.setCodigo (codigo);
        this.setNome   (nome);
    }
    
    public void setCodigo(int codigo) throws Exception
    {
        if(codigo <= 0)
            throw new Exception ("Codigo inválido");

        this.codigo = codigo;
    }
    public void setNome(String nome) throws Exception
    {
        if(nome == null || nome.equals(""))
            throw new Exception ("Nome não fornecido");

        this.nome = nome;
    }
    public int getCodigo() { return this.codigo;}
    public String getNome(){ return this.nome; }
    public void Materia(Materia modelo) throws Exception
    {
        if(modelo == null)
            throw new Exception("Modelo inválido");
        
        this.codigo = modelo.codigo;
        this.nome = modelo.nome;
    }
    public String toString()
    {
        String ret = "";
        
        ret = "codigo da matéria" + this.codigo;
        ret = "Nome da matéria" + this.nome;

        return ret;
    }
    public int hashCode()
    {
        int ret = 7;

        ret = ret * 7 + new Integer(this.codigo).hashCode();
        ret = ret * 7 + this.nome.hashCode();
        
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
        
        if(!(obj instanceof Materia))
            return false;

        Materia mat = (Materia)obj;

        if(this.codigo != mat.codigo)
            return false;

        if(this.nome != mat.nome)
            return false;

        return true;
    }   
  
}
