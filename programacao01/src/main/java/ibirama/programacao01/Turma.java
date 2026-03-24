/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibirama.programacao01;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {

    private String nome;
    private int anoIngresso;
    private String sala;s
    
    private Estudante discentes = new Estudante();
    private Disciplina disciplina = new Disciplina();
    private Professor professores = new Professor();

    private Set<Estudante> _discentes = new HashSet<Estudante>();
    private Set<Disciplina> _disciplina = new HashSet<Disciplina>(); 
    private Set<Professor> _professores = new HashSet<Professor>();
}
