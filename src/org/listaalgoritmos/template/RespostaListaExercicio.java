package org.listaalgoritmos.template;

import java.lang.reflect.Array;

public class RespostaListaExercicio {
	
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
    
    public static void main(String[] args) {
        
        
    }
    
    
    /**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
    
    public static float calcularImc(float pesoCorporal, float alturaPessoa) {
        
        float valorImc = pesoCorporal / (alturaPessoa * alturaPessoa);
        return valorImc;
        
    }
    
    /**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
    
    public static float calcularAreaTrapezio(float comprimentoBaseMaior, float comprimentoBaseMenor, float alturaTrapezio) {    
        
        float areaCalculada = ((comprimentoBaseMaior + comprimentoBaseMenor) * alturaTrapezio) / 2;
        return areaCalculada;
    }
    
    public static int obterMaiorValor(int valorA, int valorB) {
        if (valorA > valorB) {
            return valorA;
        } else {
            return valorB;
        }
        
    }
    
    /**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
    
    public static boolean verificarSePar(int valorNumerico) {
        return valorNumerico % 2 == 0;        
    }
    
    /**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */ 
    
    public static float calcularMediaNotas(float[] arrayNotas) {
        
        float somaNotas = 0; 
        
        for(int indice = 0; indice < arrayNotas.length; indice++) {
            somaNotas = somaNotas + arrayNotas[indice];
        }
        
        return somaNotas / arrayNotas.length; 
        
    }
    
    /**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 */
    
    public static void imprimirArrayInverso(int[] arrayInteiros) {
        
        for(int indice = arrayInteiros.length - 1; indice >= 0; indice--) {
            
            if(indice > 0) {
                System.out.print(arrayInteiros[indice] + ",");
            } else {
                System.out.print(arrayInteiros[indice]);
            }
        }
    }
    
    /**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa  nica linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
    
    public static void imprimirElementosPrimos(int[] arrayInteiros) {
        for (int indice = 0; indice < arrayInteiros.length; indice++){
            int contadorDivisores = 0;
               if(arrayInteiros[indice] >= 2) {
                 for (int divisor = 1; divisor <= arrayInteiros[indice]; divisor++) {
                    if(arrayInteiros[indice] % divisor == 0) {
                       contadorDivisores++;
                    }
                 }
                    if(contadorDivisores == 2){
                      System.out.print(arrayInteiros[indice] + "  ");
                   }
              }
        }
    }
    
    /**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
    
    public static void imprimirElementosImpares(int[] array) 
	{
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] % 2 != 0) { 
	            System.out.print(array[i] + " "); 
	        }
	    }
	}
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		    for (int i = 0; i < array.length; i++) {
		        if (array[i] % 2 == 0) { 
		            System.out.print(array[i] + " "); 
		        }
		    }
		}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		int maiorElemento = array[0];
		int menorElemento = maiorElemento;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maiorElemento) {
				maiorElemento = array[i];
			}else if(array[i] < menorElemento) {
				menorElemento = array[i];
			}
		}
		
		System.out.print(maiorElemento + " " + menorElemento + " ");

	}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		int media;
		int soma = 0;
		for (int i = 0;i < array.length; i++) {
		    soma += array[i];
		}
			media = soma / array.length;
			return media;	

	}
}