package br.com.paulo.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 11)
	private String cpf;
	
	@Column(nullable = false, length = 11)
	private String telNumber;
	
	public Person() {}
	
	public Person(String name, String cpf, String telNumber) {
		this.name = name;
		this.cpf = cpf;
		this.telNumber = telNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, name, telNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(name, other.name)
				&& Objects.equals(telNumber, other.telNumber);
	}
	
}
