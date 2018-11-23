package io.swagger.api.impl;
import java.util.ArrayList;

public class alerta {
    Integer id;
    String fecha;
    String hora;


  public alerta(){
      this.id = null;
      this.fecha = null;
      this.hora = null;
  }
  public alerta(Integer id, String fecha, String hora){
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public Integer getID(){
        return this.id;
    }
     public String getFecha(){
        return this.fecha;
    }
     public String getHora(){
        return this.hora;
    }
    
    
    
public ArrayList<alerta> init(){
        alerta e = new alerta(1,"18/11/2018","18:00");
        alerta es = new alerta(2,"11/11/2018","11:00");
        alerta ed = new alerta(3,"16/11/2018","16:00");
        alerta ea = new alerta(4,"18/12/2017","17:00");
        alerta e1 = new alerta(5,"09/11/2018","15:00");
        alerta ew = new alerta(1,"12/11/2018","12:00");
        alerta eww = new alerta(2,"19/11/2018","19:00");
        
        ArrayList<alerta> xd = new ArrayList<>();
        xd.add(e);
        xd.add(es);
        xd.add(ed);
        xd.add(ea);
        xd.add(e1);
        xd.add(ew);
        xd.add(eww);
        return xd;
}

public ArrayList<alerta> getAlertas(Integer x){
    ArrayList<alerta> al = this.init();
    ArrayList<alerta> nc = new ArrayList<alerta>();
    for (int i = 0; i < al.size(); i++) {
        if (al.get(i).id.equals(x)){
            nc.add(al.get(i));
        }
    }
    al.get(x);
    return nc;
}
    
}

