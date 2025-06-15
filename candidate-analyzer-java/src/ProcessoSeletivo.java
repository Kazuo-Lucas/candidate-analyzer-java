import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        int quantidadeCandidatos;
        System.out.println("Informe a quantidade de candidatos: ");
        quantidadeCandidatos = Integer.parseInt(System.console().readLine());

        List<Candidato> candidatos = new ArrayList<>();
        List<Candidato> candidatosAprovados = new ArrayList<>();

        candidatos = getCandidatos(quantidadeCandidatos);
        candidatosAprovados = analisarCandidatos(candidatos);
        imprimirCandidatosAprovados(candidatosAprovados);
    }

    public static List<Candidato> getCandidatos(int quantidadeCandidatos) {
        List<Candidato> candidatos = new ArrayList<>();

        if (quantidadeCandidatos <= 0) {
            throw new IllegalArgumentException("A quantidade de candidatos deve ser maior que zero.");
        }

        for(int i = 0; i < quantidadeCandidatos; i++) {
            System.out.println("Informe o nome do candidato " + (i + 1) + ": ");
            String nome = System.console().readLine();

            System.out.println("Informe o salário pretendido pelo candidato " + (i + 1) + ": ");
            double salarioPretendido = Double.parseDouble(System.console().readLine());

            candidatos.add(new Candidato(nome, salarioPretendido));
        }

        System.out.println("Candidatos cadastrados com sucesso!");

        return candidatos;
    }

    public static List<Candidato> analisarCandidatos(List<Candidato> candidatos) {
        List<Candidato> candidatosAprovados = new ArrayList<>();
        double salarioBase = 2000.0; 

        for (Candidato candidato : candidatos) {
            if (candidato.getSalarioPretendido() <= salarioBase) {
                System.out.println("Ligar para candidato " + candidato.getNome());

                boolean atendeu = ligarParaCandidato(candidato);

                if(atendeu) {
                    candidatosAprovados.add(candidato);
                }
                
            }
        }

        return candidatosAprovados;
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static boolean ligarParaCandidato(Candidato candidato) {
        int tentativas = 1;
        boolean atendeu = false;

        while (tentativas <= 3) {
            if (atender()) {
                atendeu = true;
                return atendeu;
            } else {
                System.out.println("Tentativa " + tentativas + " de ligar para " + candidato.getNome() + " falhou.");
                tentativas++;
            }
        }

        return atendeu;
    
    }

    public static void imprimirCandidatosAprovados(List<Candidato> candidatosAprovados) {
        if (candidatosAprovados.isEmpty()) {
            System.out.println("Nenhum candidato aprovado.");
        } else {
            System.out.println("Candidatos aprovados:");
            for (Candidato candidato : candidatosAprovados) {
                System.out.println(candidato.getNome() + " - Salário pretendido: " + candidato.getSalarioPretendido());
            }
        }
    }

}
