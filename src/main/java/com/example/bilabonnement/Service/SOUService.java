package com.example.bilabonnement.Service;

import com.example.bilabonnement.Model.SOUModel;
import com.example.bilabonnement.Repositories.SOURepository;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

public class SOUService {

    SOURepository souRepo = new SOURepository();

    public double beregnKmPris(WebRequest request) {
/*
        Hardcoded
        int kmVedAfhentning = 5;
        int kmVedAflevering = 10;

        int kmKørt = kmVedAflevering - kmVedAfhentning;
        int aftalteKm = 3;

        if (kmKørt > aftalteKm) {
            int kmKørtForLangt = kmKørt - aftalteKm;
            return kmKørtForLangt * 0.75;
        } else return 0;


        int kmKørt = request.getParameter("kmKørt") - souRepo.getLejeAftaleByReNr().get().getKmVedAfhentning();

        if (kmKørt > souRepo.getLejeAftaleByReNr().get().setMaxKilometer()) {
            int kmKørtForLangt = kmKørt - souRepo.getLejeAftaleByReNr().get().setMaxKilometer();
            return kmKørtForLangt * 0.75;
        } else return 0;
    }

    public double beregnPrisSOU(WebRequest request) {


        if (beregnKmPris(request) + XXXXXX > 0) {


            return beregnKmPris(request) + XXXXXX;
        } else return 0;
    }



    */

        return 0;
    }
}
