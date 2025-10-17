import java.time.LocalDate;

public class MainPrincipal {
    static void main() {
        Curso curso1 = new Curso();

        System.out.println("curso:");
        curso1.setTitulo("java QA");
        curso1.setDescricao("java QA Dio");
        curso1.setCargaHoraria(120);

        System.out.println(curso1);


        System.out.println();

        Mentoria mentoria1 = new Mentoria();
        System.out.println("Mentoria:");
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("mentoria de QA em java ");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}
