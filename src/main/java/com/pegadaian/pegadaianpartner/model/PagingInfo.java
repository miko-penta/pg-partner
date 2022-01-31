package com.pegadaian.pegadaianpartner.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagingInfo {
    protected int currentPage;
    protected int pageCount;
    protected int pageSize;
}
