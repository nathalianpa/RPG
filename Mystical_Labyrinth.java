/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 
 * Nathalia Pereira Alves
 * Patricia Faustino Ferreira
 * Miriã Oliveira Machado
 * Isabella Bezerra Januario Silva
 * Laisa Beatriz Alves da Silva
 * 
 */
public class Mystical_Labyrinth {
    public static void main(String[] args) {
        Random gerador = new Random();
        
        String personagens[] = {
            "Historiador", "Cavaleira", "Médica", "Mago"
        };
        
        int personagensPosicao = 0;
        
        int personagensVidas[] = {
            3, 3, 3, 3
        };
        
        String decisoes[] = {
            "-> Que a sorte esteja ao seu lado!",
            "-> Começamos bem até aqui, não é mesmo? Mas fique atento, grandes perigos podem estar a sua espera!",
            "-> O desafio está começando a esquentar, seja bem vindo ao Deserto! Apesar da forte ventania no local, é possível avistar de longe mantimentos que poderão ser de grande ajuda nos próximos passos, como: água, comida, poções mágicas e curativos. Porém cabe a você, jogador, escolher o lado correto para conseguir pegar esses mantimentos.",
            "-> Você se deparou com dois caminhos diferentes: o direito, que é escuro e parece perigoso,  e o esquerdo, que é estreito e há armadilhas.",
            "-> Você chegou a um caminho sem saída, há uma grande parede em sua frente. Você prefere voltar atrás ou tentar escalar a parede?",
            "-> Você se deparou com uma ponte deteriorada e um caminho que lhe parece mais seguro, qual você deseja seguir?",
            "-> Escolha o lado direito para atravessar a ponte de artefatos egípcios ou o lado esquerdo para atravessar o chão de areia.",
            "-> Escolha o lado direito para passar pelo caminho estreito ou o lado esquerdo para passar pelo caminho espaçoso. (Observação: em um dos dois lados você irá encontrar a tumba do faraó, podendo estar aberta ou não).",
            "-> Ande reto ou vire para o lado esquerdo, ambos os caminhos estão escuros e apenas o sabre de luz da cavaleira pode iluminar, caso você seja a cavaleira, prossiga, caso não seja, peça sua ajuda, ela irá escolher o caminho e te guiar!",
            "-> Escolha o lado direito para lutar com a Múmia, ou o lado esquerdo para lidar com uma armadilha de Osíris.",
            "-> Agora é questão de vida ou morte, jogue o dado, se cair número ímpar, ande para a esquerda, se cair número par, ande para a direita. Que a sorte decida o seu destino!",
            "-> Escolha o lado esquerdo para resolver um enigma ou o lado direito para lidar com uma armadilha.",
            "-> Escolha o lado direito para resolver um enigma ou o lado esquerdo para um desafio de combate com a divindade egípcia Hórus.",
            "-> Você se deparou com duas direções, agora escolha!",
            "-> Você se deparou com duas direções, agora escolha!"            
        };
        
        int decisoesPosicao = 0;
        
        String decisoesDirecoesDireita[] = {
            "Lado direito: Sucesso! Você atravessou a tumba do Faraó e conseguiu chegar até o outro lado são e salvo.",
            "Lado direito: Que azar! Você escorregou em uma armadilha que poderá te levar a uma queda sem fim. Peça a ajuda de um de seus companheiros para te resgatar.",
            "Lado direito: Parabéns! Seguindo por este lado a ventania não estava tão forte, você conseguiu atravessar o deserto e pegar com sucesso todos os mantimentos. Siga em frente!",
            "Lado direito: Apesar da escuridão assustadora, você atravessou tranquilamente e conseguiu passar ao outro lado.",
            "Voltar atrás:  Você voltou atrás e procurou um caminho alternativo para continuar sua aventura, porém, se deparou com uma areia movediça e acabou ficando preso. Infelizmente está fora do jogo.",
            "Seguir pela ponte:  Você segue pela ponte com apreensão, as cordas que a mantinham presa pareciam querer romper a qualquer instante. Do outro lado, você  acaba encontrando diversos artefatos egípcios e segue sua aventura.",
            "Lado direito: Você escolheu o lado direito e enquanto atravessava a ponte caiu no 4º artefato chamado Pedra de Rosetta, que estava rachado. Perdeu 1 vida.",
            "Lado direito: Você escolheu o lado direito e passou pelo caminho estreito, levou alguns arranhões, mas passa bem. Siga em frente sem olhar para trás.",
            "Lado direito: Estava apenas escuro, sem nenhum impedimento, prossiga ao seu destino.",
            "Lado direito: Haverá o túmulo da Múmia, caso escolha esse lado, lute com ela. Ganha 2 vidas.",
            "Lado direito: As paredes estão se fechando e você não tem para onde correr, fim de jogo para você.",
            "Lado direito: Você escolheu o lado direito, se for para a esquerda irá encontrar uma plataforma com diversos pisos, encontre os pisos corretos para o portal se abrir, caso não encontre os pisos corretos, perderá 1 vida",
            "Lado direito: Se você escolheu o lado direito, terá um desafio de encontrar um pergaminho mágico que irá abrir um portal na pirâmide egípcia, caso não consiga abrir este portal, perderá 1 vida.",
            "Lado direito: Você escolheu o lado direito e irá encontrar Osíris, lute com ele e ganhe.",
            "Lado direito: Irá encontrar magia branca para enfrentar seus inimigos. Mas tome cuidado com os vestígios de sangue espalhados pelo caminho. Você acaba de encostar em um vestígio de sangue e perdeu 1 vida."  
        };
        
        int decisoesDirecoesDireitaVidas[] = {
            0, 0, 0, 0, -100, 0, -1, 0, 0, 2, -100, -1, -1, 0, -1
        };
        
        String decisoesDirecoesEsquerda[] = {
            "Lado esquerdo: Cuidado, nesta parte do labirinto há diversos tipos de armadilhas no chão para proteger a tumba contra ladrões, qualquer piso em falso poderá perder uma vida.",
            "Lado esquerdo: Foi uma caminhada complicada, mas vocês conseguiram chegar são e salvos até o Deserto. E como recompensa, pegue estas poções que possuem o poder de força bruta.",
            "Lado esquerdo: Que pena! Houve turbulências durante o caminho devido a grande ventania e tempestade de areia, devido a isto, não foi possível pegar os mantimentos. Mas não desista, siga em frente e destinado a vencer!",
            "Lado esquerdo: A passagem não foi fácil. Mesmo tentando ser o mais cauteloso possível, você foi atingido por umas das armadilhas.",
            "Escalar a parede: Você começou a escalar a parede, e conseguiu chegar ao outro lado com sucesso.",
            "Seguir caminho: Você segue pelo caminho e encontra uma poção de regeneração.",
            "Lado esquerdo: Você escolheu o lado esquerdo, ótima escolha! Atravessou pelo chão de areia e chegou ao outro lado facilmente apesar da sujeira.",
            "Lado esquerdo: Você escolheu o lado esquerdo e deu de cara com a tumba do faraó aberta e ela está vazia, CORRA!",
            "Lado esquerdo: Havia aberturas no chão e a cavaleira caiu em uma delas, caso você seja a cavaleira, perderá 1 vida. Caso você não seja a cavaleira, perderá 1 vida vida para ajudar sua companheira de equipe.",
            "Lado esquerdo: Haverá uma armadilha no meio do caminho, caso escolha esse lado, roube suas poções.",
            "Lado esquerdo: Você ganhou 3 vidas.",
            "Lado esquerdo: Você escolheu o lado esquerdo e enquanto passava por uma esfinge, havia uma armadilha, despercebido, caiu em uma poça de lamas, logo perdeu 2 vidas.",
            "Lado esquerdo: Se você escolheu o lado esquerdo, terá de enfrentar Hórus em um desafio, esse desafio consiste em pegar uma chave em que Hórus carrega em sua mão esquerda, essa chave lhe dará poderes para combater os próximos desafios, mas antes disso, terá de lutar contra Hórus.",
            "Lado esquerdo: Você escolheu o lado esquerdo e irá encontrar um poço negro de Anúbis. Mas infelizmente cai no poço e será “Game Over”.",
            "Lado esquerdo: Irá encontrar Hórus com sua magia. Lute com ele e ganhe, mas perde sua magia e 1 vida. Se optar por não lutar, estará fora do jogo."      
        };
        
        int decisoesDirecoesEsquerdaVidas[] = {
            -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 2, -2, 0, -100, -1
        };
        
        String desafios[] = {
            "-> Você terá de escolher entre pedir ajuda ou seguir em frente.",
            "-> Hórus  e Osíris estão em ataque! Caso esteja jogando com mais pessoas, você pode pedir ajuda, mas lembre-se que, ao pedir ajuda, você perderá uma vida.",
            "-> Seth, o Deus do Caos está bravo pela derrota de seu irmão Osíris, e não poupará forças para sua vingança, se prepare para o próximo inimigo.",
            "-> Suas escolhas te levaram a um caminho sem volta, agora enfrente a fúria da Múmia em um duelo! Caso esteja jogando com mais pessoas, você pode pedir ajuda, mas lembre-se que, ao pedir ajuda, você perderá uma vida.",
            "-> Você encostou em uma parede falsa dentro do labirinto e foi parar em um corredor repleto de artefatos, caso você não seja o historiador, peça sua ajuda para distinguir quais artefatos podem ser retirados do corredor sem causar desmoronamento das paredes e os leve consigo para te ajudar a lutar contra o faraó quando o esbarrar pelo caminho.",
            "-> Você encontrou Anúbis, o Deus do Submundo. Para  derrotá-lo, terá de enfrentá-lo, escolha entre as opções:",
            "-> Que tal enfraquecer um dos seus inimigos e ter vantagem para lutar contra ele? Faça sua escolha e se vingue! Observação: O jogador deverá escolher um de seus inimigos que lutou até aqui, para um novo duelo.Escolha entre: lutar sozinho, pedir ajuda.",
            "-> Cleópatra irá proteger o Faraó com todas as suas forças. O fim está próximo, mantenham-se firme, fortes e juntos para vencer esta próxima batalha."           
        };
        
        int desafiosPosicao = 0;
        
        String desafiosComAjuda[] = {
            "Pedir ajuda : Enquanto estava caminhando no deserto, despercebido, acaba caindo em uma armadilha, irá perder 1 ponto de vida.",
            "Pedir ajuda: Você pediu ajuda. Juntos vocês derrotaram as criaturas facilmente.",
            "Pedir ajuda: Ao pedir ajuda, você precisou cuidar de seus amigos, devido a isto, obteve um dano de menos -2 pontos de vida.",
            "Pedir ajuda: Você pediu ajuda! Juntos vocês derrotaram a múmia com braveza.",
            "Pedir ajuda: O Historiador conseguiu passar pela fase com sucesso.",
            "Pedir ajuda: O time lutou bravamente contra o inimigo, porém tiveram ferimentos graves, e todos perderam 1 ponto de vida.",
            "Pedir ajuda: Você pediu ajuda aos seus colegas, porém irá perder 1 vida.",
            "Pedir ajuda: Você pediu ajuda aos seus colegas, porém irá perder 2 vidas."           
        };
        
        int desafiosComAjudaVidas[] = {
            -1, 0, -2, 0, 0, -1, -1, -2    
        };
        
        String desafiosSemAjuda[] = {
            "Seguir em frente: Ao seguir em frente você se depara com uma escrita sagrada, decifre a para poder seguir em frente e obter um 2 vidas extras.",
            "Lutar sozinho: Você lutou contra as duas entidades com dificuldade, mas conseguiu derrotá-las, apesar do corte no braço.",
            "Lutar sozinho: Você lutou bravamente e derrotou Seth com sucesso! E como recompensa, receba + 3 pontos devida.",
            "Lutar sozinho: Você lutou bravamente contra a múmia e a derrotou sem levar dano.",
            "Lutar sozinho: Ao atravessar esta fase, houve desmoronamento, mas você conseguiu chegar até o outro lado com apenas alguns ferimentos.",
            "Lutar sozinho: Anúbis fala: Estou impressionado com sua coragem, em vir sozinho me enfrentar, como reconhecimento, eu irei te poupar e como recompensa te darei 2 vidas extras.",
            "Lutar sozinho: Você irá derrotar um dos seus inimigos, apesar dos ferimentos, perdeu 2 vidas, mais irá ganhar o que o inimigo deixar cair.",
            "Lutar sozinho: Você derrotou a Cleópatra sem se ferir."          
        };
        
        int desafiosSemAjudaVidas[] = {
            2, 0, 3, 0, 0, 2, -2, 0
        };
        
        boolean inicioDoJogo = true;
        boolean inicioDaOpcao = true;
        
        System.out.println("Bem vindo ao Mystical Labyrinth!");
        System.out.println("...");
        System.out.println("No início desta aventura, você poderá escolher qual destino deseja começar a trilhar neste labirinto. Mas lembre-se: Ao realizar sua escolha, poderá seguir o caminho da luz, ou das trevas.");
        System.out.println("...");
        
        while(inicioDoJogo) {
            if(personagensPosicao > 3) {
                personagensPosicao = 0;
                continue;
            }
            
            if(personagensVidas[0] <= 0 && personagensVidas[1] <= 0 && personagensVidas[2] <= 0 && personagensVidas[3] <= 0) {
                System.out.println("Fim do jogo, todos morreram!");
                inicioDoJogo = false;
                continue;
            }
                        
            if(personagensVidas[personagensPosicao] <= 0) {                
                personagensPosicao = personagensPosicao + 1;
                continue;
            }
            
            System.out.println("Olá personagem " + personagens[personagensPosicao] + "...");
            System.out.println("");
            
            if(decisoesPosicao >= decisoes.length && desafiosPosicao >= desafios.length) {
                System.out.println("Você terá de lutar com o Faraó, a autoridade máxima do Egito.");
                
                do {
                    System.out.println("Escolha entre: pedir ajuda (tecle 1) ou lutar sozinho (tecle 2).");
                    Scanner sc = new Scanner(System.in);
                    String opcao = sc.next();
                    
                    if(opcao.equals("1")) {
                        System.out.println("Pedir ajuda: Você pediu ajuda. Juntos vocês lutaram contra o Faraó. A batalha não fora fácil e perderam muita vida, entretanto, derrotaram o Faraó e conseguiram vencer o jogo. Parabéns a todos! Agora estão livres do labirinto.");
   
                        inicioDaOpcao = false;
                    } else if(opcao.equals("2")) {
                        System.out.println("Lutar sozinho: Os golpes do Faraó foram muito fortes e você não conseguiu vencê-lo. Você morreu e acabou com as chances de todos os seus amigos. Todos morreram, fim do jogo!!!");
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] - 100;
                        inicioDaOpcao = false;
                    } else {
                        System.out.println("Opção inválida...");
                        inicioDaOpcao = true;
                    }
                    
                    System.out.println("Fim do jogo!!!");
                        
                } while(inicioDaOpcao);
                
                      
                inicioDoJogo = false;
                continue;
            }
            
            if(desafiosPosicao >= desafios.length) {
                System.out.println("" + decisoes[decisoesPosicao]);
                System.out.println("");
                
                do {
                    System.out.println("Escolha entre: lado direito (tecle 1) ou lado esquerdo (tecle 2).");
                    Scanner sc = new Scanner(System.in);
                    String opcao = sc.next();
                    
                    if(opcao.equals("1")) {
                        System.out.println("" + decisoesDirecoesDireita[decisoesPosicao]);
                        
                        if(decisoesDirecoesDireitaVidas[decisoesPosicao] > 0) {
                            System.out.println("Você ganhou " + decisoesDirecoesDireitaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(decisoesDirecoesDireitaVidas[decisoesPosicao] < 0) {
                            System.out.println("Você perdeu " + decisoesDirecoesDireitaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + decisoesDirecoesDireitaVidas[decisoesPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else if(opcao.equals("2")) {
                        System.out.println("" + decisoesDirecoesEsquerda[decisoesPosicao]);
                        
                        if(decisoesDirecoesEsquerdaVidas[decisoesPosicao] > 0) {
                            System.out.println("Você ganhou " + decisoesDirecoesEsquerdaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(decisoesDirecoesEsquerdaVidas[decisoesPosicao] < 0) {
                            System.out.println("Você perdeu " + decisoesDirecoesEsquerdaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + decisoesDirecoesEsquerdaVidas[decisoesPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else {
                        System.out.println("Opção inválida...");
                        inicioDaOpcao = true;
                    } 
                } while(inicioDaOpcao);
                
                decisoesPosicao = decisoesPosicao + 1;
                personagensPosicao = personagensPosicao + 1;
                continue;
            }
            
             if(decisoesPosicao >= decisoes.length) {
                System.out.println("" + desafios[desafiosPosicao]);
                System.out.println("");
                
                do {
                    System.out.println("Escolha entre: pedir ajuda (tecle 1) ou lutar sozinho (tecle 2).");
                    Scanner sc1 = new Scanner(System.in);
                    String opcao = sc1.next();
                    
                    if(opcao.equals("1")) {
                        System.out.println("" + desafiosComAjuda[desafiosPosicao]);
                        
                        if(desafiosComAjudaVidas[desafiosPosicao] > 0) {
                            System.out.println("Você ganhou " + desafiosComAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(desafiosComAjudaVidas[desafiosPosicao] < 0) {
                            System.out.println("Você perdeu " + desafiosComAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        }
     
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + desafiosComAjudaVidas[desafiosPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else if(opcao.equals("2")) {
                        System.out.println("" + desafiosSemAjuda[desafiosPosicao]);
                        
                        if(desafiosSemAjudaVidas[desafiosPosicao] > 0) {
                            System.out.println("Você ganhou " + desafiosSemAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(desafiosSemAjudaVidas[desafiosPosicao] < 0) {
                            System.out.println("Você perdeu " + desafiosSemAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + desafiosSemAjudaVidas[desafiosPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else {
                        System.out.println("Opção inválida...");
                        inicioDaOpcao = true;
                    } 
                } while(inicioDaOpcao);
                
                desafiosPosicao = desafiosPosicao + 1;
                personagensPosicao = personagensPosicao + 1;
                continue;
            }        
            
            System.out.println("Pressione qualquer tecla + Enter, para rolar o dado.");
            System.out.println("");
            
            Scanner enter = new Scanner(System.in);
            enter.next();
            
            int dado = gerador.nextInt((6 - 1) + 1) + 1;
            System.out.println("O dado rolou e retornou o número " + dado);
            System.out.println("");
            
            if(dado % 2 != 0) {
                System.out.println("Este número é ímpar, seu próximo passo será uma fase de Decisão!");
                System.out.println("~~~~~~~~~~~~~~~~~~");
                
                System.out.println("" + decisoes[decisoesPosicao]);
                System.out.println("");
                
                do {
                    System.out.println("Escolha entre: lado direito (tecle 1) ou lado esquerdo (tecle 2).");
                    Scanner sc = new Scanner(System.in);
                    String opcao = sc.next();
                    
                    if(opcao.equals("1")) {
                        System.out.println("" + decisoesDirecoesDireita[decisoesPosicao]);
                        
                        if(decisoesDirecoesDireitaVidas[decisoesPosicao] > 0) {
                            System.out.println("Você ganhou " + decisoesDirecoesDireitaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(decisoesDirecoesDireitaVidas[decisoesPosicao] < 0) {
                            System.out.println("Você perdeu " + decisoesDirecoesDireitaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + decisoesDirecoesDireitaVidas[decisoesPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else if(opcao.equals("2")) {
                        System.out.println("" + decisoesDirecoesEsquerda[decisoesPosicao]);
                        
                        if(decisoesDirecoesEsquerdaVidas[decisoesPosicao] > 0) {
                            System.out.println("Você ganhou " + decisoesDirecoesEsquerdaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(decisoesDirecoesEsquerdaVidas[decisoesPosicao] < 0) {
                            System.out.println("Você perdeu " + decisoesDirecoesEsquerdaVidas[decisoesPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + decisoesDirecoesEsquerdaVidas[decisoesPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else {
                        System.out.println("Opção inválida...");
                        inicioDaOpcao = true;
                    } 
                } while(inicioDaOpcao);
                
                decisoesPosicao = decisoesPosicao + 1;
                personagensPosicao = personagensPosicao + 1;
                continue;     
            } else {
                System.out.println("Este número é par, seu próximo passo será uma fase de Desafio!");
                System.out.println("~~~~~~~~~~~~~~~~~~");
                
                System.out.println("" + desafios[desafiosPosicao]);
                System.out.println("");
                
                do {
                    System.out.println("Escolha entre: pedir ajuda (tecle 1) ou lutar sozinho (tecle 2).");
                    Scanner sc1 = new Scanner(System.in);
                    String opcao = sc1.next();
                    
                    if(opcao.equals("1")) {
                        System.out.println("" + desafiosComAjuda[desafiosPosicao]);
                        
                        if(desafiosComAjudaVidas[desafiosPosicao] > 0) {
                            System.out.println("Você ganhou " + desafiosComAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(desafiosComAjudaVidas[desafiosPosicao] < 0) {
                            System.out.println("Você perdeu " + desafiosComAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        }
     
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + desafiosComAjudaVidas[desafiosPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else if(opcao.equals("2")) {
                        System.out.println("" + desafiosSemAjuda[desafiosPosicao]);
                        
                        if(desafiosSemAjudaVidas[desafiosPosicao] > 0) {
                            System.out.println("Você ganhou " + desafiosSemAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        } else if(desafiosSemAjudaVidas[desafiosPosicao] < 0) {
                            System.out.println("Você perdeu " + desafiosSemAjudaVidas[desafiosPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        personagensVidas[personagensPosicao] = personagensVidas[personagensPosicao] + desafiosSemAjudaVidas[desafiosPosicao];
                        
                        if(personagensVidas[personagensPosicao] <= 0) {
                            System.out.println("Você morreu!");
                            System.out.println("");
                        } else {
                            System.out.println("Você possui " + personagensVidas[personagensPosicao] + " pontos de vida");
                            System.out.println("");
                        }
                        
                        inicioDaOpcao = false;
                    } else {
                        System.out.println("Opção inválida...");
                        inicioDaOpcao = true;
                    } 
                } while(inicioDaOpcao);
                
                desafiosPosicao = desafiosPosicao + 1;
                personagensPosicao = personagensPosicao + 1;
                continue;
            }        
        }
    }   
}
