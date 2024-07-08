package builder;

import java.time.LocalDate;

public class PatronBuilderUsuario {
    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String email;
    private final LocalDate fechaDeNacimiento;
    private final String genero;
    private final String estadoCivil;

    public PatronBuilderUsuario(String estadoCivil, String genero, LocalDate fechaDeNacimiento, String email, String telefono, String apellido, String nombre) {
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public PatronBuilderUsuario(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.telefono = builder.telefono;
        this.email = builder.email;
        this.fechaDeNacimiento = builder.fechaDeNacimiento;
        this.genero = builder.genero;
        this.estadoCivil = builder.estadoCivil;
    }

    @Override
    public String toString() {
        return "builder.PatronBuilderUsuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ",\nfechaDeNacimiento=" + fechaDeNacimiento +
                ", genero='" + genero + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    public static class Builder{
        private String nombre;
        private String apellido;
        private String telefono;
        private String email;
        private LocalDate fechaDeNacimiento;
        private String genero;
        private String estadoCivil;


        public PatronBuilderUsuario.Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PatronBuilderUsuario.Builder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PatronBuilderUsuario.Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public PatronBuilderUsuario.Builder email(String email) {
            this.email = email;
            return this;
        }

        public PatronBuilderUsuario.Builder fechaDeNacimiento(LocalDate fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
            return this;
        }

        public PatronBuilderUsuario.Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public PatronBuilderUsuario.Builder estadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }

        public PatronBuilderUsuario build(){
            return new PatronBuilderUsuario(this);
        }
    }
}
