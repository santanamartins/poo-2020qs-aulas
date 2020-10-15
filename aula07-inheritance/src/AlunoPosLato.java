public class AlunoPosLato extends AlunoPos {

    public AlunoPosLato(String nome, String sobrenome, String ra,
                    String orientador, String programa) {
        super(nome, sobrenome, ra, orientador, programa);
        System.out.println("AlunoPosLato");
    }

    public String toString() {
        return super.toString() + "Tipo do programa: " + "Lato sensu\n";
    }
}
