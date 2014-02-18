package cs_sprint2;

import java.util.*;




/**
 *
 * @author RurJorge
 */
public class ExcesoAtributosExceptionAppCS extends Exception{
    public ExcesoAtributosExceptionAppCS (){
        super();
    }
    
    @Override
    public String getMessage(){
        return "ERROR, la habilidad debe estar comprendida entre 0 y 5.";
    }
    
}
