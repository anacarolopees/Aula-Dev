package LocacaoDeVeiculos_Ana_Carolina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLocadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//início
		System.out.println("BEM VINDO/A A LOCADORA OASIS!");
		System.out.println("Somos a maior locadora de veiculos da america latina.");
		System.out.println("Vamos as compras!");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Insira seus dados, por favor. ");
		Cliente cliente1 = new Cliente();
		System.out.println("Nome: ");
		cliente1.setNome(entrada.next());
		System.out.println("Endereco: ");
		cliente1.setEndereco(entrada.next());
		System.out.println("Telefone: ");  
		cliente1.setTelefone(entrada.next());
		System.out.println("CPF: ");
		cliente1.setCPF(entrada.nextInt());
		System.out.println("CNH: ");
		cliente1.setCNH(entrada.nextInt());
		System.out.println("Idade: ");
		//verificar idade do cliente
		int idade = entrada.nextInt();
			if (idade >= 18) {
				System.out.println("O cliente pode alugar um veiculo.");
				System.out.println("-------------------------------------------------------------------------------");

			}else {
            System.out.println("Que pena! O cliente nao pode alugar um veiculo, pois tem menos de 18 anos.");
            System.exit(0);
        }
			//array list carros
			Carro carro1 = new Carro("Volksvagem, ", " Preto, ", "Combustivel Flex, ",
			 "Jetta, ", "2500km rodados, ", "2000", true, "NAN-4258", 4, 250.00);
			Carro carro2 = new Carro("Honda, ", " Branco, ", "Combustivel Flex, ",
					 "Civic, ", "3000km rodados, ", "2020", true, "MVH-6038", 4, 250.00);
			Carro carro3 = new Carro("Chevrolet, ", " Preto, ", "Combustivel Flex, ",
					 "Cruze, ", "800km rodados, ", "2000", true, "DBM-6317", 4, 250.00);
			Carro carro4 = new Carro("BMW, ", " Cinza, ", "Combustivel Flex, ",
					 "BMW Serie 5, ", "7500km rodados, ", "2000", true, "KNR-5787", 4, 250.00);
			Carro carro5 = new Carro("Mercedes, ", " Preto, ", "Combustivel Flex, ",
					 "C300, ", "5500km rodados, ", "2000", true, "JPZ-1584", 4, 250.00);
			Carro carro6 = new Carro("Range Rover, ", " Preto, ", "Combustivel Flex, ",
					 "Range Rover Evoque, ", "500km rodados, ", "2000", true, "LFM-6694", 4, 250.00);
			Carro carro7 = new Carro("Hyundai, ", " Preto, ", "Combustivel Flex, ",
					 "Hyundai Elantra, ", "700km rodados, ", "2000", true, "LWH-2208", 4, 250.00);
			Carro carro8 = new Carro("Ford, ", " Preto, ", "Combustivel Flex, ",
					 "Fiesta, ", "2500km rodados, ", "2000", true, "MZQ-2651", 4, 250.00);	
			Carro carro9 = new Carro("Toyota, ", " Preto, ", "Combustivel Flex, ",
					 "Corola, ", "2500km rodados, ", "4500", true, "KAP-8060", 4, 250.00);	
			Carro carro10 = new Carro("Jaguar, ", " Preto, ", "Combustivel Flex, ",
					 "F-Type, ", "2500km rodados, ", "200", true, "MYJ-0599", 4, 250.00);
			List<Veiculo> veiculos = new ArrayList<Veiculo>();
			veiculos.add(carro1);
			veiculos.add(carro2);
			veiculos.add(carro3);
			veiculos.add(carro4);
			veiculos.add(carro5);
			veiculos.add(carro6);
			veiculos.add(carro7);
			veiculos.add(carro8);
			veiculos.add(carro9);
			veiculos.add(carro10);
			
			//array list motos
			List<Veiculo> veiculos2 = new ArrayList<Veiculo>();
			Moto moto1 = new Moto("Honda", "Vermelho", "Gasolina", "CBR 1000RR", "5000", "2022", true, "XYZ123", 2, 15000.0, "4 tempos", 1000, "123456789");
			Moto moto2 = new Moto("Yamaha", "Azul", "Gasolina", "YZF R6", "3000", "2021", true, "ABC456", 2, 12000.0, "4 tempos", 600, "987654321");
			Moto moto3 = new Moto("Suzuki", "Preto", "Gasolina", "GSX-R1000", "4000", "2022", true, "LMN789", 2, 14000.0, "4 tempos", 1000, "456789123");
			Moto moto4 = new Moto("Kawasaki", "Verde", "Gasolina", "Ninja ZX-10R", "2500", "2021", true, "JKL321", 2, 13500.0, "4 tempos", 1000, "321654987");
			Moto moto5 = new Moto("Ducati", "Vermelho", "Gasolina", "Panigale V4", "6000", "2022", true, "DEF456", 2, 18000.0, "4 tempos", 1103, "789123456");
			Moto moto6 = new Moto("Harley-Davidson", "Preto", "Gasolina", "Sportster Iron 883", "8000", "2021", true, "GHI654", 2, 11500.0, "V2", 883, "654321789");
			Moto moto7 = new Moto("BMW", "Azul", "Gasolina", "S1000RR", "3500", "2023", true, "OPQ987", 2, 16000.0, "4 tempos", 999, "987456321");
			Moto moto8 = new Moto("KTM", "Laranja", "Gasolina", "Duke 390", "2000", "2022", true, "RST852", 2, 9500.0, "4 tempos", 373, "852369741");
			Moto moto9 = new Moto("Triumph", "Branco", "Gasolina", "Street Triple RS", "2800", "2021", true, "UVW369", 2, 12500.0, "3 cilindros", 765, "369852147");
			Moto moto10 = new Moto("Aprilia", "Preto", "Gasolina", "RSV4", "5000", "2023", true, "MNO123", 2, 15500.0, "4 tempos", 1100, "123789456");
			veiculos2.add(moto1);
			veiculos2.add(moto2);
			veiculos2.add(moto3);
			veiculos2.add(moto4);
			veiculos2.add(moto5);
			veiculos2.add(moto6);
			veiculos2.add(moto7);
			veiculos2.add(moto8);
			veiculos2.add(moto9);
			veiculos2.add(moto10);

		System.out.println("Quantos dias voce deseja ficar com o veiculo: ");
		int data;
		data = entrada.nextInt();
			
		//selecionar o pais
		int opcao;
		int opcao2;
			
		exibirMenu(); // metodo (acao)
		opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Voce selecionou o Brasil! Iremos te mostrar as opcoes de veiculos disponiveis. ");
			exibirMenu2();
			opcao2 = entrada.nextInt();
			switch(opcao2) {
			case 1:
				for (Veiculo veiculo : veiculos) {
					System.out.println("----"+ veiculo.getFabricante() + " " + veiculo.getModelo() + 
			        " (" + veiculo.getAno() + ")" + veiculo.getCor() + veiculo.getCapacidade() 
			        + veiculo.getPreco() + veiculo.getTipoCombustivel() + veiculo.getPlaca()+
			        veiculo.getKmRodados());
			          		
				}
				//civic
				opcao2 = entrada.nextInt();
				switch(opcao2) {
				case 1:
					System.out.println("Voce escolheu o carro Jetta! ");
					cliente1.alugarVeiculo(carro1);
					break;
				case 2:
					System.out.println("Voce escolheu o carro Civic! ");
					cliente1.alugarVeiculo(carro2);
					break;
				case 3:
					System.out.println("Voce escolheu o carro Cruze! ");
					cliente1.alugarVeiculo(carro3);
					break;
				case 4:
					System.out.println("Voce escolheu o carro BMW Serie 5! ");
					cliente1.alugarVeiculo(carro4);
					break;
					
				case 5:
					System.out.println("Voce escolheu o carro C300! ");
					cliente1.alugarVeiculo(carro5);
					break;
				case 6:
					System.out.println("Voce escolheu o carro Range Rover Evoque! ");
					cliente1.alugarVeiculo(carro6);
					break;
				case 7:
					System.out.println("Voce escolheu o carro Hyundai Elantra! ");
					cliente1.alugarVeiculo(carro7);
					break;
				case 8:
					System.out.println("Voce escolheu o carro Fiesta! ");
					cliente1.alugarVeiculo(carro8);
					break;
				case 9:
					System.out.println("Voce escolheu o carro Corola! ");
					cliente1.alugarVeiculo(carro9);
					break;
				case 10:
					System.out.println("Voce escolheu o carro F-Type! ");
					cliente1.alugarVeiculo(carro10);
					break;
				default:
					System.out.println("SAINDO DO SISTEMA.");
					break;
				}
				break;
			case 2:
				for (Veiculo veiculo2 : veiculos2) {
					System.out.println("----"+ veiculo2.getFabricante() + " " + veiculo2.getModelo() + 
			        " (" + veiculo2.getAno() + ")" + veiculo2.getCor() + veiculo2.getCapacidade() 
			        + veiculo2.getPreco() + veiculo2.getTipoCombustivel() + veiculo2.getPlaca()+
			        veiculo2.getKmRodados());
			          		
				}
				opcao2 = entrada.nextInt();
				switch(opcao2) {
				case 1:
					System.out.println("Voce escolheu a moto ! CBR 1000RR");
					cliente1.alugarVeiculo(moto1);
					break;
				case 2:
					System.out.println("Voce escolheu a moto YZF R6 ! ");
					cliente1.alugarVeiculo(moto2);
					break;
				case 3:
					System.out.println("Voce escolheu a moto GSX-R1000! ");
					cliente1.alugarVeiculo(moto3);
					break;
				case 4:
					System.out.println("Voce escolheu a moto Ninja ZX-10R! ");
					cliente1.alugarVeiculo(moto4);
					break;
					
				case 5:
					System.out.println("Voce escolheu a moto Panigale V4! ");
					cliente1.alugarVeiculo(moto5);
					break;
				case 6:
					System.out.println("Voce escolheu a moto Sportster Iron 883! ");
					cliente1.alugarVeiculo(moto6);
					break;
				case 7:
					System.out.println("Voce escolheu a moto S1000RR! ");
					cliente1.alugarVeiculo(moto7);
					break;
				case 8:
					System.out.println("Voce escolheu a moto Duke 390! ");
					cliente1.alugarVeiculo(moto8);
					break;
				case 9:
					System.out.println("Voce escolheu a moto Street Triple RS! ");
					cliente1.alugarVeiculo(moto9);
					break;
				case 10:
					System.out.println("Voce escolheu a moto RSV4! ");
					cliente1.alugarVeiculo(moto10);
					break;
			default:
				System.out.println("SAINDO DO SISTEMA.");
				break;
			}
		}
			break;
		case 2:
			System.out.println("Voce selecionou a Argentina! Iremos te mostrar as opcoes de veiculos disponiveis.");
			exibirMenu2();
			opcao2 = entrada.nextInt();
			switch(opcao2) {
			case 1:
				for (Veiculo veiculo : veiculos) {
			          if (veiculo.isDisponivel()) {
			                System.out.println("----"+ veiculo.getFabricante() + " " + veiculo.getModelo() + 
			                " (" + veiculo.getAno() + ")" + veiculo.getCor() + veiculo.getCapacidade() 
			                + veiculo.getPreco() + veiculo.getTipoCombustivel() + veiculo.getPlaca()+
			                veiculo.getKmRodados());
			         }
				}
				//civic
				opcao2 = entrada.nextInt();
				switch(opcao2) {
				case 1:
					System.out.println("Voce escolheu o carro Jetta! ");
					cliente1.alugarVeiculo(carro1);
					break;
				case 2:
					System.out.println("Voce escolheu o carro Civic! ");
					cliente1.alugarVeiculo(carro2);
					break;
				case 3:
					System.out.println("Voce escolheu o carro Cruze! ");
					cliente1.alugarVeiculo(carro3);
					break;
				case 4:
					System.out.println("Voce escolheu o carro BMW Serie 5! ");
					cliente1.alugarVeiculo(carro4);
					break;
					
				case 5:
					System.out.println("Voce escolheu o carro C300! ");
					cliente1.alugarVeiculo(carro5);
					break;
				case 6:
					System.out.println("Voce escolheu o carro Range Rover Evoque! ");
					cliente1.alugarVeiculo(carro6);
					break;
				case 7:
					System.out.println("Voce escolheu o carro Hyundai Elantra! ");
					cliente1.alugarVeiculo(carro7);
					break;
				case 8:
					System.out.println("Voce escolheu o carro Fiesta! ");
					cliente1.alugarVeiculo(carro8);
					break;
				case 9:
					System.out.println("Voce escolheu o carro Corola! ");
					cliente1.alugarVeiculo(carro9);
					break;
				case 10:
					System.out.println("Voce escolheu o carro F-Type! ");
					cliente1.alugarVeiculo(carro10);
					break;
				default:
					System.out.println("SAINDO DO SISTEMA.");
					break;
				}
				break;
			case 2:
				
				break;
			default:
				System.out.println("SAINDO DO SISTEMA.");
				break;
			}
			opcao2 = entrada.nextInt();
			switch(opcao2) {
			case 1:
				System.out.println("Voce escolheu a moto ! CBR 1000RR");
				cliente1.alugarVeiculo(moto1);
				break;
			case 2:
				System.out.println("Voce escolheu a moto YZF R6 ! ");
				cliente1.alugarVeiculo(moto2);
				break;
			case 3:
				System.out.println("Voce escolheu a moto GSX-R1000! ");
				cliente1.alugarVeiculo(moto3);
				break;
			case 4:
				System.out.println("Voce escolheu a moto Ninja ZX-10R! ");
				cliente1.alugarVeiculo(moto4);
				break;
				
			case 5:
				System.out.println("Voce escolheu a moto Panigale V4! ");
				cliente1.alugarVeiculo(moto5);
				break;
			case 6:
				System.out.println("Voce escolheu a moto Sportster Iron 883! ");
				cliente1.alugarVeiculo(moto6);
				break;
			case 7:
				System.out.println("Voce escolheu a moto S1000RR! ");
				cliente1.alugarVeiculo(moto7);
				break;
			case 8:
				System.out.println("Voce escolheu a moto Duke 390! ");
				cliente1.alugarVeiculo(moto8);
				break;
			case 9:
				System.out.println("Voce escolheu a moto Street Triple RS! ");
				cliente1.alugarVeiculo(moto9);
				break;
			case 10:
				System.out.println("Voce escolheu a moto RSV4! ");
				cliente1.alugarVeiculo(moto10);
				break;
		default:
			System.out.println("SAINDO DO SISTEMA.");
			break;
			}
			break;
			
		case 3:
			System.out.println("Voce selecionou o Paraguai! Iremos te mostrar as opcoes de veiculos disponiveis.");
			exibirMenu2();
			opcao2 = entrada.nextInt();
			switch(opcao2) {
			case 1:
				for (Veiculo veiculo : veiculos) {
			          if (veiculo.isDisponivel()) {
			                System.out.println("----"+ veiculo.getFabricante() + " " + veiculo.getModelo() + 
			                " (" + veiculo.getAno() + ")" + veiculo.getCor() + veiculo.getCapacidade() 
			                + veiculo.getPreco() + veiculo.getTipoCombustivel() + veiculo.getPlaca()+
			                veiculo.getKmRodados());
			         }
				}
				//civic
				opcao2 = entrada.nextInt();
				switch(opcao2) {
				case 1:
					System.out.println("Voce escolheu o carro Jetta! ");
					cliente1.alugarVeiculo(carro1);
					break;
				case 2:
					System.out.println("Voce escolheu o carro Civic! ");
					cliente1.alugarVeiculo(carro2);
					break;
				case 3:
					System.out.println("Voce escolheu o carro Cruze! ");
					cliente1.alugarVeiculo(carro3);
					break;
				case 4:
					System.out.println("Voce escolheu o carro BMW Serie 5! ");
					cliente1.alugarVeiculo(carro4);
					break;
					
				case 5:
					System.out.println("Voce escolheu o carro C300! ");
					cliente1.alugarVeiculo(carro5);
					break;
				case 6:
					System.out.println("Voce escolheu o carro Range Rover Evoque! ");
					cliente1.alugarVeiculo(carro6);
					break;
				case 7:
					System.out.println("Voce escolheu o carro Hyundai Elantra! ");
					cliente1.alugarVeiculo(carro7);
					break;
				case 8:
					System.out.println("Voce escolheu o carro Fiesta! ");
					cliente1.alugarVeiculo(carro8);
					break;
				case 9:
					System.out.println("Voce escolheu o carro Corola! ");
					cliente1.alugarVeiculo(carro9);
					break;
				case 10:
					System.out.println("Voce escolheu o carro F-Type! ");
					cliente1.alugarVeiculo(carro10);
					break;
				default:
					System.out.println("SAINDO DO SISTEMA.");
					break;
				}
				break;
			case 2:
				
				break;
			default:
				System.out.println("SAINDO DO SISTEMA.");
				break;
			}
			opcao2 = entrada.nextInt();
			switch(opcao2) {
			case 1:
				System.out.println("Voce escolheu a moto ! CBR 1000RR");
				cliente1.alugarVeiculo(moto1);
				break;
			case 2:
				System.out.println("Voce escolheu a moto YZF R6 ! ");
				cliente1.alugarVeiculo(moto2);
				break;
			case 3:
				System.out.println("Voce escolheu a moto GSX-R1000! ");
				cliente1.alugarVeiculo(moto3);
				break;
			case 4:
				System.out.println("Voce escolheu a moto Ninja ZX-10R! ");
				cliente1.alugarVeiculo(moto4);
				break;
				
			case 5:
				System.out.println("Voce escolheu a moto Panigale V4! ");
				cliente1.alugarVeiculo(moto5);
				break;
			case 6:
				System.out.println("Voce escolheu a moto Sportster Iron 883! ");
				cliente1.alugarVeiculo(moto6);
				break;
			case 7:
				System.out.println("Voce escolheu a moto S1000RR! ");
				cliente1.alugarVeiculo(moto7);
				break;
			case 8:
				System.out.println("Voce escolheu a moto Duke 390! ");
				cliente1.alugarVeiculo(moto8);
				break;
			case 9:
				System.out.println("Voce escolheu a moto Street Triple RS! ");
				cliente1.alugarVeiculo(moto9);
				break;
			case 10:
				System.out.println("Voce escolheu a moto RSV4! ");
				cliente1.alugarVeiculo(moto10);
				break;
		default:
			System.out.println("SAINDO DO SISTEMA.");
			break;
			}
			break;	
		}
		
		//contrato final
		System.out.println("Durante os " + data + " dias, o valor da diaria vai ser por R$ 250 per dia, "
				+ "logo, o resultado total do seu aluguel e de: " + (data*250) );
		//cliente1.pagarDiaria();
		System.out.println("Confirme a compra escrevendo seu nome: ");
		String contrato;
		contrato = entrada.next();
			System.out.println("O seu contrato foi concluido. Seu veiculo foi alugado. Muito obrigado pela confianca. VOLTE SEMPRE!");
		
	}
	

	//menus!
	private static void exibirMenu() {
		System.out.println("Na OASIS, trabalhamos com paises da america latina! "
		+ "Selecione um pais para retirada, e iremos mostrar os veiculos disponiveis. ");
		System.out.println("1 - BRASIL");
		System.out.println("2 - ARGENTINA");
		System.out.println("3 - PARAGUAI");
		System.out.println("0 - SAIR");
	}
	private static void exibirMenu2() {
		System.out.println("Escolha o tipo de veiculo desejado: ");
		System.out.println("1 - CARRO");
		System.out.println("2 - MOTO");
	}
	
 }

     

        

        
        
        


