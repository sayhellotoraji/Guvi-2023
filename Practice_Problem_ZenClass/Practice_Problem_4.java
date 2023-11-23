package Practice_Problem_ZenClass;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Practice_Problem_4{
    public static void main(String args[]){


        List<Double> list = new ArrayList<>();
        list.add(3.14);
        list.add(4.65);
        list.add(5.55);

        List<Double> new_list = list.stream().map(Math::floor).collect(Collectors.toList());

        for(Double num: new_list)
            System.out.println(num);

    }
}