package Aplicação;

import exercício4.dispositivos.ComboDispositivo;
import exercício4.dispositivos.EscaneadoraConcreta;
import exercício4.dispositivos.ImpressoraConcreta;

public class Exercício4 {
    public static void main(String[] args) {
    ImpressoraConcreta i = new ImpressoraConcreta("1080");
        i.processoDoc("Minha carta!!");
        i.imprimir("Minha carta!!");

		System.out.println();
    EscaneadoraConcreta s = new EscaneadoraConcreta("2003");
		s.processoDoc("Meu Email");
		System.out.println("Resultado do escaner: " + s.escanear());

		System.out.println();
    ComboDispositivo c = new ComboDispositivo("2081");
		c.processoDoc("Minha dissertação");
		c.imprimir("Minha dissertação");
		System.out.println("Resultado do escaner: " + c.escanear());
    }
}