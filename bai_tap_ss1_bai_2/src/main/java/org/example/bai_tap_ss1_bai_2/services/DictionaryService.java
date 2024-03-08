package org.example.bai_tap_ss1_bai_2.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    @Override
    public String result(String vocabulary) {
        Map<String, String> dictionary = new LinkedHashMap<>();
        dictionary.put("pig", "con heo");
        dictionary.put("cat", "con mèo");
        dictionary.put("dog", "con cho ");
        dictionary.put("name", "ten");
        dictionary.put("money", "tiền");
        dictionary.put("fruit", "hoa qua");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if(vocabulary.toLowerCase().equals(entry.getKey().toLowerCase())){
                return entry.getValue();
            }
        }
        return null;
    }
}
