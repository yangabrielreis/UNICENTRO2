/*
xi
@version 0.5
@author Mateus de Oliveira Lopes
 */

package armazenamento;

import java.io.FileWriter;

public interface GerenciaJogadores {
  void adicionarJogador(String nome1, int pontuacao1);
  
  //void atualizarJogador(String nome1, int pontuacao1, FileWriter fw);
}
