package jogoDaVelha;

public class Jogo{
    private char vencedor;

    public char verificarVencedor(String[] tab)
    {
        for(int i = 0; i < 8; i++)
        {
            String v = null;
            switch (i){
                case 0:
                    v = tab[0] + tab[1] + tab[2];
                    break;
                case 1:
                    v = tab[3] + tab[4] + tab[5];
                    break;
                case 2:
                    v = tab[6] + tab[7] + tab[8];
                    break;
                case 3:
                    v = tab[0] + tab[3] + tab[6];
                    break;
                case 4:
                    v = tab[1] + tab[4] + tab[7];
                    break;
                case 5:
                    v = tab[2] + tab[5] + tab[8];
                    break;
                case 6:
                    v = tab[0] + tab[4] + tab[8];
                    break;
                case 7:
                    v = tab[6] + tab[4] + tab[2];
                    break;
            }
            if(v.equals("XXX"))
            {
                vencedor = 'X';
                break;
            }
            else if(v.equals("OOO"))
            {
                vencedor = 'O';
                break;
            }
            else
            {
                vencedor = '1';
            }

        }
        return vencedor;
    }
}