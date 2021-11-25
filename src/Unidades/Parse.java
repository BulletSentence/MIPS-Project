package Unidades;

import java.util.Arrays;

public interface Parse {

    public static int parseBtoD(int [] binarya){
         int[] saz=new int[binarya.length];
         int tempx=0;
        if(binarya[0]==1){
            for(int i=0;i<binarya.length;i++){
                if(binarya[i]==1)
                    saz[i]=0;
                else
                    saz[i]=1;
            }

            String jo = Arrays.toString(saz);
            String  replace = jo.replace(",", "");
            String  replace1 = replace.replace("[", "");
            String replace2 = replace1.replace("]", "");
            String trim = replace2.replace(" ", "");
            String temp=trim;
             tempx=-1*((Integer.parseInt(temp, 2))+1);
        }

        else if(binarya[0]==0){
            String jo = Arrays.toString(binarya);
            String  replace = jo.replace(",", "");
            String  replace1 = replace.replace("[", "");
            String replace2 = replace1.replace("]", "");
            String trim = replace2.replace(" ", "");
            String temp=trim;
             tempx=Integer.parseInt(temp, 2);
        }
        return tempx;
    }
 
    public static int parseBtoD_unsigned(int [] binarya){
         String jo = Arrays.toString(binarya);
        String  replace = jo.replace(",", "");
        String  replace1 = replace.replace("[", "");
        String replace2 = replace1.replace("]", "");
        String trim = replace2.replace(" ", "");
        String temp=trim;
        int tempx=Integer.parseUnsignedInt(temp, 2);
        return tempx;
    }
    
     public static int[] parseDtoB(int d,int size){
        String temp=Integer.toBinaryString(d);
        int[] res=new int[size];
        if(res.length<=temp.length()){
            for(int i=res.length-1,j=temp.length()-1;i>=0;i--,j--){
                res[i]=Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        else{
             for(int i=res.length-1,j=temp.length()-1;j>=0;i--,j--){
                res[i]=Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        
        return res;
    }
    
    public static String BtoS(int[] binary){
        String jo = Arrays.toString(binary);
        String  replace = jo.replace(",", "");
        String  replace1 = replace.replace("[", "");
        String replace2 = replace1.replace("]", "");
        String trim = replace2.replace(" ", "");
        String rd=trim;
        return rd;
    }
    
    public static int[] parseStoB(String s,int size){
        int [] res=new int[size];
        for(int i = 0; i < size; i++) {
           res[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
            return res;
    }
    
    public static int[] StoB(String s){
        int [] res=new int[32];
        int d=Integer.parseInt(s);
        res=parseDtoB(d,32);
            return res;
    }
    
}