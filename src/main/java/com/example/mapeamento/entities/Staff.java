package com.example.mapeamento.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
 /*
  * https://www.tutorialspoint.com/pg/jpa/jpa_advanced_mappings.htm
  * Single_table -> cria uma unica tabela para todas as classes da herança
  * Joined -> cria uma junção de registro em tabelas diferentes
  * TABLE_PER_CLASS -> cria uma tabela para cada classe e os registros independentes
  * */
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "type")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sid;
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	private String sname;
}
