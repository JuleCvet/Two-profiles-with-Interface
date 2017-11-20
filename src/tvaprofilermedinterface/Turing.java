
package tvaprofilermedinterface;

public class Turing implements Profiler{

    @Override
    public String nämligenBakgrund() {
        return TextInfo.turingBakgrund();
        
//        return "Alan Mathison Turing född 23 juni 1912 i Maida Vale, London,"
//                + " död genom förgiftning den 7 juni 1954 i Wilmslow, Cheshire, "
//                + "var en brittisk matematiker,\nlogiker och kryptoanalytiker. "
//                + "Han studerade vid King's College, Cambridge och sedan\nvid Princeton 1936–1938.\n ";
//        
    }

    @Override
    public String arbete() {
            return TextInfo.turingWork();
//       return "Alan Turing lade en stor del av grunderna för dagens informations- "
//               + "och datorteknologi.\nHan är mest känd för turingtestet, turingmaskinen "
//               + "och sina insatser i andra världskriget\nmed kodknäckandet av tyskarnas"
//               + " Enigmachiffer. Turing maskiner är i dag centrala inom studiet\nav beräkningshetsteorin";
       
    }
}
