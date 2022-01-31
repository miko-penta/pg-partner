package com.pegadaian.pegadaianpartner.controller;


import com.pegadaian.pegadaianpartner.entity.Partner;
import com.pegadaian.pegadaianpartner.repository.PartnerRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partner")
@Api("Partner API")
public class PartnerController {

    Logger LOGGER = LoggerFactory.getLogger(PartnerController.class);

    @Autowired
    PartnerRepository partnerRepository;

    @ApiOperation(value = "Find All Partner")
    @PostMapping(value="",
            consumes = "application/json; charset=UTF-8",
            produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<Partner>> findAllPaginated() {
        try {
            List<Partner> partnerList = partnerRepository.findAll();

            return new ResponseEntity<>(partnerList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Get Partner By Id")
    @PostMapping(value = "/findById/{id}",consumes = "application/json; charset=UTF-8",
            produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<Partner>> findById(
            @PathVariable(value = "id") String id) {
        try {
            List<Partner> partnerList = partnerRepository.findByPartnerId(id);

            return new ResponseEntity<>(partnerList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
