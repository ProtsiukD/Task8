package practical.second;

/**
 * Created by prots on 15.05.2017.
 */
public class Main {
    public static void main(String[] args){
        try {
            Plants plants = new Plants(5, Color.RED, Type.ROSE);
            System.out.println(plants);
        }catch (ColorException | TypeExeption e){
            System.err.println(e.getMessage()+'\n');
            e.printStackTrace();
        }
    }
}
