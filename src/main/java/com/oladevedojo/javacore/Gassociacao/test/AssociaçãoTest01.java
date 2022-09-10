package com.oladevedojo.javacore.Gassociacao.test;

import com.oladevedojo.javacore.Gassociacao.dominio.Aluno;
import com.oladevedojo.javacore.Gassociacao.dominio.Local;
import com.oladevedojo.javacore.Gassociacao.dominio.Professor;
import com.oladevedojo.javacore.Gassociacao.dominio.Seminario;

public class AssociaçãoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
