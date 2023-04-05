package application;

import entities.ReadJson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProgramInvoincing {

    public static void main(String[] args) {

        ReadJson readJson = new ReadJson();
        JSONArray jsonArray = new JSONArray(readJson.getJson());

        List<Double> list = new ArrayList<>();

        for (int i=0;i<jsonArray.length();i++){
            list.add(jsonArray.getJSONObject(i).getDouble("valor"));
        }

        Optional<Double> smaller = list.stream().filter(x -> x != 0).min(Comparator.naturalOrder());
        Optional<Double> bigger = list.stream().max(Comparator.naturalOrder());

        System.out.println();
        System.out.println("Lowest billing amount > 0: " + smaller.get());
        System.out.println("Higher billing value: " + bigger.get());

        double average = 0;
        int contValidDays = 0;
        double sum = 0;
        int contDays = 1;

        for (int i=0;i<list.size();i++){
            double value = list.get(i);

            if (value != 0){
                contValidDays++;
            }

            sum += value;
            average = sum/contValidDays;

            if (value>average){
                contDays++;
            }
        }
        System.out.print("Cont Days = " + contDays);

    }
}
