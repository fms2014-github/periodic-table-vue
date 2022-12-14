package com.periodic.server.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.periodic.server.model.dto.PeriodicDetailInfoRes;
import com.periodic.server.model.dto.PeriodicTableRes;
import com.periodic.server.model.entity.Periodic;
import com.periodic.server.service.PeriodicTableService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PeriodicRestfulController {

    private final PeriodicTableService service;

    @PostMapping("/atom/table/list")
    public PeriodicTableRes atomList() {
        PeriodicTableRes result = new PeriodicTableRes();

        result.setTableData(service.atomList());

        return result;
    }

    @PostMapping("/atom/detail/{atomName}")
    public Periodic atomDetailInfo(@PathVariable("atomName") String atomName) {
        PeriodicDetailInfoRes result = new PeriodicDetailInfoRes();
        Periodic periodic = service.atomDetail(atomName);

        result.setPeriodic(periodic);

        return periodic;
    }

    @GetMapping("/test")
    public void htmlParse() {
        try {
            Document doc = Jsoup.connect("https://fms2014-github.github.io/periodic-table/").get();

            Elements elements1 = doc.select(".lightbox-background");
            for (int i = 0; i < elements1.size(); i++) {

                Element temp = elements1.get(i);

                String atomNum = temp.select(".atom-icon>.atom-num").text();
                String atomName = temp.select(".atom-icon>.atom-name").text();
                String atomFullName = temp.select(".atom-icon>.atom-full-name").text();
                String atomInfo = temp.select(".atom-info").text();

                Periodic periodic = new Periodic();
                periodic.setAtomNum(atomNum);
                periodic.setAtomName(atomName);
                periodic.setAtomFullName(atomFullName);
                periodic.setAtomInfo(atomInfo);
                service.insertPeriodic(periodic);
            }

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}
