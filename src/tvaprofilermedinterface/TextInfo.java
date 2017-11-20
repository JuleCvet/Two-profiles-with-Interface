package tvaprofilermedinterface;

public class TextInfo {
    
//Man ska lagra inforationer om Turing och Boole i filen TextInfo,
//och kan komma åt dem via statiska metoderna TuringBakgrund,  //TuringWork, booleBakgrund och booleWork.

        static Turing t = new Turing();
        static Boole b = new Boole();
        
    public static String turingBakgrund() {
        return "Alan Mathison Turing född 23 juni 1912 i Maida Vale, London,"
                + " död genom förgiftning den 7 juni 1954 i Wilmslow, Cheshire, "
                + "var en brittisk matematiker,\nlogiker och kryptoanalytiker. "
                + "Han studerade vid King's College, Cambridge och sedan\nvid Princeton 1936–1938.\n ";
//        return t.nämligenBakgrund();
    }
    
    public static String turingWork() {
        return "Alan Turing lade en stor del av grunderna för dagens informations- "
               + "och datorteknologi.\nHan är mest känd för turingtestet, turingmaskinen "
               + "och sina insatser i andra världskriget\nmed kodknäckandet av tyskarnas"
               + " Enigmachiffer. Turing maskiner är i dag centrala inom studiet\nav beräkningshetsteorin";
       
        //return b.arbete();
        
    }
    
    public static String booleBakgrund() {
        return "George Boole, född 2 november 1815, död 8 december 1864, var en brittisk"
         + "matematiker och filosof.\nHan är känd som skaparen av Boolesk algebra, "
            + "grunden för all modern datoraritmetik.\n ";
       // return b.nämligenBakgrund();
        
    }
    
   public static String booleWork(){
       return "1854 publicerade han An investigation into the Laws of Thought, "
                + "on Which are founded the Mathematical\nTheories of Logic and Probabilities."
                + " I denna skrift behandlade Boole logik på nytt sätt genom att reducera "
                + "logiken\ntill en enkel algebra. Logiska satser kunde beskrivas med symbolisk "
                + "notation och manipuleras enligt regler som liknade\nden  normala matematikens. "
                + "Detta var början till vad som nu kallas Boolesk algebra.\n ";
       //return b.arbete();
       
   }
}
