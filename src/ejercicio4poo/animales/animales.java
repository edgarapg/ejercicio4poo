package ejercicio4poo.animales;
import ejercicio4poo.Ejercicio4poo;
import ejercicio4poo.mamiferos;
import ejercicio4poo.rectiles;
import ejercicio4poo.aves;
import javax.swing.JOptionPane;
public class animales {
    mamiferos m;
    rectiles r;
    aves a;
    Ejercicio4poo ejer;
    
    public static void main(String[] args) {
       animales p=new animales();
       p.metodo();
    }
    public void metodo(){
      m=new mamiferos();
      r=new rectiles();
      a=new aves();
      ejer=new Ejercicio4poo();
       
     String jugar= JOptionPane.showInputDialog("elegir especie \n1-maiferos\n2-aves\n3-reptiles");
     int d=  Integer.parseInt(jugar);   
    switch(d){
        case 1:
            m.setNombre(JOptionPane.showInputDialog("nombre \n"));
            m.setPatas(JOptionPane.showInputDialog("# de patas \n"));
            m.setEspecie("mamiferos\n");
            m.setAlimento(JOptionPane.showInputDialog("alimento \n"));
            m.setHubicacion(JOptionPane.showInputDialog("ubicacion\n"));
            m.setHabitad(JOptionPane.showInputDialog("habitad \n")); 
            m.imprimir();
        break;
        case 2:
            a.setNombre(JOptionPane.showInputDialog("nombre \n"));
            a.setPatas(JOptionPane.showInputDialog("# de patas \n"));
            a.setEspecie("mamiferos\n");
            a.setAlimento(JOptionPane.showInputDialog("alimento \n"));
            a.setHubicacion(JOptionPane.showInputDialog("ubicacion\n"));
            a.setHabitad(JOptionPane.showInputDialog("habitad \n")); 
            a.imprimir();
        break;
        case 3:
            r.setNombre(JOptionPane.showInputDialog("nombre \n"));
            r.setPatas(JOptionPane.showInputDialog("# de patas \n"));
            r.setEspecie("reptiles\n");
            r.setAlimento(JOptionPane.showInputDialog("alimento \n"));
            r.setHubicacion(JOptionPane.showInputDialog("ubicacion\n"));
            r.setHabitad(JOptionPane.showInputDialog("habitad \n")); 
            r.imprimir();
        break;
    }
    }
}
