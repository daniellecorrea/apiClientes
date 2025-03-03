package br.com.cotiinformatica.entities;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_perfil")
public class Perfil {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "nome", length = 25, nullable = false)
	private String nome;

	@OneToMany(mappedBy = "perfil")
	private List<Usuario> usuarios;

	@ManyToMany
	@JoinTable(
		name = "tb_perfil_permissao",
		joinColumns = @JoinColumn(name = "perfil_id", nullable = false),
		inverseJoinColumns = @JoinColumn(name = "permissao_id", nullable = false)
	)
	private List<Permissao> permissoes;
}

