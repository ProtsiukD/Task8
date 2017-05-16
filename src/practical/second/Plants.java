package practical.second;

/**
 * Created by prots on 15.05.2017.
 */
public class Plants {
    private int size;
    private java.awt.Color color;
    private java.lang.reflect.Type type;

    public Plants(int size, Color color, Type type) throws  ColorException, TypeExeption {
        this.size = size;
        //java.awt.Color c = colorStrToEnum(color);
        //java.lang.reflect.Type t = typeStrToEnum(type);
        //this.type = type;
        //this.color = color;
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch (color.toLowerCase()){
            case "red" : return Color.RED;
            case "yellow" : return Color.YELLOW;
            case "blue" : return Color.BLUE;
            case "white" : return Color.WHITE;
            case "pink" : return Color.PINK;
            default: throw  new ColorException("enter only blue, red, or white");
        }
    }

//    private Type typeStrToEnum(String type){
//        switch (type.toLowerCase()){
//            case "rose" : return Type.ROSE;
//            case "tulips" : return Type.TULIPS;
//            case "lilies" : return Type.LILIES;
//            case "carnations" : return Type.CARNATIONS;
//            case "daffodils" : return Type.DAFFODILS;
//            //default: throw  new TypeExeption("enter only rose, tulips, daffodils, carnations, lilies");
//        break;}
//    }

    @Override
    public String toString() {
        return this.type + " "+ this.color+" "+this.size;
    }
}
