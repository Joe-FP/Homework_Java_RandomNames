import java.util.ArrayList;
import java.util.Collections;

public class Name {

    ArrayList<String> names;

    public Name() {
        names = new ArrayList<>();
        names.add("Joe");
        names.add("John");
        names.add("Sarah");
        names.add("Pete");
    }

    public String getNumberOfNames(int numNames){
        if(numNames > names.size()){
            return "There are only " + names.size() + " names in the list.";
        }
        String str = "";
        Collections.shuffle(names);
        for (int x = 0; x < numNames; x++){
            str = str + names.get(x);
            if (x < numNames-1){
                str = str + " and ";
            }
        }
        return str;
    }

//    public String getOneName(){
//        Collections.shuffle(names);
//        return names.get(0);
//    }
//
//    public String getTwoNames(){
//        Collections.shuffle(names);
//        String name1 = names.get(0);
//        String name2 = names.get(names.size()-1);
//        return name1 + " and " + name2;
//    }
}
