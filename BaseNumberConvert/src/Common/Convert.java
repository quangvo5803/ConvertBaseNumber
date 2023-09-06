package Common;

public class Convert {
    public static final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    //Convert from Binary to Decimal
    public static String convertBinaryToDecimal(String binary){
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }
    //Convert from Decimal to Hexa
    public static String convertDecimalToHexa(String decimal){
        String hexa ="";
        int dec = Integer.parseInt(decimal);
        while(dec !=0 ){
            hexa = hexDigits[dec%16] + hexa;
            dec /= 10;
        }
        return hexa;
    }
    //Convert from Binaray to Hexadecimal
    public static String convertBinaryToHexa(String binary){
        String decimal = convertBinaryToDecimal(binary);
        String hex = convertDecimalToHexa(decimal);
        return hex;
    }

    //Convert From Hexal to Decimal
    public static String convertHexaToDecimal(String hex){
        int decimal = Integer.parseInt(hex,16);
        return Integer.toString(decimal);
    }

    //Convert From Decimal to Binary
    public static String convertDecimalToBinary(String decimal){
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }
    //Convert From Hexal to Binary
    public static String convertHexaTiBinary(String hex){
        String decimal = convertHexaToDecimal(hex);
        String binary = convertDecimalToBinary(decimal);
        return binary;
    }



}
