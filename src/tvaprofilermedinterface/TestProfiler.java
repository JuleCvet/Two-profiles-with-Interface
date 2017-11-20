
package tvaprofilermedinterface;

public class TestProfiler {//so ovaa klasa, profiler ni e ekstra
    public static void main(String[] args) {
        Boole boole = new Boole();
        System.out.println(boole.nämligenBakgrund()+"\n"+ boole.arbete());
        
        Turing tur = new Turing();
        System.out.println(tur.nämligenBakgrund()+"\n"+tur.arbete());
        
        
    }
    
    
//    public static String booleInfo(){
//        String info = "BackGrund: " + new Boole().nämligenBakgrund() + "\nArbete: " + new Boole().arbete();
//        return info;

    
//    
//    public static String turringInfo(){
//        String info = "BackGrund: " + new Turing().nämligenBakgrund() + "\nArbete: " + new Turing().arbete();
//        return info;
        
    }

