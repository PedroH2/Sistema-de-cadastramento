package BD.dbos;

import java.sql.*;
import BD.*;
import BD.Core.*;
import BD.daos.*;
public class Fez implements Cloneable
{
    private int ra;
    private int cod;
    private float nota;
    private float frequencia;
    
    public Fez (int ra, int cod, float nota, float frequencia) throws Exception
    {
        this.setRA (ra);
        this.setCod  (cod);
        this.setNota  (nota);
        this.setFrequencia(frequencia);
    }
    
 
    public void setRA (int ra) throws Exception
    {
        if (ra <= 0)
            throw new Exception ("RA invalido");

        this.ra = ra;
    }   

    public void setCod (int cod) throws Exception
    {
        if (cod <= 0)
            throw new Exception ("Codigo invalido");

        this.cod = cod;
    }  

    public void setNota (float nota) throws Exception
    {
        if (nota <= 0)
            throw new Exception ("Nota invalida");

        this.nota = nota;
    }  
    public void setFrequencia (float frequencia) throws Exception
    {
        if (frequencia <= 0)
            throw new Exception ("Frequencia indefinida");

        this.frequencia = frequencia;
    }  

    public int getRA ()
    {
        return this.ra;
    }

    public int getCod ()
    {
        return this.cod;
    }

    public float getNota ()
    {
        return this.nota;
    }
    
    public float getFrequencia()
    {
    	return this.frequencia;
    }

    public String toString ()
    {
        String ret="";

        ret+="RA: "+this.ra+"\n";
        ret+="cod..: "+this.cod  +"\n";
        ret+="Nota.: "+this.nota + "\n";
        ret+="frequencia: "+this.frequencia;

        return ret;
    }
    
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (!(obj instanceof Fez))
            return false;

        Fez liv = (Fez)obj;

        if (this.ra!=liv.ra)
            return false;

        if (this.cod!=liv.cod)
            return false;

        if (this.nota!=liv.nota)
            return false;
        if (this.frequencia!=liv.frequencia)
            return false;

        return true;
    }

    public int hashCode ()
    {
        int ret=666;

        ret = 7*ret + new Integer(this.ra).hashCode();
        ret = 7*ret + new Integer(this.cod).hashCode();
        ret = 7*ret + new Float(this.nota).hashCode();
        ret = 7*ret + new Float(this.frequencia).hashCode();

        return ret;
    }


    public Fez (Fez modelo) throws Exception
    {
    	if(modelo == null)
    		throw new Exception("Modelo nulo");
        this.ra = modelo.ra; // nao clono, pq nao eh objeto
        this.cod = modelo.cod; // nao clono, pq nao eh objeto
        this.nota = modelo.nota; // nao clono, pq nao eh objeto
        this.frequencia = modelo.frequencia; // nao clono, pq nao eh objeto
    }

    public Object clone ()
    {
        Fez ret=null;

        try
        {
            ret = new Fez (this);
        }
        catch (Exception erro)
        {} // nao trato, pq this nunca � null e construtor de
           // copia da excecao qdo seu parametro for null

        return ret;
    }
}
