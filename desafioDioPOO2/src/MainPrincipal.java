import java.time.LocalDate;

public class MainPrincipal {
    static void main() {
        Curso curso1 = new Curso();

        //System.out.println("curso:");
        curso1.setTitulo("java QA");
        curso1.setDescricao("java QA Dio");
        curso1.setCargaHoraria(120);

        //System.out.println(curso1);


        //System.out.println();

        Mentoria mentoria1 = new Mentoria();
        //System.out.println("Mentoria:");
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("mentoria de QA em java ");
        mentoria1.setData(LocalDate.now());

        //.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEdson = new Dev();
        devEdson.setNome("Edson victor");

        devEdson.inscreverBootcamp(bootcamp);

        devEdson.progredir();
        System.out.println("####################");


        System.out.println("Conteúdos Inscritos: " + devEdson.getConteudosInscritos());
        System.out.println("Conteúdo Concluido: " + devEdson.getConteudosConcluidos());
        System.out.println("XP: " + devEdson.calcularXP());


    }
}
