package application;

import entities.ReadJson;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProgramInvoincing {

    public static void main(String[] args) {

        ReadJson readJson = new ReadJson();
        JSONArray jsonArray = new JSONArray(readJson.getJson());

        for (int i=0;i< jsonArray.length();i++){
            Double value = jsonArray.getJSONObject(i).getDouble("valor");
        }

        double smaller = jsonArray.getJSONObject(0).getDouble("valor");
        double bigger = jsonArray.getJSONObject(0).getDouble("valor");

        for (int i=0; i<jsonArray.length();i++){
            Double value = jsonArray.getJSONObject(i).getDouble("valor");
            if (value < smaller && value !=0 ){
                smaller = value;
            }
            if (value > bigger){
                bigger = value;
            }
        }
        System.out.println();
        System.out.println("Lowest billing amount: " + smaller);
        System.out.println("Higher billing value: " + bigger);

        double average = 0;
        int contValidDays = 0;
        double sum = 0;
        int contDays = 1;

        for (int i=0;i< jsonArray.length();i++){
            Double value = jsonArray.getJSONObject(i).getDouble("valor");
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
