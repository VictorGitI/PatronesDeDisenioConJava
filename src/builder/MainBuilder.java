package builder;

import java.time.LocalDate;

public class MainBuilder {
    public static void main(String[] args) {
        PatronBuilderUsuario usuario1 = new PatronBuilderUsuario.Builder()
                .nombre("victor")
                .apellido("asc")
                .fechaDeNacimiento(LocalDate.now().minusYears(29))
                .genero("masculino")
                .estadoCivil("undefined")
                .email("victor@gmail.com")
                .telefono("123456")
                .build();


        System.out.println(usuario1.toString());
    }
}
