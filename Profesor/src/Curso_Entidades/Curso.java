
package Curso_Entidades;


public class Curso {
    private String nombreCurso;
    private int  horasDia;
    private int diasSemana;
    private String turno;
    private float precioHora;
    private String[] alumnos = new  String [6];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasDia, int diasSemana, String turno, float precioHora) {
        this.nombreCurso = nombreCurso;
        this.horasDia = horasDia;
        this.diasSemana = diasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

   
    
    
}
