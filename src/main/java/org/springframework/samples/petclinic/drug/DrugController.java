package org.springframework.samples.petclinic.drug;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
class DrugController {

    private final DrugRepository drugs;

    public DrugController(DrugRepository drugService) {
        this.drugs = drugService;
    }

    @GetMapping("/medicine.html")
    public String showMedicineList(Map<String, Object> model) {
        Drugs drugs = new Drugs();
        drugs.getDrugList().addAll(this.drugs.findAll());
        model.put("drugs", drugs);
        return "drugs/drugList";
    }
}
