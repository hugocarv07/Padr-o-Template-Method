package padroesprojeto.templatemethod.hospital;

public abstract class Paciente {

    private int prontuario;
    private String nome;
    private float nivelDor1;
    private float nivelDor2;

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivelDor1(float nivelDor1) {
        this.nivelDor1 = nivelDor1;
    }

    public void setNivelDor2(float nivelDor2) {
        this.nivelDor2 = nivelDor2;
    }

    // Template Method: define o esqueleto do algoritmo e delega os passos variáveis às subclasses
    public final String verificarPrioridade() {
        float media = calcularMedia();
        if (media >= getLimitePrioridade()) {
            return "Prioritário";
        }
        return "Não prioritário";
    }

    // Template Method: monta a descrição usando o passo getTipoPaciente() e o template acima
    public final String getInfo() {
        return getTipoPaciente() + "{" +
                "prontuario=" + prontuario +
                ", nome='" + nome + '\'' +
                ", resultado=" + verificarPrioridade() +
                '}';
    }

    // Passo com implementação padrão (hook): as subclasses podem sobrescrever
    protected float calcularMedia() {
        return (nivelDor1 + nivelDor2) / 2;
    }

    // Passos obrigatórios: cada subclasse define o seu
    protected abstract float getLimitePrioridade();

    protected abstract String getTipoPaciente();
}
