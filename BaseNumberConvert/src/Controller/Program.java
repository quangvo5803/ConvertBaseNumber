package Controller;

import Common.Convert;
import Common.Validation;
import View.Menu;
import Model.Number;

public class Program extends Menu<String> {
    static String [] baseMenu = {"Convert From Hexadecimal","Convert From Decimal","Convert From Binary","Exit"};
    protected Validation v;
    protected Convert c;
    protected Number num;

    public Program(){
        super("Base number convert program",baseMenu);
        v = new Validation();
        c = new Convert();
        num = new Number();
        
    }
    //-------------------------------------------------------------------------------------
    public void execute(int n){
        switch (n){
            case 1:{
                num.setValue(v.checkInputHexaDecimal());
                convertFromHexadecimal(num);
                break;
            }
            case 2:{
                num.setValue(v.checkInputDecimal());
                convertFromDecimal(num);
                break;
            }
            case 3:{
                num.setValue(v.checkInputBinary());
                convertFromBinary(num);
                break;
            }
            case 4:{
                System.exit(0);
            }
        }
    }
    //-------------------------------------------------------------------------------------
    public void convertFromHexadecimal(Number num){
        final String[] hexChoice = {"Convert to Decimal","Convert to Binary","Exit"};
        class convertFromHexadecimal extends Menu<String>{
            public convertFromHexadecimal(){
                super("Conver From Hexadecimal",hexChoice);
            }

            @Override
            public void execute(int n){
                switch(n){
                    case 1:{
                        String result = c.convertHexaToDecimal(num.getValue());
                        System.out.println("Hexadecimal " + num.getValue() + " to Decimal: " + result);
                        break; 
                    }
                    case 2:{
                        String result = c.convertHexaTiBinary(num.getValue());
                        System.out.println("Hexadecimla " + num.getValue() + " to Binary " + result);
                        break;
                    }
                    case 3:{
                        System.exit(0);
                        break;
                    }
                }
            }
        }
        convertFromHexadecimal ch = new convertFromHexadecimal();
        ch.run();
    }
    //-------------------------------------------------------------------------------------
    public void convertFromDecimal(Number num){
        final String[] decChoice = {"Convert to Hexadecimal","Convert to Binary","Exit"};
        class convertFromDecimal extends Menu<String>{ 
            public convertFromDecimal(){
                super("Convert From Decimal",decChoice);
            }
            @Override
            public void execute(int n){
                switch(n){
                    case 1:{
                        String result = c.convertDecimalToHexa(num.getValue());
                        System.out.println("Decimal" + num.getValue() + " to Hexadecimal: " + result);
                        break;
                    }
                    case 2:{
                        String result = c.convertDecimalToBinary(num.getValue());
                        System.out.println("Decimal " + num.getValue() + " to Binary: " + result);
                        break;
                    }
                    case 3:{
                        System.exit(0);
                        break;
                    }
                }
            }
        }
        convertFromDecimal cd = new convertFromDecimal();
        cd.run();
    }
    //-------------------------------------------------------------------------------------
    public void convertFromBinary(Number num){
         final String[] binChoice = {"Convert to Decimal","Convert to Hexadecimal","Exit"};
         class convertFromBinary extends Menu<String>{
            public convertFromBinary(){
                super("Convert From Binary",binChoice);
            }

            @Override
            public void execute(int n){
                switch(n){
                    case 1:{
                        String result = c.convertBinaryToDecimal(num.getValue());
                        System.out.println("Binary " + num.getValue() + " to Decimal " + result);
                        break;
                    }
                    case 2:{
                        String result = c.convertBinaryToHexa(num.getValue());
                        System.out.println("Binary " + num.getValue() + " to Decimal " + result);
                        break;
                    }
                    case 3:{
                        System.exit(0);
                        break;
                    }
                }
            }
         }
         convertFromBinary cb = new convertFromBinary();
         cb.run();
    }


}
