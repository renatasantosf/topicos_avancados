package com.example.guillermo1.encontrapet.classes;

import java.util.ArrayList;

/**
 * Created by Guillermo1 on 05/06/2017.
 */

public class Usuario {
    private String nome,senha;
    private int cep,telefone,celular,latitude,longitude;
    private ArrayList<classPet> classPets = new ArrayList<>();

    public Usuario(String nome_usuario, String senha,int cep, int telefone, int celular, int latitude, int longitude,ArrayList<classPet> classPets) {
        this.nome = nome_usuario;
        this.senha = senha;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.latitude = latitude;
        this.longitude = longitude;
        this.classPets = classPets;
    }

    public String getNome_usuario() {
        return nome;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome = nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public ArrayList<classPet> getClassPets() {
        return classPets;
    }

    public void setClassPets(ArrayList<classPet> classPets) {
        this.classPets = classPets;
    }
}
