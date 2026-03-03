/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.theo;

import javax.xml.crypto.Data;

/**
 *
 * @author aluno
 */
public class Estudante {
        private String nome;
        private Data dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
        
        
        
        public String getNome(){
            return this.nome;
        }
        public void setNome(String n){
            this.nome = n;
        }
        public Data getData(){
            return this.dataNascimento;
        }
        public void setData(Data d){
            this.dataNascimento = d;
        }
        public String getCPF(){
            return this.cpf;
            
        }
        public void setCPF(String c){
            this.cpf = c;
        }
        public char getGenero(){
            return this.genero;
        }
        public void setGenero(char g){
            this.genero = g;
        }
        public String getMatricula(){
            return this.matricula;
        }
        public void setMatricula(String m){
            this.matricula = m;
        }
        public String getEmail(){
            return this.email;
        }
        public void setEmail(String e){
            this.email = e;
        }
        
        
}
