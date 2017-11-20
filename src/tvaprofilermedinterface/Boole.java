
package tvaprofilermedinterface;

public class Boole implements Profiler{

    @Override
    public String nämligenBakgrund(){
        return TextInfo.booleBakgrund();
//     return "George Boole, född 2 november 1815, död 8 december 1864, var en brittisk"
//             + "matematiker och filosof.\nHan är känd som skaparen av Boolesk algebra, "
//             + "grunden för all modern datoraritmetik.\n ";
     
    }
    
    @Override
    public String arbete() {
           return TextInfo.booleWork();
//        return "1854 publicerade han An investigation into the Laws of Thought, "
//                + "on Which are founded the Mathematical\nTheories of Logic and Probabilities."
//                + " I denna skrift behandlade Boole logik på nytt sätt genom att reducera "
//                + "logiken\ntill en enkel algebra. Logiska satser kunde beskrivas med symbolisk "
//                + "notation och manipuleras enligt regler som liknade\nden  normala matematikens. "
//                + "Detta var början till vad som nu kallas Boolesk algebra.\n ";
        
    }
}
