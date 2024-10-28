package entities;
import java.util.UUID;
public class Funcionario {
	private UUID id;
	private String nome;
	private String cpf;
	private String matricula;
	private Endereco endereco;
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	public Funcionario(UUID id, String nome, String cpf, String matricula, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}


