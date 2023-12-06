package Atividades_Ana_Carolina;

import java.util.Scanner;

public class SpeedBike implements Veiculo{
	Scanner entrada = new Scanner (System.in);
	
	//atributos
	public int velocidade;
	public int marcha;
	
	//construtor padrao
	public SpeedBike() {
		
	}
	//construtor parametros
	public SpeedBike(int velocidade, int marcha) {
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	
	//get e set
	int getVelocidade () {
		return velocidade;
		}
     void setVelocidade (int velocidade) {
    	 this.velocidade = velocidade;
     }
	
     int getMarcha () {
 		return marcha;
 		}
      void setMarcha (int m) {
 		System.out.println("Qual a marcha que desejas colocar? ");
 		m= entrada.nextInt();
 		velocidade = m;
 		}
      
      //implementação
      @Override
  	public int mudarMarcha() {
    	marcha = entrada.nextInt();
  		switch (marcha) {
  		case(1):
  			System.out.println("A primeira marcha foi escolhida.");
  		break;
  		case (2):
  			System.out.println("A segunda marcha foi escolhida.");
  			break;
  		case (3):
  			System.out.println("A terceira marcha foi escolhida.");
  		break;
  		default:
  			System.out.println("Nenhuma marcha escolhida. Andando normalmente");
  			break;
  			}
  		return marcha;
  	}

      @Override
      public void acelerar() {
		System.out.println("Acelerando a bike ");
	}

      @Override
      public void frear() {
		System.out.println("Freando a bike");
		
	}
	//metodo
      public void estado() {
		if(velocidade > 0) {
			System.out.println("Bike em movimento");
		}else if(velocidade <= 0) {
			System.out.println("Bike parada");
		}
		
		
	}

}
