public class TestAlunosConstructorOrder {
    public static void main(String[] args) {
        AlunoGrad a1 = new AlunoGrad("joao", "silva", "1234", "bcc");
        System.out.println();
        AlunoPos a2 = new AlunoPos("maria", "pereira", "5678",
                "ppgcc", "pedro souza");
        System.out.println();
        AlunoPosLato ap1 = new AlunoPosLato("maria", "pereira", "5678",
                "ppgcc", "pedro souza");
        System.out.println();
        AlunoPosStricto ap2 = new AlunoPosStricto("pedro", "siqueira", "92983",
                "ppgcc", "pedro souza");

    }
}
