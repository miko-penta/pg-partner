package com.pegadaian.pegadaianpartner.repository;

import com.pegadaian.pegadaianpartner.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PartnerRepository extends JpaRepository<Partner, String> {

    @Query("SELECT t FROM tbl_partner t WHERE t.partner_id like %:partner_id%")
    List<Partner> findByPartnerId(@Param("partner_id") String partnerId);
}
