package ejercicio4poo;
import javax.swing.JOptionPane;
public class Ejercicio4poo {

    
    public void imprimir(){
   JOptionPane.showMessageDialog(null, getNombre());    
   JOptionPane.showMessageDialog(null, getPatas());
   JOptionPane.showMessageDialog(null, getEspecie());
   JOptionPane.showMessageDialog(null, getHabitad());
 } 
   
    private String patas;
    private String nombre;
    private String especie;
    private String habitad;

    /**
     * @return the patas
     */
    public String getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(String patas) {
        this.patas = patas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the habitad
     */
    public String getHabitad() {
        return habitad;
    }

    /**
     * @param habitad the habitad to set
     */
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    
}
