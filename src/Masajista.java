public class Masajista extends Persona {

    private Integer dorsal;
    private String demarcacion;

    public Masajista() {}

    public Masajista(String nombre, String apellido, Integer edad, Integer dorsal, String demarcacion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }
}
