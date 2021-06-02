package com.example.demo.information.model;

import java.util.List;

public class SearchInformationOutDTO {

    private String searchName;
    
    private List<SearchInformation> searchInforList;
    
    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public List<SearchInformation> getSearchInforList() {
        return searchInforList;
    }

    public void setSearchInforList(List<SearchInformation> searchInforList) {
        this.searchInforList = searchInforList;
    }
}
