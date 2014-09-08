/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y estructura de datos 2014
 *  
 *  Autores:    Nancy Girón Muñoz - 13467
 *              Martín Meyer Ramazzini - 13043
 *              Alberto López Montenegro - 13181
 */
 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 1210la
 */
public class Factory {
    
    FrameSelector FS=new FrameSelector();
    int type=-1;
    HashSet S1;
    TreeSet S2;
    LinkedHashSet S3;

    public Factory() {
		FS.run();
		while(FS.RN){System.out.print("");}
        type=FS.gettype();
        setInit();
		System.out.println(type);
    }
    private void setInit(){
        switch(type){
            case 1:S1=new HashSet();break;
            case 2:S2=new TreeSet();break;
            case 3:S3=new LinkedHashSet();break;
        }
    }
    private Set getSet(){
        switch(type){
            case 1:return S1;
            case 2:return S2;
            case 3:return S3;
        }
        return null;
    }
    private void add(Persona in){
        switch(type){
            case 1:S1.add(in);break;
            case 2:S2.add(in);break;
            case 3:S3.add(in);break;
        }
    }
}