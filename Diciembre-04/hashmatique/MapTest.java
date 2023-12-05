package hashmatique;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Grupo firme", "Si pudiera mentir");
        trackList.put("Los Bukis", "Navidad sin ti");
        trackList.put("Hector Lavoe", "El Cantante");
        trackList.put("Jessi Uribe", "Repitela");
        trackList.put("Cómo te voy a olvidar", "Los Ángeles Negros");
        trackList.put("Isi", "Burrito Sabanero");
        System.out.println(trackList.get("Los Bukis"));

        for (String key : trackList.keySet()) {
            System.out.println(key + ":" + trackList.get(key));
        }

    }
}
