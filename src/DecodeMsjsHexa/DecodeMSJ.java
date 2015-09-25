/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecodeMsjsHexa;

/**
 *
 * @author Franco1703
 */
public class DecodeMSJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mjs en HEXA a decodificar
        String msj= "4573746520657320756e2065" +
                    "6a6572636963696f20706172" +
                    "612071756520707261637469" +
                    "7175656e20616c676f726974" +
                    "6d6f732c2079206465207061" +
                    "736f20616c676f206465206573" +
                    "747275637475726173206465" +
                    "206461746f732e0d0a54616c" +
                    "2076657a206c657320706172" +
                    "657a636120666163696c2c20" +
                    "65737065726f20717565206c6f" +
                    "207365612e0d0a417175656c" +
                    "20717565206c6f2072657375" +
                    "656c7661207469656e652075" +
                    "6e2070756e746f2061206661" +
                    "766f7220656e206c61206465" +
                    "66656e73612c20736f6c6f2073" +
                    "6920686163656e20656c2070" +
                    "726f6772616d612071756520" +
                    "6465636f6469666971756520" +
                    "65737465206d656e73616a65" +
                    "20646562656e20656e766961" +
                    "7220656c20636f6469676f2065" +
                    "6e20632b2b206f20656e206a" +
                    "61766120616c20636f7272656f" +
                    "0d0a706172616469676d6173" +
                    "2e75746e40676d61696c2e63" +
                    "6f6d0d0a0d0a73616c75646f73" +
                    "2e0d0a0d0a4e4f54413a2076" +
                    "616c69646f20686173746120" +
                    "656c20566965726e65732032" +
                    "352d30392d32303135206873" +
                    "3a32323a3030";
        
//        System.out.println(msj);
        for (int i=0; i < msj.length(); i++) {
            String primerasDos=msj.substring(i,i+2);
            String enAscii=getTablaAscci(primerasDos);
            System.out.print(enAscii);
            i++;
        }//for
        System.out.println("");
        
    }//end main
    
    
    
    
    //caracteres mas usados de la tabla Ascii
    public static String getTablaAscci(String letra){
        String palabraEnAscii="";
        boolean bandera = false;
        while(bandera!=true){
            if(letra.equalsIgnoreCase("20")){
                palabraEnAscii=" ";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("21")){
                palabraEnAscii="!";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("22")){
                palabraEnAscii="\"";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("23")){
                palabraEnAscii="#";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("24")){
                palabraEnAscii="$";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("25")){
                palabraEnAscii="%";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("26")){
                palabraEnAscii="&";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("27")){
                palabraEnAscii="'";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("28")){
                palabraEnAscii="(";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("29")){
                palabraEnAscii=")";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("2A")){
                palabraEnAscii="*";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("2B")){
                palabraEnAscii="+";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("2C")){
                palabraEnAscii=",";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("2D")){
                palabraEnAscii="-";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("2E")){
                palabraEnAscii=".";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("2F")){
                palabraEnAscii="/";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("30")){
                palabraEnAscii="0";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("31")){
                palabraEnAscii="1";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("32")){
                palabraEnAscii="2";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("33")){
                palabraEnAscii="3";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("34")){
                palabraEnAscii="4";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("35")){
                palabraEnAscii="5";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("36")){
                palabraEnAscii="6";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("37")){
                palabraEnAscii="7";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("38")){
                palabraEnAscii="8";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("39")){
                palabraEnAscii="9";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("3A")){
                palabraEnAscii=":";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("3B")){
                palabraEnAscii=";";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("3C")){
                palabraEnAscii="<";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("3D")){
                palabraEnAscii="=";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("3E")){
                palabraEnAscii=">";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("3F")){
                palabraEnAscii="?";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("40")){
                palabraEnAscii="@";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("41")){
                palabraEnAscii="A";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("42")){
                palabraEnAscii="B";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("43")){
                palabraEnAscii="C";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("44")){
                palabraEnAscii="D";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("45")){
                palabraEnAscii="E";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("46")){
                palabraEnAscii="F";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("47")){
                palabraEnAscii="G";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("48")){
                palabraEnAscii="H";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("49")){
                palabraEnAscii="I";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("4A")){
                palabraEnAscii="J";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("4B")){
                palabraEnAscii="K";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("4C")){
                palabraEnAscii="L";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("4D")){
                palabraEnAscii="M";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("4E")){
                palabraEnAscii="N";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("4F")){
                palabraEnAscii="O";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("50")){
                palabraEnAscii="P";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("51")){
                palabraEnAscii="Q";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("52")){
                palabraEnAscii="R";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("53")){
                palabraEnAscii="S";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("54")){
                palabraEnAscii="T";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("55")){
                palabraEnAscii="U";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("56")){
                palabraEnAscii="V";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("57")){
                palabraEnAscii="W";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("58")){
                palabraEnAscii="X";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("59")){
                palabraEnAscii="Y";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("5A")){//
                palabraEnAscii="Z";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("5B")){
                palabraEnAscii="[";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("5C")){
                palabraEnAscii="\\";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("5D")){
                palabraEnAscii="]";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("5E")){
                palabraEnAscii="^";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("5F")){
                palabraEnAscii="_";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("60")){
                palabraEnAscii="`";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("61")){
                palabraEnAscii="a";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("62")){
                palabraEnAscii="b";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("63")){
                palabraEnAscii="c";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("64")){
                palabraEnAscii="d";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("65")){
                palabraEnAscii="e";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("66")){
                palabraEnAscii="f";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("67")){
                palabraEnAscii="g";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("68")){
                palabraEnAscii="h";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("69")){
                palabraEnAscii="i";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("6A")){
                palabraEnAscii="j";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("6B")){
                palabraEnAscii="k";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("6C")){
                palabraEnAscii="l";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("6D")){
                palabraEnAscii="m";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("6E")){
                palabraEnAscii="n";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("6F")){
                palabraEnAscii="o";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("70")){
                palabraEnAscii="p";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("71")){
                palabraEnAscii="q";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("72")){
                palabraEnAscii="r";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("73")){
                palabraEnAscii="s";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("74")){
                palabraEnAscii="t";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("75")){
                palabraEnAscii="u";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("76")){
                palabraEnAscii="v";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("77")){
                palabraEnAscii="w";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("78")){
                palabraEnAscii="x";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("79")){
                palabraEnAscii="y";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("7A")){
                palabraEnAscii="z";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("7B")){
                palabraEnAscii="{";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("7C")){
                palabraEnAscii="|";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("7D")){
                palabraEnAscii="}";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("7E")){
                palabraEnAscii="~";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("7F")){
                palabraEnAscii="DEL";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("25")){
                palabraEnAscii="%";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("26")){
                palabraEnAscii="&";
                bandera=true;
                break;
            }else if(letra.equalsIgnoreCase("27")){
                palabraEnAscii="'";
                bandera=true;
                break;
            }else break;
            
        }
        
        return palabraEnAscii;
    }
    
}
