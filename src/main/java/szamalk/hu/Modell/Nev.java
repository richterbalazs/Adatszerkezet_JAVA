package szamalk.hu.Modell;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Nev {
    private String jel;
    String[][] rajz=new String[3][8];

    public Nev(String jel) {
        this.jel = jel;
    }
    public void kirajzol(){
        rajz= new String[][]{
                {jel, jel, " ", " ", " ", " ", " ", " ", " ",},
                {jel, " ", jel, " ", " ", " ", " ", " ", " ",},
                //{jel, jel, jel, jel, jel, jel, jel, jel, jel,},
                {jel, jel, "", " ", " ", " ", " ", " ", " ",},
                {jel, " ", jel, " ", " ", " ", " ", " ", " ",},
                {jel, jel, " ", " ", " ", " ", " ", " ", " ",}
        };


        for( int i = 0; i < rajz.length; i++ )
        {
            for( int j = 0; j < rajz[i].length; j++ )
            {
// egymás mellé írom ki egy sor elemeit
                System.out.print(rajz[i][j]+" ");
            }
// ha végeztem egy sor kiírásával, akkor új sort kezdek
            System.out.println();
        }
    }

    public int jelekMegszamlalasaSorban(int sor){
        int darabSzam = 0;
        for(int i = 0; i < rajz[sor].length; i++){
            if(rajz[sor][i] == jel){
                darabSzam++;
            }
        }
        return darabSzam;
    }

    public int jelekMegszamlalasaOszlopban(int oszlop){
        int darabSzam = 0;
        for(int i = 0; i < rajz.length; i++){
            if(rajz[i][oszlop] == jel){
                darabSzam++;
            }
        }
        return darabSzam;
    }

    public boolean oszlopTelivanE(int oszlop){
        boolean telivan = true;
        for(int i = 0; i < rajz.length; i++) {
            if(rajz[i][oszlop] != jel){
                telivan = false;
            }
        }
        return telivan;
    }

    public boolean sorTelivanE(int sor){
        boolean telivan = true;
        for(int i = 0; i < rajz.length; i++) {
            if(rajz[sor][i] != jel){
                telivan = false;
            }
        }
        return telivan;
    }

    @Override
    public String toString() {
        return "Nev{" +
                "jel='" + jel + '\'' +
                ", rajz=" + Arrays.toString(rajz) +
                '}';
    }
}

