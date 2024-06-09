package pe.edu.cibertec.api_soap_pubs_examen.repository;


import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.promedio.Promedio;

@Component
public class PromedioRepository {
    public Promedio calcularNotas(int nota1, int nota2, int nota3, int nota4) {
        Promedio promedio = new Promedio();
        promedio.setNota1(nota1);
        promedio.setNota2(nota2);
        promedio.setNota3(nota3);
        promedio.setNota4(nota4);

        promedio.setNotaminima(calcularNotaMinima(nota1, nota2, nota3, nota4));
        promedio.setPromedio(calcularPromedio(nota1, nota2, nota3, nota4, promedio.getNotaminima()));

        return promedio;
    }

    private int calcularNotaMinima(int nota1, int nota2, int nota3, int nota4) {
        return Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));
    }

    private double calcularPromedio(int nota1, int nota2, int nota3, int nota4, int notaMenor) {
        int suma = nota1 + nota2 + nota3 + nota4;
        suma -= notaMenor;
        return suma / 3.0;
    }
}
