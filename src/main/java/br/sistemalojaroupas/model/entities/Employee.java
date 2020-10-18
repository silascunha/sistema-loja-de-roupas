
package br.sistemalojaroupas.model.entities;

import java.io.Serializable;
import java.util.Objects;
import org.dizitart.no2.IndexType;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;
import org.dizitart.no2.objects.Index;
import org.dizitart.no2.objects.Indices;

@Indices(
    @Index(value = "cpf", type = IndexType.Unique)
)

public class Employee implements Serializable {
private static final long serialVersionUID = 1L;

  @Id
  private NitriteId id;
  private String nome;
  private String cpf;
  private String nascimento;
  private String telefone;
  private String email;
  private String endereco;
  private String admissao;
  private String cargo;
  private String salario;
  
  private Employee () {}

    private Employee(String nome, String cpf, String telefone, String email, String endereco, String cargo, String nascimento, String admissao, String salario) {
    
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cargo = cargo;
        this.nascimento = nascimento;
        this.admissao = admissao;
        this.salario = salario;
          
}

    public NitriteId getId() {
        return id;
    }
    
    public void setId(NitriteId id) {
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

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getAdmissao() {
        return admissao;
    }
    
    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getSalario() {
        return salario;
    }
    
    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "cadFunc{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", cargo=" + cargo + ", nascimento=" + nascimento + ", admissao=" + admissao + ", salario=" + salario + '}';
    }
    
}
