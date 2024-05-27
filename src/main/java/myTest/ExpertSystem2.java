package myTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpertSystem2 {
    private Map<String, Boolean> symptoms;

    public ExpertSystem2() {
        symptoms = new HashMap<>();
        symptoms.put("Qızdırma", false);
        symptoms.put("Öskürək", false);
        symptoms.put("Boğaz ağrısı", false);
        symptoms.put("Bədən ağrısı", false);
        symptoms.put("Halsızlıq", false);
    }

    public void getSymptoms() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xahiş edirəm, cavabı 'bəli' və ya 'xeyr' ilə verin.");
        for (String symptom : symptoms.keySet()) {
            System.out.print(symptom + " var mı ?");
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("bəli")) {
                symptoms.put(symptom, true);
            }
        }
    }

    public void diagnose() {
        boolean hasFlu = symptoms.get("Qızdırma") && symptoms.get("Öskürək") && symptoms.get("Boğaz ağrısı") &&
                symptoms.get("Bədən ağrısı") && symptoms.get("Halsızlıq");
        if (hasFlu) {
            System.out.println("Simptomlarınıza əsasən, ehtimal ki, sizin qripiniz var....");
        } else {
            System.out.println("Simptomlarınıza əsasən, ehtimal ki, sizin qripiniz yoxdur....");
        }
    }

    public static void main(String[] args) {
        ExpertSystem2 expertSystem2 = new ExpertSystem2();
        expertSystem2.getSymptoms();
        expertSystem2.diagnose();
    }
}
