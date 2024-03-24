package app;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int[] ataqueLeve  = new int[3];
        int[] ataquePesado  = new int[3];
        int[] defesa  = new int[3];
        int[] cura  = new int[3];
        int[] dado = new int[2];
        int[] classe = new int[2];
        String[] classePlayer = new String[2];
        String[] nomeAtaqueLeve = new String[3];
        String[] nomeAtaquePesado = new String[3];
        String[] nomeDefesa = new String[3];
        String[] nomeCura = new String[3];
        int entrada = 0;
        int confirmar = 0;

        // 0 == guerreiro
        // 1 == mago
        // 2 == arqueiro

        //guerreiro
        ataqueLeve[0] = 8;
        ataquePesado[0] = 16;
        defesa[0] = 8;
        cura[0] = 10;
        nomeAtaqueLeve[0] = "Corte Rápido";
        nomeAtaquePesado[0] = "Fúria Berserk";
        nomeDefesa[0] = "Parede de Escudos";
        nomeCura[0] = "Meditar";

        //mago
        ataqueLeve[1] = 12;
        ataquePesado[1] = 24;
        defesa[1] = 4;
        cura[1] = 10;
        nomeAtaqueLeve[1] = "Bola de Fogo";
        nomeAtaquePesado[1] = "Meteoro";
        nomeDefesa[1] = "Escudo Mágico";
        nomeCura[1] = "Regenerar";

        //arqueiro
        ataqueLeve[2] = 8;
        ataquePesado[2] = 16;
        defesa[2] = 4;
        cura[2] = 10;
        nomeAtaqueLeve[2] = "Chuva de Flechas";
        nomeAtaquePesado[2] = "Tiro de Elite";
        nomeDefesa[2] = "Desviar";
        nomeCura[2] = "Concentrar";

        // 0 == player 1
        // 1 == player 2

        //bem vindo
        for(int jogador = 0; jogador <= 1; ++jogador) {
            entrada = 0;
            if (jogador == 0) {
                JOptionPane.showMessageDialog(null, "======================\n|   Bem vindo a RPG DUEL   |\n======================");
            }
            while ((entrada < 1) || (entrada > 3) || (confirmar == 1)) {
                entrada = Integer.parseInt(JOptionPane.showInputDialog("Player " + (jogador + 1) + "\nEscolha sua classe: \n[1] Guerreiro.\n[2] Mago.\n[3] Arqueiro."));
                confirmar = 1;
                if (entrada == 1) {
                    confirmar = JOptionPane.showConfirmDialog(null,  "                            [1]  Guerreiro:\n [?] Guerreiros são exímios lutadores marciais\n sempre prontos para o combate.\nDano:          [40.0]      " + nomeAtaqueLeve[0] + ":                " + ataqueLeve[0]+ " DMG\nDefesa:      [4.00]      " + nomeAtaquePesado[0] + ":             " + ataquePesado[0] + " DMG\nVida:           [50.0]      " + nomeDefesa[0] + ":    " + defesa[0] + " DEF\nMana:         [3.00]      " + nomeCura[0] + ":                         " + cura[0] + " HP\n          [Passiva] round sem atacar +5 de vida." , "Confirmação" , JOptionPane.YES_NO_OPTION);
                    classe[jogador] = 0;
                    if (jogador == 0) {
                        classePlayer[jogador] = "Guerreiro";
                    }

                    else {
                        classePlayer[jogador] = "Guerreiro";
                    }
                }
                else if (entrada == 2) {
                    confirmar = JOptionPane.showConfirmDialog(null,  "                            [2]  Mago:\n [?] Magos são mestres das artes místicas.\nDano:          [60.0]      " + nomeAtaqueLeve[1] + ":       " + ataqueLeve[1]+ " DMG\nDefesa:      [2.00]      " + nomeAtaquePesado[1] + ":                " + ataquePesado[1] + " DMG\nVida:           [50.0]      " + nomeDefesa[1] + ":      " + defesa[1] + " DEF\nMana:         [3.00]      " + nomeCura[1] + ":            " + cura[1] + " HP\n[Passiva] round sem receber dano +1 mana." , "Confirmação" , JOptionPane.YES_NO_OPTION);
                    classe[jogador] = 1;
                    if (jogador == 1) {
                        classePlayer[jogador] = "Mago";
                    }
                    else {
                        classePlayer[jogador] = "Mago";
                    }
                }
                else if (entrada == 3) {
                    confirmar = JOptionPane.showConfirmDialog(null,  "                            [3]  Arqueiro:\n [?] Caçadores letais a longa distância,\n se adaptam a qualquer tipo de situação. \nDano:          [40.0]      " + nomeAtaqueLeve[2] + ":    " + ataqueLeve[2]+ " DMG\nDefesa:      [2.00]      " + nomeAtaquePesado[2] + ":                " + ataquePesado[2] + " DMG\nVida:           [50.0]      " + nomeDefesa[2] + ":                          " + defesa[2] + " DEF\nMana:         [3.00]      " + nomeCura[2] + ":                " + cura[2] + " HP\n         [Passiva] recebe +5 DMG e +1 DEF\n           por round, no máximo 4 vezes." , "Confirmação" , JOptionPane.YES_NO_OPTION);
                    classe[jogador] = 2;
                    if (jogador == 1) {
                        classePlayer[jogador] = "Arqueiro";
                    }
                    else {
                        classePlayer[jogador] = "Arqueiro";
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Por favor, pague o programador para liberar esta classe. XD");
                }
            }

        }
        //fim bem vindo
        int[] vidaPlayer = new int [2];
        int[] manaPlayer = new int [2];
        int[] danoTotal = new int [2];
        int[] danoRecebido = new int [2];
        int[] desistir = new int[2];
        int fimJogo = 0;
        int jogadas = 0;
        int round = 0;


        vidaPlayer[0] = 50;
        vidaPlayer[1] = 50;

        //inicio da partida

        while  (fimJogo == 0) {
            round += 1;
            for(int jogador = 0; jogador <= 1; ++jogador) {
                if (fimJogo == 1) {
                    break;
                }
                entrada = 0;
                confirmar = 1;
                if ((jogadas % 2) == 0) {
                    JOptionPane.showMessageDialog(null, "Round [ " + round + " ].");
                    if (round == 2) {
                        JOptionPane.showMessageDialog(null,"[!] As passivas estão ativas a partir deste momento!");
                    }
                }
                if (jogador == 0) {
                    danoRecebido[0] = danoTotal[1];
                    manaPlayer[0] += 3;
                    danoTotal[0] = 0;
                    if (danoRecebido[1] > 0);
                    vidaPlayer[1] -= danoRecebido[1];
                }
                if (jogador == 1) {
                    danoRecebido[1] = danoTotal[0];
                    manaPlayer[1] += 3;
                    danoTotal[1] = 0;
                    if (danoRecebido[0] > 0);
                    vidaPlayer[0] -= danoRecebido[0];
                }
                while (entrada != 5) {
                    entrada = Integer.parseInt(JOptionPane.showInputDialog("Player " + (jogador + 1) + "          Classe: " + classePlayer[jogador] + "\nVida: " + vidaPlayer[jogador] + "          Mana: " + manaPlayer[jogador] + "\nDano Total: " + danoTotal[jogador] + "\nDano Recebido: " + danoRecebido[jogador] + "\n[1] " + nomeAtaqueLeve[classe[jogador]] + ": " + ataqueLeve[classe[jogador]] + " DMG | 2 MANA.\n[2] " + nomeAtaquePesado[classe[jogador]] + ": " + ataquePesado[classe[jogador]] + " DMG | 4 MANA.\n[3] " + nomeDefesa[classe[jogador]] + ": +" + defesa[classe[jogador]] + " PROTEÇÃO | 1 MANA.\n[4] " + nomeCura[classe[jogador]] + ": +" + cura[classe[jogador]] + " VIDA | 3 MANA.\n[5] Finalizar Round.\n[6] Desistir."));
                    switch (entrada) {
                        case 1:
                            if (manaPlayer[jogador] >= 2) {
                                JOptionPane.showMessageDialog(null, "Girando dado...");
                                dado[jogador] = (int) (1 + Math.random() * (10 - 1));
                                if ((dado[jogador] >= 1) && (dado[jogador] <= 2)) {
                                    manaPlayer[jogador] -= 2;
                                    danoTotal[jogador] += ataqueLeve[classe[jogador]] / 2;
                                    JOptionPane.showMessageDialog(null, "Você desequilibra ao atacar,\nseu ataque causa metade do dano.\nDado: [ " + dado[jogador] + " ]");
                                } else if (((dado[0] >= 3) && (dado[0] <= 8))) {
                                    manaPlayer[jogador] -= 2;
                                    danoTotal[jogador] += ataqueLeve[classe[jogador]];
                                    JOptionPane.showMessageDialog(null, "Um ataque normal...\nDado: [ " + dado[jogador] + " ]");
                                } else {
                                    manaPlayer[jogador] -= 2;
                                    danoTotal[jogador] += ataqueLeve[classe[jogador]] + (ataqueLeve[classe[jogador]] / 2);
                                    JOptionPane.showMessageDialog(null, "Ataque crítico!\nSeu ataque da 50% a mais de dano.\nDado: [ " + dado[jogador] + " ]" );
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Você NÃO tem mana suficiente para realizar essa ação.");
                            }
                            break;
                        case 2:
                            if (manaPlayer[jogador] >= 4) {
                                JOptionPane.showMessageDialog(null, "Girando dado...");
                                dado[jogador] = (int) (1 + Math.random() * (10 - 1));
                                if ((dado[jogador] >= 1) && (dado[jogador] <= 2)) {
                                    manaPlayer[jogador] -= 4;
                                    danoTotal[jogador] += ataquePesado[classe[jogador]] / 2;
                                    JOptionPane.showMessageDialog(null, "Você desequilibra ao atacar,\nseu ataque causa metade do dano.\nDado: [ " + dado[jogador] + " ]");
                                } else if (((dado[jogador] >= 3) && (dado[jogador] <= 8))) {
                                    manaPlayer[jogador] -= 4;
                                    danoTotal[jogador] += ataquePesado[classe[jogador]];
                                    JOptionPane.showMessageDialog(null, "Um ataque normal...\nDado: [ " + dado[jogador] + " ]");
                                } else {
                                    manaPlayer[jogador] -= 4;
                                    danoTotal[jogador] += ataquePesado[classe[jogador]] + (ataquePesado[classe[jogador]] / 2);
                                    JOptionPane.showMessageDialog(null, "Ataque crítico!\nSeu ataque da 50% a mais de dano.\nDado: [ " + dado[jogador] + " ]");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Você NÃO tem mana suficiente para realizar essa ação.");
                            }
                            break;
                        case 3:
                            if ((manaPlayer[jogador] >= 1) && (danoRecebido[jogador] > 0)) {
                                JOptionPane.showMessageDialog(null, "Rodando dado...");
                                dado[jogador] = (int) (1 + Math.random() * (10 - 1));
                                if (dado[jogador] == 1) {
                                    manaPlayer[jogador] -= 1;
                                    danoRecebido[jogador] -= defesa[classe[jogador]] / 2;
                                    JOptionPane.showMessageDialog(null, "Você perde a postura e não consegue\n defender parte do dano.\nVocê bloqueia [" + (defesa[classe[jogador]] / 2) + "] de dano.\nDado: [ " + dado[jogador] + " ]");
                                } else if (((dado[jogador] >= 2) && (dado[jogador] <= 8))) {
                                    manaPlayer[jogador] -= 1;
                                    danoRecebido[jogador] -= defesa[classe[jogador]];
                                    JOptionPane.showMessageDialog(null, "Você bloqueia [" + defesa[classe[jogador]] + "] de dano.\nDado: [ " + dado[jogador] + " ]");
                                } else {
                                    manaPlayer[jogador] -= 1;
                                    danoRecebido[jogador] -= defesa[classe[jogador]] + (defesa[classe[jogador]] / 2);
                                    JOptionPane.showMessageDialog(null, "Você bloqueia graciosamente [" + (defesa[classe[jogador]] + (defesa[classe[jogador]] / 2)) + "] de dano.\nDado: [ " + dado[jogador] + " ]");
                                }

                            } else if ((danoRecebido[jogador] == 0) && (manaPlayer[jogador] >= 1)) {
                                confirmar = JOptionPane.showConfirmDialog(null, "Você não está recebendo nenhum dano,\n       portanto nada vai acontecer...\n          Utilizar mesmo assim?\n", "Confirmação", JOptionPane.YES_NO_OPTION);
                                if (confirmar == 1) {
                                    break;
                                } else {
                                    if (manaPlayer[jogador] >= 1) {
                                        manaPlayer[jogador] -= 1;
                                        JOptionPane.showMessageDialog(null, "Você se protege... mas nada acontece.");
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null,"Você NÃO tem mana suficiente para realizar essa ação.");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Você NÃO tem mana suficiente para realizar essa ação.");
                            }
                            if (danoRecebido[jogador] < 0) {
                                danoRecebido[jogador] = 0;
                            }
                            break;
                        case 4:
                            if ((manaPlayer[jogador] >= 3) && (vidaPlayer[jogador] == 50)) {
                                confirmar = JOptionPane.showConfirmDialog(null, "    Sua vida está no máximo,\nportanto nada vai acontecer...\n      Utilizar mesmo assim?\n", "Confirmação", JOptionPane.YES_NO_OPTION);
                                if (confirmar == 1) {
                                    break;
                                } else {
                                    if (manaPlayer[jogador] >= 3) {
                                        manaPlayer[jogador] -= 3;
                                        JOptionPane.showMessageDialog(null, "Você tenta se regenerar... mas sua vida já estava cheia.");
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null,"Você NÃO tem mana suficiente para realizar essa ação.");
                                    }
                                }

                            } else if ((manaPlayer[jogador] >= 3) && (vidaPlayer[jogador] < 50)) {
                                JOptionPane.showMessageDialog(null, "Rodando dado...");
                                dado[jogador] = (int) (1 + Math.random() * (10 - 1));
                                if (dado[jogador] == 1) {
                                    manaPlayer[jogador] -= 3;
                                    vidaPlayer[jogador] += cura[classe[0] / 2];
                                    JOptionPane.showMessageDialog(null, "Você se desconcentra e não consegue\n curar parte do dano.\nVocê cura [" + (cura[classe[jogador] / 2]) + "] de vida.\nDado: [ " + dado[jogador] + " ]");
                                } else if (((dado[jogador] >= 2) && (dado[jogador] <= 8))) {
                                    manaPlayer[jogador] -= 3;
                                    vidaPlayer[jogador] += cura[classe[0]];
                                    JOptionPane.showMessageDialog(null, "Você cura [" + cura[classe[jogador]] + "] de vida.\nDado: [ " + dado[jogador] + " ]");
                                } else {
                                    manaPlayer[jogador] -= 3;
                                    vidaPlayer[jogador] += cura[classe[jogador]] + (cura[classe[jogador]] / 2);
                                    JOptionPane.showMessageDialog(null, "Você se restaura graciosamente [" + (cura[classe[jogador]] + (cura[classe[jogador]] / 2)) + "] de cura.\nDado: [ " + dado[jogador] + " ]");
                                }

                            }
                            else  {
                                JOptionPane.showMessageDialog(null,"Você NÃO tem mana suficiente para realizar essa ação.");
                            }

                            if (vidaPlayer[jogador] > 50) {
                                vidaPlayer[jogador] = 50;
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Finalizando...");
                            jogadas += 1;
                            if ((vidaPlayer[0] <= 0) || (vidaPlayer[1] <= 0)) {
                                fimJogo = 1;
                                JOptionPane.showMessageDialog(null,"Fim de jogo!");
                                break;
                            }
                            break;
                        case 6:
                            confirmar = JOptionPane.showConfirmDialog(null,"O sucesso só é alcançado por aqueles que persistem.\n                  Tem certeza que deseja desistir?", "Confirmação", JOptionPane.YES_NO_OPTION);
                            if (confirmar == 0) {
                                fimJogo = 1;
                                JOptionPane.showMessageDialog(null,"Fim de Jogo!");
                                entrada = 5;
                                desistir[jogador] = 1;
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor, selecione uma opção entre [1] e [6]");
                    }

                }

                if (round > 1) {
                    if ((classe[jogador] == 0) && (danoTotal[jogador] == 0) && (fimJogo == 0)) {
                        if (vidaPlayer[jogador] < 50) {
                            vidaPlayer[jogador] += 5;
                            if (vidaPlayer[jogador] > 50) {
                                vidaPlayer[jogador] = 50;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "                              [Passiva]\nO Guerreiro escuta os tambores da batalha...\n                          Recebe + 5 HP.\n                          HP Total: [ " + vidaPlayer[jogador] + " ]");

                    } else if ((classe[jogador] == 1) && (danoRecebido[jogador] == 0) && (fimJogo == 0)) {
                        manaPlayer[jogador] += 1;
                        JOptionPane.showMessageDialog(null, "                              [Passiva]\nO Mago escuta a voz de seus ancestrais...\n                      Recebe + 1 Mana.\n                          Mana Total: [ " + manaPlayer[jogador] + " ]");

                    } else if ((classe[jogador] == 2) && (fimJogo == 0)) {
                        if ((ataqueLeve[2] < 12) && (ataquePesado[2] < 24)) {
                            ataqueLeve[2] += 1;
                            ataquePesado[2] += 2;
                            defesa[2] += 1;
                            JOptionPane.showMessageDialog(null, "                              [Passiva]\nO Arqueiro rastreia a fraqueza de seus inimigos...\n                          Recebe + 5 DMG.\n                          Recebe + 1 DEF.");
                        }

                    }
                }

                if ((danoRecebido[jogador] > 0) && (jogador == 1)) {
                    JOptionPane.showMessageDialog(null,"O player 2 recebeu [ " + danoRecebido[jogador] + " ] de dano este round.");
                }
                else if (danoRecebido[jogador] > 0 && (jogador == 0)) {
                    JOptionPane.showMessageDialog(null,"O player 1 recebeu [ " + danoRecebido[jogador] + " ] de dano este round.");
                }
            }
        }

        if ((vidaPlayer[0] <= 0) && (vidaPlayer[1] <= 0)) {
            JOptionPane.showMessageDialog(null,"Empate!");
        }
        else if ((vidaPlayer[0] <= 0) && (vidaPlayer[1] > 0)) {
            JOptionPane.showMessageDialog(null,"Vencedor: Player 2!");
        }
        else if ((vidaPlayer[1] <= 0) && (vidaPlayer[0] > 0)){
            JOptionPane.showMessageDialog(null,"Vencedor: Player 1!");
        }

        if ((desistir[0] == 1) && (desistir[1] == 0)) {
            JOptionPane.showMessageDialog(null,"Vencedor: Player 2!");
        }
        else if ((desistir[1] == 1) && (desistir[0] == 0)) {
            JOptionPane.showMessageDialog(null,"Vencedor: Player 1!");
        }


    }
}